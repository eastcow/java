package home.eastcow;

import home.eastcow.pojo.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamAction {

  /**
   *
   *
   *
   * @param args
   */
  public static void main(String[] args) {
      mapToList();
  }


  /**
   * Map To List
   */
  public static void mapToList(){
    Map<Long, List<String>> hashMap = new HashMap<>();
    hashMap.put(1L, List.of("A", "B", "C", "D"));
    hashMap.put(2L, List.of("A", "B", "X", "D", "E"));

    List<User> collect = hashMap.entrySet().stream().map(
        keySet -> new User(keySet.getKey(), (long) keySet.getValue().size(),
            keySet.getValue().stream().anyMatch(value -> value.equals("X"))))
        .collect(Collectors.toList());

    for ( User user : collect ) {
      System.out.println(user.getId());
      System.out.println(user.getCount());
      System.out.println(user.isNameEmpty());
    }
  }

}
