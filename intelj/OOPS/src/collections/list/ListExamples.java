package collections.list;

import java.util.*;
import java.util.Iterator;

public class ListExamples {
    public static void main(String[] args) {
       ArrayList<String> languages = new ArrayList<>();
        languages.add("Telugu");
        languages.add("English");
        languages.add("Hindi");
        languages.add("Tamil");
        languages.add(2,"kannada");

        Iterator itr=languages.iterator();
        System.out.println("Using ArrayList");
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }

        LinkedList<String> states= new LinkedList<>();
        states.add("Andhra");
        states.add("Telangana");
        states.add("Kerla");
        states.add("Tamilnadu");
        states.add("Karnataka");

        for (int i=0; i<states.size();i++)
        {
            System.out.println(states.get(i));
        }

        Vector<String> captiles= new Vector<>();
        captiles.add("Amaravathi");
        captiles.add("Hydrabad");
        captiles.add("Thiruvanthapuram");
        captiles.add("Chennai");
        captiles.add("Banglore");
        for (int i=0; i<captiles.size();i++)
        {
            System.out.println(captiles.get(i));
        }
    }
}
