package JavaTraining;
//method overloading : same name but different parameters
// class Parent{
//     void sum(int a, int b){
//         System.out.println(a+b);
//     }
//     void sum(int a, int b, int c){
//         System.out.println(a+b+c);
//     }
//     void sum(double a, double b, double c, double d){
//         System.out.println(a+b+c+d);
//     }
// }

class Shape{
    void area(double l, double b){
        System.out.println("Area of rectangle : " +l*b);
    }
    void area(double r){
       // double pi = 3.1415;
        System.out.println("Area of circle : "+3.14*r*r);
    }
    void area(int s){
        System.out.println("Area of square : "+s*s);
    }
    void area(float b, float h){
         System.out.println("Area of triangle : "+0.5*b*h);
    }
}
public class Method_Overloading {
    public static void main(String[] args) {
        // Parent obj = new Parent();
        // obj.sum(5, 10);
        // obj.sum(4, 20, 30);
        // obj.sum(5.0, 4.0, 10.0, 20.5);
        Shape obj = new Shape();
        obj.area(2.2, 10);
        obj.area(5.5);
        obj.area(4, 10);
        obj.area(4);
    }
  }

