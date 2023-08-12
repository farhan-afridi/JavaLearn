class XQue1
{
    public static void main(String[] args)
    {
        long i , j ,r, c = 0;
        for (i = 1 ; 1<=9 ; i++)
        {
            for (j = 0 ; j<=9 ; j++)
            {
                System.out.println(c);
                r = (i*1000)+(i*100)+(i*10)+j;
                if (r%9==0)
                    c++;
            }
        }
    }
}
