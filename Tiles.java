/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author maddy
 */
public class Tiles {
    
    int value;
    int tilerandom;
    int[] Tiles = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000, 1500, 2000, 3000, 250, 350, 650, 700, 100, 50, 0};
    
    public Tiles() {
         
    }
    
    /*
     * post: returns the value fo the randomly selected tile
     */
    public int tileSpun() {
         tilerandom = (int) (Math.random() * (20));
         value = Tiles[tilerandom];
        return value;
    }
}
