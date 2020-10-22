package SamplePrograms.ArrayMethods;

import java.util.Arrays;

public class SumArrayByRow {

    public static void main(String[] args) {
        double shopping[][] = {
            {1.23, 4.56, 7.89},
            {10.11,12.13,14.15},
            {16.17, 18.19, 20.21}
        };
        double totals[] = getTotals(shopping);
        System.out.println(Arrays.toString(totals));
        main(args);
    }
    
    public static double[] getTotals(double prices[][]) {
        double totals[] = new double[prices.length];
        
        for (int i = 0; i < prices.length; i++) {
            for (int j = 0; j < prices[i].length; j++) {
                totals[i] = totals[i] + prices[i][j];
            }
        }
        return totals;
    }
    
}
