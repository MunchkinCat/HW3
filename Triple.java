import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gabe on 9/26/2016.
 */
public class Triple<T1,T2,T3> {

    private T1 left;
    private T2 middle;
    private T3 right;

    public void Triple(T1 left,T2 middle, T3 right) {
        this.left = left;
        this.middle = middle;
        this.right = right;
    }


    public T1 getLeft() {
        return left;
    }

    public void setLeft(T1 left) {
        this.left = left;
    }

    public T2 getMiddle() {
        return middle;
    }

    public void setMiddle(T2 middle) {
        this.middle = middle;
    }

    public T3 getRight() {
        return right;
    }

    public void setRight(T3 right) {
        this.right = right;
    }

    public  toString() {
        return"("+left+", "+middle+","+right+")"
    }


}


