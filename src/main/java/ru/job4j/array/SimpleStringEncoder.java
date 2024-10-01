package ru.job4j.array;

public class SimpleStringEncoder {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 0;
      for (int i = 0; i < input.length(); i++){
          if (symbol == input.charAt(i)) {
              symbol = input.charAt(i);
             counter++;
          }
          else {
            result += symbol;
            if (counter > 1) {
                result += Integer.toString(counter);
            }
            symbol = input.charAt(i);
            counter = 1;
          }
      }
      result += symbol;
      if (counter > 1) {
      result += Integer.toString(counter);
      }
      return result;
    }
}