import java.util.*;

public class for_eachloop
{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int [5];
        int i ;
        //Input in Array
        for (i = 0 ; i<5 ; i++)
        {
            arr[i] = in.nextInt();
        }
        //printing of array using FOR_EACH LOOP
        for(int num : arr)      //it represents for every elemet of array
        {
            System.out.print(num+" ");
        }
    }
}
