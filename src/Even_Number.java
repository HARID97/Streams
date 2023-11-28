import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Even_Number {
    public static void main(String args[]){

        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1 = Arrays.asList(2,3,4,5,6,7,8,9,10);

        list2 = list1.stream().filter(x->x%2==0).collect(Collectors.toList());

        System.out.println("Even Number List: "+list2);


    }


}
