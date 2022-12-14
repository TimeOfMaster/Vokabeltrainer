public class VokabelTrainer {
    List<VocCard> unknown;
    List<VocCard> known;
    List<VocCard> perfect;

    public VokabelTrainer() {
        this.unknown = new List<>();
        this.known = new List<>();
        this.perfect = new List<>();

        preset();
    }

    public void preset() {
        this.unknown.append(new VocCard("x", "y", "z"));
        this.unknown.append(new VocCard("x", "yy", "zz"));
        this.unknown.append(new VocCard("x", "yyy", "zzz"));
    }

    public void learnVoc() {
        String input = "";

        if(!this.unknown.isEmpty()) {
            this.unknown.toFirst();

            while (this.unknown.hasAccess()) {
                String topic = this.unknown.getContent().getTopic();
                String questionWord = this.unknown.getContent().getQuestionWord();
                String translation = this.unknown.getContent().getTranslation();
                int counter = this.unknown.getContent().getCounter();

                if (input.equals(translation)) { // ueberpruefung des input 
                    counter ++;
                } else if (counter >= 1) {
                    counter --;
                }
                this.unknown.getContent().setCounter(counter);

                this.unknown.next();
            }
            
            this.unknown.toFirst();
            while (this.unknown.hasAccess()) {
                if (this.unknown.getContent.getCounter() > 0) {
                    moveUnknown();
                } else {
                    this.unknown.next();
                }
            }

        } else if(!this.known.isEmpty()) {
            this.known.toFirst();

            while (this.known.hasAccess()) {
                String topic = this.known.getContent().getTopic();
                String questionWord = this.known.getContent().getQuestionWord();
                String translation = this.known.getContent().getTranslation();
                int counter = this.known.getContent().getCounter();

                if (input.equals(translation)) { // ueberpruefung des input 
                    counter ++;
                } else if (counter >= 1) {
                    counter --;
                }
                this.known.getContent().setCounter(counter);

                this.known.next();
            }
            
            this.known.toFirst();
            while (this.known.hasAccess()) {
                if (this.known.getContent.getCounter() > 3) {
                    moveKnown();
                } else {
                    this.known.next();
                }
            }

        } else if(!this.perfect.isEmpty()) {
            this.perfect.toFirst();

            while (this.perfect.hasAccess()) {
                String topic = this.perfect.getContent().getTopic();
                String questionWord = this.perfect.getContent().getQuestionWord();
                String translation = this.perfect.getContent().getTranslation();
                int counter = this.perfect.getContent().getCounter();

                if (input.equals(translation)) { // ueberpruefung des input 
                    counter ++;
                } else if (counter >= 1) {
                    counter --;
                }
                this.perfect.getContent().setCounter(counter);

                this.perfect.next();
            }
        }
    }

    public void add(String resTopic, String resQuestionWord, String resTranslation) {  // add VocCard to list unknown
        this.unknown.append(new VocCard(resTopic, resQuestionWord, resTranslation));
    }

    public void moveUnknown() {
        this.known.append(new VocCard(this.unknown.getContent().getTopic(), this.unknown.getContent().getQuestionWord(), this.unknown.getContent().getTranslation(), this.unknown.getContent().getCounter()));
        this.unknown.remove();
    }

    public void moveKnown() {
        this.unknown.append(new VocCard(this.perfect.getContent().getTopic(), this.perfect.getContent().getQuestionWord(), this.perfect.getContent().getTranslation(), this.perfect.getContent().getCounter()));
        this.perfect.remove();
    }
}