
public class exceptions {

    public static void main(String[] args) {
        Student studen = new Student();
        System.out.println(studen);
        // int numerators[] = { 20, 30, 40, 50 };
        // int denominators[] = { 2, 3, 4, 0 };
        // for (int i = 0; i < numerators.length; i++) {
        // System.out.println(divide(numerators[i], denominators[i]));
        // }
        // System.out.println("good job:)");
    }

    public static int divide(int a, int b) {
        try {
            return a / b;
        } catch (ArithmeticException d) {
            System.out.println(d);
            return 0;
        }
    }
}
// This code will run except for some cases as u could
// see we cant divide 50 by 0 that is an exception.
