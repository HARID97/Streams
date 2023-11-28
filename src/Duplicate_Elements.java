import java.util.*;
import java.util.stream.Collectors;

public class Duplicate_Elements {

    public static void main(String[] args) {

        List<Integer> list1= Arrays.asList(2,3,4,5,6,22,3);
        Set<Integer> set1 = new HashSet<>();

        //Finding Duplicate elements in a list
        System.out.println("Duplicate elements are: ");
        list1.stream().filter(y->!set1.add(y)).forEach(z->System.out.println(z));

        //print the first element of the list
        list1.stream().findFirst().ifPresent(y->System.out.println("First Element is: "+y));

        //print total number of elements in the list
        System.out.println("Total number of elements in the list: "+list1.stream().count());

        //maximum value present in the list
        System.out.println("Max Element: "+list1.stream().max(Integer::compare).get());

        //Sorting in reverseOrder
        //list1.stream().sorted(Collections.reverseOrder()).forEach(y->System.out.println(y));
        System.out.println(list1.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList()));



    }




}
