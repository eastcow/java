package java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAction {

  /**
   * @param args
   */
  public static void main(String[] args) {
    filter();
//    mapToList();
  }


  public static void filter() {
    List<User> list = new ArrayList<>();
    list.add(new User(0L, "A"));
    list.add(new User(1L, "B"));
    list.add(new User(2L, null));
    list.add(new User(3L, null));

//    List<User> collect = list.stream().filter(user -> user.getName() == null)
//        .map(input -> new User(input.getId(), "Test"))
//        .collect(Collectors.toList());

    List<User> collect = list.stream().filter(user -> user.getName() == null)
//        .map(input -> new User(input.getId(), "Test"))
        .collect(Collectors.toList());

    for (User user : collect) {
      System.out.println(user);
    }

  }

  /**
   * Map To List
   */
  public static void mapToList() {
    Map<Long, List<String>> hashMap = new HashMap<>();
    hashMap.put(1L, List.of("A", "B", "C", "D"));
    hashMap.put(2L, List.of("A", "B", "X", "D", "E"));

    List<User> collect = hashMap.entrySet().stream().map(
        keySet -> new User(keySet.getKey(), (long) keySet.getValue().size(),
            keySet.getValue().stream().anyMatch(value -> value.equals("X"))))
        .collect(Collectors.toList());

    for (User user : collect) {
      System.out.println(user.getId());
      System.out.println(user.getCount());
      System.out.println(user.isNameEmpty());
    }
  }

}
