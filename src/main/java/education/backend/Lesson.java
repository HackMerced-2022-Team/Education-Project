package education.backend;

import java.util.ArrayList;
import lombok.Data;

@Data
public class Lesson {
    private String title = "";
    private String topic = "";
    private int timeToComplete = 0;
    private String text = "";
    private ArrayList<String> quizQuestions = new ArrayList<String>();
    private ArrayList<String> quizAnswers = new ArrayList<String>();

    private String question1, question2, question3, question4, question5 = "";
    private String answer1, answer2, answer3, answer4, answer5 = "";

    public Lesson() {}

    public Lesson(
        String title, String topic, 
        int timeToComplete, String text) {
        
        this.title = title;
        this.topic = topic;
        this.timeToComplete = timeToComplete;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getTimeToComplete() {
        return timeToComplete;
    }

    public void setTimeToComplete(int timeToComplete) {
        this.timeToComplete = timeToComplete;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getQuizQuestions() {

        quizQuestions.add(question1);
        quizQuestions.add(question2);
        quizQuestions.add(question3);
        quizQuestions.add(question4);
        quizQuestions.add(question5);

        return quizQuestions;
    }

    public ArrayList<String> getQuizAnswers() {

        quizAnswers.add(answer1);
        quizAnswers.add(answer2);
        quizAnswers.add(answer3);
        quizAnswers.add(answer4);
        quizAnswers.add(answer5);

        return quizAnswers;
    }
}
