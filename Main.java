import java.util.Arrays;
import java.util.List;

public class Main {

    public static double sumofList(List<? extends Number> List){

        double s = 0.0;
        for(Number n: List){
            s += n.doubleValue();
        }
        return s;
    }
    public static void main(String[] args) {

        Pair<String, Integer> datalist1 = new OrderedPair<String, Integer>("Wembo", 8);
        Pair<String, String>  datalist2 = new OrderedPair<String, String>("Opening", "Doors");

        System.out.println(datalist1.getKey()+ " " + datalist2.getValue());
        System.out.println(datalist2.getValue());

        List<Integer> l1 = Arrays.asList(1, 2, 3,5,6,7,8,8);
        System.out.println("sum = " + sumofList(l1));

        List<Double> l2 = Arrays.asList(1.2, 2.3, 3.5, 0.6,0.8);
        System.out.println("sum = " + sumofList(l2));
    }
}
