package org.edu.getjavajob.lesson4.tictactoe;

/**
 * @author Alex
 * @since 21.09.14
 */
public abstract class Field {
    protected final Figure[][] field;

    public Field(int size) {
        field = new Figure[size][size];

        for (int i = 0; i < field.length; i++) {
            field[i] = new Figure[size];
            for (int j = 0; j < field[i].length; j++) {
                field[i][j] = Figure.NONE;
            }
        }
    }

    //check current game state
    public abstract GameState checkState();

    public Figure getCurrentFigure() {
        //TODO: implement basing on current game state
        return Figure.CROSS;
    }

    public void makeMove(Point point) throws InvalidMoveException {
        if(field[point.getX()][point.getY()] != Figure.NONE) {
            throw new InvalidMoveException();
        } else {
            field[point.getX()][point.getY()] = getCurrentFigure();
        }
    }

    public void printField() {
        //TODO: implement
    }

    protected static class Point {
        private final int x;
        private final int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

}
