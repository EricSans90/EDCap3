public class EjercicioNotas {
    private float NT, NP, NTR;

    public EjercicioNotas(float NT, float NP, float NTR) {
        this.NT = NT;
        this.NP = NP;
        this.NTR = NTR;
    }

    public static float calculoNotaFinal(EjercicioNotas aCalcular){
        float NF=0;
        if ((0<=aCalcular.NT)&&(aCalcular.NT<=10)&&(0<=aCalcular.NP)&&(aCalcular.NP<=10)&&(0<=aCalcular.NTR)&&(aCalcular.NTR<=10)){
            if (aCalcular.NT<4.5){
                if (aCalcular.NP>=5){
                    if (aCalcular.NT>=4){
                        NF=aCalcular.NT;
                    } else {
                        NF=4;
                    }
                } else {
                    NF=aCalcular.NT;
                }
                System.out.println("Nota: "+NF);
                return NF;
            } else {
                if (aCalcular.NP>=5){
                    NF=aCalcular.NT+aCalcular.NTR;
                } else {
                    NF=aCalcular.NT;
                }
            }
            if (NF>=10) {
                //System.out.println("Nota: "+NF+" MH");
                System.out.println("Nota: MH");
            } else {
                System.out.println("Nota: "+NF);
            }
        } else {
            System.out.println("Error");
        }

        return NF;
    }

    public static void main(String[] args) {
        //En mi ejercicio lo leeré desde un objeto instanciado previamente y no desde un archivo,
        // pero el mecanismo es el mismo, dado que leería los valores del archivo y los usaría como argumentos para
        // crear la variable test1
        EjercicioNotas test1 = new EjercicioNotas(8,6,4);
        test1.calculoNotaFinal(test1);
        EjercicioNotas test2 = new EjercicioNotas(7,6,1);
        test1.calculoNotaFinal(test2);
        EjercicioNotas test3 = new EjercicioNotas(10,2,4);
        test1.calculoNotaFinal(test3);
        EjercicioNotas test4 = new EjercicioNotas(6,3,4);
        test1.calculoNotaFinal(test4);
        EjercicioNotas test5 = new EjercicioNotas(3,3,5);
        test1.calculoNotaFinal(test5);
        EjercicioNotas test6 = new EjercicioNotas(4.25F,6,4);
        test1.calculoNotaFinal(test6);
        EjercicioNotas test7 = new EjercicioNotas(2,7,9);
        test1.calculoNotaFinal(test7);
        EjercicioNotas test8 = new EjercicioNotas(-3,2,7);
        test1.calculoNotaFinal(test8);
        EjercicioNotas test9 = new EjercicioNotas(0,-1,8);
        test1.calculoNotaFinal(test9);
        EjercicioNotas test10 = new EjercicioNotas(1,2,-6);
        test1.calculoNotaFinal(test10);

    }
}
