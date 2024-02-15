public class Testje {
    public static void main(String[] args) {
        int i = 0;
        while (true){
            if (i<3) {
                System.out.println(i + " is still smaller than 3");
            }else {
                break;
            }
            i += 1;
        }
    }
}