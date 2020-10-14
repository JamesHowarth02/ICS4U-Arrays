package SamplePrograms;

public class Array2DEx1 {
    public static void main(String[] args) {
        int x[][] = new int[4][5];
        
        for (int row = 0; row < x.length; row++) {
            for (int column = 0; column < x[row].length; column++) {
                int num = 10 * row + column;
                x[row][column] = num;
                System.out.format(">%5d <|", x[row][column]);
            }
            System.out.println("");
        }
        System.out.println("=============================");
        int marks[][] = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {11, 12, 13, 14},
            {15, 16, 17, 18, 19, 20, 21},
            {22, 23, 24}
        };
        
        for (int row = 0; row < marks.length; row++) {
            for (int column = 0; column < marks[row].length; column++) {
                System.out.format(">%5d <|", marks[row][column]);
            }
            System.out.println("");
        }     
    }    
}
