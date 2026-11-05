public class ColisExpress extends Colis {

    public ColisExpress(String code, int poids,
                        boolean horsDakar) {
        super(code, poids, horsDakar);
    }

    @Override
    public long tarif() {
        return super.tarif() * 3 / 2;
    }

    @Override
    public String sigle() {
        return "EXP";
    }

    @Override
    public int priorite() {
        return 3;
    }
}