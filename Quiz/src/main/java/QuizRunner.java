import org.questions.*;

import javax.swing.*;

public class QuizRunner {

    // Create quiz
    private static final Quiz quiz = new Quiz();

    public static void main(String[] args) {

        // Create questions
        String q1 = "Which birds are commonly found in Missouri?";
        Choice[] q1Choices = new Choice[] {
                new Choice("Wedge-tailed Eagle"),
                new Choice("American Robin", true),
                new Choice ("Roseate Spoonbill"),
                new Choice ("Northern Cardinal", true)
        };
        Checkbox question1 = new Checkbox(q1, q1Choices);

        String q2 = "The Missouri state bird is the Eastern Bluebird.";
        Choice[] q2Choices = new Choice[] {
                new Choice("True", true),
                new Choice("False")
        };
        TrueOrFalse question2 = new TrueOrFalse(q2, q2Choices);

        String q3 = "What is the primary color of an American Goldfinch";
        Choice[] q3Choices = new Choice[] {
                new Choice("Yellow", true),
                new Choice("Orange"),
                new Choice("Red"),
                new Choice("Blue")
        };
        MultipleChoice question3 = new MultipleChoice(q3, q3Choices);

        // Add questions to the quiz
        quiz.addQuestions(new Question[] {question1, question2, question3});

        // interact with the user (run quiz and giving score)
        quiz.run();

        String newline = System.lineSeparator();
        System.out.println("You answered " + quiz.getNumCorrect() +
                " of " + quiz.getQuestions().size() +
                " questions correctly. Thanks for playing!" + newline);
    }
}
