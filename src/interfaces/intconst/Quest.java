package interfaces.intconst;
/**
 * Created by WERT on 18.01.2017.
 */

import static interfaces.intconst.AskMe.answer;

public class Quest {

    public static void main(String[] args) {
        Question q = new Question();
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }

}