import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ForceBook {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, HashSet<String>> sides = new LinkedHashMap<>();

        String line;
        while (!"Lumpawaroo".equals(line = reader.readLine())) {
            boolean isArrow = line.contains(" -> ");

            if (isArrow) {
                String[] tokens = line.split(" -> ");

                String forceUser = tokens[0];
                String forceSide = tokens[1];

                for (Map.Entry<String, HashSet<String>> side : sides.entrySet()) {
                    if (side.getValue().contains(forceUser)) {
                        side.getValue().remove(forceUser);
                    }
                }

                if (!sides.containsKey(forceSide)) {
                    sides.put(forceSide, new HashSet<>());
                }

                sides.get(forceSide).add(forceUser);
                System.out.printf("%s joins the %s side!%n", forceUser, forceSide);
            } else {
                String[] tokens = line.split(" \\| ");

                String forceSide = tokens[0];
                String forceUser = tokens[1];

                boolean flag = false;
                for (Map.Entry<String, HashSet<String>> side : sides.entrySet()) {
                    if (side.getValue().contains(forceUser)) {
                        flag = true;
                        break;
                    }
                }
                
                if (flag)
                    continue;

                if (!sides.containsKey(forceSide)) {
                    sides.put(forceSide, new HashSet<>());
                }

                sides.get(forceSide).add(forceUser);
            }
        }

        sides.entrySet()
                .stream()
                .filter(s -> s.getValue().size() > 0)
                .sorted((s1, s2) -> {
                    int res = Integer.compare(s2.getValue().size(), s1.getValue().size());

                    if (res == 0) {
                        res = s1.getKey().compareTo(s2.getKey());
                    }

                    return res;
                })
                .forEach(s -> {
                    System.out.printf("Side: %s, Members: %d%n", s.getKey(), s.getValue().size());

                    s.getValue()
                            .stream()
                            .sorted(String::compareTo)
                            .forEach(m -> System.out.printf("! %s%n", m));
                });
    }
}
