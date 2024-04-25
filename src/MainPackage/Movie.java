package MainPackage;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.max;

public class Movie {
    private String title;
    private List<String> cast;
    private String category;
    private String releaseDate;
    private double  budget;

    public Movie(String title, List<String> cast, String category, String releaseDate, double  budget) {
    	if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
    	if (cast == null || cast.isEmpty()) {
            throw new IllegalArgumentException("Cast list cannot be null or empty");
        }
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        if (releaseDate == null || releaseDate.isEmpty()) {
            throw new IllegalArgumentException("Release date cannot be null or empty");
        }
        if (budget < 0) {
            throw new IllegalArgumentException("Budget cannot be negative");
        }
        this.title = title;
        this.cast = new ArrayList<>(cast);
        this.category = category;
        this.releaseDate = releaseDate;
        this.budget = budget;

    }

    public String getTitle() {
        return title;
    }

    public List<String> getCast() {
        return new ArrayList<>(cast);
    }

    public String getCategory() {
        return category;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public double getBudget() {
        return budget;
    }
    public void setTitle(String title) {
        if (title == null || title.isEmpty()) {
            throw new IllegalArgumentException("Title cannot be null or empty");
        }
        this.title = title;
    }

    public void setCast(List<String> cast) {
        if (cast == null || cast.isEmpty()) {
            throw new IllegalArgumentException("Cast list cannot be null or empty");
        }
        this.cast = new ArrayList<>(cast);
    }

    public void setCategory(String category) {
        if (category == null || category.isEmpty()) {
            throw new IllegalArgumentException("Category cannot be null or empty");
        }
        this.category = category;
    }

    public void setReleaseDate(String releaseDate) {
        if (releaseDate == null || releaseDate.isEmpty()) {
            throw new IllegalArgumentException("Release date cannot be null or empty");
        }
        this.releaseDate = releaseDate;
    }

    public void setBudget(double budget) {
        if (budget < 0) {
            throw new IllegalArgumentException("Budget cannot be negative");
        }
        this.budget = budget;
    }

}
