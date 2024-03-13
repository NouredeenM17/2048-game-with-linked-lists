package NouredeenHammadDSProject1;

/**
 *
 * @author Nouredeen HAMMAD
 */
public class NouredeenHammadNode<T> {

    private T data;
    private int column;
    private NouredeenHammadNode right;
    private NouredeenHammadNode up;

    public NouredeenHammadNode(int column, T data) {
        this.data = data;
        this.right = null;
        this.up = null;
        this.column = column;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    }

    public NouredeenHammadNode getRight() {
        return right;
    }

    public void setRight(NouredeenHammadNode right) {
        this.right = right;
    }

    public NouredeenHammadNode getUp() {
        return up;
    }

    public void setUp(NouredeenHammadNode up) {
        this.up = up;
    }

}
