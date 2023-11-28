import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Numbers_startingwith_one {

    public static void main(String[] args) {
        int cap=6;
        Scanner scanner = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        for(int i=0;i<cap;i++){
            System.out.println("Enter the numbers: ");
            list1.add(scanner.nextInt());
        }
        System.out.println(list1.stream().filter(x->Integer.toString(x).startsWith("1")).collect(Collectors.toList()));

    }

}
