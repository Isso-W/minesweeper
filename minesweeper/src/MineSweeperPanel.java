import java.util.*;
public class MineSweeperPanel {
    public MineSweeperTile[][] board;
    /**
     * Start a new game.
     *
     * @param  x  number of columns
     * @param  x  number of rows
     * @param  numMines  number of Mines
     */
    public void reset(int x, int y, int numMines){
        //create panel
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                board[i][j] = new MineSweeperTile();
            }
        }

        //set mines
        Random random = new Random();
        int xValue = random.nextInt(x);
        int yValue = random.nextInt(y);
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

    }

    /**
     * if right-click on a not checked grid, flag the grid as mine
     * @param  x  position of the grid
     * @param  y  position of the grid
     */
    private void flag(int x, int y){

    }

}
