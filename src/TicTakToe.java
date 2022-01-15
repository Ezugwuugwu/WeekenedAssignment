public class TicTakToe {
    public static void main(String[] args) {

        char [][] ticTakToe = {

                {'X', 'O', 'O'},
                {'X', 'X', 'X', 'F'},
                {'O', 'X', 'O'}
        };

//Using enhanced for loop
        System.out.println("\nPrinting with the enhanced for loop ");
        for (char[] outerarray : ticTakToe){
            for (char innerArray : outerarray){
                System.out.print(innerArray+"  ");
            }
            System.out.println();
        }
        //with for loop
        System.out.println("\n");
        System.out.println("Printing with the for loop");
        for (int row =0; row <ticTakToe.length; row++ ){
            for (int column =0; column <ticTakToe.length; column++){
                System.out.print(ticTakToe[row][column]+"  ");
            }
            System.out.println();
        }
    }
}
