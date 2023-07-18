package stone_scissors_paper.players;



import stone_scissors_paper.base.Player;
import stone_scissors_paper.enums.AnswerVariants;
import stone_scissors_paper.interfaces.Answers;

import java.util.ArrayList;
import java.util.Random;

public class User extends Player implements Answers {

    public User(String name) {
        super(name);
    }

    @Override
    public AnswerVariants makeAnswer() {
        // TODO написать получение ответа из консоли и удалить метод generateAnswer() из этого класса
        return generateAnswer();
    }

    private AnswerVariants generateAnswer() {
        // Получаем список со всеми возможными вариантами ответа
        ArrayList<AnswerVariants> answerVariants = new ArrayList<>();
        answerVariants.addAll(AnswerVariants.getAllAnswerVariants());

        // Получаем случайно сгенерированный индекс
        int index = new Random().nextInt(answerVariants.size());

        return answerVariants.get(index);
    }
}
