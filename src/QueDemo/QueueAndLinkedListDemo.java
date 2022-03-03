package QueDemo;

import sun.awt.image.ImageWatched;

import java.util.*;

public class QueueAndLinkedListDemo {
    public static void main(String[] args) {



        List<String> mylist = new ArrayList<>();


        // priority class implementation of Que
        Queue<String> p = new PriorityQueue<String>();
        Queue<String> l = new LinkedList<String>();
        l.peek();
        // ---------Linked List-------------
        // LinkedList --> list interface and Que interface --> Collection --> Iterator (Hierarchy)
        List<String> linkeL = new LinkedList<String>();
        // linkeL.peek() We cannot usepeek method because peek() is not declared in list interface
        LinkedList Lone = new LinkedList(); // LinkedList is implementing both List and Queue interface
        Lone.add("Luis");
        Lone.add(25);
        Lone.add(true);

        LinkedList<Integer> intList = new LinkedList<>();
        LinkedList<Double> doublist = new LinkedList<>();
        LinkedList<Float> floatList = new LinkedList<>();
        //LinkedList<Student> stuList = new LinkedList<Student>();
        LinkedList<String> obj1 = new LinkedList<>();
        obj1.add("a");
        obj1.add("b");
        obj1.add("c");
        obj1.add("d");
        obj1.add("e");
        obj1.add("f");
        obj1.add("g");

        System.out.println(obj1.size());
        // ---------using offer

        obj1.offer("h");
        obj1.offer("i");
        System.out.println(obj1);

        //
        obj1.set(1, "Luis");
        System.out.println(obj1);
        System.out.println(obj1.size());

        System.out.println(obj1.indexOf("c")); // return index value of element, -->from List interface
        System.out.println(obj1.contains("c"));// return true if element is in a list --> from List interface
        System.out.println(obj1.get(1)); // return element from specified index value --> from List
        System.out.println(obj1.remove("f"));
        System.out.println(obj1);

        System.out.println("----------------------FORLOOP OUTPUT--------------------");

        for(String i: obj1) {
            System.out.println(i);
        }
        System.out.println("-------------------------ITERATOR OUTPUT-------------------------");

        Iterator<String> itr = obj1.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        // ArrayList is better for storing and accessing data.
        // Link list is better for Data manipulation (cleaning filtering etc)


    }
}
