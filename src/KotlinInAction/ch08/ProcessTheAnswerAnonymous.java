package KotlinInAction.ch08;

import kotlin.jvm.functions.Function1;

import static KotlinInAction.ch08.ProcessTheAnswer.processTheAnswer;

/* Java */

public class ProcessTheAnswerAnonymous {
    public static void main(String[] args) {
        processTheAnswer(
            new Function1<Integer, Integer>() {
                @Override
                public Integer invoke(Integer number) {
                    System.out.println(number);
                    return number + 1;
                }
            });
    }
}
