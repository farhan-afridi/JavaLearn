import java.util.*;
public class input_basic
{
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        char c = in.next().charAt(0);
        in.nextLine();
        String s = in.nextLine();
        Long l = in.nextLong();
        Short sh = in.nextShort();
        double d = in.nextDouble();
    }
}