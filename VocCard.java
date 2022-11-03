public class VocCard {
    private String topic;
    private String questionWord;
    private String translation;
    private int counter;

    public VocCard() {

    }

    public VocCard (String resTopic, String resQuestionWord, String resTranslation) {
        topic = resTopic;
        questionWord = resQuestionWord;
        translation = resTranslation;
        counter = 0;
    }

    public String getTopic() {
        return topic;
    }

    public String getQuestionWord() {
        return questionWord;
    }

    public String getTranslation() {
        return translation;
    }

    public int getCounter(){
        return counter;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setQuestionWord(String questionWord) {
        this.questionWord = questionWord;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }

    public void setCounter(int counter){
        this.counter = counter;
    }
}
