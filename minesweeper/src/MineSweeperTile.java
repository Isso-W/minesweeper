public class MineSweeperTile {
    private boolean isMine = false;

    /**
     * set the grid as mine
     */
    public void setMine() {
        isMine = true;
    }

    /**
     * check the grid
     *
     * @return true if it is mine, false if not.
     */
    public boolean isMine() {
        return isMine;
    }
}
