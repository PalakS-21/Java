package JavaTraining;

public class Strings {
    public static void main(String[] args) {
        
   
    // String str = "palak";
    // String str1 = "soni";
    // int count = 0;
    // for(int i = 0; i <str.length();i++){
    //     for(int j = 0; j < str1.length() ; j++){
    //         if(str.charAt(i) == str1.charAt(j)){
    //               count++;
    //         }
    //     }
    // }
    // System.out.println("count = " +count);
   //_________________________________________________________________________________


    // String palindrom = "racecar";
    // char[] arr = palindrom.toCharArray();
    // for(int i = 0; i < arr.length ; i++){
    //     System.out.println(arr[i]);
    // }

//     int target = 0;
//     String palindrom = "racecar";
//     for(int i = 0; i < palindrom.length(); i++){
//         if(palindrom.charAt(i)== palindrom.charAt(i++)){
//             target++;
//         }
//     }
//________________________________________________________________________

//CONUT THE VOWEL IN THE STRING.

// String name = "palaksoonii";
// char[] arr = name.toCharArray();
// int vowel = 0;
// int consonant = 0;
// for(int i = 0; i<arr.length;i++){
//     if(arr[i] == 'a' ||arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u'){
//         vowel++;
//     }
// }
// System.out.println("vowel count = " +vowel);
//__________________________________________________________________________________________________________

//PRINT REPEATED CHARACTER SINGLE TIME.
// String str = "hheellloo";
// String newStr = "";
// for(int i = 0; i < str.length() ; i++){
//     char c = str.charAt(i);
//         if(newStr.indexOf(c) == -1){
//            newStr = newStr + c;
//     }
// }
// System.out.println(newStr + "  ");
//___________________________________________________________________________________________________________
 
// String str = "hii";
// String str1 = "hii";
// System.out.println(str==str1); //true
// ----------------------------------------------
// String str = new String("hello");
// String str1 = new String("hello");
// System.out.println(str==str1);   //false
//_______________________________________________________________________________________

//PRINT THE FIRST REPEATED CHARACTER.

// String str = "hellloooiii";
// char[] ch = str.toCharArray();
// for(int i = 0; i < ch.length; i++){
//     for(int j = i+1 ; j < ch.length; j++ ){
//         if(ch[i]==ch[j]){
//             System.err.println(ch[i]); //prints the 1st repeated letter.
//            // System.err.println(ch[j]); //prints the 2nd repeated letter.
//             return;
//         }
//     }
// }
//_____________________________________________________________________________________________

//IMMUTABLE STRING.

// String str = "hello";
// //str = "hii";
// System.out.println(str.concat("hii"));
// System.out.println(str);  //original string didn't change.
//_____________________________________________________________________________________________

//STRING BUILDER.MUTABLE STRING.

StringBuilder str = new StringBuilder(8);
str.append("helloo java");
//old*2+2 , if length is more than capacity then the capacity is increased by this formula.
System.out.println(str.length()); //countd the no. of character in the string
System.out.println(str.capacity());
}
}
