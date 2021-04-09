package com.java.design.patterns.iterator;

public class Listing {
    public static void List(Aggregate aggregate) {
        Iterator i = aggregate.createIterator();
        for (i.First(); !i.IsDone(); i.Next()) {
            System.out.println(i.CurrentItem());
        }
    }
}
