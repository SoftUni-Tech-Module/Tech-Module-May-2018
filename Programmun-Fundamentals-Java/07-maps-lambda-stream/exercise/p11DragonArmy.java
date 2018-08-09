import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class p11DragonArmy {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, TreeMap<String, Long[]>> dragons = new LinkedHashMap<>();
        int n = Integer.parseInt(reader.readLine());

        for (int i = 1; i <= n; i++) {
            String[] tokens = reader.readLine().split(" ");

            String type = tokens[0];
            String name = tokens[1];
            long damage = tokens[2].equals("null") ? 45 : Long.parseLong(tokens[2]);
            long health = tokens[3].equals("null") ? 250 : Long.parseLong(tokens[3]);
            long armor = tokens[4].equals("null") ? 10 : Long.parseLong(tokens[4]);

            dragons.putIfAbsent(type, new TreeMap<>());
            dragons.get(type).putIfAbsent(name, new Long[3]);

            dragons.get(type).get(name)[0] = damage;
            dragons.get(type).get(name)[1] = health;
            dragons.get(type).get(name)[2] = armor;
        }

        for (Map.Entry<String, TreeMap<String, Long[]>> type : dragons.entrySet()) {
            TreeMap<String, Long[]> typeDragons = type.getValue();

            double damageAverage = 0;
            double healthAverage = 0;
            double armorAverage = 0;

            for (Map.Entry<String, Long[]> dragon : typeDragons.entrySet()) {
                damageAverage += dragon.getValue()[0];
                healthAverage += dragon.getValue()[1];
                armorAverage += dragon.getValue()[2];
            }

            int size = typeDragons.size();

            damageAverage /= size;
            healthAverage /= size;
            armorAverage /= size;

            System.out.printf("%s::(%.2f/%.2f/%.2f)%n", type.getKey(), damageAverage, healthAverage, armorAverage);

            typeDragons.entrySet()
                    .forEach(d -> {
                        Long[] stats = d.getValue();
                        long dragonDamage = stats[0];
                        long dragonHealth = stats[1];
                        long dragonArmor = stats[2];

                        System.out.printf("-%s -> damage: %d, health: %d, armor: %d%n",
                                d.getKey(), dragonDamage, dragonHealth, dragonArmor);
                    });
        }
    }
}
