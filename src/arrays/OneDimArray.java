package arrays;

public class OneDimArray {
    public static void main(String[] args) {
        // 1D-Array
        int arr[] = new int[6];
        for(int i = 0;i<6;i++)
            arr[i] = (int)(Math.random()*10);                      // Generation of Random Numbers
        System.out.println("\nYour 1D Array is: ");
        for(int i = 0;i<6;i++)
            System.out.print(arr[i] + " ");
    }
}
