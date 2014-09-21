package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public class Field33 extends Field {

    public Field33() {
        super(3);
    }

    @Override
    public GameState checkState() {
        //TODO: implement
        return GameState.CROSS_WINS;
    }
}
