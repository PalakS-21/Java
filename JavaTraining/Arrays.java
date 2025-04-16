package JavaTraining;
 import java.util.Scanner;
public class Arrays {
       public static void main(String[] args) {
        
        // int[] arr = {1,2,3,4,5,6};
        // System.out.println(arr[0]);
        // System.out.println(arr[1]);
        // System.out.println(arr[2]);
        // System.out.println(arr[3]);
        // System.out.println(arr[4]);
        // System.out.println(arr[5]);
//__________________________________________________________________________________________

    //    int[] arr = {1,2,3,4,5};
    //    for(int i = 0; i<= arr.length; i++){
    //     System.out.println(arr[i]);
    //    }
//_______________________________________________________________________________________

//TAKING ARRAYS INPUT FROM USER.

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size of array : ");

// int n = scn.nextInt();
// int[] arr = new int[n];
// System.out.println("Enter the values of array : ");

// for(int i = 0;i<n;i++){
//     arr[i]=scn.nextInt();
// }
//_____________________________________________________________________________________________

//REVERSE THE ARRAY.

// int[] arr = {1,2,3,4,5};
// for(int i = 4; i<arr.length ; i--){
//     System.out.println(arr[i]);
// }
//___________________________________________________________________________________________

// FIND THE MAXIMUM ELEMENT FROM THE ARRAY.

// Scanner max = new Scanner(System.in);
// System.out.println("Enter the size of Array : ");
// int n = max.nextInt();
// int[] arr = new int[n];

// System.out.println("Enter the elements : ");
// for(int i = 0; i < n; i++){
//        arr[i] = max.nextInt();
// } 

// int maximum = 0;
// for(int i = 0; i < n; i++){
//        if(arr[i]>n){
//               maximum = arr[i];
//        }
// }
// System.out.println("MAXIMUM ELEMENT IN THE ARRAY IS : " +maximum);
//____________________________________________________________________________________________________

//COUNT EVEN AND ODD NUMBERS IN AN ARRAY.

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size of array : ");
// int n = scn.nextInt();
// int[] arr = new int[n];
// int even = 0;
// int odd = 0;

// System.out.println("Enter the elements : ");
// for(int i=0;i<n;i++){
//        arr[i] = scn.nextInt();

// if(arr[i] % 2 == 0)
//      even++;
// else
//      odd++;          
// }
// System.out.println("EVEN : " +even+ " ODD : " +odd);
//__________________________________________________________________________________________________

//REVERSE THE ARRAY.

Scanner scn = new Scanner(System.in);
System.out.println("Enter the size of array : ");
int n = scn.nextInt();
int[] arr = new int[n];

System.out.println("Enter the elements : ");
for(int i = 0; i < n; i++){
       arr[i] = scn.nextInt();
}
System.out.println("Reversed array : ");
for(int i = n-1; i >= 0; i--){
       System.out.println(arr[i] + " ");
}
       }
}
