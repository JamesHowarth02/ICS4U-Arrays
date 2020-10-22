package SamplePrograms.ArrayMethods;

public class SwimTimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String athletes[] = {"Bob", "Sue", "Amy", "Joe"};
       double times[][] = {
           {12.8, 14.2, 11.7},
           {13.8},
           {10.9, 9.8, 10.7, 12.2},
           {12.8, 10.4}
       };
        
       double avgtime[] = getAvg(times);
        for (int i = 0; i < athletes.length; i++) {
            System.out.println(athletes[i]  + "'s Swimming Times:");
            for (int j = 0; j < times[i].length; j++) {
                System.out.print(times[i][j] + " | ");
            }
            System.out.println();
        }
    }
    
    public static double[] getAvg(double t[][]) {
        double avg[] = new double[t.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[i].length; j++) {
                avg[i] += t[i][j];
            }
            avg[i] = avg[i]/t.length;
        }
        return avg;
    }
 }
