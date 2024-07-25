//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.printf("Original array:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "");}
            System.out.println();
            System.out.println("array in reverse: ");
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            for ( int i = arr.length - 1; i >= 0; i--) {
                System.out.println(arr[i] + " ");

        }

    }
}