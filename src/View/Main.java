/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Controller.CharacterCounterController;
import Model.CharacterCounterModel;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CharacterCounterModel model = new CharacterCounterModel();
        CharacterCounterView view = new CharacterCounterView();
        CharacterCounterController controller = new CharacterCounterController(model, view);
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your content: ");
        String inputString = scanner.nextLine();
        controller.processInputString(inputString);

        scanner.close();
    }
}
