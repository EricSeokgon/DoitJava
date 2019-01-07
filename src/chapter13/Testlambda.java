package chapter13;

interface PrintString {
    void showString(String string);
}
public class Testlambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("Hello lambda_1");
        showMyString(lambdaStr);
    }

    public static void showMyString(PrintString printString) {
        printString.showString("Hello lambda_2");
    }
}
