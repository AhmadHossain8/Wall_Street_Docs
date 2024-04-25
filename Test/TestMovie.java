import static org.junit.Assert.*;

import org.junit.Test;

import MainPackage.Movie;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import junit.framework.TestCase;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestMovie {
    private Movie m1;

    @Before
    public void setUp() {
        List<String> l = new ArrayList<>();
        l.add("Arifin Shuvo");
        l.add("Mahiya Mahi");
        m1 = new Movie("Dhaka Attack", l, "Action", "2017", 500000.5);
    }

    @Test
    public void testGetTitle() {
        assertEquals("Dhaka Attack", m1.getTitle());
    }
    @Test
    public void testSetTitle() {
        m1.setTitle("Jinn");
        assertEquals("Jinn", m1.getTitle());
    }
    @Test
    public void testGetCategory() {
        assertEquals("Action", m1.getCategory());
    }

    @Test
    public void testSetCategory() {
        m1.setCategory("History");
        assertEquals("History", m1.getCategory());
    }

    @Test
    public void testGetReleaseDate() {
        assertEquals("2017", m1.getReleaseDate());
    }

    @Test
    public void testSetReleaseDate() {
        m1.setReleaseDate("2018");
        assertEquals("2018", m1.getReleaseDate());
    }

    @Test
    public void testGetBudget() {
    	assertEquals(Double.valueOf(500000.5), m1.getBudget(), 0.001);
    }

    @Test
    public void testSetBudget() {
        m1.setBudget(300000);
        assertEquals(Double.valueOf(300000.0), m1.getBudget(), 0.00);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testSetNegativeBudget() {
        m1.setBudget(-2.5);
    }

    @Test
    public void testGetCast() {
        List<String> l = new ArrayList<>();
        l.add("Arifin Shuvo");
        l.add("Mahiya Mahi");
        assertEquals(l, m1.getCast());
    }

    @Test
    public void testSetCast() {
        List<String> l = new ArrayList<>();
        l.add("Ferdous");
        m1.setCast(l);
        assertEquals(l, m1.getCast());
    }
}