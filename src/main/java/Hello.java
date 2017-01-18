public class Hello {
    public static void main(String args[]) {
        String greeting = greeting("Oleg");
        System.out.println(greeting);
    }

    public static String greeting(String name) {
        return String.format("Hello, %s!", name);
    }
}