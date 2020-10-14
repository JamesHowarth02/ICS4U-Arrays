package SamplePrograms;

public class SortingExample {
    static int arr[] = new int[9999999];
    public static void main(String[] args) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * arr.length) + 1;
        }
        int smallest = findSmallestLocation(0);
        System.out.println(smallest);
    }  
    
    public static int findSmallestLocation(int startPoint) {
        int smallest = startPoint;
        int smallestNum = arr[startPoint];
        
        for (int i = startPoint; i < arr.length; i++) {
            if(arr[i] < smallestNum) {
                smallest = i;
                smallestNum = arr[i];
            }
        }
        return smallestNum;
    }
   
    public static void swap(int loc1, int loc2) {
        int temp = arr[loc1];
        arr[loc1] = arr[loc2];
        arr[loc2] = temp;
    }
}
