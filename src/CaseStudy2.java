import java.util.Scanner;

public class CaseStudy2 {
    public static void main(String[] args) {
        Scanner Inputline = new Scanner(System.in);
        System.out.println("Noem een dag van de week");
        String weekdag = Inputline.next();
        String weekdagnummer = switch (weekdag) {
            case "maandag" -> "1";
            case "dinsdag" -> "2";
            case "woensdag" -> "3";
            case "donderdag" -> "4";
            case "vrijdag" -> "5";
            case "zaterdag" -> "6";
            case "zondag" -> "7";
            default -> "deze dag bestaat niet";
        };
        System.out.println("de genoemde dag: " + weekdag +" heeft dagnummer: " + weekdagnummer);
    }
}