package java;

public class User {

  Long id;
  String name;
  boolean isNameEmpty = true;
  Long count = 0L;

  public User(Long id, String name) {
    this.id = id;
    this.name = name;
  }

  public User(Long id, boolean isNameEmpty, Long count) {
    this.id = id;
    this.isNameEmpty = isNameEmpty;
    this.count = count;
  }

  public User(boolean isNameEmpty, Long count) {
    this.isNameEmpty = isNameEmpty;
    this.count = count;
  }


  public User(Long key, long size, boolean anyMatch) {
      this.id = key;
      this.count = size;
      this.isNameEmpty = anyMatch;
  }

  @Override
  public String toString() {
    return "User{" +
        "id=" + id +
        ", name='" + name + '\'' +
        ", isNameEmpty=" + isNameEmpty +
        ", count=" + count +
        '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isNameEmpty() {
    return isNameEmpty;
  }

  public void setNameEmpty(boolean nameEmpty) {
    isNameEmpty = nameEmpty;
  }

  public Long getCount() {
    return count;
  }

  public void setCount(Long count) {
    this.count = count;
  }
}
