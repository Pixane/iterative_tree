package com.tree;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        Node<Integer> root = new Node<>();
        root.setData(1);
        root.addChild(13);
        root.addChild(192);
        root.addChild(15);
        root.getChildren().get(0).addChild(22);
        root.getChildren().get(0).addChild(24);
        root.getChildren().get(0).addChild(32);
        root.getChildren().get(1).addChild(25);
        root.getChildren().get(1).addChild(23);
        root.getChildren().get(2).addChild(1254);
        root.getChildren().get(2).addChild(125);
        Node.DFS(root);
    }
}

