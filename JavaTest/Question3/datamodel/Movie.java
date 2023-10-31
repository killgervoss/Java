package datamodel;

public class Movie {
    private String movieId;
    private String movieName;
    private double rating;
    private String availability;
    private double price;
    private String timing;

    // Default constructor
    public Movie() {}

    // Parameterized constructor
    public Movie(String movieId, String movieName, double rating, String availability, double price, String timing) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.rating = rating;
        this.availability = availability;
        this.price = price;
        this.timing = timing;
    }

    // Getters and setters
    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getAvailability() {
        return availability;
    }

    public void setAvailability(String availability) {
        this.availability = availability;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }

    @Override
    public String toString() {
        return "MovieId: " + movieId + ", MovieName: " + movieName + ", Rating: " + rating + ", Availability: " + availability;
    }
}
