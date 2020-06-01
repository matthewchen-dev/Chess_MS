package Game.Pieces;

import Game.GUI.Board;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rook extends Board {

    //Images
    private ImageIcon Rook = new ImageIcon(("img\\rook.jpg"));

    private int x = 4;
    private int y = 4;
    boolean selected = false;

    //Event Handlers
    private ButtonHandler handler = new ButtonHandler();

    public Rook() {
        Tiles[x][y].setIcon(Rook);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tiles[i][j].addActionListener(handler);
            }
        }


    }


    private void processClickRook(int i, int j){

        if(isValidMove(i, j) == false){
            return;
        }
        Tiles[x][y].setIcon(null);
        Tiles[i][j].setIcon(Rook);
        x = i;
        y = j;
    }

    private boolean isValidMove(int i, int j){

        int deltaX = Math.abs(i - x);
        int deltaY = Math.abs(j -y);

        if((deltaX <=4) && (deltaY == 0)){
            return true;
        }else if ((deltaX == 0) && (deltaY <= 4)){
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
                        processClickRook(i,j);
                    }

                }
            }




        }
    }


}
