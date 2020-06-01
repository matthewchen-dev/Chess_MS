package Game.Pieces;

import Game.GUI.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class King extends Board {

    //Images
    private ImageIcon King = new ImageIcon(("img\\king.jpg"));

    private int x = 4;
    private int y = 2;
    boolean selected = false;

    //Event Handlers
    private ButtonHandler handler = new ButtonHandler();

    public King() {
        Tiles[x][y].setIcon(King);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tiles[i][j].addActionListener(handler);
            }
        }


    }


    private void processClickKing(int i, int j){

        if(isValidMove(i, j) == false){
            return;
        }
        Tiles[x][y].setIcon(null);
        Tiles[i][j].setIcon(King);
        x = i;
        y = j;
    }

    private boolean isValidMove(int i, int j){

        int deltaX = Math.abs(i - x);
        int deltaY = Math.abs(j -y);

        if((deltaX == 1) && (deltaY == 1)){
            return true;
        }else if ((deltaX == 1) && (deltaY == 1)){
            return true;
        }else{
            return false;
        }
    }




    private class ButtonHandler implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if(source == Tiles[x][y]){
                selected = true;
            }

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){

                    if(source == Tiles[i][j] && selected == true){
                        processClickKing(i,j);
                    }

                }
            }




        }
    }

}
