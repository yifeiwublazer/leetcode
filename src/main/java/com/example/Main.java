package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList      = new ArrayList<>();
        LinkedList<Integer> linkedList    = new LinkedList<>();
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        // push=addFirst
        // offer=addLast
        // pop=removeFirst throw exception if list is null
        // poll=remove and return head, return null if list is empty
        LinkedList<Integer> stack    = new LinkedList<>(); // push pop
        LinkedList<Integer> queue    = new LinkedList<>(); // offer poll

        // PriorityQueue by default is a min-heap, use comparator to make it a max-help
        Queue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o2 - o1);// reverse order
    }
}
