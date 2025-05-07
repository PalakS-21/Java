 package JavaTraining;

class Parent{
    void eat(){
        System.out.println("home");
    }
}
    class Child extends Parent{
        void eat(){
            System.out.println("child");
            super.eat();
        }
    }


public class MethodOverriding {
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.eat();
    }
}
