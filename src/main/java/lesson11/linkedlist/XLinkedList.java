package lesson11.linkedlist;

import java.util.StringJoiner;

public class XLinkedList {

  class XItem {
    int value;
    XItem next;

    public XItem(int value) {
      this.value = value;
    }
  }

  private XItem head;

  public XItem getHead() {
    return head;
  }

  public void add(int value) {
    XItem item = new XItem(value);
    if (head == null) {
      head = item;
    } else {
      XItem current = head;
      while (current.next != null) {
        current = current.next;
      }
      current.next = item;
    }
  }

  public boolean contains(int value) {
    XItem current = head;
    while (current != null) {
      if (current.value == value) return true;
      current = current.next;
    }
    return false;
  }

  public void remove(int value) {
    XItem curr = head;
    XItem prev = null;
    while (curr != null) {
      if (curr.value == value) {
        if (prev == null) {
          head = head.next;
          break;
        }
        prev.next = curr.next;
        break;
      }
      prev = curr;
      curr = curr.next;
    }
  }

  public String toString() {
    StringJoiner sj = new StringJoiner(",","[","]");
    XItem current = head;
    while (current != null) {
      sj.add(String.valueOf(current.value));
      current = current.next;
    }
    return sj.toString();
  }

  public int length_weird() {
    XItem curr = head;
    int len = 0;
    while((curr!=null)&&((len=len+1)>0)&&(curr=curr.next)!=null);
    return len;
  }

  public int length_naive() {
    XItem curr = head;
    int len = 0;
    while(curr != null) {
      len++;
      curr = curr.next;
    }
    return len;
  }
  // ----------------------------------------
  public int length_rec(XItem curr) {
    if (curr == null) return 0;
    return length_rec(curr.next) + 1;
  }

  public int length() {
    return length_rec(head);
  }
  // ----------------------------------------
  public int length_rec2(XItem curr, int count) {
    if (curr == null) return count;
    return length_rec2(curr.next, count + 1);
  }

  public int length2() {
    return length_rec2(head, 0);
  }
  // ----------------------------------------
  public void revert() {
    XItem curr = head;
    XItem prev = null;
    while (curr != null) {
      XItem next = curr.next;
      curr.next = prev;
      prev = curr;
      curr = next;
    }
    head = prev;
  }



}
