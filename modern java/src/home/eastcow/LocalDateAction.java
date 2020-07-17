package home.eastcow;

import java.time.LocalDate;

public class LocalDateAction {

  public static void main(String[] args) {
    System.out.println(LocalDate.now().isAfter(LocalDate.of(2020, 07, 17)));
    System.out.println(LocalDate.now().isAfter(LocalDate.of(2020, 07, 16)));
    System.out.println(LocalDate.now().isAfter(LocalDate.of(2020, 07, 18)));

    System.out.println(LocalDate.now().isBefore(LocalDate.of(2020, 07, 17)));
    System.out.println(LocalDate.now().isBefore(LocalDate.of(2020, 07, 16)));
    System.out.println(LocalDate.now().isBefore(LocalDate.of(2020, 07, 18)));
  }
}
