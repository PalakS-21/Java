package JavaTraining;

// class Main{
//     void sum(){
//         System.out.println(this);
//     }
// }

// class Student{
//     int a;

//     Student(int a){
//         this.a = a; //this keyword points to current object.
//     }
//     void hi(){
//         System.out.println(a);
//     }
// }

class Constructor{
    Constructor(){
        System.out.println("non-parameterized constructor");
    }
    Constructor(int a){
        this();
        System.out.println(a);
    }
    Constructor(int a , int b){
        this(5);
        System.out.println(a+b);
    }
}



public class This_keyword {
    public static void main(String[] args) {
        // Main obj = new Main();
        // System.out.println(obj);
        // obj.sum();
        // Student obj1 = new Student(20);
        // obj1.hi();
        Constructor c1 = new Constructor();
        Constructor c2 = new Constructor(5);
        Constructor c3 = new Constructor(20,10);
        
    }
}


