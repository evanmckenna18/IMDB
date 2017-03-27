import java.util.LinkedList;

/**
 * Created by EvanMcKenna18 on 3/24/2017.
 */
public class Movie implements Comparable<Movie> {
    private String year;
    private String title;
    private Person director;
    private LinkedList<Person> actors;

     public int compareTo(Movie other){
        return this.title.compareTo(other.getTitle());
    }
    public String getTitle(){
        return title;
    }

    public Movie(String line){
        this.year = line.substring(0,4);
        this.title = line.substring(5,38).trim();
        String tempS = line.substring(89);
        this.director = new Person(tempS.substring(0,tempS.indexOf(" ")), tempS.substring(tempS.indexOf(" ")+1));
        actors = new LinkedList<Person>();
        String[] thing = line.substring(38,80).split(",");
        for(String str:thing) {
            str = str.trim();
            actors.add(new Person(str.substring(0,str.indexOf(" ")) , str.substring(str.indexOf(" ")+1)));

        }


    }
    public Person getDirector(){
        return director;
    }

    public LinkedList<Person> getActors() {
        return actors;
    }
}
