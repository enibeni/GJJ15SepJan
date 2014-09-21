package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Main {
    public static void main(String[] args) {
        //approximate flow, simplified for simplicity, skip console setup
        final Player human = new HumanPlayer();
        final ComputerPlayer computerPlayer = new HardComputerPlayer();
        final Field field = new Field55();

        final Game game = new Game(human, computerPlayer, field);

        while(game.isFinished()) {
            try {
                game.makeMove();
            } catch (InvalidMoveException e) {
                System.err.println("Your last move was invalid, please try again");
            }
        }
        System.out.println(game.field.checkState()); //TODO:

    }
}
