class Vehicule {
    protected String nom = "vehicule";
    static int compteur = 0;

    Vehicule() {
        compteur++;
        System.out.println("A " + nom);
        demarrer();
    }

    void demarrer() {
        System.out.println("B " + nom);
    }

    String type() {
        return "Vehicule";
    }

    String comparer(Vehicule v) {
        return "C1";
    }

    String comparer(Moto m) {
        return "C2";
    }

    static String categorie() {
        return "D-vehicule";
    }
}