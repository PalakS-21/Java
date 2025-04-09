package JavaTraining;

public class UppercaseLowercase {
    public static void main(String[] args) {
        char ch = 'v';
        
        if (ch >= 'A' && ch <= 'Z')
        System.out.println("Alphabet is in Uppercase");
       
        else if (ch >= 'a' && ch <= 'z')
        System.out.println(" Alphabet is in Lowercase");
        
        else
        System.out.println("Not an alphabet");
    }
}
