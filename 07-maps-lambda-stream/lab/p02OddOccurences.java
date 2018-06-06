import java.util.*;

public class p02OddOccurences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split(" "))
                .map(String::toLowerCase)
                .toArray(String[]::new);

        //We use LinkedHashMap because we need to print the words in the input order
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();

        for (String word : words) {
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);
            } else {
                map.put(word, 1);
            }
        }

        //List to keep our odd occurrences
        ArrayList<String> resultWords = new ArrayList<>();

        for (String word : map.keySet()) {
            int counter = map.get(word);
            if (counter % 2 != 0) {
                //Add only odd occurrences
                resultWords.add(word);
            }
        }

        //Print the results
        System.out.println(String.join(", ", resultWords));
    }
}
