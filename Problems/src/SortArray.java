import java.util.Arrays;

public class SortArray {
    public static void main(String[] args) {
        int [] num ={1,2,4,5,3,6};
        String [] character ={"a","b","x","r","e"};

        System.out.println("Before Sorting");

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(character));

        Arrays.sort(num);
        Arrays.sort(character);

        System.out.println("Before Sorting");

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(character));


    }
}
