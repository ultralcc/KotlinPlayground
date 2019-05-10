package KotlinInAction.ch08;

import static KotlinInAction.ch08.ProcessTheAnswer.processTheAnswer;

/* Java */

public class ProcessTheAnswerLambda {
    public static void main(String[] args) {
        processTheAnswer(number -> number + 1);
    }
}
