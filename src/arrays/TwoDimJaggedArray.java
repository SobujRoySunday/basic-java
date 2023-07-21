package arrays;

public class TwoDimJaggedArray {
    public static void main(String[] args) {
        // 2D Jagged Array
        int arr3[][] = new int[3][];
        arr3[0] = new int[4];
        arr3[1] = new int[2];
        arr3[2] = new int[3];
        for(int i = 0;i<3;i++){
            for(int j = 0;j < arr3[i].length;j++){
                arr3[i][j] = (int)(Math.random()*100);
            }
        }
        System.out.println("\n\nYour 2D Jagged Array is: ");
        for(int n[]:arr3){
            for(int m:n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
