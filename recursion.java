// RECURSION
// Q)PRINT NO.S FROM 5 TO 1-->
// import java.util.Scanner;
// public class recursion{
// public static void printnum(int n ){
// if(n==0){
// return;
// }

// System.out.println(n);
// printnum(n-1);
// }

// public static void main(String[] args){
// int n = 5;
// printnum(n);
// }
// }

// Q)PRINT NO.S FROM 1 TO 5-->
// import java.util.Scanner;
// public class recursion{
// public static void printnum(int n ){
// if(n==6){
// return;
// }

// System.out.println(n);
// printnum(n+1);
// }

// public static void main(String[] args){
// int n = 0;
// printnum(n);
// }
// }

// Q)PRINT SUM OF FIRST n NATURAL NO.S-->
// import java.util.Scanner;

// public class recursion {
// public static void printsum(int i, int n, int sum) {
// if (i == n) {
// sum += i;
// System.out.println(sum);
// return;
// }
// sum += i;
// printsum(i + 1, n, sum);
// }

// public static void main(String[] args) {
// printsum(1, 21 , 0);
// }
// }
// ADD ONS FOR THE ABOVE Q
// import java.util.Scanner;

// public class recursion {
// public static void printsum(int i, int n, int sum) {
// if (i == n) {
// sum += i;
// System.out.println(sum);
// return;
// }
// sum += i;
// printsum(i + 1, n, sum);
// System.out.println(i);
// }

// public static void main(String[] args) {
// printsum(1, 5, 0);
// }
// }

// Q)PRINT FACTORIAL OF A NUMBER N:-->

// import java.util.*;

// public class recursion {
// public static int calfactorial(int n) {
// if (n == 0 || n == 1) {
// return 1;
// }
// int fac_1 = calfactorial(n - 1);
// int fac_n = n * fac_1;
// return fac_n;
// }

// public static void main(String[] args) {
// int n = 5;
// int answer = calfactorial(n);
// System.out.println(answer);
// }
// }
// X-----------X-----------X----------------X-------------X--------------X-----------------X
// Q)FIBONACCI SERIES USING
// (1)BASIC LOOP THEORY
// -->
// import java.util.*;

// public class recursion {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// int n = 5;
// int a = 0;
// int b = 1;
// // PRINT FIRST TWO TERMS
// System.out.print(a + " ");
// System.out.print(b + " ");
// // running the loop for the series
// for (int i = 0; i < n; i++) {
// int c = a + b; // FOR NEXT TERM
// System.out.print(c + " ");
// a = b;// UPDATING THE TERMS
// b = c;
// }
// }
// }

// ------------------- //------------------//

// (2)USING RECURSION THEORY
// public class recursion {
// public static void printfib(int a, int b, int n) {
// if (n == 0) {
// return;
// }
// int c = a + b;
// System.out.println(c);
// printfib(b, c, n - 1);

// }

// public static void main(String[] args) {
// int a = 0, b = 1;
// System.out.println(a + " ");
// System.out.println(b + " ");
// int n = 7;
// printfib(a, b, n - 2);
// }
// }
// X------------X------------X---------------X---------------X--------------------X--------------------X
// Q)PRINT THE X^n TILL THE STACK HEIGHT.
// -->

// PRINT X^n (STACK HEIGHT MUST BE = TO logn)
// --->
// import java.util.*;

// public class recursion {
// public static int calpower(int x, int n) {
// if (x == 0) {// base case 1.
// return 0;
// }
// if (n == 0) {// base case 2.
// return 1;
// }

// if (n % 2 == 0) {
// return calpower(x, n / 2) * calpower(x, n / 2);
// } else {
// return calpower(x, n / 2) * calpower(x, n / 2) * x;
// }
// }

// public static void main(String[] args) {
// int x = 2, n = 5;
// int ans = calpower(x, n);
// System.out.println(ans);
// }
// }
// X-----------------X---------------X---------------X--------------------X-------------------X-----------------X--------------------X---------------------X-------------------
// ADVANCE RECURSION--->
// TOWER OF HANOI
// import java.util.*;

// public class recursion {
// public static void towerOfHanoi(int n, String src, String helper, String
// dest) {
// if (n == 1) {
// System.out.println(" Transfer Disk" + n + " From" + src + " To" + dest);
// return;
// }

// towerOfHanoi(n - 1, src, helper, dest);
// System.out.println(" Transfer Disk" + n + " From" + src + " To" + dest);
// towerOfHanoi(n - 1, helper, src, dest);

// public static void main(String[] args) {
// int n = 2;
// towerOfHanoi(n, "S", "H", "D");

// }
// }
// X-----------------X----------------X-----------------X-------------------X--------------------X
// Q)PRINT A STRING IN REVERSE-->"abcd"
// public class recursion {
// public static void printrev(String str, int idx) {
// if (idx < 0) {
// return;
// }
// System.out.print(str.charAt(idx));
// printrev(str, idx - 1);
// }

// public static void main(String[] args) {
// String str = "abcd";
// printrev(str, str.length() - 1);
// }
// }
// X---------------X---------------X-----------------X------------------X-------------------X-------------------X----------------------------X

// Q)FIND THE 1ST & LAST OCCURENCE OF AN ELEMENT IN A STRING - "abaacdafaah"
// SOLN-->
// import java.util.*;

// public class recursion {
// public static int first = -1;
// public static int last = -1;

// public static void findOccurance(String str, int idx, char element) {
// if (idx == str.length()) {
// System.out.println(first);
// System.out.println(last);
// return;
// }
// char currchar = str.charAt(idx);
// if (currchar == element) {
// if (first == -1) {
// first = idx;
// } else {
// last = idx;
// }
// }
// findOccurance(str, idx + 1, element);
// }

// public static void main(String[] args) {
// String str = "abaacdaefaah";
// findOccurance(str, 0, 'a');
// }
// X----------------X----------------X---------------X----------------X---------------------X---------------------X----------------------X-------------------------X--------------------------X;
// Q)Check If An Array Is Sorted???
// soln-->
// import java.util.Scanner;

// public class recursion {
// public static boolean isSorted(int arr[], int idx) {
// if (idx == arr.length - 1) {
// return true;
// }
// if (arr[idx] < arr[idx + 1]) { //if we keep --> arr[idx]>=arr[idx+1]
// // this means array is already sorted //then
// return isSorted(arr, idx + 1); //here we shud write --> return false;
// } else { //And
// return false; //here --> return isSorted(arr, idx + 1);
// }
// }

// public static void main(String[] args) {
// int arr[] = { 1, 2, 3 };
// System.out.println(isSorted(arr, 0));
// }
// }
// X----------------X--------------X--------------------X---------------------X----------------------X-----------------------X-----------------------X---------------------------X------------------------X----------------------------X

// Q)MOVE ALL "x" TO THE END OF THE STRING.
// SOLN-->
// import java.util.Scanner;

// public class recursion {
// public static void moveAllX(int idx, String str, String newString, int count)
// {
// if (idx == str.length()) {
// for (int i = 0; i < count; i++) {
// newString += 'x';
// }
// System.out.print(newString);
// return;
// }

// char currChar = str.charAt(idx);
// if (currChar == 'x') {
// count++;
// moveAllX(idx + 1, str, newString, count);
// } else {
// newString += currChar;// newString = newstring + currchar
// moveAllX(idx + 1, str, newString, count);
// }
// }

// public static void main(String[] args) {
// String str = "axbcxxd";
// moveAllX(0, str, "", 0);
// }
// }
// X-------------------------X---------------------------X------------------------------X----------------------------X--------------------------X-------------------------X-----------------------------------X---------------------------X--------------------------------X---------------------------------X-------------------------------X
// Q)REMOVE ALL THE DUPLICATES FROM THE STRING "abbccda";
// SOLN-->
// import java.util.Scanner;

// public class recursion {
// public static boolean[] map = new boolean[26];

// public static void remDp(int idx, String str, String newStr) {
// if (idx == str.length()) {
// System.out.println(newStr);
// return;
// }
// char currChar = str.charAt(idx);
// if (map[currChar - 'a']) {
// remDp(idx + 1, str, newStr);
// } else {
// newStr += currChar;
// map[currChar - 'a'] = true;
// remDp(idx + 1, str, newStr);
// }
// }

// public static void main(String[] args) {
// String str = "abgfeigefiugugugyasfyadu";
// remDp(0, str, "");
// }
// }
// X--------------------X---------------------X---------------------------X------------------------X---------------------------X-----------------------------X-----------------------------------X--------------------------------X--------------------------------X
// Q)PRINT ALL SUBSEQUENCES OF THE STRING - "abc"
// SOLN-->
// import java.util.*;

// public class recursion {
// public static void subSeq(String str, int idx, String newStr) {
// if (idx == str.length()) {
// System.out.println(newStr);
// return;
// }
// char currChar = str.charAt(idx);
// // to be included
// subSeq(str, idx + 1, newStr + currChar);
// // not to be included
// subSeq(str, idx + 1, newStr);
// }

// public static void main(String[] args) {
// String str = "abc";
// subSeq(str, 0, "");
// }
// }
// X-------------------------X----------------------------X-----------------------------X------------------------------X-------------------------------X----------------------------------X
// Q)PRINT ALL THE UNIQUE SUBSEQUENCES OF A STRING "aaa"..
// SOLN-->
// import java.util.Scanner;

// public class recursion {
// public static boolean[] map = new boolean[26];

// public static void remDp(int idx, String str, String newStr) {
// if (idx == str.length()) {
// System.out.println(newStr);
// return;
// }
// char currChar = str.charAt(idx);
// if (map[currChar - 'a']) {
// remDp(idx + 1, str, newStr);
// } else {
// newStr += currChar;
// map[currChar - 'a'] = true;
// remDp(idx + 1, str, newStr);
// }
// }

// public static void main(String[] args) {
// String str = "abgfeigefiugugugyasfyadu";
// remDp(0, str, "");
// }
// }
// X--------------------X---------------------X---------------------------X------------------------X---------------------------X-----------------------------X-----------------------------------X--------------------------------X--------------------------------X
// Q)PRINT ALL SUBSEQUENCES OF THE STRING - "abc"
// SOLN-->
// import java.util.HashSet;

// public class recursion {
// public static void subSeq(String str, int idx, String newStr, HashSet<String>
// set) {
// if (idx == str.length()) {
// if (set.contains(newStr)) {
// return;
// } else {
// System.out.println(newStr);
// set.add(newStr);
// return;
// }
// }
// char currChar = str.charAt(idx);
// // to be included
// subSeq(str, idx + 1, newStr + currChar, set);
// // not to be included
// subSeq(str, idx + 1, newStr, set);
// }

// public static void main(String[] args) {
// String str = "aaa";
// HashSet<String> set = new HashSet<>();
// subSeq(str, 0, "", set);
// }
// }
// X-----------------------------------X-----------------------------------------X--------------------------------------------------X---------------------------------------------------X-----------------------------------------X---------------------------------------------X
// Q)PRINT KEYPAD COMBINATION
// public class recursion {
// public static String[] keypad = { ".", "abc", "def", "ghi", "jkl", "mno",
// "pqrs", "tu", "vwx", "yz" };

// public static void printComb(int idx, String str, String combination) {
// if (idx == str.length()) {
// System.out.println(combination);
// return;
// }
// char currChar = str.charAt(idx);
// String mapping = keypad[currChar - '0'];
// for (int i = 0; i < mapping.length(); i++) {
// printComb(idx + 1, str, combination + mapping.charAt(i));
// }
// }

// public static void main(String[] args) {
// String str = "23";
// printComb(0, str, " ");
// }
// }
// X--------------------------X----------------------------X-----------------------------X-------------------------------------X------------------------------------X--------------------------------------X--------------------------------------------X---------------------------------X--------------------------------X
// Q)PRINT ALL THE PERMUTATIONS OF THE STRING??
// SOLN-->