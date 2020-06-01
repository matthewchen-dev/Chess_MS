package Game.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Board extends JFrame{

    private Container contents;

    //Grid
    public JButton[][] Tiles = new JButton[5][5];

    //Colours
    public Color White = Color.WHITE; //White Squares; by default the panel is white, not really needed
    public Color Black = Color.BLACK; //Black Squares



    public Board() {

        JFrame frame = new JFrame();

        setTitle("5x5 Chess");

        contents = getContentPane();
        contents.setLayout(new GridLayout(5, 5));



        //Create and Add Board Components
        for (int i = 0; i < 5; i++) {//walks ranks

            for (int j = 0; j < 5; j++) {//walks files

                Tiles[i][j] = new JButton();//adds buttons on every tile

                if ((i + j) % 2 != 0) {
                    Tiles[i][j].setBackground(Black);
                } else {
                    Tiles[i][j].setBackground(White);
                }//colours each tile alternating colours

                contents.add(Tiles[i][j]);

            }
        }


        //Size and Display Window
        setSize(1200, 1200);
        setResizable(false);
        setLocationRelativeTo(null);//centres window
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }//end of ChessGUI


}//end of class
