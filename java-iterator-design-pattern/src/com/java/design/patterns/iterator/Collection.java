package com.java.design.patterns.iterator;

import java.util.ArrayList;

public class Collection extends Aggregate{

    public ArrayList<Integer> arrayList;

    public Collection(){
        arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(6);
    }

    @Override
    public Iterator createIterator() {
        return new CollectionIterator(this);
    }
}
