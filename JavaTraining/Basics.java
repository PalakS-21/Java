package JavaTraining;

public class Basics {
    public static void main(String[] args) {
        // int a = 55555;
        // int reversed = 0;
        // int sum = 0;
        // while(a != 0){
        //      int lastDigit = a % 10; 
        //      reversed = reversed * 10 + lastDigit ;
        //      a = a / 10;
        //      sum = sum + lastDigit;
        // }
        // System.out.println(sum);
        //_____________________________________________________________________________________

        
        int[] arr = {1,23,56,5,8,99,7,57};
           boolean isPrime = false;
        for (int  i = 2; i < arr.length;i++){
            if(arr[i] % 2 == 0){
                isPrime = false;
                
            }
        }
        System.out.println(+arr[i]+ "not prime ");
    }
}
