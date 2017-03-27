import java.util.Comparator;

/**
 * Created by EvanMcKenna18 on 3/26/2017.
 */
public class MovieComparator implements Comparator<Movie> {
    public int compare(Movie movie1, Movie movie2){
        if(movie1.getDirector().getLast().equals(movie2.getDirector().getLast())){
            return movie1.getDirector().getFirst().compareTo(movie2.getDirector().getFirst());
        }
        else{
            return movie1.getDirector().getLast().compareTo(movie2.getDirector().getLast());
        }
    }
}
