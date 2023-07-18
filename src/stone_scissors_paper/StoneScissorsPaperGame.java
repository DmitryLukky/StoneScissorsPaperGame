package stone_scissors_paper;


import stone_scissors_paper.enums.AnswerVariants;
import stone_scissors_paper.game.Game;
import stone_scissors_paper.players.Robot;
import stone_scissors_paper.players.User;

public class StoneScissorsPaperGame {

    public static void start() {
        // TODO прочитать имя из консоли и создать объект юзера
        User user = new User("Margarita");
        Robot robot = new Robot();

        Game gameManager = new Game();

        // При вызове у user метода makeAnswer() произойдет получение ответа пользователя из консоли
        AnswerVariants userAnswer = user.makeAnswer();
        AnswerVariants robotAnswer = robot.makeAnswer();

        AnswerVariants result = gameManager.getResult(userAnswer, robotAnswer);

        System.out.println("User answer: " + userAnswer);
        System.out.println("Robot answer: " + robotAnswer);
        System.out.println("Result: " + result);
    }
}

