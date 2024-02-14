import java.util.Scanner;
import java.lang.Math;

public class Leeftijdstemrecht {
    public static void main(String[] args) {
        int leeftijd;
        int wachttijd;
        Scanner Inputline = new Scanner(System.in);
        System.out.println("Wat is je leeftijd? ");
        leeftijd = Inputline.nextInt();
        wachttijd = Math.max(18-leeftijd,0);
        if(wachttijd == 0) {
            System.out.println("Je mag stemmen, drinken en verzekeringsgeld betalen");
        }else {
            System.out.println("Je bent nog te jong, je moet nog " + wachttijd + " jaar wachten");
        }
    }
}