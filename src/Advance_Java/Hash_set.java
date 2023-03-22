package Advance_Java;

import java.util.HashSet;
        // does not store duplicate items
public class Hash_set
{
    public static void main(String[] args)
    {
        HashSet<Integer> hs1 = new HashSet<>();

        hs1.add(6);
        hs1.add(8);
        hs1.add(3);
        hs1.add(8);         ///duplicate value, which is only stored single time
        hs1.add(11);

        System.out.println(hs1);
    }
}
