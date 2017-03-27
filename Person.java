import java.util.Comparator;
import java.util.StringJoiner;

/**
 * Created by EvanMcKenna18 on 3/24/2017.
 */
public class Person implements Comparable<Person> {
    private String first, last;
    public Person(String fir, String last){
        first = fir;
        this.last = last;
    }
    public String getFirst(){
        return first;
    }

    public String getLast() {
        return last;
    }
    public int compareTo(Person other){
        if(last.equals(other.getLast())){
            return first.compareTo(other.getFirst());
        }
        else{
            return last.compareTo(other.getLast());
        }
    }
    public String toString(){
        return first + " " + last;
    }
}
