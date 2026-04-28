import java.util.Scanner;

public class CustomSubstring {

    static String sub(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++)
            result += text.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        int s = sc.nextInt();
        int e = sc.nextInt();

        System.out.println(sub(text, s, e));
        System.out.println(text.substring(s, e));
    }
}
