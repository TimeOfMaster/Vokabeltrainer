import java.util.Random;
public class VokabelTrainer {
    List<VocCard> unknown = new List<>(); //Liste der Vokabeln die neu hinzugefügt wurden
    List<VocCard> know = new List<>(); //Liste der Vokabeln die einmal richtig waren
    List<VocCard> ready = new List<>(); //Liste der Vokabeln die zweimal richtig waren

    public VokabelTrainer() {
        preset();
    }

    public void preset() {
        unknown.append(new VocCard("x", "y", "z")); //fügt neue Vokabeln hinzu
        unknown.append(new VocCard("x", "yy", "zz"));
        unknown.append(new VocCard("x", "yyy", "zzz"));
    }

    public void learnVoc() {
       if(!unknown.isEmpty())
           {
               while (!unknown.isEmpty()) {
                   String topic = "";
                   String questionWord = "";
                   String translation = "";
                   int counter = 0;
                   String input = "";

                   if (input.equals(translation)) { //man kriegt ein questionword, man schreibt ein input, input wird überprüft ob es = translation ist
                       counter++;
                   } else {
                       if (counter >= 1) {
                           counter--;
                       }
                   }
               }
           }
    }


    public void add(String resTopic, String resQuestionWord, String resTranslation) {  //Der user fügt selber Vokabeln hinzu, die er lernen möchte
        unknown.append(new VocCard(resTopic, resQuestionWord, resTranslation));
    }
    public void findOutLength(){

    }

    public void move(VocCard recCard) {

    }
}

