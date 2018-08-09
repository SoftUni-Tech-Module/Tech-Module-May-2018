import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Snowwhite {
    public static void main(String[] args) throws IOException, IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        LinkedHashMap<String, Integer> dwarfs = new LinkedHashMap<>();
        HashMap<String, Integer> colors = new HashMap<>();

        String line;
        while (!"Once upon a time".equals(line = reader.readLine())) {
            String[] tokens = line.split(" <:> ");

            String dwarfName = tokens[0];
            String dwarfHatColor = tokens[1];
            int dwarfPhysics = Integer.parseInt(tokens[2]);

            String dwarfId = String.format("%s <:> %s", dwarfName, dwarfHatColor);

            if (!dwarfs.containsKey(dwarfId)) {
                dwarfs.put(dwarfId, dwarfPhysics);
                colors.putIfAbsent(dwarfHatColor, 0);
                colors.put(dwarfHatColor, colors.get(dwarfHatColor) + 1);
            } else {
                int oldPhysics = dwarfs.get(dwarfId);

                if (dwarfPhysics > oldPhysics) {
                    dwarfs.put(dwarfId, dwarfPhysics);
                }
            }
        }

        dwarfs.entrySet()
                .stream()
                .sorted((d1, d2) -> {
                    int compareResult = Integer.compare(d2.getValue(), d1.getValue());

                    if (compareResult == 0) {
                        String d1HatColor = d1.getKey().split(" <:> ")[1];
                        String d2HatColor = d2.getKey().split(" <:> ")[1];

                        compareResult = Integer.compare(
                                colors.get(d2HatColor),
                                colors.get(d1HatColor)
                        );
                    }

                    return compareResult;
                })
                .forEach(d -> {
                    String[] dwarfIdTokens = d.getKey().split(" <:> ");
                    String dwarfName = dwarfIdTokens[0];
                    String dwarfHatColor = dwarfIdTokens[1];

                    Integer dwarfPhysics = d.getValue();

                    System.out.printf("(%s) %s <-> %d%n", dwarfHatColor, dwarfName, dwarfPhysics);
                });
    }
}
