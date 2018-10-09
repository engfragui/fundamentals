package com.github.engfragui.fundamentals.datastructures;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * Created by fguiducci on 6/30/18.
 */
// Java implementation of double ended queue
public class DequeUsage {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();
    deque.add(4);
    deque.add(1);
    deque.add(7);
    deque.add(9);
    deque.add(3);
    deque.add(10);
    System.out.println(deque.getFirst());
    System.out.println(deque.getLast());
  }
}