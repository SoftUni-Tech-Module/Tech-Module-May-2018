import java.util.*;

public class SoftUniKaraoke {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] singers = scanner.nextLine().split(", ");
        String[] songs = scanner.nextLine().split(", ");

        LinkedHashMap<String, ArrayList<String>> winners = new LinkedHashMap<>();
        while (true) {
            String line = scanner.nextLine();

            if ("dawn".equals(line))
                break;

            String[] tokens = line.split(", ");
            String singer = tokens[0];
            String song = tokens[1];
            String award = tokens[2];

            boolean isSingerValid = checkData(singer, singers);
            boolean isSongValid = checkData(song, songs);

            if (!isSingerValid || !isSongValid)
                continue;

            winners.putIfAbsent(singer, new ArrayList<>());

            if (!winners.get(singer).contains(award)) {
                winners.get(singer).add(award);
            }
        }

        if (winners.size() == 0) {
            System.out.println("No awards");
        } else {
            winners
                    .entrySet()
                    .stream()
                    .sorted((w1, w2) -> {
                        int compareResult = Integer.compare(w2.getValue().size(), w1.getValue().size());

                        if (compareResult == 0) {
                            compareResult = w1.getKey().compareTo(w2.getKey());
                        }

                        return compareResult;
                    })
                    .forEach(w -> {
                        System.out.printf("%s: %d awards%n", w.getKey(), w.getValue().size());

                        w.getValue()
                                .stream()
                                .sorted(String::compareTo)
                                .forEach(a -> {
                                    System.out.printf("--%s%n", a);
                                });
                    });
        }
    }

    private static boolean checkData(String name, String[] data) {
        for (String item : data) {
            if (item.equals(name))
                return true;
        }

        return false;
    }
}
