public class Inventaire {

    public static long valeurAssuree(Object[] objets) {

        long somme = 0;

        for (int i = 0; i < objets.length; i++) {

            if (objets[i] instanceof ColisFragile) {

                ColisFragile c = (ColisFragile) objets[i];

                somme += c.getValeurDeclaree();
            }
        }

        return somme;
    }

    public static int[] compterParType(Object[] objets) {

        int[] resultat = new int[4];

        for (int i = 0; i < objets.length; i++) {

            if (objets[i] instanceof ColisFragile) {
                resultat[2]++;
            }
            else if (objets[i] instanceof ColisExpress) {
                resultat[1]++;
            }
            else if (objets[i] instanceof ColisStandard) {
                resultat[0]++;
            }
            else if (objets[i] != null) {
                resultat[3]++;
            }
        }

        return resultat;
    }
}