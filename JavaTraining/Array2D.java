package JavaTraining;

import java.util.*;

public class Array2D {
    public static void main(String[] args) {
        // int[][] arr = {{1,2,3,4},{1,2,3,4}};
        // for(int i = 0; i<arr.length;i++){
        //     for(int j = 0;j<arr[i].length;j++){
        //         System.out.println(arr[i][j]);
        //     }
        //     // System.out.println();
        // }
//_____________________________________________________________________________________ __    
//SUM OF ALL ELEMENTS OF ARRAY.

    //     int[][] arr = {{1,2,3},{1,1,2}};
    //     int sum = 0;
    //     for(int i = 0; i < arr.length; i++){
    //         for(int j = 0; j < arr[i].length; j++){
    //         sum = sum + arr[i][j]; //sum+=arr[i][j];
    //     }
    // }
    // System.out.println("SUM = " +sum);
    //_____________________________________________________________________________

//ROW-WISE SUM OF ARRAY (EACH ROW).

//     Scanner sc = new Scanner(System.in);
//     System.out.println("Enter the no. of rows : ");
//     int rows = sc.nextInt();
//     System.out.println("Enter the no. of columns : ");
//     int cols = sc.nextInt();

//     System.out.println("Enter the numbers");
//     int[][] arr = new int[rows][cols];

//     //input
//     //rows
//     for(int i = 0; i < rows; i++){
//         //columns
//         for(int j = 0; j < cols; j++){
//            arr[i][j] = sc.nextInt();
//         }
//     }
//     //output sum of each row.
//     for(int i = 0; i<arr.length; i++){
//     int rowSum = 0;
//     for(int j = 0; j<arr[i].length; j++){
//         rowSum += arr[i][j];
//     }
//     System.out.println("sum of row " +i+ ": " +rowSum);
// }
//     System.out.println("----------------------------------");

//        //output column sum
//     for(int j= 0; j<arr[0].length; j++){
//         int colSum = 0;
//         for(int i =0; i<arr.length; i++){
//             colSum += arr[i][j];
//         }
//         System.out.println("sum of column " +j+ ": " +colSum);
//     }
//     System.out.println("--------------------------------------");

//     //maximum element in the array
//     int max = arr[0][0];
//     for(int i = 0; i<arr.length; i++){
//         for(int j = 0; j<arr[i].length; j++){
//             if(arr[i][j] > max){
//                 max = arr[i][j];
//             }
//         }
//     }
//     System.out.println("Maximum element in the array : " +max);
//     System.out.println("--------------------------------------");

//     //minimum element in the array
//     int min = arr[0][0];
//     for(int i = 0; i< arr.length; i++){
//         for(int j = 0; j<arr[i].length; j++){
//             if(arr[i][j] < min){
//                 min = arr[i][j];
//             }
//         }
//     }
//     System.out.println("Minimum element in the array : " +min);
//     System.out.println("---------------------------------------");
//______________________________________________________________________

    //2D ARRAY INPUT.

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter the no. of rows : ");
    // int rows = sc.nextInt();
    // System.out.println("Enter the no. of columns : ");
    // int cols = sc.nextInt();

    // System.out.println("Enter the numbers");
    // int[][] numbers = new int[rows][cols];

    // //input
    // //rows
    // for(int i = 0; i < rows; i++){
    //     //columns
    //     for(int j = 0; j < cols; j++){
    //         numbers[i][j] = sc.nextInt();
    //     }
    // }
    // //output 
    // System.out.println("output : ");
    // for(int i = 0; i<rows; i++){
    //     for(int j = 0; j<cols; j++){
    //         System.out.print(numbers[i][j] +" ");
    //     }
    //     System.out.println();
    // }
    //_______________________________________________________________________________-
 
    //SERACH FOR A GIVEN NUMBER X AND PRINT ITS INDICES. TAKE MATRIX AS INPUT FROM USER.

    // Scanner scn = new Scanner(System.in);
    // System.out.println("Enter the no. of rows : ");
    // int rows = scn.nextInt();
    // System.out.println("Enter the no. of columns : ");
    // int columns = scn.nextInt();

    // System.out.println("Enter the numbers : ");
    // int[][] matrix = new int[rows][columns];

    // //input
    // //rows
    // for(int i = 0; i<rows; i++){
    //     //columns
    //     for(int j = 0; j<columns; j++){
    //         matrix[i][j] = scn.nextInt();
    //     }
    // }
    // System.out.println("Enter the element x to search in the matrix : ");
    // int x = scn.nextInt();

    // //output
    // for(int i = 0; i<rows; i++){
    //     for(int j = 0; j < columns; j++){
    //         //comparison with x
    //         if(matrix[i][j] == x){
    //         System.out.print("x found at location (" + i + "," + j +")");
    //         }
    //     }
    // }
}
}