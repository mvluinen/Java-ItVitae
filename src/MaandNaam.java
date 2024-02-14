import java.util.Scanner;

public class MaandNaam {
    public static void main(String[] args) {
        int maandnummer;
        String maandnaam;
        while(true) {
            Scanner Inputline = new Scanner(System.in);
            System.out.println("Noem een maandnummer");
            maandnummer = Inputline.nextInt();
            maandnaam = switch (maandnummer) {
                case 1 -> "Januari";
                case 2 -> "Februari";
                case 3 -> "Maart";
                case 4 -> "April";
                case 5 -> "Mei";
                case 6 -> "Juni";
                case 7 -> "Juli";
                case 8 -> "Augustus";
                case 9 -> "September";
                case 10 -> "Oktober";
                case 11 -> "November";
                case 12 -> "December";
                default -> "error";
            };
            if (!maandnaam.equals("error")) {
                break;
            } else {
                System.out.println("input is buiten bereik");
            }
        }
        System.out.println("de genoemde maandnumer: " + maandnummer +" heet: " + maandnaam);
    }
}

