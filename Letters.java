/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

import java.util.ArrayList;

/**
 *
 * @author maddy
 */
public class Letters {

    //Creates the arrayList that the words will be stored in 
    ArrayList<String> wordList = new ArrayList();
    char[][] wordArray = new char[2][6];
    String wordChoice;
    int randomWordChoice;
    char letter;
    String userString = "";
    int money;
    char[][] flippedTiles = new char[2][6];

    public Letters() {
        wordList.add("ALARM CLOCK ");
        wordList.add("SURF  BOARD ");
        wordList.add("WATER BOTTLE");
        wordList.add("PUSH  BUTTON");
        wordList.add("FERRISWHEEL ");
        wordList.add("LONG  SLEEVE");
        wordList.add("POSTERBOARD ");
        wordList.add("CELL  PHONE ");
        wordList.add("STEP  LADDER");
        wordList.add("MIND  READER");
        
    }

    /*
     * pre: userInput and guessWord are strings
     * post: returns the amount of correctly guessed letters
     * Checks how many letters the user guessed correct
     */
    public int Check(String userInput, String guessWord) {
        int total = 0;
        wordChoice = guessWord;
        userString = userInput.toUpperCase();
        if (userInput.length() == 1) {
            letter = userInput.charAt(0);
            for (int i = 0; i < 12; i++) {
                if (letter == guessWord.charAt(i)) {
                    total++;
                }
            }
        } 
        return total;
    }

    /*
     * post: returns the random word selected
     * removes a randomly selected word for the arrayList and returns it
     */
    public String Word() {
        randomWordChoice = (int) (Math.random() * (wordList.size()));
        wordChoice = wordList.get(randomWordChoice);
        wordList.remove(randomWordChoice);
        return wordChoice;
    }

    /*
     * pre: word is a string
     * post: returns an array of the characters of the word
     * Converts the word into a 2D array, a character stored at each index
     */
    public char[][] Convert(String word) {
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (word.charAt(j+i*6) == ' ') {
                    wordArray[i][j] = '/';
                }
                else 
                    wordArray[i][j] = word.charAt(j+i*6);
            }
        }
        return wordArray;
    }

    /*
     * post: returns the flipped tiles
     * Checks to see if the letters of the word match the guessed word, and if so, flips the tile
     */
    public char[][] flipTiles(char[][] displayWord, char[][] unflippedTiles, String guessedLetter, String guessWord) {
        flippedTiles = unflippedTiles;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                if (displayWord[i][j] == '/') {
                    flippedTiles[i][j] = displayWord[i][j];
                } 
                if (guessedLetter.equals(Character.toString(displayWord[i][j]))) {
                    flippedTiles[i][j] = displayWord[i][j];
                }
                
            }
        }
        return flippedTiles;
    }
    
    /*
     * post: returns the money value
     * Adds the value of the spin multiplied by the amount of correct guesses to the current money
     */
    public int setMoney(int newMoney, int correct, int tileVal) {
        money = newMoney;
        money += correct * tileVal;
        return money;
    }
}
