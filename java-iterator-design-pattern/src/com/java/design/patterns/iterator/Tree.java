package com.java.design.patterns.iterator;

public class Tree extends Aggregate {
    private final int value;
    Tree left;
    Tree right;

    public Tree(int value) {
        this.value = value;
        left = null;
        right = null;
    }

    public int takeValue() {
        return value;
    }

    public void addToLeft(Tree tree) {
        this.left = tree;
    }

    public void addToRight(Tree tree) {
        this.right = tree;
    }

    @Override
    public Iterator createIterator() {
        return new TreeIterator(this);
    }
}
