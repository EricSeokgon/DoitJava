package chapter14;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }

    public static void main(String[] args) {
        ThrowsException test = new ThrowsException();
        try {
            test.loadClass("C:\\Users\\user\\IdeaProjects\\DoitJava\\src\\chapter14\\a.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
