import java.util.Scanner;

class testing
{
    public static void main(String[] args)
    {
//        int x = 4 ;
//        System.out.println(x++);

        Scanner in =new Scanner(System.in);
        System.out.println("Enter three Numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int max = a ;
        int min = a ;
        int mid = 0 ;

        if (max<b || max<c)
        {
            if (max<c)
                max = c;
            if (max<b)
                max = b;
        }
        if (min>b || min>c)
        {
            if (min>c)
                min = c;
            if (min>b)
                min = b;
        }
        mid = (a+b+c)-(min+max);
        System.out.println("2nd Greatest = "+mid);
    }
}
