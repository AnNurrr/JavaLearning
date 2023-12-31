public class twoDarray {

    public static void main(String[] args) {


        // Creating 2D array
        int[][] matrix = new int[3][3];

        //Assigning each elements
        matrix[0][0] = 9;
        matrix[0][1] = 8;
        matrix[0][2] = 7;
        matrix[1][0] = 6;
        matrix[1][1] = 5;
        matrix[1][2] = 4;
        matrix[2][0] = 3;
        matrix[2][1] = 2;
        matrix[2][2] = 1;

        System.out.println(matrix[0][0]);


        //Iterating
        for(int i=0; i<matrix.length; i++) {
            for( int j=0; j<matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        System.out.println("Number of Rows: " + numRows);
        System.out.println("Number of Columns: " + numColumns);

    }
}