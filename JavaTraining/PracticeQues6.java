package JavaTraining;

public class PracticeQues6 {
    public static void main(String[] args) {
        
        int num1=20;
        int num2=40;

        System.out.println("Before Swapping");
        System.out.println("num1 = " +num1+ ", num2 = " +num2);

        int temp = num1;
        num1 = num2;
        num2 = temp;

        System.out.println("After Swapping");
        System.out.println("num1 = " +num1+ ", num2 = " +num2);
    }
}
