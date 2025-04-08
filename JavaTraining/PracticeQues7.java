package JavaTraining;

public class PracticeQues7 {
    public static void main(String[] args) {
        
        int num1=10;
        int num2=20;

        System.out.println("Before Swapping");
        System.out.println("num1 = " +num1+ ", num2 = " +num2);

        num1=num1+num2;   //10+20=30 (num1)
        num2=num1-num2;   //30-20=10 (num2)
        num1=num1-num2;   //30-10=20 (num1)

        System.out.println("After Swapping");
        System.out.println("num1 = " +num1+ ", num2 = " +num2);
    }
}
