package Movie_Get_Movie_By_Genre;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName, String company, String genre, int budget) {
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}

class Solution {
    public static Movie[] getMovieByGenre(Movie[] movies, String searchGenre) {
        List<Movie> filteredMovies = new ArrayList<>();
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(searchGenre)) {
                filteredMovies.add(movie);
            }
        }
        return filteredMovies.toArray(new Movie[0]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie[] movies = new Movie[4];

        for (int i = 0; i < 4; i++) {
            movies[i] = new Movie(sc.next(), sc.next(), sc.next(), sc.nextInt());
        }

        String searchGenre = sc.next();
        
        Movie[] filteredMovies = Solution.getMovieByGenre(movies, searchGenre);
        for (Movie movie : filteredMovies) {
            if (movie.getBudget() > 80000000) {
                System.out.println("High Budget Movie");
            } else {
                System.out.println("Low Budget Movie");
            }
        }
        
        sc.close();
    }

}

