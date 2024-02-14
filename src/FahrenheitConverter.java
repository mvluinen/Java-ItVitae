//`F = (C * 9/5) + 32`
import java.util.Arrays;
import java.util.Scanner;

public class FahrenheitConverter {
    public static void main(String[] args) {
        String sourceunit;
        double sourceval;
        double Kval;
        double Cval=0;
        double Fval;

        Scanner Inputline = new Scanner(System.in);
        while (true) {
            System.out.println("In welke eenheid staat de temperatuur? (K)elvin, (F)ahrenheit of (C)elcius");
            sourceunit = String.valueOf(Inputline.next().toUpperCase().charAt(0));
//            if(sourceunit.equals("K") || sourceunit.equals("F") || sourceunit.equals("C")){
            if (Arrays.asList("C", "F", "K").contains(sourceunit)) {
                break;
            }
            System.out.println("Input is incorrect, probeer opnieuw");
        }
        while (true) {
            try {
                Scanner Inputline2 = new Scanner(System.in);
                System.out.println("Hoeveel " + sourceunit + " wil je converteren?");
                sourceval = Inputline2.nextFloat();
                break;
            } catch (Exception e) {
            }
        }

        switch (sourceunit){
            case "K":
                Cval = sourceval - 273.15;
                break;
            case "C":
                Cval = sourceval;
                break;
            case "F":
                Cval = (sourceval - 32)/1.8;
                break;
        }

        Kval = Cval + 273.15;
        Fval = Cval * 1.8 + 32;
        System.out.println("De temperatuur van "+ sourceval + sourceunit + " is:\nCelcius:\t"+Cval+"C\nFahrenheit:\t"+Fval+"F\nKelvin:\t\t"+Kval);
    }
}
