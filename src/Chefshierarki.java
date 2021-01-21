public class Chefshierarki {

    String name;
    Chefshierarki chef;

    public Chefshierarki(String name, Chefshierarki chef) {
        super();
        this.name = name;
        this.chef = chef;
    }

    public String getName() {
        return name;
    }

    public Chefshierarki getChef() {
        return chef;
    }

}