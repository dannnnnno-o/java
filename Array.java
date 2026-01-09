import java.util.Scanner;
import java.util.Arrays;
@SuppressWarnings("unused")

public class Array {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
/* 
        String[] names = {"Alberto", "Angel", "Daniel", "Jerrian", "Sanjoe", "Nicole"};
        Arrays.sort(names);
        System.out.print("The Rad Team consists of: ");
        for(int i = 0; i < 6; i++){
            System.out.print(names[i] + " ");
        } 
*/

/*         String[] foods = new String[4];
        printArr(foods);
        Arrays.fill(foods, "pizza");
        printArr(foods); 
*/

        sum(2, 3, 4);

        scanner.close();
    }

    public static void printArr(String[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    public static void sum(int... x){
    int sum = 0;

    for(int num : x){
    sum += num;
    }
    System.out.println(sum);
    }

}

