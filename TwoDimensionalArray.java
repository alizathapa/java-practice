public class TwoDimensionalArray {
    public static void main(String[] args) {
        // int num[][] = { { 9, 8, 7 },
        // { 6, 5 },
        // { 3 } };
        // for (int i = 0; i < num.length; i++) {
        // for (int j = 0; j < num[i].length; j++) {
        // System.out.print("Row:" + i + "\t" + "Column:" + j + "\t" + num[i][j] +
        // "\t");
        // }
        // System.out.println();
        // }
        // }
        // int arr[][] = { { 0, 1, 2, 3, 4 },
        // { 1, 2, 3 },
        // { 2, 3 },
        // { 3, 4, 5, 6 }
        // };
        // for (int i = 0; i < arr.length; i++) {
        // for (int j = 0; j < arr[i].length; j++) {
        // System.out.print(arr[i][j] + "\t");
        // }
        // System.out.println();
        int arr[][] = new int[4][0];
        arr[0] = new int[5];
        arr[1] = new int[3];
        arr[2] = new int[2];
        arr[3] = new int[4];

        //filling with values
        int value=0;
        for(int i=0;i<arr.length;i++){
            (int j=0; j<arr[i].length;j++){
                arr[i][j]= value++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }
}

