import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import MainPackage.User;
import MainPackage.Movie;

public class TestUser {
    private User u1;

    @Before
    public void setUp() {
        u1 = new User("ahmad@gmail.com");
    }

    @Test
    public void testGetEmail() {
        assertEquals("ahmad@gmail.com", u1.getEmail());
    }

    @Test
    public void testSetEmail() {
        u1.setEmail("hossain@gmail.com");
        assertEquals("hossain@gmail.com", u1.getEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNullEmail() {
        u1.setEmail("");
    }

    @Test
    public void testEmptyFavoriteslist() {
        assertEquals(0, u1.getFavorites().size());
    }

    @Test
    public void testSetFavoriteMovie() {
        List<String> l = new ArrayList<>();
        l.add("Riaz");
        l.add("Sabnoor");
        Movie m1 = new Movie("Matir Moyna", l, "Romantic", "2002", 1000000.5);
        u1.addFavorites(m1);
        assertEquals(1, u1.getFavorites().size());
        
    }

    @Test
    public void testAddInFavouriteList() {
    	List<String> l = new ArrayList<>();
        l.add("Riaz");
        l.add("Sabnoor");
        Movie m1 = new Movie("Matir Moyna", l, "Romantic", "2002", 1000000.5);
        u1.addFavorites(m1);
        assertTrue(u1.getFavorites().contains(m1));
    }

    @Test
    public void testDeleteinFavouriteList(){
    	List<String> l = new ArrayList<>();
        l.add("Riaz");
        l.add("Sabnoor");
        Movie m1 = new Movie("Matir Moyna", l, "Romantic", "2002", 1000000.5);
        u1.addFavorites(m1);
        assertFalse(u1.getFavorites().contains(m1));
    }

    @Test
    public void testDetails(){
        u1.getDetails();
    }


    @Test
    public void testSearchInFavorites() {
    	List<String> l = new ArrayList<>();
        l.add("Riaz");
        l.add("Sabnoor");
        Movie m1 = new Movie("Matir Moyna", l, "Romantic", "2002", 1000000.5);
        u1.addFavorites(m1);
        List<Movie> searchResults = u1.searchFavoriteMovie("Matir Moyna");
        assertEquals(1, searchResults.size());
    }

    
    @Test
    public void testSearchFavoritesMovie() {
        List<Movie> searchResults = u1.searchFavoriteMovie("Ora 11 jon");
        assertEquals(0, searchResults.size());
    }

    @Test
    public void testSearch() {
    	List<String> l = new ArrayList<>();
        l.add("Riaz");
        l.add("Sabnoor");
        Movie m1 = new Movie("Matir Moyna", l, "Romantic", "2002", 1000000.5);
        List<Movie> movieList = new ArrayList<>();
        movieList.add(m1);
        List<Movie> searchResults = u1.search("Matir Moyna",movieList);
        assertEquals(1, searchResults.size());
    }
}