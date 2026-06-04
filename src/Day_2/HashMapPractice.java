package Day_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapPractice {
    public static Map<Integer,List<String>> groupByLength(List<String> words){
        Map<Integer, List<String>> result = new HashMap<>();

        for (String word : words) {
            int length = word.length();

            List<String> list =
                    result.computeIfAbsent(length, k -> new ArrayList<>());

            list.add(word);
        }

        return result;
    }

    public static void main(String[] args) {
        List<String> words = List.of(
                "cat",
                "dog",
                "apple",
                "bat",
                "hello"
        );

        Map<Integer, List<String>> grouped = groupByLength(words);

        System.out.println(grouped);
    }
}
