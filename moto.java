class Moto extends Vehicule {
    protected String nom = "moto";
    private int cylindree = 100 + Parametres.N;

    Moto() {
        super();
        System.out.println("E " + nom + " " + cylindree);
    }

    @Override
    void demarrer() {
        System.out.println("F " + nom + " " + cylindree);
    }

    @Override
    String type() {
        return "Moto" + cylindree / 50;
    }

    @Override
    String comparer(Vehicule v) {
        return "C3";
    }

    static String categorie() {
        return "D-moto";
    }
}