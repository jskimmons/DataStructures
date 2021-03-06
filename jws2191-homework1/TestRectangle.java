import java.util.List;
import java.util.ArrayList;

public class TestRectangle {

    public static <T extends Comparable<? super T>>  T findMax(List<T> items) {
        T largestObj = items.get(0);

        for(T obj : items){
            if(obj.compareTo(largestObj) > 0){
                largestObj = obj;
            }
        }
        return largestObj;
    }

    public static void main(String[] args) {

        List<Rectangle> rects = new ArrayList<>();

        rects.add(new Rectangle(2,3));
        rects.add(new Rectangle(3,2));
        rects.add(new Rectangle(1,1));
        rects.add(new Rectangle(6,2));

        // This should print the return value of the toString() method
        // of the 6 x 2 rectangle.
        System.out.println(findMax(rects));

    }

}