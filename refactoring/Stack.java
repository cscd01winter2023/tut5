package refactoring;

import java.util.Vector;

public class Stack<E> extends Vector<E> {

  Stack() {
    super();
  }

  /**
   * Adds an element to the top of the stack
   *
   * @param e
   */
  public void push(E e) {
    super.add(0, e);
  }


  /**
   * Dequeues the most recent element from the stack.
   *
   * @return The element that was dequeued
   */
  public E pop() {

    // Soln:
    E e = super.remove(0);
    return e;
  }
}
