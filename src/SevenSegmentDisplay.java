public class SevenSegmentDisplay {
    private static int[][] values_In_Rows_And_Columns = new  int[5][4];

    public static void main(String[] args) {
        set_Segement_And_Check_Binary_Validity("10110111");
        displaySegment();
    }
    //END OF MAIN CLASS

    public static void set_Segement_And_Check_Binary_Validity(String number){
        if ((number.length()==8) && number.charAt(number.length()-1) == '1'){
            setSegment(number);
        }else {
            if (number.length() !=8){
                System.out.println("Invalid Binary length");
            }else {
                if ((number.charAt(number.length()-1) != '1')){
                    System.out.println("Power Binary off");
                }
            }

        }
    }


    public static void setSegment(String numbers) {
        boolean isValid = true;
            if (Character.getNumericValue(numbers.charAt(0)) == 1) {
                segment_A();
            }
            if (Character.getNumericValue(numbers.charAt(1)) == 1) {
                segment_B();
            }

            if (Character.getNumericValue(numbers.charAt(2)) == 1) {
                segment_C();
            }

            if (Character.getNumericValue(numbers.charAt(3)) == 1) {
                segment_D();
            }

            if (Character.getNumericValue(numbers.charAt(4)) == 1) {
                segment_E();
            }

            if (Character.getNumericValue(numbers.charAt(5)) == 1) {
                segement_F();
            }

            if (Character.getNumericValue(numbers.charAt(6)) == 1) {
                segement_G();
            }

    }


    public static void displaySegment() {
        int row,column;
            for (row = 0; row < values_In_Rows_And_Columns.length; row++) {
                for (column = 0; column < values_In_Rows_And_Columns[row].length; column++){
                    if (values_In_Rows_And_Columns[row][column] == 1) System.out.print('#');
                    else System.out.print(' ');
                    }
                System.out.println();
            }
    }

    public static void segment_A(){
        values_In_Rows_And_Columns[0][0] = 1;
        values_In_Rows_And_Columns[0][1] = 1;
        values_In_Rows_And_Columns[0][2] = 1;
        values_In_Rows_And_Columns[0][3] = 1;
    }

    public static void segment_B(){
        values_In_Rows_And_Columns[0][3] = 1;
        values_In_Rows_And_Columns[1][3] = 1;
        values_In_Rows_And_Columns[2][3] = 1;
    }

    public static void segment_C(){
        values_In_Rows_And_Columns[2][3] = 1;
        values_In_Rows_And_Columns[3][3] = 1;
        values_In_Rows_And_Columns[4][3] = 1;
    }

    public static void segment_D(){
        values_In_Rows_And_Columns[4][0] = 1;
        values_In_Rows_And_Columns[4][1] = 1;
        values_In_Rows_And_Columns[4][2] = 1;
        values_In_Rows_And_Columns[4][3] = 1;
    }

    public static void segment_E(){
        values_In_Rows_And_Columns[2][0] = 1;
        values_In_Rows_And_Columns[3][0] = 1;
        values_In_Rows_And_Columns[4][0] = 1;
    }

    public static void segement_F(){
        values_In_Rows_And_Columns[0][0] = 1;
        values_In_Rows_And_Columns[1][0] = 1;
        values_In_Rows_And_Columns[2][0] = 1;
    }

    public static void segement_G(){
        values_In_Rows_And_Columns[2][0] = 1;
        values_In_Rows_And_Columns[2][1] = 1;
        values_In_Rows_And_Columns[2][2] = 1;
        values_In_Rows_And_Columns[2][3] = 1;
    }
}
