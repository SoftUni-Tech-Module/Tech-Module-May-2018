import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;

public class p08LogsAggregator {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int count = Integer.parseInt(reader.readLine());
        LinkedHashMap<String, LinkedHashMap<String, Integer>> users = new LinkedHashMap<>();

        for (int i = 0; i < count; i++) {
            String line = reader.readLine();

            String[] tokens = line.split(" ");

            String ip = tokens[0];
            String user = tokens[1];
            int duration = Integer.parseInt(tokens[2]);

            if (users.containsKey(user) == false) {
                users.put(user, new LinkedHashMap<>()); //add the user if absent
            }

            if (users.get(user).containsKey(ip) == false) {
                users.get(user).put(ip, duration); //add the ip and duration if absent
            } else {
                users.get(user).put(ip, users.get(user).get(ip) + duration); //increment the duration if we have the ip already
            }
        }

        users.entrySet()
                .stream()
                .sorted((u1, u2) -> u1.getKey().compareTo(u2.getKey())) //order the users alphabetically
                .forEach(u -> {
                    int totalDuration = u.getValue()
                            .values()
                            .stream()
                            .mapToInt(Integer::intValue)
                            .sum(); //get sum all of ip addresses

                    String[] ips = u.getValue()
                            .keySet()
                            .stream()
                            .sorted()
                            .toArray(String[]::new); //get only ip addresses and sort them alphabetically

                    System.out.printf("%s: %d [%s]%n",
                            u.getKey(),
                            totalDuration,
                            String.join(", ", ips));
                });
    }
}
