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
        EjercicioNotas test = new EjercicioNotas(0,0,0);
        EjercicioNotas camino1 = new EjercicioNotas(8,6,4);
        test.calculoNotaFinal(camino1);
        EjercicioNotas camino2 = new EjercicioNotas(7,6,1);
        test.calculoNotaFinal(camino2);
        EjercicioNotas camino3 = new EjercicioNotas(10,2,4);
        test.calculoNotaFinal(camino3);
        EjercicioNotas camino4 = new EjercicioNotas(6,3,4);
        test.calculoNotaFinal(camino4);
        EjercicioNotas camino5 = new EjercicioNotas(3,3,5);
        test.calculoNotaFinal(camino5);
        EjercicioNotas camino6 = new EjercicioNotas(4.25F,6,4);
        test.calculoNotaFinal(camino6);
        EjercicioNotas camino7 = new EjercicioNotas(2,7,9);
        test.calculoNotaFinal(camino7);
        EjercicioNotas camino8a = new EjercicioNotas(-3,2,7);
        test.calculoNotaFinal(camino8a);
        EjercicioNotas camino8b = new EjercicioNotas(0,-1,8);
        test.calculoNotaFinal(camino8b);
        EjercicioNotas camino8c = new EjercicioNotas(1,2,-6);
        test.calculoNotaFinal(camino8c);

    }
}
