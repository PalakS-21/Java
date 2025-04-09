package JavaTraining;

public class LargestOfTwoNum {
    public static void main(String[] args) {
        /*int a = 4;
        int b = 5;

        if(a>b){
            System.out.println("a is GREATER");
        }
        else{
            System.out.println("b is GREATER");
        }
            */


int a =5, b = 10, c = 20;

if(a>b && a>c){
    System.out.println("a is Greater");
}
else if(b>c && b>a){
    System.out.println("b is Greater");
}
else{
    System.out.println("c is greater");
}
    }
}
