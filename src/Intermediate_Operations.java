import java.util.Arrays;
import java.util.*;
import java.util.stream.Collectors;

public class Intermediate_Operations {

    public static void main(String args[]){

        List<String> list1 = Arrays.asList("Hello","World","Java");

        //map operation
        List final_list = list1.stream().map(x->x+"Hari").collect(Collectors.toList());
        System.out.println("Final List: "+ final_list);

        //filter operation
        List final_list2 = list1.stream().filter(x->x.startsWith("He")).collect(Collectors.toList());
        System.out.println("Final List2: "+ final_list2);

        //sorted operation
        List final_list3 = list1.stream().sorted().collect(Collectors.toList());
        System.out.println("Final List3: "+ final_list3);


    }

}
