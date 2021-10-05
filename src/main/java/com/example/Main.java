package com.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Stack<Integer> stack              = new Stack<>();
        //Queue<Integer> queue              = new PriorityQueue<>();
        ArrayList<Integer> arrayList      = new ArrayList<>();
        LinkedList<Integer> linkedList    = new LinkedList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        LinkedList<Integer> stack    = new LinkedList<>();
        LinkedList<Integer> queue    = new LinkedList<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.pop();
        stack.pop();
        System.out.println(stack);

        queue.offer(5);
        queue.offer(6);
        queue.offer(7);
        queue.poll();
        queue.poll();
        System.out.println(queue);
    }
}
