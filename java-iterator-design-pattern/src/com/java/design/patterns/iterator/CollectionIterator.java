package com.java.design.patterns.iterator;

public class CollectionIterator extends Iterator {

    private final Collection collection;
    private       int        idx;

    public CollectionIterator(final Collection collection) {
        this.collection = collection;
        idx = 0;
    }

    @Override
    public void First() {
        idx = 0;
    }

    @Override
    public void Next() {
        idx++;
    }

    @Override
    public boolean IsDone() {
        return idx == collection.arrayList.size();
    }

    @Override
    public int CurrentItem() {
        return collection.arrayList.get(idx);
    }
}
