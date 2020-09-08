package day06;

public class Cell /* extends Object */ {
    int row;
    int col;

    public Cell(int row, int col) {
        this.row = row;
        this.col = col;
    }

    /**
     * 重写了Object类中的方法
     */
    public String toString() {
        return "[" + row + "," + col + "]";
    }
}
