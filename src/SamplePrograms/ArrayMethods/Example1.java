package SamplePrograms.ArrayMethods;
public class Example1 {
 
    public static void main(String[] args) {
        int abc[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        changeTo10(abc);
        for (int i = 0; i < abc.length; i++) {
            System.out.println(abc[i]);
        }
    }
    public static void changeTo10(int x[]) {
        for (int i = 0; i < x.length; i++) {
            x[i] = 10;
        }
    }
}
