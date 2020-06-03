package Game.Pieces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.GUI.Board.Tiles;

public class Pawn {

    //Images
    private ImageIcon Pawn = new ImageIcon(("img\\pawn.jpg"));

    private int x = 3;
    private int y = 2;
    boolean selected = false;

    //Event Handlers
    private ButtonHandlerPawn handler = new Pawn.ButtonHandlerPawn();

    public Pawn() {
        Tiles[x][y].setIcon(Pawn);

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                Tiles[i][j].addActionListener(handler);
            }
        }


    }


    private void processClickPawn(int i, int j){

        if(isValidMovePawn(i, j) == false){
            return;
        }
        Tiles[x][y].setIcon(null);
        Tiles[i][j].setIcon(Pawn);
        x = j;
        y = i;

        selected = false;
    }

    private boolean isValidMovePawn(int i, int j){

        int deltaX = Math.abs(i - x);
        int deltaY = Math.abs(j -y);

        if((deltaX == 1) && (deltaY == 0)){
            return true;
        }else if ((deltaX == 1) && (deltaY == 0)){
            return true;
        }else{
            return false;
        }
    }

    private class ButtonHandlerPawn implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if(source == Tiles[x][y]){
                selected = true;
            }

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){

                    if(source == Tiles[i][j] && selected == true){
                        processClickPawn(i,j);
                    }

                }
            }




        }
    }

}
