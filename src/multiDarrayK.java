import java.util.Arrays;
import java.util.Scanner;

public class multiDarrayK
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];

        //input
        for (int row = 0 ; row< arr.length ; row++)
        {
            for (int col = 0 ; col<arr[row].length ; col++)
            {
                arr[row][col] = in.nextInt();
            }
        }

        //OUTPUT
        for (int row = 0 ; row< arr.length ; row++)
        {
            System.out.println(Arrays.toString(arr[row]));
        }
        System.out.println("\n");

        //using For Each Loop
        for(int[] a : arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
