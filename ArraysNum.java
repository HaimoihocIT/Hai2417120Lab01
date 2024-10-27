import java.util.Arrays;
import java.util.Scanner;
public class ArraysNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the number of elements in arrays: ");
        int size = input.nextInt();
        int[] numbers = new int[size];

        System.out.println("Enter the elements of arrays: ");
        for(int i=0; i<size; i++) {
        numbers[i] = input.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println("Sort arrays: " + Arrays.toString(numbers));

        int sum=0;
        for(int num : numbers) {
         sum += num;
        }
        double average = (double)  sum / size;
        System.out.println("Sum of elements in arrays: " + sum);
        System.out.println("Average of elements in arrays :" + average);
        input.close();

    }
}
