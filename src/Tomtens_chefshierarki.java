import java.util.ArrayList;
import java.util.Scanner;


public class Tomtens_chefshierarki {

    private static void Chefshierarkin() {
        Chefshierarki tomten = new Chefshierarki("Tomten", null);
        Chefshierarki glader = new Chefshierarki("Glader", tomten);
        Chefshierarki butter = new Chefshierarki("Butter", tomten);
        Chefshierarki tröger = new Chefshierarki("Tröger", glader);
        Chefshierarki trötter = new Chefshierarki("Trötter", glader);
        Chefshierarki blyger = new Chefshierarki("Blyger", glader);
        Chefshierarki rådjuret = new Chefshierarki("Rådjuret", butter);
        Chefshierarki nyckelpigan = new Chefshierarki("Nyckelpigan", butter);
        Chefshierarki haren = new Chefshierarki("Haren", butter);
        Chefshierarki räven = new Chefshierarki("Räven", butter);
        Chefshierarki skumtomten = new Chefshierarki("Skumtomten", trötter);
        Chefshierarki dammråttan = new Chefshierarki("Dammråttan", skumtomten);
        Chefshierarki gråsuggan = new Chefshierarki("Gråsuggan", räven);
        Chefshierarki myran = new Chefshierarki("Myran", räven);
        Chefshierarki bladlusen = new Chefshierarki("Bladlusen", myran);

        ArrayList<Chefshierarki> nissar = new ArrayList<>();
        nissar.add(tomten);
        nissar.add(glader);
        nissar.add(butter);
        nissar.add(tröger);
        nissar.add(trötter);
        nissar.add(blyger);
        nissar.add(rådjuret);
        nissar.add(nyckelpigan);
        nissar.add(haren);
        nissar.add(räven);
        nissar.add(skumtomten);
        nissar.add(dammråttan);
        nissar.add(gråsuggan);
        nissar.add(myran);
        nissar.add(bladlusen);

        Scanner scan = new Scanner(System.in);
        System.out.println("Ange en nisse för att få fram dess underordnande:");
        String name = scan.nextLine();
        int sumup = 0;
        for (Chefshierarki c : nissar) {
            if (c.getName().equalsIgnoreCase(name)) {
                sumup++;
            }
        }
        if (sumup > 0) {
            getCheferna(name, nissar);
        }
        else {
            System.out.println(name + " är inte en giltig nisse! Försök igen! \n");
            Chefshierarkin();
        }
    }

    private static void getCheferna(String name, ArrayList<Chefshierarki> member) {
        for (Chefshierarki nisse : member) {

            if (nisse.getName().equalsIgnoreCase("tomten"));

            else if (nisse.getChef().getName().equalsIgnoreCase(name)) {
                System.out.println(nisse.getName());
                getCheferna(nisse.getName(), member);
            }
        }
    }

    public static void main(String[] args) {
        Chefshierarkin();
    }
}