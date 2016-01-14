/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author maddy
 */
public class Players {
    
    int money;
    
    public Players(int newMoney) {
        money = newMoney;
    }
    
    /*
     * post: returns the users current money
     */
    public int getMoney() {
        return money;
    }
    
    /*
     * pre: money is an integer 
     */
    public void setMoney(int newMoney) {
        money = newMoney;
    }
}
