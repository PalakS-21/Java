package JavaTraining;

public class Patterns {
public static void main(String[] args) {
    
    // for(int i = 1; i <= 5; i++){            // *
    //     for(int j = 1; j <= i; j++){        // * *
    //         System.out.print(" *");         // * * *
    //     }                                   // * * * * 
    //  System.out.println("");                // * * * * *
    // }
   



    for(int i = 1; i <= 5;i++){
        for(int j = 5; j >= 1; j--){
            System.out.print(" ");
        }
        for(int k = 1; k <= i; k++){
            System.out.println("*");
        }
    }
    for(int p = 1; p<=1; p++){
        System.err.print("*");
    }
    System.out.print("*");
   }
   }

