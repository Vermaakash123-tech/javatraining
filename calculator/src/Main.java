import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    private JTextField display;
    private JButton[] numberButtons;
    private JButton[] functionButtons;
    private JButton addButton, subButton, mulButton, divButton, equButton, delButton, clrButton, negButton;
    private JPanel panel;

    private double num1 = 0, num2 = 0, result = 0;
    private char operator;

    public Calculator() {
        // Set up the frame
        setTitle("Calculator");
        setSize(400, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // Create and set up display area
        display = new JTextField();
        display.setEditable(false);
        add(display, BorderLayout.NORTH);

        // Create panel for buttons
        panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));

        // Create number buttons
        numberButtons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
        }

        // Create function buttons
        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("*");
        divButton = new JButton("/");
        equButton = new JButton("=");
        delButton = new JButton("Del");
        clrButton = new JButton("C");
        negButton = new JButton("(-)");

        functionButtons = new JButton[] {addButton, subButton, mulButton, divButton, equButton, delButton, clrButton, negButton};

        for (JButton button : functionButtons) {
            button.addActionListener(this);
        }

        // Add buttons to panel
        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);

        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);

        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);

        panel.add(clrButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        // Add panel to frame
        add(panel);

        // Display the frame
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String command = e.getActionCommand();

        // Handle number buttons
        for (int i = 0; i < 10; i++) {
            if (command.equals(String.valueOf(i))) {
                display.setText(display.getText() + command);
                return;
            }
        }

        // Handle function buttons
        switch (command) {
            case "+":
                num1 = Double.parseDouble(display.getText());
                operator = '+';
                display.setText("");
                break;
            case "-":
                num1 = Double.parseDouble(display.getText());
                operator = '-';
                display.setText("");
                break;
            case "*":
                num1 = Double.parseDouble(display.getText());
                operator = '*';
                display.setText("");
                break;
            case "/":
                num1 = Double.parseDouble(display.getText());
                operator = '/';
                display.setText("");
                break;
            case "=":
                num2 = Double.parseDouble(display.getText());
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        break;
                    case '-':
                        result = num1 - num2;
                        break;
                    case '*':
                        result = num1 * num2;
                        break;
                    case '/':
                        result = num1 / num2;
                        break;
                }
                display.setText(String.valueOf(result));
                num1 = result;
                break;
            case "C":
                display.setText("");
                num1 = num2 = result = 0;
                break;
            case "Del":
                String text = display.getText();
                if (!text.isEmpty()) {
                    display.setText(text.substring(0, text.length() - 1));
                }
                break;
            case "(-)":
                double temp = Double.parseDouble(display.getText());
                temp = -temp;
                display.setText(String.valueOf(temp));
                break;
        }
    }

    public static void main(String[] args) {
        new Calculator();
    }
}
