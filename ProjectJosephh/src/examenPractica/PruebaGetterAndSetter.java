package examenPractica;

public class PruebaGetterAndSetter {

    private int privateP;
    public int publicP;

    public PruebaGetterAndSetter(int privateP, int publicP) {
        this.privateP = privateP;
        this.publicP = publicP;
    }

    public PruebaGetterAndSetter() {
    }

    
    
    public int getTam() {
        return privateP;
    }

    public void privateP(int tam) {
        this.privateP = tam;
    }

    public int publicP() {
        return publicP;
    }

    public void publicP(int tamP) {
        this.publicP = tamP;
    }

    public void mostrar (){
        System.out.println(publicP +" y "+ privateP );
    
    }

}
