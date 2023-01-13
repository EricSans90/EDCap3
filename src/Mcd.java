public class Mcd {

        private int a, b;

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Mcd(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static int calculoMcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return calculoMcd(b, a % b);
    }

    public static void main(String[] args) {
        int
    }
}
