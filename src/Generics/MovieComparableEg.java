package Generics;

import java.util.ArrayList;
import java.util.Collections;

public class MovieComparableEg implements Comparable<MovieComparableEg>{
    private double rating;
    private String name;
    private int year;

    // Used to sort movies by year
    public int compareTo(MovieComparableEg m)
    {
        return this.year - m.year;
    }

    // Constructor
    public MovieComparableEg(String nm, double rt, int yr)
    {
        this.name = nm;
        this.rating = rt;
        this.year = yr;
    }

    // Getter methods for accessing private data
    public double getRating() {
        return rating;
    }
    public String getName()   {
        return name;
    }
    public int getYear()      {
        return year;
    }
}

// Driver class
class Main3
{
    public static void main(String[] args)
    {
        ArrayList<MovieComparableEg> list = new ArrayList<MovieComparableEg>();
        list.add(new MovieComparableEg("Force Awakens", 8.3, 2015));
        list.add(new MovieComparableEg("Star Wars", 8.7, 1977));
        list.add(new MovieComparableEg("Empire Strikes Back", 8.8, 1980));
        list.add(new MovieComparableEg("Return of the Jedi", 8.4, 1983));

        Collections.sort(list);

        System.out.println("Movies after sorting : ");
        for (MovieComparableEg movie: list)
        {
            System.out.println(movie.getName() + " " +
                    movie.getRating() + " " +
                    movie.getYear());
        }
    }
}
