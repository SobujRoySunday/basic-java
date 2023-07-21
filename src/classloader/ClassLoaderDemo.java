package classloader;

class Student{
    static{
        System.out.println("Class Loaded");
    }
}

public class ClassLoaderDemo {
    public static void main(String[] args) {
        try {
            // Only loads the class but not instantiate it
            Class.forName("Student");
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
    }
}
