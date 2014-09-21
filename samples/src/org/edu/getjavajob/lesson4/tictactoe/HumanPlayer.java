package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public class HumanPlayer implements Player {
    @Override
    public Field.Point makeMove(Field field) {
        Figure myFigure = field.getCurrentFigure();
        //TODO: implement reading from console
        return new Field.Point(0,0);
    }
}
