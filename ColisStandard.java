public class ColisStandard extends Colis {

    public ColisStandard(String code, int poids,
                         boolean horsDakar) {
        super(code, poids, horsDakar);
    }

    @Override
    public String sigle() {
        return "STD";
    }

    @Override
    public int priorite() {
        return 1;
    }
}