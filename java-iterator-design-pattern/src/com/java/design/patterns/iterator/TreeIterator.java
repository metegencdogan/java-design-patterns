package com.java.design.patterns.iterator;

import java.util.Stack;

public class TreeIterator extends Iterator {

    Tree        start;
    Tree        current;
    Stack<Tree> stack;

    public TreeIterator(final Tree tree) {

        this.start = tree;
        stack = new Stack<>();
    }

    @Override
    public void First() {

        current = start;
        stack = new Stack<>();
        stack.push(current);
    }

    @Override
    public void Next() {

        if (current.right != null) stack.push(current.right);
        if (current.left != null) stack.push(current.left);
    }

    @Override
    public boolean IsDone() {

        return stack.isEmpty();
    }

    @Override
    public int CurrentItem() {

        current = stack.pop();
        return current.takeValue();
    }
}
