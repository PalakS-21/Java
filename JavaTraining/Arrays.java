package JavaTraining;
//  import java.util.Scanner;
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

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the size of array : ");
// int n = scn.nextInt();
// int[] arr = new int[n];

// System.out.println("Enter the elements : ");
// for(int i = 0; i < n; i++){
//        arr[i] = scn.nextInt();
// }
// System.out.println("Reversed array : ");
// for(int i = n-1; i >= 0; i--){
//        System.out.println(arr[i] + " ");

//__________________________________________________________________________________

//SUM OF ARRAY.

// int[] arr1 = {1,2,3,4,5};
// int[] arr2 = {5,5,5,5,5};
// int sum1 = 0;
// int sum2 = 0;
// int totalSum = 0;

// for(int i = 0; i<arr1.length; i++){
//        sum1=arr1[i]+sum1;
// }
// System.out.println("SUM : " +sum1);

// for(int j = 0; j<arr2.length;j++){
//        sum2=arr2[j]+sum2;
// }
// System.out.println("SUM : " +sum2);

// totalSum=sum1+sum2;
// System.out.println("Total sum =  "+totalSum );
//___________________________________________________________________________________________________

//SUM OF TWO ARRAY.

// int[] arr1 = {1,2,3,4,5};
// int[] arr2 = {1,2,3,4,5};
// int[] sum = new int[arr1.length];
// for(int i = 0;i<arr1.length;i++){
//        sum[i] = arr1[i]+arr2[i];
// }
// System.out.println("Sum array : ");
// for(int val : sum){
//        System.out.println(val +" ");
// }
//______________________________________________________________________________________

//COMPARE TWO ARRAY.

// int[] arr1 = {1,2,3,4,5};
// int[] arr2 = {44,2,3,4,5};

// int i = 0;

//        if(arr1[i]==arr2[i]){
//        System.out.println("Arrays are equal");
//        }
//        else if(arr1[i] != arr2[i]){
//        System.out.println("arrays are not equal");
//        }
//______________________________________________________

//MERGE TWO ARRAYS.

// int[] arr1 = {1,2,3};
// int[] arr2 = {4,5,6};
// int[] mergeArr = new int[arr1.length + arr2.length];

// for(int i = 0;i<arr1.length;i++){
//        mergeArr[i] = arr1[i];
// }
// for(int i = 0; i<arr2.length; i++){
//        mergeArr[arr1.length + i] = arr2[i];
// }
// System.out.print("Merged array : ");
// for(int val : mergeArr){          //it will iterate through all elements of thee mergeArr and will run as many times there are elements in the mergeArr.
//        System.out.print(val+ " ");
// }
//______________________________________________________________________________________________________

//FIND COMMON ELEMENTS IN TWO ARRAY.

// int[] arr1 = {1,5,8,6};
// int[] arr2 = {2,3,8,1};

// for(int i = 0; i < arr1.length; i++){
//        for(int j = 0; j < arr2.length ; j++){
//               if(arr1[i] != arr2[j]){
//               System.out.print(arr1[i] + " ");
//               break;
//        }
// }
// }
//_________________________________________________________________________________________________________

//FIND UNIQUE ELEMENTS FRON TWO AARAY.

int[] arr1 = {1,2,3,4};
int[] arr2 = {1,2,3,5};
boolean found;

for(int i = 0; i < arr1.length ; i++){
       found = false;
for(int j = 0 ; j < arr2.length ; j++){
       if(arr1[i]==arr2[j]){
          found = true;
          break;
       }
}    
       if(!found){
              System.out.println(arr1[i] +" ");
       }
}
       for(int i  = 0; i < arr2.length; i++){
              boolean ffound = false;
        for(int j  = 0; j < arr2.length;j++){
              if(arr2[i]==arr1[i]){
                     found = true;
                     break;
              }
       }
       if(!ffound){
              System.out.println(arr2[i] +" ");
       }
       
}
}
}




