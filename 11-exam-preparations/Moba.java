import java.util.*;

public class Moba {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Map<String, Map<String, Integer>> map = new LinkedHashMap<>();

        String line;
        while (!"Season end".equals(line = scanner.nextLine())) {
            String[] tokens = line.split(" -> ");

            if (tokens.length > 1) {
                String player = tokens[0];
                String position = tokens[1];
                int skill = Integer.parseInt(tokens[2]);

                if (!map.containsKey(player)) {
                    map.put(player, new LinkedHashMap<>());
                }

                if (!map.get(player).containsKey(position)) {
                    map.get(player).put(position, skill);
                } else {
                    int oldSkill = map.get(player).get(position);

                    if (skill > oldSkill) {
                        map.get(player).put(position, skill);
                    }
                }
            } else {
                tokens = line.split(" vs ");

                String player1 = tokens[0];
                String player2 = tokens[1];

                if (!map.containsKey(player1) || !map.containsKey(player2)) {
                    continue;
                }

                Map<String, Integer> player1Positions = map.get(player1);
                Map<String, Integer> player2Positions = map.get(player2);

                boolean hasCommonRole = hasCommonRole(player1Positions, player2Positions);

                if (hasCommonRole) {
                    int player1TotalPoints = player1Positions
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    int player2TotalPoints = player2Positions
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    if (player1TotalPoints > player2TotalPoints) {
                        map.remove(player2);
                    } else {
                        map.remove(player1);
                    }
                }
            }
        }

        map
                .entrySet()
                .stream()
                .sorted((p1, p2) -> {
                    int p1TotalPoints = p1
                            .getValue()
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    int p2TotalPoints = p2
                            .getValue()
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    int compareResult = Integer.compare(p2TotalPoints, p1TotalPoints);

                    if (compareResult == 0) {
                        compareResult = p1.getKey().compareTo(p2.getKey());
                    }

                    return compareResult;
                })
                .forEach(p -> {
                    int totalPoints = p
                            .getValue()
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum();

                    System.out.printf("%s: %d skill%n", p.getKey(), totalPoints);

                    p
                            .getValue()
                            .entrySet()
                            .stream()
                            .sorted((r1, r2) -> {
                                int compareResult = Integer.compare(r2.getValue(), r1.getValue());

                                if (compareResult == 0) {
                                    compareResult = r1.getKey().compareTo(r2.getKey());
                                }

                                return compareResult;
                            })
                            .forEach(r -> {
                                System.out.printf("- %s <::> %d%n", r.getKey(), r.getValue());
                            });
                });

    }

    private static boolean hasCommonRole(Map<String, Integer> player1, Map<String, Integer> player2) {
        for (Map.Entry<String, Integer> player1Entries : player1.entrySet()) {
            if (player2.containsKey(player1Entries.getKey())) {
                return true;
            }
        }

        return false;
    }
}