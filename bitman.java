
// BIT MANIPULATION IN JAVA:
// GET BIT
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int m = 7;
// int pos = 2;
// if ((m & pos) == 0) {
// System.out.println("The Bit Was Zero");
// } else {
// System.out.println("The Bit Was One");
// }
// }
// }
// SET BIT
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5;
// int pos = 1;

// int bitMask = 1 << pos;
// int newNumber = bitMask | n;
// System.out.println(newNumber);
// }
// }
// CLEAR BIT(IMP)
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5;
// int pos = 2;
// int bitMask = 1 << pos;
// int notBitMask = ~(bitMask);

// int newnum = notBitMask & n;
// System.out.println(newnum);

// }
// }

// UPDATE BIT
// There are two cases :
// Case1--->To Update bit into 0(similar to clear)
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5;
// int pos = 2;
// int bitMask = 1 << pos;
// int notBitMask = ~(bitMask);

// int newnum = notBitMask & n;
// System.out.println(newnum);
// }
// }
// Case2 --->To update bit into 1 (similar to set).
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5;
// int pos = 1;
// int bitMask = 1 << pos;
// int newnum = bitMask | n;
// System.out.println(newnum);
// }
// }
// Combined code for both CASES --->
// import java.util.*;

// public class bitman {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int opr = sc.nextInt();
// int n = 5;// 0101
// int pos = 1;
// int bitmask = 1 << pos;
// if (opr == 1) {
// int newnum = bitmask | n;
// System.out.println(newnum);
// } else {
// int notBitMask = ~(bitmask);
// int newnum = notBitMask & n;
// System.out.println(newnum);
// }
// }
// }

// X---------------X-----------------X----------------X---------------------X---------------------X-----------------------X------------------------X-----------------------X------------------------X---------------------------X-----------------------------X----------------X