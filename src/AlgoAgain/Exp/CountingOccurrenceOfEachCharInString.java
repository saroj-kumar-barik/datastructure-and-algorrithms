package AlgoAgain.Exp;

import java.util.HashMap;
import java.util.Map;

public class CountingOccurrenceOfEachCharInString {
    public static void main(String[] args) {
        HashMap<Character,Integer> countOccurrence = new HashMap<>();

        String str = "some text";

        char[] stringArrayStoringCharacters = str.toCharArray();

        for (char c : stringArrayStoringCharacters){
            // for first occurrence of each char it will always be false
            if (countOccurrence.containsKey(c)){
                // countOccurrence.get(c) : used to get the prev occ. of the char
                countOccurrence.put(c,countOccurrence.get(c)+1);
            }
            else
                countOccurrence.put(c,1);
        }

        for (Map.Entry entry : countOccurrence.entrySet() ){
            System.out.println("Character "+entry + " occurs "+entry.getValue()+ " times");
        }
    }
}
