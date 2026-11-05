public class ColisFragile extends ColisStandard {

    private long valeurDeclaree;

    public ColisFragile(String code, int poids,
                        boolean horsDakar,
                        long valeurDeclaree) {

        super(code, poids, horsDakar);
        this.valeurDeclaree = valeurDeclaree;
    }

    public long getValeurDeclaree() {
        return valeurDeclaree;
    }

    @Override
    public long tarif() {
        return super.tarif() + valeurDeclaree / 50;
    }

    @Override
    public String sigle() {
        return "FRG";
    }

    @Override
    public int priorite() {
        return 2;
    }

    @Override
    public String toString() {
        return super.toString() + " (valeur "
                + valeurDeclaree + ")";
    }
}