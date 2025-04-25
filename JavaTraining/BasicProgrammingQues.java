package JavaTraining;

//import java.util.Scanner;

public class BasicProgrammingQues {
    public static void main(String[] args) {
         
//Date : 11 April, 2025

//Ques 1. EVENODD

        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter a nnumber");
        // int num = scn.nextInt();

        // if(num % 2 == 0)
        //     System.out.println("Number is Even");
        // else if(num % 2 != 0)
        //     System.out.println("Number is Odd");
        //  else
        //     System.out.println("invalid input");
//________________________________________________________________________

//Ques 2. POSITIVE,NEGATIVE OR ZERO
        // Scanner scn = new Scanner(System.in);
        //  System.out.println("Enter a nnumber");
        //  int num = scn.nextInt();

        //  if(num > 0)
        //  System.out.println("Positive");
        //  else if(num < 0)
        //  System.out.println("Negative");
        //  else
        //  System.out.println("Zero");
//_____________________________________________________________________________________

//QUES 3. Greatest of two numbers.

// Scanner scn = new Scanner(System.in);
//  System.out.println("Enter 1st number");
//  int num1 = scn.nextInt();
// System.out.println("enter 2nd num");
// int num2 = scn.nextInt();

// if(num1 > num2)
// System.out.println("num1 is greater");
// else if(num2 > num1)
// System.out.println("num2 is greater");
// else
// System.out.println("both num are equal");
//___________________________________________________________________________________________________________

//QUES 4. VOWELCONSONANT
// Scanner scn = new Scanner(System.in);
// System.out.println("enter a character");
// char z = scn.next().charAt(0);

// switch(z){
//     case 'a':
//     case 'e':
//     case 'i':
//     case 'o':
//     case 'u':
//     System.out.println("vowel");
//     break;
//     default:
//     System.out.println("consonant");
//____________________________________________________________________________________

//QUES 5.PRINT1TONUSINGforLOOP

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the number");
// int n = scn.nextInt();
// int i = 1;
// for(i = 1 ; i <= n; i++){
//     System.out.println(i);
// }
//______________________________________________________________________________________

//QUES 6. SumOfFirstNnatutalNumbersUsingWhileLoop

//  Scanner scn = new Scanner(System.in);
//   System.out.println("Enter the number");
//   int n = scn.nextInt();
//  int i = 0;
//  int sum = 0;
//   while(i <=n){
//     sum = sum + i;
//      i++;
//   }

// System.out.println(sum);
//_________________________________________________________________________________________________________

//QUES 7. PrintMultiplicationTableUsingLOOP

// int n = 5;

// for(int i = 1; i <=10; i++){
//         System.out.println(i*n);
//        // n = n * i;
// }
 //___________________________________________________________________________________________________________

 //QUES 8. CheckWhetherANumberIsDivisibleBy5and11Using_ifelse

//  Scanner scn = new Scanner(System.in);
//    System.out.println("Enter the number");
//    int n = scn.nextInt();

//    if(n % 5 == 0 && n % 11 == 0)
//    System.out.println("The number is divisible by 5 and 11");
//    else if(n % 5 != 0 && n % 11 == 0)
//    System.out.println("The number is not divisible by 5 and 11");
//    else
//    System.out.println("Invalid Input");
//_______________________________________________________________________________________________

//QUES 9. TYPECASTING : float to int

// float f = 21;
// int i = (int)f;
// System.out.println(i);
//_____________________________________________________________________________________________________

//Ques 10. Check whether a number is multiple of 3 or not uding if-else.

// Scanner scn = new Scanner(System.in);
//     System.out.println("Enter the number");
//  Scanner scn = new Scanner(System.in);

//   if(n % 3 == 0)
//   System.out.println("Divisible by 3");
//   else if(n % 3 != 0)
//   System.out.println("Not divisible by 3");
//   else
//   System.out.println("invalid input");
//_______________________________________________________________________________________________________-

//QUES 11. Take a character input and print its ascii value.

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the characterr");
// char ch = scn.next().charAt(0);

// int asciiValue = (int)ch;
// System.out.println(asciiValue);
//_________________________________________________________________________________________________________

//QUES 12. factorialofanumber

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter the number");
// int n = scn.nextInt();

//  int fact = 1;

//   for(int i = 1; i <= n; i++){
//         fact = fact*i;
//        // System.out.println(fact);
// }
// System.out.println(fact);
//__________________________________________________________________________________________________________________

//QUES 13. Write a program to reverse a num using while loop unput 1234 output 4321.

// Scanner scn = new Scanner(System.in);
// System.out.println("Enter a number to reverse : ");
//  int num = scn.nextInt();
//  int reversed = 0;
//                                                    //0*10+4=4
//  while(num != 0){                                  //4*10+3=43            
//         int digit = num % 10;                      //43*10+2=432
//         reversed = reversed * 10 + digit;            //432*10+1=4321
//         num = num/10;

//         System.out.println("Reversed number : " +reversed);
//  }
//______________________________________________________________________________________

//QUES 14. Check whether a num is prime opr not using loop and if else.

// Scanner scn = new Scanner(System.in);
// System.out.println("ENter a number to check whether it is prime or not");
// int num = scn.nextInt();
// boolean isPrime = true;

// if(num <= 1){
//         isPrime = false;
// }else{
//         for(int i = 2; i <= num/2; i++)
//         if(num % i == 0){
//           isPrime = false;
//           break;
//         }

// }
// if(isPrime){
//         System.out.println(num+" is prime" );
// }else{
//         System.out.println(num+ " is not prime");
// }
//__________________________________________________________________________________________________________________________

//QUES 15. Use switch case to build a simple calculator.

// Scanner scn = new Scanner(System.in);
//  System.out.println("Enter the 1st number : ");
//  int num1 = scn.nextInt();
//  System.out.println("Enter the 2nd number : ");
//  int num2 = scn.nextInt();
//  char ch = scn.next().charAt(0);

//  switch (ch) {
//         case '+':
//                 System.out.println("Addition : " +(num1+num2));
//                 break;
//         case '-':
//                 System.out.println("Subtraction : " +(num1-num2));
//                 break; 
//         case '*':
//                 System.out.println("Multiplication : " +(num1*num2));
//                 break;
//         case '/':
//                 System.out.println("Division : " +(num1/num2));
//                 break;
//         default:
//                 System.out.println("invalid input");
//                 break;
//  }



 }  
   }
    

