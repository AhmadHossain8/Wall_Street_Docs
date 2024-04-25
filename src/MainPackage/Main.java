package MainPackage;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
    	User u1 = new User("ahmad@gmail.com" );
    	List<String> l = new ArrayList<>();
    	l.add("Arifin Shuvo");
    	l.add("Mahiya Mahi");
        Movie m1 = new Movie("Dhaka Attack", l, "Action", "2017", 500000.5);
        u1.addFavorites(m1);
        u1.getDetails();

    }
}