package collection.comparator;

import java.util.TreeSet;

public class Example1 {
  public static void main(String[] args) {
    var set1 = new TreeSet<>();//var is sth like auto in C++
    set1.add(new Cat_withCompare(4));
    set1.add(new Cat_withCompare(1));
    set1.add(new Cat_withCompare(2));
    set1.add(new Cat_withCompare(3));

    set1.forEach(System.out::println);
/*
  TreeSet <-> sorted <-> compare.
  In this case there's no comparable contract of Class Cat.

  --> Override comparator methode should be written, just like in C++ with map container.
 */

  }
}
