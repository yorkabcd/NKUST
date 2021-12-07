import java.util.Arrays;
import java.util.HashSet;
import java.util.ArrayList;

public class Arraylist {

    public static void main(String[] args) {

        String[] cars = {"0", "0", "1", "1", "1", "2", "2", "3", "3", "4"}; //宣告陣列
        int l = cars.length;                                                //把陣列長度存入變數l
        HashSet<String> cars2 = new HashSet(Arrays.asList(cars));           //把陣列Array轉成Hash
        int l2 = cars2.toArray().length;                                    //把Hash長度存入變數l2
        ArrayList<String> cars3  = new ArrayList( new HashSet(cars2));      //把Hash轉成Arraylist
        for (int i = 0; i < l - l2; i++) {                                  //把兩個陣列長度差算出來
            cars3.add("_");                                                 //加一個底線到陣列裡
        }
        System.out.println(cars3);                                          //輸出陣列
    }
}
