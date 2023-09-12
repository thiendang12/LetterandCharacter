/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class CharacterCounterModel {

    private String inputString;
    private Map<Character, Integer> characterCounts;
    private Map<String, Integer> wordCounts;

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public void countCharacters() {
        characterCounts = new HashMap<>();
        for (char c : inputString.toCharArray()) {
            if (Character.isLetter(c)) {
                characterCounts.put(c, characterCounts.getOrDefault(c, 0) + 1);
            }
        }
    }

    public void countWords() {
        wordCounts = new HashMap<>();
        inputString = inputString.replaceAll("\\s+", " ");

        StringTokenizer tokenizer = new StringTokenizer(inputString);
        while (tokenizer.hasMoreTokens()) {
            String word = tokenizer.nextToken();
            wordCounts.put(word, wordCounts.getOrDefault(word, 0) + 1);
        }
    }

    public int getTotalWords() {
        return wordCounts.size();
    }

    public int getTotalUniqueWords() {
        return (int) wordCounts.values().stream().filter(count -> count == 1).count();
    }

    public Map<Character, Integer> getCharacterCounts() {
        return characterCounts;
    }

    public Map<String, Integer> getWordCounts() {
        return wordCounts;
    }
}
