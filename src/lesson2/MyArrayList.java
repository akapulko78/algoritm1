package lesson2;

public class MyArrayList<Item> {
  private int size = 0;
  private Object[] list = new Object[1];

  private void resize(int capacity) {
    Object[] tmp = new Object[capacity];
    for (int i = 0; i < size; i++) {
      tmp[i] = list[i];
    }
    list = tmp;
  }

  public int size() {
    return size;
  }

  public void insert(Item item) {
    if (size == list.length) {
      resize(2 * list.length);
    }
    list[size++] = item;
  }

  public boolean delete(Item item) {
    int i = 0;
    while (i < size && !list[i].equals(item)) {
      i++;
    }
    if (i == size) {
      return false;
    }
    for (int j = 0; j < size - 1; j++) {
      list[j] = list[j + 1];
    }
    list[size - 1] = null;
    size--;
    if (size == list.length / 4 && size > 0) {
      resize(list.length / 2);
    }

    return true;
  }

  public Item get(int index) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException();
    }
    return (Item) list[index];
  }

  public void set(int index, Item item) {
    if (index < 0 || index > size - 1) {
      throw new IndexOutOfBoundsException();
    }
    list[index] = item;
  }

  public boolean find(Item item) {
    for (int i = 0; i < size - 1; i++) {
      if (list[i].equals(item)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public String toString() {
    String s = "";
    for (int i = 0; i < size; i++) {
      s = s + list[i] + ", ";
    }
    return s;
  }

}
