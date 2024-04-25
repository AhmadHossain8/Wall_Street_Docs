package MainPackage;

import java.util.Collections;
import java.util.ArrayList;
import java.util.List;
import java.util.Comparator;

public class User {
    private String email;
    private List<Movie> favorites;

    public User(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.email = email;
        this.favorites = new ArrayList<>();
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("Email cannot be null or empty");
        }
        this.email = email;
    }


    public List<Movie> getFavorites() {
        return favorites;
    }
    
    public void addFavorites(Movie movie) {
        this.favorites.add(movie);
    }

    public void deleteFavorites(Movie movie){
        this.favorites.remove(movie);
    }

    public void getDetails(){
        System.out.println("Email: " + email+ "\nFavorite movie list : ");
        for (Movie m : favorites) {
            System.out.println(m.getTitle()+ " , ");
        }
    }


    public List<Movie> searchFavoriteMovie(String query){
        List<Movie> m = new ArrayList<>();
        if(query.isEmpty() || query == null)return  m;
        for (Movie movie : favorites) {
            if (movie.getTitle().contains(query))
                   m.add(movie);
        }
        return m;
    }

    public List<Movie> search(String query,List<Movie> Movies){
        List<Movie> m = new ArrayList<>();
        if(query.isEmpty() || query == null)return m;
        for (Movie movie : favorites) {
            if (movie.getTitle().contains(query))
                   m.add(movie);
        }
        return m;
    }

}

