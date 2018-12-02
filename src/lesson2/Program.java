package lesson2;

public class Program {
  private final static int n = 10;

  public static void main(String[] args) {
    MyArrayList<Character> list = new MyArrayList<>();
    list.insert('a');
    list.insert('b');
    list.insert('c');
    System.out.println(list.find('a'));
    System.out.println(list.find('Z'));
    System.out.println(list.size());
    list.insert('d');
    list.insert('e');
    list.insert('f');
    System.out.println(list);
    System.out.println(list.get(4));
    list.set(4,'u');
    System.out.println(list.get(4));
    list.delete('m');
    list.delete('f');
    System.out.println(list.size());
    System.out.println(list);


  }
}
