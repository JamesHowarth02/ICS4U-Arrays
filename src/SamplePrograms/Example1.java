package SamplePrograms;

public class Example1 {

    public static void main(String[] args) {
       int x[] = {67, 87, 45, 98, 76, 56, 55};
       x[1] = 100;
       int ii = 4;
       x[ii - 1] = 94;
       int count7 = 0;
        for (int i = 0; i < x.length; i++) {
            System.out.format("x[%d] = %d\n", i, x[i]);
            if(x[i] == 7) count7++;
        }
        System.out.println("There are " + count7 + " 7's.");
    }  
}
