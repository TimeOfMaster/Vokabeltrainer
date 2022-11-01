public class VokabelTrainer {
    List<VocCard> unknown = new List<>();
    List<VocCard> know = new List<>();
    List<VocCard> ready = new List<>();

    public VokabelTrainer() {

    }

    public void preset() {
        unknown.append(new VocCard("x", "y", "z"));
        unknown.append(new VocCard("x", "yy", "zz"));
        unknown.append(new VocCard("x", "yyy", "zzz"));
    }

    public void learn() {

    }
    public void add() {  //Der user fügt selber Vokabeln hinzu, die er lernen möchte
        String userImput1 = "";
        String userImput2 = "";
        String userImput3 = "";
        unknown.append(new VocCard(userImput1, userImput2, userImput3));
    }

    public void move(VocCard recCard) {

    }
}
