class ArrTest
{
    public static void main (String[] args)
    {
        int[] arr = {0,1,2,3,4,5,6,7,8,9};
        int i ,c=0;
        for (i = 0 ; i<10 ; i++)
        {
            if (arr[i]==2)
            {
                c=i;
            }
        }
        System.out.println (c);
    }
}