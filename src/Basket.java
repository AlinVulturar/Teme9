import java.util.ArrayList;
import java.util.HashSet;

public class Basket {
    public static void main(String [] args){

        ArrayList<String> basket= new ArrayList<>();
        basket.add("gutuie");
        basket.add("afine");
        basket.add("ananas");
        basket.add("banane");
        basket.add("cirese");
        basket.add("kiwi");
        System.out.println(basket.contains("cirese"));
        System.out.println(basket.contains("piersici"));
        basket.remove("gutuie");
        System.out.println(basket);
        System.out.println(basket.indexOf("afine"));
        basket.add("afine");
        HashSet<String> set = new HashSet<>(basket);
        ArrayList<String> basket2 = new ArrayList<>(set);
        for (String element : basket2) {
            System.out.print(element + " ");
        }
        System.out.println();
        basket.add("mar");
        System.out.println(basket.size());
        int count = 0;
        for (String s : basket) {
            count++;
        }
        System.out.println(count);
        }
    }

