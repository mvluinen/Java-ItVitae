public class CaseStudy {
    public static void main(String[] args) {
        String weekdag = "maandag";
        String weekdagnummer = "";
        switch (weekdag) {
            case "maandag":
                weekdagnummer = "1";
                break;
            case "dinsdag":
                weekdagnummer = "2";
                break;
            case "woensdag":
                weekdagnummer = "3";
                break;
            case "donderdag":
                weekdagnummer = "4";
                break;
            case "vrijdag":
                weekdagnummer = "5";
                break;
            case "zaterdag":
                weekdagnummer = "6";
                break;
            case "zondag":
                weekdagnummer = "7";
                break;
            default:
                weekdagnummer = "deze dag bestaat niet";
        }
        System.out.println("de genoemde dag: " + weekdag +" heeft dagnummer: " + weekdagnummer);
    }
}
