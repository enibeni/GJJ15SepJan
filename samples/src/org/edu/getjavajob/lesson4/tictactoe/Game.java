package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Game {
    final Player[] players = new Player[2];
    final Field field;
    Player currentPlayer;

    public Game(Player firstPlater, Player secondPlayer, Field field) {
        this.field = field;
        players[0] = currentPlayer = firstPlater;
        players[1] = secondPlayer;
    }

    public void makeMove() throws InvalidMoveException {
        Field.Point p = currentPlayer.makeMove(field);
        field.makeMove(p);

        //TODO:switch players etc.
    }

    public boolean isFinished() {
        return field.checkState() == GameState.CONTINUING;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }
}
