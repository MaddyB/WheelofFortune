/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package wheeloffortune;

import javax.swing.*;
import java.util.Arrays;

/**
 *
 * @author maddy
 */
public class Board extends javax.swing.JFrame {

    /**
     * Creates new form Board
     */
    JFrame frame;
    String player1GuessInput = "";
    String player2GuessInput = "";
    String player3GuessInput = "";
    int numberCorrect;
    int counter = 0;
    char[][] charArray = new char[2][6];
    int tileSpun;
    int money;
    char[][] flippedTiles = {{'!', '!', '!', '!', '!', '!'}, {'!', '!', '!', '!', '!', '!'}};
    //Creates a tile object
    Tiles tile = new Tiles();
    //Creates two letter objects, one that will be used to return 'letter' to a letter object
    Letters letter = new Letters();
    Letters temp = new Letters();
    String guessWord = letter.Word();
    //Creates a bankrupt object
    Bankrupt bankrupt = new Bankrupt(0);
    //Creates a vowels object
    Vowels vowels = new Vowels();
    //Creates the three players objects
    Players Player1 = new Players(0);
    Players Player2 = new Players(0);
    Players Player3 = new Players(0);

    public Board() {
        initComponents();

        jTextField1.setEditable(false);
        jTextField2.setEditable(false);
        jTextField3.setEditable(false);
        jTextField4.setEditable(false);
        jTextField4.setVisible(false);
        jTextArea1.setEditable(false);
        jTextArea2.setEditable(false);
        jTextArea3.setEditable(false);
        jTextArea4.setEditable(false);
        jTextArea5.setEditable(false);
        jTextArea6.setEditable(false);
        jTextArea8.setText("Money: $" + Player1.getMoney());
        jTextArea9.setEditable(false);
        jTextArea10.setEditable(false);
        jTextArea11.setEditable(false);
        jTextArea12.setEditable(false);
        jTextArea13.setEditable(false);
        jTextArea14.setEditable(false);
        jTextArea15.setEditable(false);
        jTextArea16.setEditable(false);
        jTextArea17.setEditable(false);
        jTextArea18.setEditable(false);
        jTextArea19.setEditable(false);
        jTextArea10.setText("Money: $" + Player2.getMoney());
        jTextArea18.setText("Money: $" + Player3.getMoney());
        jTextArea19.setEditable(false);
        jTextArea19.setText("WELCOME TO WHEEL OF FORTUNE \n"
                + "How To Play: \n"
                + "Player 1 will start by spinning and then guessing a letter \n"
                + "If the letter is correct, they will keep guessing, if not, Player 2 can spin and repeat the process \n"
                + "The guessing will continue moving on to the next player until the word is guessed \n"
                + "Once the first word is guessed, the process will repeat starting with the second player for the second word \n"
                + "When the second word is guessed, the process will repeat starting with the third player for the third word \n"
                + "When the third word has been guessed, the player with the most money will move on to the final round \n"
                + "For the final round, the player with the most money will get to guess letters \n"
                + "If they get any of the letters wrong, the game is over \n"
                + "The game will continue until the player guesses a wrong letter \n"
                + "Rules: \n"
                + "The vowels are a, e, i, o and u. It is assumed when you guess one, you will click the buy a vowel button. \n"
                + "You can only guess characters. If you guess a word, the game will move onto the next player. \n"
                + "If there are ties between the players with the most money after the third round, there will not be a fourth round and the game will be over. \n"
                + "Only guess a letter once for each word. \n"
                + "/ represents a blank space. \n"
                + "If you spin $0, that is bankrupt. Your money will be set to zero and the guessing will move on to the next player \n"
                + "When are you done reading the instructions, press the button.");
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        jButton6.setVisible(false);
        jButton7.setVisible(false);
        jButton8.setVisible(false);
        jButton9.setVisible(false);
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));

        //Sets the array that stores the words individual letters at each index to the array of the word that was chosen
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                charArray[i][j] = letter.Convert(guessWord)[i][j];
            }
        }


    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton10 = new javax.swing.JButton();
        jScrollPane19 = new javax.swing.JScrollPane();
        jTextArea19 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane9 = new javax.swing.JScrollPane();
        jTextArea9 = new javax.swing.JTextArea();
        jScrollPane10 = new javax.swing.JScrollPane();
        jTextArea10 = new javax.swing.JTextArea();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jScrollPane11 = new javax.swing.JScrollPane();
        jTextArea11 = new javax.swing.JTextArea();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea12 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jTextArea13 = new javax.swing.JTextArea();
        jScrollPane14 = new javax.swing.JScrollPane();
        jTextArea14 = new javax.swing.JTextArea();
        jScrollPane15 = new javax.swing.JScrollPane();
        jTextArea15 = new javax.swing.JTextArea();
        jScrollPane16 = new javax.swing.JScrollPane();
        jTextArea16 = new javax.swing.JTextArea();
        jScrollPane17 = new javax.swing.JScrollPane();
        jTextArea17 = new javax.swing.JTextArea();
        jScrollPane18 = new javax.swing.JScrollPane();
        jTextArea18 = new javax.swing.JTextArea();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton10.setText("Continue");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton10);
        jButton10.setBounds(600, 470, 101, 29);

        jTextArea19.setColumns(20);
        jTextArea19.setRows(5);
        jScrollPane19.setViewportView(jTextArea19);

        getContentPane().add(jScrollPane19);
        jScrollPane19.setBounds(0, 0, 710, 520);

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1);
        jTextField1.setBounds(30, 440, 120, 50);
        getContentPane().add(jTextField2);
        jTextField2.setBounds(250, 440, 120, 50);
        getContentPane().add(jTextField3);
        jTextField3.setBounds(480, 440, 110, 50);

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(70, 40, 80, 120);

        jLabel1.setText("1.");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(30, 420, 45, 16);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(150, 40, 80, 120);

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea3.setColumns(20);
        jTextArea3.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea3.setRows(5);
        jScrollPane3.setViewportView(jTextArea3);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(230, 40, 80, 120);

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea4.setColumns(20);
        jTextArea4.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea4.setRows(5);
        jScrollPane4.setViewportView(jTextArea4);

        getContentPane().add(jScrollPane4);
        jScrollPane4.setBounds(310, 40, 80, 120);

        jScrollPane5.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea5.setColumns(20);
        jTextArea5.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        getContentPane().add(jScrollPane5);
        jScrollPane5.setBounds(390, 40, 80, 120);

        jScrollPane6.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jTextArea6.setColumns(20);
        jTextArea6.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea6.setRows(5);
        jScrollPane6.setViewportView(jTextArea6);

        getContentPane().add(jScrollPane6);
        jScrollPane6.setBounds(470, 40, 80, 120);

        jButton1.setText("Guess");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(150, 470, 97, 29);

        jButton2.setText("Buy a Vowel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(40, 410, 118, 29);

        jButton3.setText("Spin");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(150, 440, 75, 29);

        jScrollPane7.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane7.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane7.setViewportView(jTextArea7);

        getContentPane().add(jScrollPane7);
        jScrollPane7.setBounds(30, 370, 110, 40);

        jScrollPane8.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane8.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea8.setEditable(false);
        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jScrollPane8.setViewportView(jTextArea8);

        getContentPane().add(jScrollPane8);
        jScrollPane8.setBounds(30, 330, 110, 40);

        jScrollPane9.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane9.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea9.setColumns(20);
        jTextArea9.setRows(5);
        jScrollPane9.setViewportView(jTextArea9);

        getContentPane().add(jScrollPane9);
        jScrollPane9.setBounds(260, 370, 110, 40);

        jScrollPane10.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane10.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea10.setColumns(20);
        jTextArea10.setRows(5);
        jScrollPane10.setViewportView(jTextArea10);

        getContentPane().add(jScrollPane10);
        jScrollPane10.setBounds(260, 330, 110, 40);

        jButton4.setText("Buy a Vowel");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(260, 410, 120, 30);

        jButton5.setText("Guess");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(370, 470, 82, 29);

        jButton6.setText("Spin");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6);
        jButton6.setBounds(370, 440, 75, 29);

        jScrollPane11.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane11.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea11.setColumns(20);
        jTextArea11.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea11.setRows(5);
        jScrollPane11.setViewportView(jTextArea11);

        getContentPane().add(jScrollPane11);
        jScrollPane11.setBounds(70, 160, 80, 120);

        jScrollPane12.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane12.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea12.setColumns(20);
        jTextArea12.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea12.setRows(5);
        jScrollPane12.setViewportView(jTextArea12);

        getContentPane().add(jScrollPane12);
        jScrollPane12.setBounds(150, 160, 80, 120);

        jScrollPane13.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane13.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea13.setColumns(20);
        jTextArea13.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea13.setRows(5);
        jScrollPane13.setViewportView(jTextArea13);

        getContentPane().add(jScrollPane13);
        jScrollPane13.setBounds(230, 160, 80, 120);

        jScrollPane14.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane14.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea14.setColumns(20);
        jTextArea14.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea14.setRows(5);
        jScrollPane14.setViewportView(jTextArea14);

        getContentPane().add(jScrollPane14);
        jScrollPane14.setBounds(310, 160, 80, 120);

        jScrollPane15.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane15.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea15.setColumns(20);
        jTextArea15.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea15.setRows(5);
        jScrollPane15.setViewportView(jTextArea15);

        getContentPane().add(jScrollPane15);
        jScrollPane15.setBounds(390, 160, 80, 120);

        jScrollPane16.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane16.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea16.setColumns(20);
        jTextArea16.setFont(new java.awt.Font("Engravers MT", 0, 18)); // NOI18N
        jTextArea16.setRows(5);
        jScrollPane16.setViewportView(jTextArea16);

        getContentPane().add(jScrollPane16);
        jScrollPane16.setBounds(470, 160, 80, 120);

        jScrollPane17.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane17.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea17.setColumns(20);
        jTextArea17.setRows(5);
        jScrollPane17.setViewportView(jTextArea17);

        getContentPane().add(jScrollPane17);
        jScrollPane17.setBounds(480, 370, 110, 40);

        jScrollPane18.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane18.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        jTextArea18.setColumns(20);
        jTextArea18.setRows(5);
        jScrollPane18.setViewportView(jTextArea18);

        getContentPane().add(jScrollPane18);
        jScrollPane18.setBounds(480, 330, 110, 40);

        jButton7.setText("Buy a Vowel");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7);
        jButton7.setBounds(490, 410, 120, 30);

        jButton8.setText("Spin");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8);
        jButton8.setBounds(590, 440, 75, 29);

        jButton9.setText("Guess");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9);
        jButton9.setBounds(590, 470, 82, 29);

        jTextField4.setText("GAME OVER");
        getContentPane().add(jTextField4);
        jTextField4.setBounds(280, 300, 90, 20);

        jLabel2.setText("2.");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(250, 420, 12, 16);

        jLabel4.setText("3.");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(480, 420, 12, 16);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/wheel_of_fortune_logo.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 710, 510);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    //When the user guesses a letter, checks to see if the letter is in the word, either gives the player money or moves onto the next player and displays the letter
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Sets the letter object back to a letter
        letter = temp;
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        player1GuessInput = jTextField1.getText();
        player1GuessInput = player1GuessInput.toUpperCase();
        numberCorrect = letter.Check(player1GuessInput, guessWord);
        Player1.setMoney(letter.setMoney(Player1.getMoney(), tileSpun, numberCorrect));
        //Sets the flipped tiles to the ones they have guessed
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player1GuessInput, guessWord)[i][j];
            }
        }
        jTextArea8.setText("Money: $" + Player1.getMoney());
        //Sets all the text areas to the letters being displayed
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField1.setEditable(false);
        jTextField1.setText("");
        jButton3.setVisible(true);
        //If they are the final player and they guess a wrong letter, game over or if they got no correct answers or bankrupt, moves on to the next player 
        if (counter >= 3 && numberCorrect == 0 || counter >= 3 && tileSpun == 0) {
            jButton3.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        } else if (numberCorrect == 0 || tileSpun == 0) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton6.setVisible(true);
        }

        //If all the letters have been guessed, move onto the next round
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            //If the first word has been guessed, lets the second player start
            if (counter == 1) {
                jButton6.setVisible(true);
                jButton3.setVisible(false);
            } //If the second word has been guessed, lets the third player start
            else if (counter == 2) {
                jButton8.setVisible(true);
                jButton3.setVisible(false);
            } //When the third word has been guessed, determines which player won and lets them play the final round, and checks if there is a tie
            else if (counter >= 3) {
                if (Player2.getMoney() > Player1.getMoney() && Player2.getMoney() > Player3.getMoney()) {
                    jButton6.setVisible(true);
                    jButton3.setVisible(false);
                } else if (Player3.getMoney() > Player1.getMoney() && Player3.getMoney() > Player2.getMoney()) {
                    jButton8.setVisible(true);
                    jButton3.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
                //Picks a new word, resets the flipped tiles and makes the charArray set to the new wrd
                guessWord = letter.Word();
                for (int i = 0; i < 2; i++) {
                    for (int j = 0; j < 6; j++) {
                        charArray[i][j] = letter.Convert(guessWord)[i][j];
                        flippedTiles[i][j] = '!';
                    }
                }
            
                jTextArea1.setText(Character.toString(flippedTiles[0][0]));
                jTextArea2.setText(Character.toString(flippedTiles[0][1]));
                jTextArea3.setText(Character.toString(flippedTiles[0][2]));
                jTextArea4.setText(Character.toString(flippedTiles[0][3]));
                jTextArea5.setText(Character.toString(flippedTiles[0][4]));
                jTextArea6.setText(Character.toString(flippedTiles[0][5]));
                jTextArea11.setText(Character.toString(flippedTiles[1][0]));
                jTextArea12.setText(Character.toString(flippedTiles[1][1]));
                jTextArea13.setText(Character.toString(flippedTiles[1][2]));
                jTextArea14.setText(Character.toString(flippedTiles[1][3]));
                jTextArea15.setText(Character.toString(flippedTiles[1][4]));
                jTextArea16.setText(Character.toString(flippedTiles[1][5]));
            
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    //Picks a random value for the player to spin
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        tileSpun = tile.tileSpun();
        //If they spun the bankrupt tile, set money to zero and move to next players turn, else let them guess
        if (tileSpun == 0) {
            bankrupt.setMoney(tileSpun, numberCorrect);
            Player1.setMoney(bankrupt.getMoney());
            jTextArea8.setText("Money : $" + Player1.getMoney());
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton6.setVisible(true);
        } else {
            jTextField1.setEditable(true);
            jButton1.setVisible(true);
            jButton2.setVisible(true);
            jButton3.setVisible(false);
        }
        jTextArea7.setText("You spun: $" + tileSpun);
    }//GEN-LAST:event_jButton3ActionPerformed
    
    //Deals with the player guessing and buying a vowel
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //Sets the letters object to a vowels object
        letter = vowels;
        player1GuessInput = jTextField1.getText();
        player1GuessInput = player1GuessInput.toUpperCase();
        //Sets the flipped tiles to the ones that have been guessed
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player1GuessInput, guessWord)[i][j];
            }
        }

        numberCorrect = letter.Check(player1GuessInput, guessWord);
        money = letter.setMoney(Player1.getMoney(), numberCorrect, tileSpun);
        Player1.setMoney(money);
        jTextArea8.setText("Money : $" + Player1.getMoney());
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField1.setEditable(false);
        jTextField1.setText("");
        jButton3.setVisible(true);
        jButton1.setVisible(false);
        jButton2.setVisible(false);
        //If they are the last player left and they guess a wrong letter, game over, else if they are bankrupt or guessed wrong, move onto next player
        if (counter >= 3 && numberCorrect == 0 || counter >= 3 && tileSpun == 0) {
            jButton3.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        } else if (numberCorrect == 0 || tileSpun == 0) {
            jButton1.setVisible(false);
            jButton2.setVisible(false);
            jButton3.setVisible(false);
            jButton6.setVisible(true);
        }
        //If the full word has been displayed, add to the counter that indicates the round and move onto the next round 
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            //If first word has been guessed, second player starts next round
            if (counter == 1) {
                jButton6.setVisible(true);
                jButton3.setVisible(false);
            } 
            //If second word has been guessed, third player starts next round
            else if (counter == 2) {
                jButton8.setVisible(true);
                jButton3.setVisible(false);
            } 
            //If third word has been guessed, determine who moves onto final round and setup so they can play
            else if (counter >= 3) {
                if (Player2.getMoney() > Player1.getMoney() && Player2.getMoney() > Player3.getMoney()) {
                    jButton6.setVisible(true);
                    jButton3.setVisible(false);
                } else if (Player3.getMoney() > Player1.getMoney() && Player3.getMoney() > Player2.getMoney()) {
                    jButton8.setVisible(true);
                    jButton3.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
            //picks a new word and resets the array
            guessWord = letter.Word();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    charArray[i][j] = letter.Convert(guessWord)[i][j];
                    flippedTiles[i][j] = '!';
                }
            }
            jTextArea1.setText(Character.toString(flippedTiles[0][0]));
            jTextArea2.setText(Character.toString(flippedTiles[0][1]));
            jTextArea3.setText(Character.toString(flippedTiles[0][2]));
            jTextArea4.setText(Character.toString(flippedTiles[0][3]));
            jTextArea5.setText(Character.toString(flippedTiles[0][4]));
            jTextArea6.setText(Character.toString(flippedTiles[0][5]));
            jTextArea11.setText(Character.toString(flippedTiles[1][0]));
            jTextArea12.setText(Character.toString(flippedTiles[1][1]));
            jTextArea13.setText(Character.toString(flippedTiles[1][2]));
            jTextArea14.setText(Character.toString(flippedTiles[1][3]));
            jTextArea15.setText(Character.toString(flippedTiles[1][4]));
            jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    //Handles selecting a random value for the player to spin
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        tileSpun = tile.tileSpun();
        //If the player spins the bankrupt tile, sets their money to zero and moves on to next players turn, else continue with their turn
        if (tileSpun == 0) {
            bankrupt.setMoney(tileSpun, numberCorrect);
            Player2.setMoney(bankrupt.getMoney());
            jTextArea10.setText("Money : $" + Player2.getMoney());
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton8.setVisible(true);

        } else {
            jTextField2.setEditable(true);
            jButton4.setVisible(true);
            jButton5.setVisible(true);
            jButton6.setVisible(false);
        }
        jTextArea9.setText("You spun: $" + tileSpun);
    }//GEN-LAST:event_jButton6ActionPerformed
    //Handles the players guess, giving them money, moving onto the next player if needed
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        letter = temp;
        jButton5.setVisible(false);
        jButton4.setVisible(false);
        player2GuessInput = jTextField2.getText();
        player2GuessInput = player2GuessInput.toUpperCase();
        numberCorrect = letter.Check(player2GuessInput, guessWord);
        Player2.setMoney(letter.setMoney(Player2.getMoney(), tileSpun, numberCorrect));
        //Sets the flipped tiles to the guessed tiles
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player2GuessInput, guessWord)[i][j];
            }
        }
        jTextArea10.setText("Money: $" + Player2.getMoney());
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField2.setEditable(false);
        jTextField2.setText("");
        jButton6.setVisible(true);
        //If, in the final round, the user guesses a wrong letter the game ends
        if (counter >= 3 && numberCorrect == 0 || counter >= 3 && tileSpun == 0) {
            jButton6.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        } 
        //If the user guesses wrong, move onto the next player
        else if (numberCorrect == 0) {
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton8.setVisible(true);
        }
        //If the word is displayed, move onto the next or final round
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            if (counter == 2) {
                jButton8.setVisible(true);
                jButton6.setVisible(false);
            } else if (counter >= 3) {
                if (Player1.getMoney() > Player2.getMoney() && Player1.getMoney() > Player3.getMoney()) {
                    jButton3.setVisible(true);
                    jButton6.setVisible(false);
                } else if (Player3.getMoney() > Player1.getMoney() && Player3.getMoney() > Player2.getMoney()) {
                    jButton8.setVisible(true);
                    jButton6.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
            guessWord = letter.Word();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    charArray[i][j] = letter.Convert(guessWord)[i][j];
                    flippedTiles[i][j] = '!';
                }
            }
            jTextArea1.setText(Character.toString(flippedTiles[0][0]));
            jTextArea2.setText(Character.toString(flippedTiles[0][1]));
            jTextArea3.setText(Character.toString(flippedTiles[0][2]));
            jTextArea4.setText(Character.toString(flippedTiles[0][3]));
            jTextArea5.setText(Character.toString(flippedTiles[0][4]));
            jTextArea6.setText(Character.toString(flippedTiles[0][5]));
            jTextArea11.setText(Character.toString(flippedTiles[1][0]));
            jTextArea12.setText(Character.toString(flippedTiles[1][1]));
            jTextArea13.setText(Character.toString(flippedTiles[1][2]));
            jTextArea14.setText(Character.toString(flippedTiles[1][3]));
            jTextArea15.setText(Character.toString(flippedTiles[1][4]));
            jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    //Handles if the user guesses and buys a vowel
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        letter = vowels;
        player2GuessInput = jTextField2.getText();
        player2GuessInput = player2GuessInput.toUpperCase();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player2GuessInput, guessWord)[i][j];
            }
        }

        numberCorrect = letter.Check(player2GuessInput, guessWord);
        money = letter.setMoney(Player2.getMoney(), numberCorrect, tileSpun);
        Player2.setMoney(money);
        jTextArea10.setText("Money : $" + Player2.getMoney());
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField2.setEditable(false);
        jTextField2.setText("");
        jButton6.setVisible(true);
        jButton4.setVisible(false);
        jButton5.setVisible(false);
        //If, in the final round, the user guesses a wrong letter the game ends
        if (counter >= 3 && numberCorrect == 0 || counter >= 3 && tileSpun == 0) {
            jButton6.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        } 
        //If the user guesses wrong or gets bankrupt, move onto the next player
        else if (numberCorrect == 0 || tileSpun == 0) {
            jButton4.setVisible(false);
            jButton5.setVisible(false);
            jButton6.setVisible(false);
            jButton8.setVisible(true);
        }
         //If the word is displayed, move onto the next or final round
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            if (counter == 2) {
                jButton8.setVisible(true);
                jButton6.setVisible(false);
            } else if (counter >= 3) {
                if (Player1.getMoney() > Player2.getMoney() && Player1.getMoney() > Player3.getMoney()) {
                    jButton3.setVisible(true);
                    jButton4.setVisible(false);
                } else if (Player3.getMoney() > Player1.getMoney() && Player3.getMoney() > Player2.getMoney()) {
                    jButton8.setVisible(true);
                    jButton4.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
            guessWord = letter.Word();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    charArray[i][j] = letter.Convert(guessWord)[i][j];
                    flippedTiles[i][j] = '!';
                }
            }
            jTextArea1.setText(Character.toString(flippedTiles[0][0]));
            jTextArea2.setText(Character.toString(flippedTiles[0][1]));
            jTextArea3.setText(Character.toString(flippedTiles[0][2]));
            jTextArea4.setText(Character.toString(flippedTiles[0][3]));
            jTextArea5.setText(Character.toString(flippedTiles[0][4]));
            jTextArea6.setText(Character.toString(flippedTiles[0][5]));
            jTextArea11.setText(Character.toString(flippedTiles[1][0]));
            jTextArea12.setText(Character.toString(flippedTiles[1][1]));
            jTextArea13.setText(Character.toString(flippedTiles[1][2]));
            jTextArea14.setText(Character.toString(flippedTiles[1][3]));
            jTextArea15.setText(Character.toString(flippedTiles[1][4]));
            jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        }

    }//GEN-LAST:event_jButton4ActionPerformed
    
    //If the user guesses and buys a vowel
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        letter = vowels;
        player3GuessInput = jTextField3.getText();
        player3GuessInput = player3GuessInput.toUpperCase();
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player3GuessInput, guessWord)[i][j];
            }
        }

        numberCorrect = letter.Check(player3GuessInput, guessWord);
        money = letter.setMoney(Player3.getMoney(), numberCorrect, tileSpun);
        Player3.setMoney(money);
        jTextArea18.setText("Money : $" + Player3.getMoney());
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField3.setEditable(false);
        jTextField3.setText("");
        jButton8.setVisible(true);
        jButton7.setVisible(false);
        jButton9.setVisible(false);
        //If, in the final round, the user guesses a wrong letter the game ends
        if (counter >= 3 && numberCorrect == 0 || counter >= 3 && tileSpun == 0) {
            jButton8.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        }
        //If the user guesses wrong or gets bankrupt, move onto the next player
        else if (numberCorrect == 0 || tileSpun == 0) {
            jButton3.setVisible(true);
            jButton8.setVisible(false);
        }
         //If the word is displayed, move onto the next or final round
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            if (counter == 1) {
                jButton6.setVisible(true);
                jButton8.setVisible(false);
            } else if (counter >= 3) {
                if (Player1.getMoney() > Player2.getMoney() && Player1.getMoney() > Player3.getMoney()) {
                    jButton3.setVisible(true);
                    jButton8.setVisible(false);
                } else if (Player2.getMoney() > Player1.getMoney() && Player2.getMoney() > Player3.getMoney()) {
                    jButton6.setVisible(true);
                    jButton8.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
            guessWord = letter.Word();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    charArray[i][j] = letter.Convert(guessWord)[i][j];
                    flippedTiles[i][j] = '!';
                }
            }
            jTextArea1.setText(Character.toString(flippedTiles[0][0]));
            jTextArea2.setText(Character.toString(flippedTiles[0][1]));
            jTextArea3.setText(Character.toString(flippedTiles[0][2]));
            jTextArea4.setText(Character.toString(flippedTiles[0][3]));
            jTextArea5.setText(Character.toString(flippedTiles[0][4]));
            jTextArea6.setText(Character.toString(flippedTiles[0][5]));
            jTextArea11.setText(Character.toString(flippedTiles[1][0]));
            jTextArea12.setText(Character.toString(flippedTiles[1][1]));
            jTextArea13.setText(Character.toString(flippedTiles[1][2]));
            jTextArea14.setText(Character.toString(flippedTiles[1][3]));
            jTextArea15.setText(Character.toString(flippedTiles[1][4]));
            jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        }
    }//GEN-LAST:event_jButton7ActionPerformed
    
    //Selects the random tile value
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        tileSpun = tile.tileSpun();
        //If the user spins the bankrupt tile, set money to zero and moves onto the next player, else continue playing
        if (tileSpun == 0) {
            bankrupt.setMoney(tileSpun, numberCorrect);
            Player3.setMoney(bankrupt.getMoney());
            jTextArea18.setText("Money : $" + Player3.getMoney());
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton3.setVisible(true);
        } else {
            jTextField3.setEditable(true);
            jButton7.setVisible(true);
            jButton9.setVisible(true);
            jButton8.setVisible(false);
        }
        jTextArea17.setText("You spun: $" + tileSpun);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        letter = temp;
        jButton7.setVisible(false);
        jButton9.setVisible(false);
        player3GuessInput = jTextField3.getText();
        player3GuessInput = player3GuessInput.toUpperCase();
        numberCorrect = letter.Check(player3GuessInput, guessWord);
        Player3.setMoney(letter.setMoney(Player3.getMoney(), tileSpun, numberCorrect));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 6; j++) {
                flippedTiles[i][j] = letter.flipTiles(charArray, flippedTiles, player3GuessInput, guessWord)[i][j];
            }
        }
        jTextArea18.setText("Money: $" + Player3.getMoney());
        jTextArea1.setText(Character.toString(flippedTiles[0][0]));
        jTextArea2.setText(Character.toString(flippedTiles[0][1]));
        jTextArea3.setText(Character.toString(flippedTiles[0][2]));
        jTextArea4.setText(Character.toString(flippedTiles[0][3]));
        jTextArea5.setText(Character.toString(flippedTiles[0][4]));
        jTextArea6.setText(Character.toString(flippedTiles[0][5]));
        jTextArea11.setText(Character.toString(flippedTiles[1][0]));
        jTextArea12.setText(Character.toString(flippedTiles[1][1]));
        jTextArea13.setText(Character.toString(flippedTiles[1][2]));
        jTextArea14.setText(Character.toString(flippedTiles[1][3]));
        jTextArea15.setText(Character.toString(flippedTiles[1][4]));
        jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        jTextField3.setEditable(false);
        jTextField3.setText("");
        jButton8.setVisible(true);
        //If, in the final round, the user guesses a wrong letter the game ends
        if (counter == 3 && numberCorrect == 0 || counter == 3 && tileSpun == 0) {
            jButton8.setVisible(false);
            jTextField4.setVisible(true);
            jTextArea1.setText(Character.toString(charArray[0][0]));
            jTextArea2.setText(Character.toString(charArray[0][1]));
            jTextArea3.setText(Character.toString(charArray[0][2]));
            jTextArea4.setText(Character.toString(charArray[0][3]));
            jTextArea5.setText(Character.toString(charArray[0][4]));
            jTextArea6.setText(Character.toString(charArray[0][5]));
            jTextArea11.setText(Character.toString(charArray[1][0]));
            jTextArea12.setText(Character.toString(charArray[1][1]));
            jTextArea13.setText(Character.toString(charArray[1][2]));
            jTextArea14.setText(Character.toString(charArray[1][3]));
            jTextArea15.setText(Character.toString(charArray[1][4]));
            jTextArea16.setText(Character.toString(charArray[1][5]));
        } 
         //If the user guesses wrong or gets bankrupt, move onto the next player
        else if (numberCorrect == 0 || tileSpun == 0) {
            jButton7.setVisible(false);
            jButton8.setVisible(false);
            jButton9.setVisible(false);
            jButton3.setVisible(true);
        }
        //If the word is displayed, move onto the next or final round
        if (Arrays.deepEquals(flippedTiles, charArray)) {
            counter++;
            letter = temp;
            if (counter == 1) {
                jButton6.setVisible(true);
                jButton8.setVisible(false);
            } else if (counter == 3) {
                if (Player1.getMoney() > Player2.getMoney() && Player1.getMoney() > Player3.getMoney()) {
                    jButton3.setVisible(true);
                    jButton8.setVisible(false);
                } else if (Player2.getMoney() > Player1.getMoney() && Player2.getMoney() > Player3.getMoney()) {
                    jButton6.setVisible(true);
                    jButton8.setVisible(false);
                } else if (Player1.getMoney() == Player2.getMoney() || Player1.getMoney() == Player3.getMoney() || Player2.getMoney() == Player3.getMoney() || (Player1.getMoney() == Player2.getMoney() && Player2.getMoney() == Player3.getMoney())) {
                    jButton3.setVisible(false);
                    jButton6.setVisible(false);
                    jButton8.setVisible(false);
                    jTextField4.setVisible(true);
                }
            }
            guessWord = letter.Word();
            for (int i = 0; i < 2; i++) {
                for (int j = 0; j < 6; j++) {
                    charArray[i][j] = letter.Convert(guessWord)[i][j];
                    flippedTiles[i][j] = '!';
                }
            }
            jTextArea1.setText(Character.toString(flippedTiles[0][0]));
            jTextArea2.setText(Character.toString(flippedTiles[0][1]));
            jTextArea3.setText(Character.toString(flippedTiles[0][2]));
            jTextArea4.setText(Character.toString(flippedTiles[0][3]));
            jTextArea5.setText(Character.toString(flippedTiles[0][4]));
            jTextArea6.setText(Character.toString(flippedTiles[0][5]));
            jTextArea11.setText(Character.toString(flippedTiles[1][0]));
            jTextArea12.setText(Character.toString(flippedTiles[1][1]));
            jTextArea13.setText(Character.toString(flippedTiles[1][2]));
            jTextArea14.setText(Character.toString(flippedTiles[1][3]));
            jTextArea15.setText(Character.toString(flippedTiles[1][4]));
            jTextArea16.setText(Character.toString(flippedTiles[1][5]));
        }
    }//GEN-LAST:event_jButton9ActionPerformed
    
    //When the user is done reading the rules, displays everything else
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        jButton10.setVisible(false);
        jTextArea19.setVisible(false);
        jScrollPane19.setVisible(false);
    }//GEN-LAST:event_jButton10ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Board.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Board().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JScrollPane jScrollPane15;
    private javax.swing.JScrollPane jScrollPane16;
    private javax.swing.JScrollPane jScrollPane17;
    private javax.swing.JScrollPane jScrollPane18;
    private javax.swing.JScrollPane jScrollPane19;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea10;
    private javax.swing.JTextArea jTextArea11;
    private javax.swing.JTextArea jTextArea12;
    private javax.swing.JTextArea jTextArea13;
    private javax.swing.JTextArea jTextArea14;
    private javax.swing.JTextArea jTextArea15;
    private javax.swing.JTextArea jTextArea16;
    private javax.swing.JTextArea jTextArea17;
    private javax.swing.JTextArea jTextArea18;
    private javax.swing.JTextArea jTextArea19;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    private javax.swing.JTextArea jTextArea9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
