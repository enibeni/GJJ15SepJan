package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public interface Player {
    /**
     * @param field Current field state
     * @return point where player place a figure
     */
    Field.Point makeMove(Field field);
}
