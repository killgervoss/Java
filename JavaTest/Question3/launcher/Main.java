package launcher;

import datamodel.Movie;
import service.MovieService;
import java.io.IOException;
import java.util.List;

public class Main {
	
	//Main method
    public static void main(String[] args) {
    	//Creating instance to access methods
        MovieService movieService = new MovieService();
        try {
        	//Fetching filtered movies
            List<Movie> filteredMovies = movieService.readCSV();
            
            //Display result
            System.out.println("Available Movies:");
            for (Movie movie : filteredMovies) {
                System.out.println(movie);
            }
        } catch (IOException e) {
            System.out.println("Error reading the CSV file: " + e.getMessage());
        }
    }
}