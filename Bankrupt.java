/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author maddy
 */
public class Bankrupt extends Players{
    
    public Bankrupt(int newMoney) {
        super(newMoney);
    }
    /*
     * pre: tileValue and numberCorrect are integers greater than or equal to zero
     * Sets money to zero
     */
    public void setMoney(int tileValue, int numberCorrect) {
        money = 0;
    }
    /*
     * post: returns the new money value
     */
    public int getMoney() {
        return money;
    }
    
}
