package Advance_Java;

import java.util.LinkedList;
            //  beech me value addition fast hota hai,kyuki ye ek naya memory location me data store krke uska refernce use krta hai,
            // linkedlist monogamous nhii hai ,matlab eke ke baad ek jaisa array hota hai(100, 101 , 102, 103, 104, ....)
            // agar array me naya element beech me dalna hai to uske aage ka sara element khiskana hoga.which slower way to insert an element
public class Linked_list
{
    public static void main(String[] args)
    {
        LinkedList<Integer> k1 = new LinkedList<>();

        k1.add(0);
        k1.add(1);
        k1.add(2);
        k1.add(3);
        k1.add(4);
        k1.add(5);

        k1.addLast(22);
        k1.addFirst(11);

        System.out.println("TheLinked List = "+k1);
        System.out.println("Size of list = "+k1.size());
    }
}