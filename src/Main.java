import java.util.HashMap;

public class Main {
   public static void main(String[] args) {
       System.out.println("TASK 1: CREATE & PUT");
       HashMap<String, Integer> students = new HashMap<>();
       students.put("Aida", 85);
       students.put("Azat", 92);
       students.put("Dana", 77);
       System.out.println("Name: " + students);
       System.out.println("Size: " + students.size());
       System.out.println();



       System.out.println("TASK 2: GET & CONTAINS KEY");
       System.out.println("Aida score: " + students.get("Aida"));
       System.out.println("Mira score: " + students.get("Mira"));
       if (students.containsKey("Mira")) {
           System.out.println("Mira found");
       } else {
           System.out.println("Mira not found");
       }
       System.out.println();



       System.out.println("TASK 3: UPDATE EXISTING VALUE");
       Integer oldValue = students.put ("Dana", 80);
       System.out.println("Old value: " + oldValue);
       System.out.println("Updated: " + students);
       System.out.println();



       System.out.println("TASK 4: REMOVE BY KEY");
       Integer removedAzat = students.remove("Azat");
       System.out.println("Remove Azat?: " + (removedAzat != null));
       System.out.println("Removed value: " + removedAzat);
       if (removedAzat != null) {
           System.out.println("Removal succeed");
       } else {
           System.out.println("Element is not removed");
       }
       Integer removedNon = students.remove("NonExisting");
       System.out.println("Remove Non Existing?: " + (removedNon != null));
       System.out.println("Map now: " + students);
       if (removedNon != null) {
           System.out.println("Removal succeed");
       } else {
           System.out.println("Element is not removed");
       }
       System.out.println();



       System.out.println("TASK 5: IS EMPTY & CLEAR");
       System.out.println("Is empty? - " + students.isEmpty());
       students.clear();
       System.out.println("Now, Is empty? - " + students.isEmpty());
       students.put("Aida", 85);
       students.put("Azat", 92);
       students.put("Dana", 80);
       System.out.println("Re-inserted map: " + students);
       System.out.println();



       System.out.println("TASK 6: GET OR DEFAULT");
       int miraScore = students.getOrDefault("Mira", -1);
       System.out.println("Mira: " + miraScore + "Not found");
       int aidaScore = students.getOrDefault("Aida", -1);
       System.out.println("Aida: " + aidaScore);
       int azatScore = students.getOrDefault("Azat", -1);
       System.out.println("Azat: " + azatScore);
       System.out.println();



       System.out.println("TASK 7: PUT IF ABSENT");
       students.putIfAbsent("Mira", 88);
       students.putIfAbsent("Aida", 90);
       System.out.println("Map: " + students);
       System.out.println("Aida keeps old value, Mira inserted");
       System.out.println();



       System.out.println("TASK 8: REPLACE");
       students.replace("Aida", 85, 86);
       boolean replacedMissing = students.replace("SomeName", 50) != null;
       System.out.println("Map after replace: " + students);
       System.out.println("Replacing missing key: " + replacedMissing);
       students.replace("Aida", 91);
       System.out.println("Map after replace: " + students);
       System.out.println();



       System.out.println("TASK 9: ITERATE OVER KEYS, VALUES, ENTRIES");
       System.out.println("Keys: ");
       for (String key : students.keySet()) {
           System.out.println(key);
       }
       System.out.println("Values: ");
       for (Integer value : students.values()) {
           System.out.println(value);
       }
       System.out.println("Entries: ");
       for (HashMap.Entry<String, Integer> entry : students.entrySet()) {
           System.out.println(entry.getKey() + ": " + entry.getValue());
       }
       System.out.println();



       System.out.println("TASK 10: COUNT HOW MANY HAVE SCORE >= 80");
       int count = 0;
       for (Integer value : students.values()) {
           if (value >= 80) {
               count++;
           }
       }
       System.out.println("Count: " + count);
       System.out.println();



       System.out.println("TASK 11: FIND MAX SCORE & HWO HAS IT");
       int max = Integer.MIN_VALUE;
       String topStudent = " ";
       for (HashMap.Entry<String, Integer> entry : students.entrySet()) {
           if (entry.getValue() > max) {
               max = entry.getValue();
               topStudent = entry.getKey();
           }
       }
       System.out.println("Highest score: "+ topStudent + " " + max);
       System.out.println();



       System.out.println("TASK 12: WORD FREQUENCY COUNTER");
       String text = "Java is fun and Java is powerful and fun";
       text = text.toLowerCase();
       String[] words = text.split(" ");
       System.out.println("Text: " + text);
       HashMap<String, Integer> map = new HashMap<>();
       for (String word : words) {
           map.put(word,map.getOrDefault(word,0) + 1);
       }
       System.out.println("Word frequencies: ");
       System.out.println(map);
       System.out.println();



       System.out.println("TASK 13: CHARACTER FREQUENCY");
       String word = "Mississippi";
       word = word.toLowerCase();
       HashMap<Character, Integer> character = new HashMap<>();
       for (char ch : word.toCharArray()) {
           if (Character.isLetter(ch)) {
               character.put(ch, character.getOrDefault(ch, 0) + 1);
           }
       }
       System.out.println("Character frequency: ");
       System.out.println(character);
       System.out.println();
   }
}
