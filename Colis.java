public abstract class Colis implements Comparable<Colis> {

    private String code;
    private int poids;
    private boolean horsDakar;

    public Colis(String code, int poids, boolean horsDakar) {
        if (poids <= 0) {
            throw new IllegalArgumentException(
                "Le poids doit etre superieur a 0"
            );
        }

        this.code = code;
        this.poids = poids;
        this.horsDakar = horsDakar;
    }

    public String getCode() {
        return code;
    }

    public int getPoids() {
        return poids;
    }

    public boolean isHorsDakar() {
        return horsDakar;
    }

    public long tarif() {
        long montant = (long) poids * Parametres.TARIF_KG;

        if (horsDakar) {
            montant += Parametres.SURCHARGE_HORS_DAKAR;
        }

        return montant;
    }

    public abstract String sigle();

    public abstract int priorite();

    @Override
    public String toString() {
        String destination = horsDakar ? "hors-Dakar" : "Dakar";

        return "[" + sigle() + "] " + code + " "
                + poids + "kg " + destination + " "
                + tarif() + " FCFA";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Colis autre = (Colis) o;

        return code.equals(autre.code);
    }

    @Override
    public int hashCode() {
        return 31 * getClass().hashCode() + code.hashCode();
    }

    @Override
    public int compareTo(Colis autre) {
        int resultat = Integer.compare(
            autre.priorite(), this.priorite()
        );

        if (resultat != 0) return resultat;

        resultat = Long.compare(autre.tarif(), this.tarif());

        if (resultat != 0) return resultat;

        return this.code.compareTo(autre.code);
    }
}