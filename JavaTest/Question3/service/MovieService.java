package service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import datamodel.Movie;

public class MovieService {

	//Read movie.csv and output the filtered results
    public List<Movie> readCSV() throws IOException {
        String line;
        String splitBy = ",";
        int count = 0;
        BufferedReader br = new BufferedReader(new FileReader("/C:/Users/duure/Downloads/movie.csv"));
        //List to store movies
        List<Movie> movieList = new ArrayList<>();

        //Reading the file line by line
        while ((line = br.readLine()) != null) {
            if (count != 0) {
            	//Split to details
                String[] movieData = line.split(splitBy);
                
                //New object
                Movie movie = new Movie();

                //Setting the details
                movie.setMovieId(movieData[0].trim());
                movie.setMovieName(movieData[1].trim());
                double rating = movieData[2].isEmpty() ? 0 : Double.parseDouble(movieData[2].trim());
                movie.setRating(rating);

                //Checking for availability
                String availability = movieData[3].trim();
                if (rating >= 4.5 && "not available".equals(availability)) {
                    availability = "HouseFull";
                }
                movie.setAvailability(availability);

                movie.setPrice(Double.parseDouble(movieData[4].trim()));
                movie.setTiming(movieData[5].trim());

                //Adding to list
                movieList.add(movie);
            }
            count++;
        }

        br.close();
        //Filtering the list and output
        return movieList.stream()
                .filter(m -> m.getRating() > 0)
                .sorted(Comparator.comparingDouble(Movie::getRating))
                .filter(m -> "available".equals(m.getAvailability()) || "HouseFull".equals(m.getAvailability()))
                .collect(Collectors.toList());
    }

}
