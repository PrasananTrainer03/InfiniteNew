public class PosNeg {

    public void check(int n) {
        if (n >= 0) {
            System.out.println("Positive No...");
        } else {
            System.out.println("Negative No...");
        }
    }
    public static void main(String[] args) {
        int n = -5;
        PosNeg obj = new PosNeg();
        obj.check(n);
    }
}