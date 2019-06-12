package br.pro.hashi.ensino.desagil.desafio.model;

import java.util.Random;

public class Target extends Element {
    private final Board board;
    private final Random r = new Random();
    // --Commented out by Inspection (12/06/19 15:07):private boolean boo = true;


    public Target(int row, int col, Board board) {
        super(row, col);
        this.board = board;
    }

    public void move(){
        int valueX = r.nextInt((1 + 1) + 1) - 1;

        if (col < board.getNumCols() - 1 && col > 0 && !board.isWall(row, col + valueX)) {
            move(0, valueX);
        }
        if (row > 0 && row < board.getNumRows() - 1 && !board.isWall(row + valueX, col)) {
            move(valueX, 0);
        }
    }
}
