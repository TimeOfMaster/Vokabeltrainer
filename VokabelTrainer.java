import java.util.Random;

public class VokabelTrainer {
    List<VocCard> unknown = new List<>();
    List<VocCard> know = new List<>();
    List<VocCard> ready = new List<>();

    public VokabelTrainer() {
        preset();
    }

    public void preset() {
        unknown.append(new VocCard("x", "y", "z"));
        unknown.append(new VocCard("x", "yy", "zz"));
        unknown.append(new VocCard("x", "yyy", "zzz"));
    }

    public void learnVoc() {
        String topic = "";
        String questionWord = "";
        String translation = "";
        int counter = 0;
        String input = "";

        if (input.equals(translation))
        {
            counter ++;
        } else {
            if (counter >= 1) {
                counter --;
            }
        }

        
    }

    public void add(String resTopic, String resQuestionWord, String resTranslation) {  //Der user fügt selber Vokabeln hinzu, die er lernen möchte
        unknown.append(new VocCard(resTopic, resQuestionWord, resTranslation));
    }

    public void move(VocCard recCard) {

    }
}
