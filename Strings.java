// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// String name = sc.nextLine();
// System.out.println("my name is: " + name);
// }
// }

// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// // concatenation
// Scanner sc = new Scanner(System.in);
// String firstname = sc.next();
// String lastname = sc.next();
// String fullname = firstname + lastname;
// System.out.print(fullname);

// }
// }

// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// // concatenation
// Scanner sc = new Scanner(System.in);
// String firstname = sc.next();
// String lastname = sc.next();
// String fullname = firstname + " " + lastname;
// System.out.print(fullname);

// }
// }
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// // concatenation
// Scanner sc = new Scanner(System.in);
// String firstname = sc.next();
// String lastname = sc.next();
// String fullname = firstname + lastname;
// System.out.print(fullname.length());

// }
// }

// CHARAT

// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// // concatenation
// Scanner sc = new Scanner(System.in);
// String firstname = sc.next();
// String lastname = sc.next();
// String fullname = firstname + lastname;
// System.out.println(fullname.length());

// // here
// for (int i = 0; i < fullname.length(); i++) {
// System.out.println(fullname.charAt(i));
// }

// }
// }

// COMPARING TWO STRINGS
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// String name1 = "Tony";
// String name2 = "tony";

// if (name1.compareTo(name2) == 0) {
// System.out.println("Strings are equal");

// } else {
// System.out.println("Strings are not equal");
// }
// if (name1 == name2) {
// System.out.println("Strings are equal");

// } else {
// System.out.println("Strings are not equal");
// }
// if (new String("tony") == new String("tony")) {
// System.out.println("strings are equal");
// } else {
// System.out.println("Strings are not equal");
// }
// }
// }

// import java.util.*;

// public class Strings {

// public static void main(String[] args) {

// String sentence = "My name is VRSK";
// String name = sentence.substring(11, sentence.length());
// System.out.println(name);
// }
// }

// import java.util.*;

// public class Strings {

// public static void main(String[] args) {

// String sentence = "VROHANSIVAKOUSHIK";
// String name = sentence.substring(10);
// System.out.println(name);
// }
// }

// NOW LETS LEARN ABOUT STRING BUILDER
// A NORMAL STRING FUNCTION DOES NOT ALLOW US TO MAKE ANY
// CHANGES TO OUR WORD WHICH WE HAVE GIVEN SO BY USING STRING
// BUILDER WE CAN MAKE CHANGES
// import java.util.*;

// public class Strings {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("VRSK");
// System.out.println(sb.charAt(1));
// }
// }
// HOW TO USE CharAt FUNCTION???
// SOLN--->CharAt FUNCTION PRINTS ALL THE CHARACTERS IN THE STRING LINE BY LINE
// U CAN SAY.
// import java.util.*;

// public class Strings {

// public static void main(String[] args) {
// StringBuilder sb = new StringBuilder("VRSK");
// for (int i = 0; i < sb.length(); i++)
// System.out.println(sb.charAt(i));
// }
// }
// CHANGING THE STRING IN THE WORD GIVEN BY IS DONE BY ???
// SOLN--->BY USING name.setCharAt();
// import java.util.Scanner;
// public class Strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);

// StringBuilder name = new StringBuilder("VRSK");
// System.out.println(name);

// name.setCharAt(1, 'N');
// System.out.println(name);
// name.insert(1, 'R');
// System.out.println(name);

// }
// }
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// StringBuilder name = new StringBuilder("VRSK");
// System.out.println(name);
// name.delete(1, 3);
// System.out.println(name);

// }
// }
// HOW DO WE APPEND STRINGS??
// SOLN: APPENDING THE STRING MEANS TO ADD A CHARCTER
// LATER THIS DONE BY using name.append();
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// StringBuilder name = new StringBuilder("VRSK");
// System.out.println(name);
// name.append("vbbrhd");
// System.out.println(name.length());

// }
// }

// REVERSING AT STRING(IMP)
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// StringBuilder word = new StringBuilder("hello");
// for (int i = 0; i < word.length() / 2; i++) {
// int front = i;
// int back = word.length() - 1 - i;// 5-1-0=4

// char frontChar = word.charAt(front);
// char backChar = word.charAt(back);

// word.setCharAt(front, backChar);

// word.setCharAt(back, frontChar);
// }
// System.out.println(word);
// }
// HOW TO REVERSE A STRING IN JAVA???
// SOLN:--->
// import java.util.*;

// public class Strings {
// public static void main(String[] args) {
// StringBuilder word = new StringBuilder("hell");
// for (int i = 0; i < word.length() / 2; i++) {
// int front = i;
// int back = word.length() - 1 - i;// 5-1-0=4

// char frontChar = word.charAt(front);
// char backChar = word.charAt(back);

// word.setCharAt(front, backChar);

// word.setCharAt(back, frontChar);
// }
// System.out.println(word);
// }
// }
// THE TIME COMPLEXITY OF THIS CODE IS O(n).
// -------X---------X--------X---------X---------X-----------X-----------X-----------X--------------X----------------X------------------X: