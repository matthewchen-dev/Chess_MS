package Game.Pieces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.GUI.Board.Tiles;
import static Game.Rules.Turns.p1;
import static Game.Rules.Turns.turns;


public class WhiteRook2 {

    //Images
    private ImageIcon Rook = new ImageIcon(("img\\rook.jpg"));

    private int x = 4;
    private int y = 4;
    boolean selected = false;


    //Event Handlers
    private ButtonHandlerRook handler = new ButtonHandlerRook();

    public WhiteRook2() {
        Tiles[y][x].setIcon(Rook);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tiles[i][j].addActionListener(handler);
            }
        }


    }


    private void processClickRook(int i, int j){

        if(isValidMoveRook(i, j) == false){
            return;
        }
        Tiles[y][x].setIcon(null);
        Tiles[i][j].setIcon(Rook);
        x = j;
        y = i;


        selected = false;
        turns++;


    }

    private boolean isValidMoveRook(int i, int j){

        int deltaY = Math.abs(i - y);
        int deltaX = Math.abs(j - x);

        if((deltaX <= 4) && (deltaX > 0) && (deltaY == 0)){
            return true;
        }else if ((deltaX == 0) && (deltaY <= 4 ) && (deltaY > 0)){
            return true;
        } else {
            return false;
        }
    }

    private class ButtonHandlerRook implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if(source == Tiles[y][x]){
                selected = true;
            }

            for(int i = 0; i < 5; i++){//scans all tiles
                for(int j = 0; j < 5; j++){

                    if((source == Tiles[i][j]) && (selected == true) && (p1 == true) ){
                        processClickRook(i,j);

                    }

                }
            }




        }
    }

}
