import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;


/**
 * Created by EvanMcKenna18 on 3/24/2017.
 */
public class Main {
public static ArrayList<Movie> movies = new ArrayList<Movie>();
    public static void actorInfo(){
        int totalActors = 0;
        for(Movie mov:movies){
            totalActors += mov.getActors().size();
        }
        Set<Person> actors = new TreeSet<Person>(new ActorsComparator());
        for(Movie mov:movies){
            for(Person act:mov.getActors()){
                actors.add(act);
            }
        }
        for(Person act:actors){
            System.out.println(act);
        }
    }
    public static void directors(){

        movies.sort(new MovieComparator());

        for(Movie mov:movies)
            System.out.println(mov.getTitle());
    }
    public static void main(String[] args) throws IOException {

        BufferedReader inputFile =
                new BufferedReader(new FileReader("C:\\Users\\evanmckenna18\\Desktop\\IMDB\\src\\movies.txt"), 1024);
        String line;
        int lineNum = 0;
        while ((line = inputFile.readLine()) != null) {
            movies.add(new Movie(line));
        }
        Collections.sort(movies);
        directors();
    }
}
