package JavaTraining;

public class Functions {
    // static void sum(){
    //     int a =5;
    //     int b = 10;
    //     int c = a+b;
    //     System.out.println("heyyy");
    //     System.out.println("sum = " +c);
    // }

    // static void subtract(){
    //     int x =20;
    //     int y =10;
    //     int z = x-y;
    //     System.out.print("subratction : ");
    //     System.out.print(z);
    // }
    //____________________________________________________________________________

    // static void sum1(){
    //     int a =132;
    //     int sum = 0;
    //     for(int i = 0; i<4; i++){
    //         int b =a%10;
    //         sum = b + sum;
    //         a = a/10;
    //     }
    //     System.out.println(sum);
    // }
    //__________________________________________________________________________________

   // static void parameter(int a){
   // System.out.println(a);
   //   }
   //_____________________________________________________________________________________

//  static int SumOf2(int a, int b){
//     return a+b;
// }

static void sum(){
    int a = 24;
    int b = 54;
    int c = a+b;
   
    System.out.println("sum = " +c);
     int digit = c%10;
     c = c/10;
    
     for(int i =0; i<3; i++){
        if(c > digit){
            digit = c;  
        }
   
    }
    System.err.println("max value =  " +digit);
}

    public static void main(String[] args) {
        // sum();
        // subtract();
        // sum1();
      // parameter(1231); //argument
    //   int output = SumOf2(10, 50);
    //   System.out.println(output);
    //   System.out.println(SumOf2(10, 50));
    sum();
    }
}
