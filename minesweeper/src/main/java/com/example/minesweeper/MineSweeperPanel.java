package com.example.minesweeper;
import java.util.*;
public class MineSweeperPanel {
    int length;
    int width;
    int numMines;
    public MineSweeperPanel(int length, int width, int numMines){
        this.length = length;
        this.width = width;
        this.numMines = numMines;
    }
    public MineSweeperTile[][] board;
    /**
     * Start a new game.
     */
    public void reset(){
        //create panel
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < width; j++) {
                board[i][j] = new MineSweeperTile();
            }
        }

        //set mines
        Random random = new Random();
        int xValue = random.nextInt(length);
        int yValue = random.nextInt(width);
        while (numMines != 0){
            if (!board[xValue][yValue].isMine()) {
                board[xValue][yValue].setMine();
                numMines--;
            }
        }
    }

    /**
     * check the grid:
     *      if mine, game over
     *      if not mine:
     *          if mines nearby, show amount of mines
     *          if no mines nearby, check all grid around with no mines nearby
     *
     * @param  x  position of the grid
     * @param  y  position of the grid
     */
    public void check(int x, int y){
        if(board[x][y].isMine()){
            return;
        }
        //TODO
    }
    /**
     * get all position near the given position
     *
     * @param  x  position of the grid
     * @param  y  position of the grid
     * @return a list of all positions near the given position
     */
    public List<MineSweeperTile> getSurroundPosition(int x, int y){
        int xMin = x--;
        int xMax = x++;
        int yMin = y--;
        int yMax = y++;

        if (x == 0){xMin = 0;}
        if (y == 0){yMin = 0;}
        if (x == width){xMax = width;}
        if (y == length){yMax = length;}

        List<MineSweeperTile> result = new ArrayList<>();
        for (int i = xMin; i < xMax; i++) {
            for (int j = yMin; j < yMax; j++) {
                result.add(board[y][x]);
            }
        }
        return result;
    }

    /**
     * if right-click on a not checked grid, flag the grid as mine
     * @param  x  position of the grid
     * @param  y  position of the grid
     */
    private void flag(int x, int y){
        //TODO
    }

}
