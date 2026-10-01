import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> tecnicos = new ArrayList<>();
        tecnicos.add("Ana");
        tecnicos.add("Bruno");
        tecnicos.add("Carla");
        HashMap<String, Integer> escala = new HashMap<>();
        for (String t : tecnicos) escala.put(t, 0);
        int turnos = 12;
        int idx = 0;
        for (int i = 0; i < turnos; i++) {
            String tech = tecnicos.get(idx % tecnicos.size());
            if (escala.get(tech) < 4) {
                escala.put(tech, escala.get(tech) + 1);
            }
            idx++;
        }
        for (String t : tecnicos) {
            System.out.println(t + ": " + escala.get(t) + " turnos");
        }
    }
}