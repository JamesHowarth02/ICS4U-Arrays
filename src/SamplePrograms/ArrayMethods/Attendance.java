package SamplePrograms.ArrayMethods;

import java.util.Scanner;


public class Attendance {

  
    public static void main(String[] args) {
       String attendance[][] = {
           {"JOE","S09","S12","O14"},
           {"AMY"},
           {"SUE","S24"},
           {"BOB","S05","S23","O11","O23"}
       };
       //PRINT OUT Attendance Report
       //any 2D.length = first number, or number of rows
        for (int i = 0; i < attendance.length; i++) {
            for (int j = 0; j < attendance[i].length; j++) {
                System.out.print(attendance[i][j] + "\t");
            }
            System.out.println("");
        }
        System.out.println("Here is how many absences each student has");
        int abs[] = countAbs(attendance);
        for (int i = 0; i < abs.length; i++) {
            System.out.print(abs[i] + ", ");
        }
        System.out.println("");
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter name to index, or X to quit.");
        String name = s.nextLine();
        
        if(name.equals("X")) System.exit(0);
        String dates[] = search(attendance, name);
        if(dates.length > 0) {
            System.out.println("dates:");
            for (int i = 0; i < dates.length; i++) {
                System.out.println(dates[i]);
            }
        }
        
    }
    
    public static String[] search(String data[][], String nm) {
        String list = "";
        for (int i = 0; i < data.length; i++) {
            if(data[i][0].equals(nm)) {
                for (int j = 0; j < data[i].length; j++) {
                    list += data[i][j] + ",";
                }
            }
        }
        if(list.length() == 0) {
            return new String[0];
        }else{
            return list.split(",");
        }
    }
    public static int[] countAbs(String data[][]){
        int abs[] = new int[data.length];
        for (int i = 0; i < data.length; i++) {
            abs[i] = data[i].length - 1;   //1st one is not an absence,its a name
        }
        return abs;
    }
    
   
    
    
}
