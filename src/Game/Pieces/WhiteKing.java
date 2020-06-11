package Game.Pieces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.GUI.Board.Tiles;
import static Game.Rules.Turns.p1;
import static Game.Rules.Turns.turns;

public class WhiteKing {

    //Images
    private ImageIcon King = new ImageIcon(("img\\king.jpg"));

    private int x = 2;
    private int y = 4;
    boolean selected = false;

    //Event Handlers
    private ButtonHandlerKing handler = new ButtonHandlerKing();

    public WhiteKing() {
        Tiles[y][x].setIcon(King);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tiles[i][j].addActionListener(handler);
            }
        }


    }


    private void processClickKing(int i, int j){

        if(isValidMoveKing(i, j) == false){
            return;
        }
        Tiles[y][x].setIcon(null);
        Tiles[i][j].setIcon(King);
        x = j;
        y = i;

        selected = false;
        turns++;



    }

    private boolean isValidMoveKing(int i, int j){

        int deltaY = Math.abs(i - y);
        int deltaX = Math.abs(j - x);

        if((deltaX == 1) && (deltaY == 1)){
            return true;
        }else if ((deltaX == 1) && (deltaY == 1)){
            return true;
        }else if ((deltaX == 1) && (deltaY == 0)){
            return true;
        } else if ((deltaX == 0) && deltaY == 1){
            return true;
        }
        else{
            return false;
        }
    }

    private class ButtonHandlerKing implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if(source == Tiles[y][x]){
                selected = true;
            }

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){

                    if(source == Tiles[i][j] && selected == true && p1 == true){

                        processClickKing(i,j);
                    }

                }
            }




        }
    }

}
