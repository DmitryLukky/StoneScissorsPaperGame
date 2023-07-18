package stone_scissors_paper.enums;

import java.util.ArrayList;

public enum AnswerVariants {
    UNKNOWN, STONE, SCISSORS, PAPER;

    /**
     * Возвращаем все варианты (за исключением UNKNOWN)
     **/
    public static ArrayList<AnswerVariants> getAllAnswerVariants() {
        ArrayList<AnswerVariants> list = new ArrayList<>();

        list.add(STONE);
        list.add(SCISSORS);
        list.add(PAPER);

        return list;
    }
}
