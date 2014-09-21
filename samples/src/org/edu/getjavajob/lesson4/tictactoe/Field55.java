package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Field55 extends Field {
    public Field55() {
        super(5);
    }

    @Override
    public GameState checkState() {
        //TODO: implement for 5,5
        return GameState.DRAW;
    }
}
