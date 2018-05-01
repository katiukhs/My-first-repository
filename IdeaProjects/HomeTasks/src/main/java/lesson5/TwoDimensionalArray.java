package lesson5;

public class TwoDimensionalArray {
    public static void main(String[] args) {

        double sumOfDiagonals, productOfMiddleRowAndColumn, sumOfBorderElements;

        double[][] twoDimensionalArray = new double[3][3];

        twoDimensionalArray[0][0] = 1.0;
        twoDimensionalArray[0][1] = 1.5;
        twoDimensionalArray[0][2] = 2.0;
        twoDimensionalArray[1][0] = 1.5;
        twoDimensionalArray[1][1] = 2.0;
        twoDimensionalArray[1][2] = 2.5;
        twoDimensionalArray[2][0] = 2.0;
        twoDimensionalArray[2][1] = 2.5;
        twoDimensionalArray[2][2] = 3.0;

        double valueOf00 = twoDimensionalArray[0][0], valueOf01 = twoDimensionalArray[0][1],
                valueOf02 = twoDimensionalArray[0][2], valueOf10 = twoDimensionalArray[1][0],
                valueOf11 = twoDimensionalArray[1][1], valueOf12 = twoDimensionalArray[1][2],
                valueOf20 = twoDimensionalArray[2][0], valueOf21 = twoDimensionalArray[2][1],
                valueOf22 = twoDimensionalArray[2][2];

        sumOfDiagonals = valueOf00 + valueOf11 + valueOf22 + valueOf02 + valueOf20;
        productOfMiddleRowAndColumn = valueOf10 * valueOf11 * valueOf12 * valueOf01 * valueOf21;
        sumOfBorderElements = valueOf00 + valueOf01 + valueOf02 + valueOf12 + valueOf22 + valueOf21
                + valueOf20 + valueOf10;

        System.out.println("The sum of the diagonal array products: " + sumOfDiagonals);
        System.out.println("The product of the middle multiplication of the row and the middle column of the array: "
                + productOfMiddleRowAndColumn);
        System.out.println("The sum of all elements at the edge of the board: " + sumOfBorderElements);

    }
}
