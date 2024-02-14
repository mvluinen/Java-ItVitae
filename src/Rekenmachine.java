//Creëer twee variabelen met elk een willekeurig gekozen cijfer. Voer vervolgens verschillende integeroperaties uit met deze twee cijfers en geef de resultaten weer.
//Houd er rekening mee dat de oorspronkelijke variabelen ongewijzigd moeten blijven na hun initialisatie.


import java.util.Scanner;

public class Rekenmachine {
    public static void main(String[] args) {
        Scanner Inputline = new Scanner(System.in);
        System.out.println("Wat is het eerste getal?");
        float firstnumb = Inputline.nextFloat();
        System.out.println("okay eerste getal is " + firstnumb + " Wat is het tweede getal?");
        float secnumb = Inputline.nextFloat();
        System.out.print("okay eerste getal is " + firstnumb + " en het tweede getal is " + secnumb);
        System.out.println(". Wil je deze getallen / + - * doen?");
        String operator = Inputline.next();
        float result = switch (operator){
            case "+" -> firstnumb + secnumb;
            case "-" -> firstnumb - secnumb;
            case "/" -> firstnumb / secnumb;
            case "*" -> firstnumb * secnumb;
            default -> 0;
            };
        System.out.print(firstnumb + operator + secnumb + " = " + result);
    }
}
