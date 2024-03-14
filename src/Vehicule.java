public class Vehicule{
    public static void main(String[] args){
        Masina masina = new Masina("Ford");
        masina.afiseazaDetalii();
        System.out.println("Viteza maxima: " + masina.calculeazaVitezaMaxima());

        Motocicleta motocicleta = new Motocicleta(true);
        motocicleta.afiseazaDetalii();
        System.out.println("Viteza maxima: " + motocicleta.calculeazaVitezaMaxima());

        Camion camion = new Camion(10);
        camion.afiseazaDetalii();
        System.out.println("Viteza maxima: " + camion.calculeazaVitezaMaxima());
    }
}
