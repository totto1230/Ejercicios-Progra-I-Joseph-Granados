package examenPracticaDrive;

public class ValorPi {

    public void valorPi(int a)  {
        float valor = 4;
        float v = (float) 4 / 3;
        float va=  (float) 4 / 5;
        float vaa = (float) 4 / 7;
        float caja = (valor - v) + (va-vaa);
        float num=0;

        for (float i = 9; i < a; i++) {
            num= num +valor/i;
            
            float result= caja+num;
            
            System.out.println(result);

        }

    }

}
