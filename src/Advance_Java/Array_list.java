package Advance_Java;

import java.util.ArrayList;

public class Array_list
{
    public static void main(String[] args)
    {
        ArrayList<Integer> l1 = new ArrayList<>(10);  //by default the limit is 10, but we can specify the size
        ArrayList<Integer> l2 = new ArrayList<>();

        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        l1.add(3);
        l1.add(0);

        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);

        System.out.println("L1 "+l1);
        System.out.println("L2 "+l2);

        l1.addAll(0,l2);
        System.out.println("L1 list after merging with L2 list at index 0 "+l1);

        l1.set(0,0);
        System.out.println(l1);

        l1.clear();
        System.out.println("Final "+l1);

//        System.out.println("First Occurrence of 3 in L1 = "+l1.indexOf(3));
//        System.out.println("Last Occurrence of 3 in L1 = "+l1.lastIndexOf(3));

//        l1.add(3,9);        // shifts the element at that index, and adds the specified element to that index
//        System.out.println("Before removing " +l1);
//        l1.remove(3);
//        System.out.println("After Removing "+l1);  // another way to print
//
//        System.out.println("Does L1 list contains 3 ? " +l1.contains(3));       //returns true or false
//        System.out.println("Does L1 list contains 8 ? " +l1.contains(8));       //returns true or false
//
//        for (int i = 0 ; i<l1.size(); i++)
//        {
//            System.out.println(l1.get(i));
//        }
    }
}
