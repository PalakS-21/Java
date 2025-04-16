package JavaTraining;

public class Basics {
    public static void main(String[] args) {
        int a = 55555;
        int reversed = 0;
        int sum = 0;
        while(a != 0){
             int lastDigit = a % 10; 
             reversed = reversed * 10 + lastDigit ;
             a = a / 10;
             sum = sum + lastDigit;
        }
        System.out.println(sum);
    }
}
