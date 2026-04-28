public class NullExceptionDemo {

    static void handle() {
        try {
            String s = null;
            System.out.println(s.length());
        } catch (Exception e) {
            System.out.println("Handled");
        }
    }

    public static void main(String[] args) {
        handle();
    }
}
