import java.util.Scanner;

public class ScanTest {
    public static void main(String[] args) {
        Scanner Inputline = new Scanner(System.in);
        System.out.println("Give me your name");
        String name = Inputline.next();
        System.out.println("hallo Mr. " + name);
    }
}
