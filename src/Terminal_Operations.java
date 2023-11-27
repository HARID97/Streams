import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Terminal_Operations {

    public static void main(String args[]){

        //collect
        List<Integer> number = Arrays.asList(2,3,4,5,3);
        Set square = number.stream().map(x->x*x).collect(Collectors.toSet());

        System.out.println(square);

        //foreach
        square.stream().forEach(y->System.out.println(y));

        //reduce
        int even = number.stream().filter(x->x%2==0).reduce(0,(ans,i)-> ans+i);
        System.out.println("Even Sum: "+even);

    }

}
