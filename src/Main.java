import java.lang.String;
interface Vehicul{
    void afiseazaDetalii();
    double calculeazaVitezaMaxima();
}

class Masina implements Vehicul {
    private String marca;
    Masina(String marca){
        this.marca = marca;
    }
    public void afiseazaDetalii(){
        System.out.println("Marca acestei masini este: " + marca);
    }

    public double calculeazaVitezaMaxima(){
        return 200;
    }
}

class Motocicleta implements Vehicul{
    private boolean cuAtas;

    Motocicleta(boolean cuAtas){
        this.cuAtas = cuAtas;
    }

    public void afiseazaDetalii(){
        if(cuAtas){
            System.out.println("Aceasta este o motocicleta cu atas");
        }
        else {
            System.out.println("Aceasta este o motocicleta fara atas");

        }
    }

    public double calculeazaVitezaMaxima() {
        return 150;
    }
}

class Camion implements Vehicul{
    private double capacitate;

    Camion(double capacitate){
        this.capacitate = capacitate;
    }

    public void afiseazaDetalii() {
        System.out.println("Acesta este un camion cu capacitatea de " + capacitate + " tone");
    }

    public double calculeazaVitezaMaxima(){
        return 100;
    }
}





































