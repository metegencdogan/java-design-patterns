package com.java.design.patterns.iterator;

public class Main {
    public static void main(String[] args) {
        Listing.List(new Collection());
        Tree tree = new Tree(12);
        Tree right = new Tree(13);
        Tree left = new Tree(15);
        Tree right2 = new Tree(20);

        tree.addToLeft(left);
        tree.addToRight(right);
        right.addToRight(right2);

        Listing.List(tree);
    }
}
