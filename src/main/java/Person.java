import java.util.HashMap;
import java.util.Map;

/**
 * Created by rohit on 8/18/2017.
 */
public class Person {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return name != null ? name.equals(person.name) : person.name == null;
    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }

    String name;

    Person(String name)
    {
        this.name=name;
    }


    public static void main(String[] args) {
        Person p1 = new Person("Rohit");
        Person p2 = new Person("Rohit");
        Map<Person,String> personMap = new HashMap<Person,String>();
        personMap.put(p1,"1");
        personMap.put(p2,"2");
        System.out.println("map.size is"+ personMap.size());

    }
}
