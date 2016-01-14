/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author maddy
 */
public class Vowels extends Letters {

    int money;

    public Vowels() {
    }
    
    /*
     * post: returns the amount of correctly guessed letters
     * Calls the Check method from the parent class (letters)
     */
    public int Check(String userStr, String wordCh) {
        return super.Check(userStr, wordCh);
    }

    /*
     * post: returns the money
     * Takes off $100 for buying a vowel, adds the tile spin multiplied by the number of correct letters
     */
    public int setMoney(int newMoney, int correct, int tileVal) {
        money = newMoney;
        money = (money - 100) + correct * tileVal;
        return money;
    }
}
