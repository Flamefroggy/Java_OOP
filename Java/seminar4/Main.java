package seminar4;

import seminar4.gb.linkedList.GBLinkedList;

import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        GBLinkedList<Integer> gbNewList = new GBLinkedList<>();
        gbNewList.addLast(6);
        gbNewList.addFirst(-14);
        gbNewList.addLast(254);
        gbNewList.addLast(12);
        gbNewList.add(3, 10);
        gbNewList.remove(1);


        for (Integer i : gbNewList) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Размер списка: " + gbNewList.size());

        System.out.println(gbNewList.get(0));

        Iterator iterator = gbNewList.descendingIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}