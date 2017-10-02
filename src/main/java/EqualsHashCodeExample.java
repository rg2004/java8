import java.util.HashMap;
import java.util.Map;

/**
 * Created by rohit on 8/1/2017.
 */
public class EqualsHashCodeExample {

    public static void main(String[] args) {
        Map<Apple,Integer> map = new HashMap();
        Apple obj1 = new Apple("GREEN");
        map.put(obj1,10);

        Integer value=  map.get(new Apple("GREEN"));

        System.out.println(value);

    }




}

class Apple
{
    String color;

    public String getColor() {
        return color;
    }

    public Apple(String color) {
        this.color = color;
    }


   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Apple apple = (Apple) o;

        return color != null ? color.equals(apple.color) : apple.color == null;
    }

    @Override
    public int hashCode() {
        return color.length();
    }
}