package chapter11;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringBuilderTest {
    public static void main(String[] args) {
        String javaStr = new String("Java");
        System.out.println("javaStr 문자열 주소: " + System.identityHashCode(javaStr));

        StringBuilder builder = new StringBuilder(javaStr);
        System.out.println("연산 전 buffer 메모리 주소: " + System.identityHashCode(builder));

        builder.append(" and");
        builder.append(" android");
        builder.append(" programming is fun!!!");
        System.out.println("연산 후 bugger 메모리 주소: " + System.identityHashCode(builder));

        javaStr = builder.toString();
        System.out.println(javaStr);
        System.out.println("연결된 javaStr 문자열 주소: " + System.identityHashCode(javaStr));
    }
}
