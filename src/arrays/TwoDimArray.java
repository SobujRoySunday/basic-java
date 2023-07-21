package arrays;

public class TwoDimArray {
    public static void main(String[] args) {
        // 2D-Array
        int arr2[][] = new int[3][4];
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                arr2[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("\n\nYour 2D Array is: ");
        for(int i = 0;i<3;i++){
            for(int j = 0;j<4;j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }
    }
}
