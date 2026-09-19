
// SORTING IN JAVA
// (1)Bubble Sort-->HOW TO DO???
// //SOLN:
// import java.util.*;

// public class sorting {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// Time Complexity For this code is O(n^2).
// public static void main(String[] args) {
// int arr[] = { 7, 8, 3, 1, 2 };
// // bubble sort
// for (int i = 0; i < arr.length - 1; i++) {// this loop is running n-1 times
// for (int j = 0; j < arr.length - i - 1; j++) {
// if (arr[j] > arr[j + 1]) {
// //Line How To Swap The Numbers:-->
// int temp = arr[j];
// arr[j] = arr[j + 1];
// arr[j + 1] = temp;
// }
// }
// }
// printArray(arr);
// }

// }

// X--------------X--------------X----------------X---------------X-----------

// SELECTION SORT-->How To Do??
// soln:
// import java.util.*;

// public class sorting {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int arr[] = { 7, 8, 3, 1, 2 };

// // Selection sort
// for (int i = 0; i < arr.length - 1; i++) {
// int smallest = i; // assume current index is smallest
// for (int j = i + 1; j < arr.length; j++) {
// if (arr[smallest] > arr[j]) {
// smallest = j; // update smallest index
// }
// }
// swap after inner loop finishes
// int temp = arr[smallest];
// arr[smallest] = arr[i];
// arr[i] = temp;

// printArray(arr); // print after each pass
// }
// }
// }

// The Time Complexity of this code is O(n^2).

// X------------X---------X-----------X------------X-----------X------------X

// INSERTION SORT -->How To Do?
// Soln:->
// import java.util.*;

// public class sorting {
// public static void printArray(int arr[]) {
// for (int i = 0; i < arr.length; i++) {
// System.out.print(arr[i] + " ");
// }
// System.out.println();
// }

// public static void main(String[] args) {
// int[] arr = { 7, 8, 3, 1, 2 };
// // insertion sort
// for (int i = 1; i < arr.length; i++) {
// int current = arr[i];
// int j = i - 1;
// while (j >= 0 && current < arr[j]) {
// arr[j + 1] = arr[j];
// j--;
// }
// // placing of the numbers
// arr[j + 1] = current;
// }
// printArray(arr);
// }

// }
// X------------X------------X------------X-------------X------------------X-----------X-------------X-----------------X-----------------X-------------------X-------------------X------------------X--------------------X-----------------X------------------------X-----------------X--------------------X-----------------------------------X------------------------------X