package Advance_Java;

import java.util.ArrayDeque;

public class Array_Deque
{
    public static void main(String[] args)
    {
        ArrayDeque<Integer> ad1 = new ArrayDeque<>();
        ad1.add(1);
        ad1.add(2);
        ad1.add(3);
        ad1.add(4);

        ad1.addFirst(0);
        System.out.println("Array Deque = "+ad1);
        System.out.println("Size of Queue = "+ad1.size());
        System.out.println(ad1.getFirst());
        System.out.println(ad1.getLast());
    }
}
