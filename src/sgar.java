import java.util.Arrays;

class sgar        //Variable Args
{
    public static void main(String[] args)
    {
        System.out.println ("Display of nos");
        dis(1,2,2,3,4,5,5,6,7);
    }
    
    public static void dis(int... arr)
    {
        int a = arr.length;
        int i = 0 ;
        for (i = 0 ; i<a ; i++)
        {
            System.out.print (arr[i]+", ");
        }

        System.out.println("\n"+Arrays.toString(arr));  //Another way to display array
    }
}