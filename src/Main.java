import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

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



       System.out.println("TASK 14: GROUP WORDS BY LENGTH");
       String[] wordArray = {"hi","book","java","sun","loop","map"};
       HashMap<Integer, ArrayList<String>> wordsLength = new HashMap<>();
       for (String w : wordArray) {
           int length = w.length();
           wordsLength.computeIfAbsent(length, k -> new ArrayList<>()).add(w);
       }
       System.out.println("Words grouped by length: ");
       for (HashMap.Entry<Integer, ArrayList<String>> entry : wordsLength.entrySet()) {
           System.out.println("Length " + entry.getKey() + ": " + entry.getValue());
       }
       System.out.println();



       System.out.println("TASK 15: FIRST NON-REPEATING CHARACTER");
       String swiss = "swiss";
       HashMap<Character, Integer> freq = new HashMap<>();
       for (char c : swiss.toCharArray()) {
           freq.put(c, freq.getOrDefault(c, 0) + 1);
       }
       char firstNonRepeat = ' ';
       for (char c : swiss.toCharArray()) {
           if (freq.get(c) == 1) {
               firstNonRepeat = c;
               break;
           }
       }
       if (firstNonRepeat != ' ') {
           System.out.println("Non repeat character: " + firstNonRepeat);
       } else {
           System.out.println("None");
       }
       System.out.println();



       System.out.println("TASK 16: TWO SUM (INDEX MAP)");
       int[] nums = {2, 7, 11, 15};
       int target = 9;
       HashMap<Integer, Integer> indexMap = new HashMap<>();
       boolean found = false;
       for (int i = 0; i < nums.length; i++) {
           int complement = target - nums[i];
           if (indexMap.containsKey(complement)) {
               System.out.println("Indices: " + indexMap.get(complement) + " and " + i);
               System.out.println("Values: " + complement + " + " + nums[i] + " = " + target);
               found = true;
               break;
           }
           indexMap.put(nums[i], i);
       }
       if (!found) {
           System.out.println("No pair found");
       }
       System.out.println();



       System.out.println("TASK 17: DETECT DUPLICATES WITH MAP");
       String[] fruits = {"apple", "banana", "apple", "orange", "banana", "kiwi", "apple"};
       HashMap<String, Integer> fruitCount = new HashMap<>();
       for (String fruit : fruits) {
           fruitCount.put(fruit, fruitCount.getOrDefault(fruit, 0) + 1);
       }
       System.out.println("Frequency map: " + fruitCount);
       System.out.println("Unique items (freq = 1): ");
       for (HashMap.Entry<String, Integer> entry : fruitCount.entrySet()) {
           if (entry.getValue() == 1) {
               System.out.println(" " + entry.getKey());
           }
       }
       System.out.println();



       System.out.println("TASK 18: EQUALS & ORDER-INSENSITIVITY");
       HashMap<String, Integer> map1 = new HashMap<>();
       map1.put("Mira", 55);
       map1.put("Aida", 65);
       map1.put("Azat", 72);
       map1.put("Dana", 70);
       HashMap<String, Integer> map2 = new HashMap<>();
       map2.put("Aida", 65);
       map2.put("Dana", 70);
       map2.put("Mira", 55);
       map2.put("Azat", 72);
       System.out.println("Map1: " + map1);
       System.out.println("Map2: " + map2);
       System.out.println("Equals: " + map1.equals(map2));
       System.out.println("HashCode of map1: " + map1.hashCode());
       System.out.println("HashCode of map2: " + map2.hashCode());
       System.out.println();



       System.out.println("TASK 19: REMOVE ENTRIES CONDITIONALLY");
       Iterator<HashMap.Entry<String, Integer>> iterator = map1.entrySet().iterator();
       while (iterator.hasNext()) {
           Map.Entry<String, Integer> entry = iterator.next();
           if (entry.getValue() < 60) {
               System.out.println("Removing: " + entry.getKey() + "=" + entry.getValue());
               iterator.remove();
           }
       }
       System.out.println("Mapafter removal: " + map1);
       System.out.println();



       System.out.println("TASK 20: MERGE SCORES");
       HashMap<String, Integer> scores1 = new HashMap<>();
       scores1.put("Aida", 40);
       scores1.put("Azat", 35);
       scores1.put("Dana", 50);
       HashMap<String, Integer> scores2 = new HashMap<>();
       scores2.put("Dana", 5);
       scores2.put("Mira", 45);
       scores2.put("Azat", 10);
       System.out.println("Scores1: " + scores1);
       System.out.println("Scores2: " + scores2);
       for (HashMap.Entry<String, Integer> entry : scores2.entrySet()) {
           scores1.merge(entry.getKey(), entry.getValue(), Integer::sum);
       }
       System.out.println("Merged scores: " + scores1);
       System.out.println();



       System.out.println("TASK 21: INVERT A MAP (HANDLING COLLISIONS)");
       HashMap<String, Integer> studentsScores = new HashMap<>();
       studentsScores.put("Aida", 67);
       studentsScores.put("Azat", 87);
       studentsScores.put("Dana", 67);
       studentsScores.put("Lili", 78);
       studentsScores.put("Mira", 67);
       studentsScores.put("Aziza", 87);
       System.out.println("Students score: " + studentsScores);
       HashMap<Integer, ArrayList<String>> score = new HashMap<>();
       for (HashMap.Entry<String, Integer> entry : studentsScores.entrySet()) {
           score.computeIfAbsent(entry.getValue(), k -> new ArrayList<>()).add(entry.getKey());
       }
       System.out.println("Inverted: ");
       for (HashMap.Entry<Integer,ArrayList<String>> entry : score.entrySet()) {
           System.out.println("Score " + entry.getKey() + ": " + entry.getValue());
       }
       System.out.println();



       System.out.println("TASK 22: TOP-K FREQUENT WORDS  (TAKEN FROM TASK 17)");
       ArrayList<HashMap.Entry<String, Integer>> entries = new ArrayList<>(fruitCount.entrySet());
       entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));
       System.out.println("Top 2 most frequent words: ");
       for (int i = 0; i < Math.min(2, entries.size()); i++) {
           Map.Entry<String, Integer> entry = entries.get(i);
           System.out.println(" " + (i+1) + ". " + entry.getKey() + " (" + entry.getValue() + " times)");
       }
   }
}
