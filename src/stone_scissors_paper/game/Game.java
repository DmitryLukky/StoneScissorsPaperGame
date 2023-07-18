package stone_scissors_paper.game;


import stone_scissors_paper.enums.AnswerVariants;

public class Game {

    /**
     * Возвращаем выигрышный результат
     **/
    public AnswerVariants getResult(AnswerVariants firstAnswer, AnswerVariants secondAnswer) {
        return calculateResult(firstAnswer, secondAnswer);
    }

    /**
     * Рассчитываем выигрышный результат
     **/
    private AnswerVariants calculateResult(AnswerVariants firstAnswer, AnswerVariants secondAnswer) {
        AnswerVariants result = null;

        switch (firstAnswer) {
            case STONE -> {
                if (secondAnswer == AnswerVariants.SCISSORS) result = AnswerVariants.STONE;
                if (secondAnswer == AnswerVariants.PAPER) result = AnswerVariants.PAPER;
                if (secondAnswer == AnswerVariants.STONE) result = null;
            }
            case PAPER -> {
                if (secondAnswer == AnswerVariants.SCISSORS) result = AnswerVariants.SCISSORS;
                if (secondAnswer == AnswerVariants.PAPER) result = null;
                if (secondAnswer == AnswerVariants.STONE) result = AnswerVariants.PAPER;
            }
            case SCISSORS -> {
                if (secondAnswer == AnswerVariants.SCISSORS) result = null;
                if (secondAnswer == AnswerVariants.PAPER) result = AnswerVariants.SCISSORS;
                if (secondAnswer == AnswerVariants.STONE) result = AnswerVariants.STONE;
            }
            default -> {
                return null;
            }
        }

        return result;
    }
}
