package chapter2;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int iNum = bNum; // byte형 값이 int형 변수로 대입됨.

        System.out.println(bNum);
        System.out.println(iNum);
    }
}
