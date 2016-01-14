/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

/**
 *
 * @author maddy
 */
public class WheelOfFortune {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Creates an object of the board
        Board board = new Board();
        
        //Sets the GUI class to visible
        board.setVisible(true);
        
        //Sets the size of the window when it opens
        board.setSize(708, 535);
        
    }
}
