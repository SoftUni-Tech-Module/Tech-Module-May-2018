import java.util.*;
import java.util.stream.Collectors;

public class p04Palindromes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] words = Arrays.stream(scanner.nextLine().split("[,.?!\\s:]+"))
                .toArray(String[]::new);

        List<String> palindromes = new ArrayList<>();

        for (String word : words) {
            if (isPalindrome(word)) {
                palindromes.add(word);
            }
        }

        palindromes = palindromes.stream()
                .distinct()
                .sorted((e1, e2) -> {
                    int res = String.CASE_INSENSITIVE_ORDER.compare(e1, e2);
                    if (res == 0) {
                        res = e2.compareTo(e1);
                    }
                    return res;
                })
                .collect(Collectors.toList());

        System.out.println(String.join(", ", palindromes));
    }

    private static boolean isPalindrome(String word) {
        for (int i = 0; i < word.length() / 2; i++) {
            char leftChar = word.charAt(i);
            char rightChar = word.charAt(word.length() - i - 1);

            if (leftChar != rightChar) {
                return false;
            }
        }

        return true;
    }
}
