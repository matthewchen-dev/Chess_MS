package Game.Pieces;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Game.GUI.Board.Tiles;
import static Game.Rules.Turns.p2;
import static Game.Rules.Turns.turns;

public class BlackPawn3 {

    //Images
    private ImageIcon Pawn = new ImageIcon(("img\\pawn.jpg"));

    private int x = 2;
    private int y = 1;
    boolean selected = false;


    //Event Handlers
    private ButtonHandlerPawn handler = new ButtonHandlerPawn();

    public BlackPawn3() {
        Tiles[y][x].setIcon(Pawn);

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
        Tiles[y][x].setIcon(null);
        Tiles[i][j].setIcon(Pawn);
        x = j;
        y = i;

        selected = false;
        turns++;

    }

    private boolean isValidMovePawn(int i, int j){

        int deltaY = (i - y);
        int deltaX = Math.abs(j - x);

        if((deltaX == 0) && (deltaY == 1)){
            return true;
        } else{
            return false;
        }
    }

    private class ButtonHandlerPawn implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            Object source = e.getSource();

            if(source == Tiles[y][x]){
                selected = true;
            }

            for(int i = 0; i < 5; i++){
                for(int j = 0; j < 5; j++){

                    if(source == Tiles[i][j] && selected == true && p2 == true){

                        processClickPawn(i,j);
                    }

                }
            }




        }
    }

}
