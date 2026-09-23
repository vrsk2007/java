

// import java.util.*;
// public class loopprob {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N : ");
//         int N = sc.nextInt();
//         int sum =0;
//         for(int i =0; i<=N; i++){
//             sum=sum+i;
//         }
//         System.out.println("The sum of first n natural numbers is "+ sum);
//     }
// }
//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q)
// import java.util.*;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N : ");
//         int N = sc.nextInt();
//         int sum =0;
//         for(int i=0; i<=N;i++){
//             sum=sum+(i*i);
//         }
//         System.out.println("The sum of the squares is "+ sum);
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q
// import java.util.*;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//           System.out.print("Enter the value of N : ");
//           int N = sc.nextInt();
//           int sum =0;
//           for(int i=0; i<=N;i++){
//             sum=sum+(i*i*i);
//         }
//         System.out.println("The sum of the Cubes is "+ sum);
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//                                                      (WHILE)
// Q)
// import java.util.*;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the value of N : ");
//         int N = sc.nextInt();
//         int positiveNumbers = 0;
//         int negativeNumbers = 0;
//         while(N!=-1){
//             if(N>0){
//                 positiveNumbers++;
//             }else{
//                 negativeNumbers++;
//             }
//             System.out.println("Positve Numbers : "+ positiveNumbers+"Negative Numbers : "+negativeNumbers);
//                     System.out.print("Enter the value of N : ");
//             N = sc.nextInt();
//         }
//         System.out.println("Positve Numbers : "+ positiveNumbers+"Negative Numbers : "+negativeNumbers);
//         sc.close();
//     }
// }
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q)
// import java.util.*;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter N value : ");
//         int N = sc.nextInt();
//         int sum = 0;
//         int count = 0;
//         int avg = 0;
//         while(N!=-1){
//             sum = sum+N;
//             count++;
//             avg = sum / count;
//             System.out.print("Enter N value : ");
//             N = sc.nextInt();
//         }
//         System.out.println("The average of the numbers : " + avg);
//         sc.close();
//     }
// }
//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q)



















// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
// Q8)
// import java.util.Scanner;

// public class loopprob {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int uppercase = 0;
//         int lowercase = 0;
//         int digits = 0;
//         int symbols = 0;

//         System.out.print("Enter text (or -1 to exit): ");
//         String alph = sc.nextLine();

        
//         while (!alph.equals("-1")) {

//             for (int i = 0; i < alph.length(); i++) {
//                 char ch = alph.charAt(i);

                
//                 if (ch == ' ') {
//                     continue;
//                 }

//                 if (ch >= 'A' && ch <= 'Z') {
//                     uppercase++;
//                 } else if (ch >= 'a' && ch <= 'z') {
//                     lowercase++;
//                 } else if (ch >= '0' && ch <= '9') {
//                     digits++;
//                 } else {
//                     symbols++;
//                 }
//             }

//           System.out.print("Enter text (or -1 to exit): ");
//             alph = sc.nextLine();
//         }

//         System.out.println("\n--- Final Counts ---");
//         System.out.println("Uppercase letters : " + uppercase);
//         System.out.println("Lowercase letters : " + lowercase);
//         System.out.println("Digits            : " + digits);
//         System.out.println("Special Symbols   : " + symbols);

//         sc.close();
//     }
// }
// ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Q9)
// import java.util.Scanner;
// public class loopprob{
//     public static void main(String[]args){
//         Scanner sc = new Scanner(System.in); 
//         System.out.print("Enter n value : ");
//         int n = sc.nextInt();
//         for(int i = 1;i<=10;i++){
//             System.out.println(n + "x" + i + "=" + n*i );
//         }
//     }
// }
// -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Q10)Factorial of a number (using for and while).
// import java.util.Scanner;
// public class loopprob{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         long factorial = 1;
//         for(int i =1;i<=number;i++){
//             factorial*=i;
//         }
//         System.out.println("Factorial of " + number + " is: " + factorial);
//         sc.close();
//     }
// }
// (USING WHILE LOOP)
// import java.util.Scanner;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int factorial = 1;
//         int num = sc.nextInt();
//         int i =1;
//         while(i<=num){
//             factorial*=i;
//             i++;
//         }
//         System.out.println("Factorial of " + num + " is: " + factorial);
//     }
// }
// ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Q11)Fibonacci series (using while)
// import java.util.*;
// public class loopprob{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int f =0;
//         int s =1;
//         int i =1;
//         int sum;
//         while(i<=n){
//             System.out.println(f);
//             sum = f+s;
//             f=s;
//             s=sum;
//             i++;
//             }
//         }
//     }
// ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
//Q12)individual digits of a number.



