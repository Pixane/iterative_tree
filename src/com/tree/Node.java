package com.tree;

import java.util.*;

public class Node<T>
{
    private T data;
    private final List<Node<T>> children = new LinkedList<>();
    private int childIndex = 0;

    Node(T input)
    {
        setData(input);
    }

    Node()
    {
        setData(null);
    }

    public void setData(T input)
    {
        data = input;
    }

    public T getData()
    {
        return data;
    }

    public void addChild(T input)
    {
        Node<T> newNode = new Node<>(input);
        children.add(newNode);
    }

    public void removeChild(Node<T> child)
    {
        children.remove(child);
    }

    public void setChildIndex(int input)
    {
        childIndex = input;
    }

    public int getChildIndex()
    {
        if(childIndex < children.size())
        {
            return childIndex;
        }
        else
        {
            childIndex = 0;
            return -1;
        }
    }

    public List<Node<T>> getChildren()
    {
        return  children;
    }

    public Node<T> getChild(int index)
    {
        return children.get(index);
    }

    public static void DFS(Node root)
    {
        Stack<Node> order = new Stack<>();
        Node current;
        int tempIndex = 0;

        order.push(root);

        while(!order.isEmpty())
        {
            current = order.pop();
            System.out.println(current.getData());

            List children = current.getChildren();
            Collections.reverse(children);
            for(Object child : current.getChildren())
            {
                order.push((Node)child);
            }
        }
    }
}
