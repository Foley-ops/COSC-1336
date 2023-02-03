public class Factorials {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            int factorial = 1;
            for (int j = 0; j >0; j--) {
                factorial *= j;
            }
            System.out.println(i + "!=" + factorial);
        }
    }
}