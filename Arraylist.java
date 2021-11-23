import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        String[] cars = {"0", "0", "1", "1", "1", "2", "2", "3", "3", "4"};
        int l = cars.length;
        HashSet<String> cars2 = new HashSet(Arrays.asList(cars));
        int l2 = cars2.toArray().length;
        ArrayList<String> cars3  = new ArrayList( new HashSet(cars2));
        for (int i = 0; i < l - l2; i++) {
            cars3.add("_");
        }
        System.out.println(cars3);
    }
}