import java.util.Comparator;

/**
 * Created by EvanMcKenna18 on 3/26/2017.
 */
public class ActorsComparator implements Comparator<Person> {
    public int compare(Person act1, Person act2){
        if(act1.getLast().equals(act2.getLast())){
            return act1.getFirst().compareTo(act2.getFirst());
        }
        else{
            return act1.getLast().compareTo(act2.getLast());
        }
    }
    }

