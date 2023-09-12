/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CharacterCounterModel;
import View.CharacterCounterView;
import java.util.Map;

/**
 *
 * @author ADMIN
 */
public class CharacterCounterController {

    private CharacterCounterModel model;
    private CharacterCounterView view;

    public CharacterCounterController(CharacterCounterModel model, CharacterCounterView view) {
        this.model = model;
        this.view = view;
    }

    public void processInputString(String inputString) {
        model.setInputString(inputString);
        model.countCharacters();
        model.countWords();
        Map<Character, Integer> characterCounts = model.getCharacterCounts();
        Map<String, Integer> wordCounts = model.getWordCounts();

        view.displayResult(inputString, characterCounts, wordCounts);
    }
}

