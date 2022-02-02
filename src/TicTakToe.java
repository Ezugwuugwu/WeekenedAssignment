public class TicTakToe {
    public static void main(String[] args) {

        char [][] ticTakToe = {

                {'X', 'O', 'O'},
                {'X', 'X', 'X', 'F'},
                {'O', 'X', 'O'}
        };


        System.out.println("\nPrinting with the enhanced for loop ");
        for (char[] outerarray : ticTakToe){ //Using enhanced for loop
            for (char innerArray : outerarray){
                System.out.print(innerArray+"  ");
            }
            System.out.println();
        }

        System.out.println("\n");
        System.out.println("Printing with the for loop");
        for (int row =0; row <ticTakToe.length; row++ ){    //with for loop
            for (int column =0; column <ticTakToe.length; column++){
                System.out.print(ticTakToe[row][column]+"  ");
            }
            System.out.println();
        }
    }
}
