public class Ex1 {
    public static void main(String[] args) {

        Vehicule v = new Moto();

        System.out.println(v.type());
        System.out.println(v.nom);
        System.out.println(((Moto) v).nom);

        System.out.println(v.comparer(v));
        System.out.println(v.comparer((Moto) v));

        System.out.println(v.categorie());

        Object o = v;

        System.out.println(o.equals(v) + " " + (o == new Moto()));

        System.out.println(o.toString().startsWith("Moto@"));

        for (int i = 0; i < Parametres.N % 3; i++) {
            new Vehicule();
        }

        System.out.println(Vehicule.compteur);
    }
}