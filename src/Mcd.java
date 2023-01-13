public class Mcd {

        private int a, b;
    public void setA(int a) {
        this.a = a;
    }
    public void setB(int b) {
        this.b = b;
    }
    public int getA() {
        return a;
    }
    public int getB() {
        return b;
    }
    public Mcd(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public static int calculoMcd(int a, int b) {
        //Es la versión recursiva
        if (b == 0) {
            return a;
        }
        return calculoMcd(b, a % b);
    }
    public static int calculoMcd(Mcd tipo) {
        if (tipo.b == 0) {
            return tipo.a;
        }
        return calculoMcd(tipo.b, tipo.a % tipo.b);
    }
    public static void main(String[] args) {
        Mcd test = new Mcd(20,5);
        //System.out.println(calculoMcd(test));
    }
}
