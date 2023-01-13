public class EjercicosPropuestos1 {
    public static void main(String[] args) {
        int NT=6, NTR = 6, NF=0;
        boolean NP = true;
        if(!NP){
            NF=4;
        } else if (NT<4.5) {
            NF=NT;
        } else {
            NF=NT+NTR;
        }

        if (NF>=10){
            System.out.println("Nota final: Matrícula de honor");
        } else {
            System.out.println("Nota final"+NF);
        }

    }
}
