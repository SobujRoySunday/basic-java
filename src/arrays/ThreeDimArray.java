package arrays;

public class ThreeDimArray {
    public static void main(String[] args) {
        // 3D Array
        int arr4[][][] = new int[3][3][3];
        for(int i = 0;i < arr4.length;i++){
            for(int j = 0;j < arr4[i].length;j++){
                for(int k = 0;k < arr4[i][j].length;k++){
                    arr4[i][j][k] = (int)(Math.random()*10);
                }
            }
        }
        System.out.println("\n\nYour 3D Array is: ");
        for(int p[][]:arr4){
            for(int q[]:p){
                for(int r:q){
                    System.out.print(r + " ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
