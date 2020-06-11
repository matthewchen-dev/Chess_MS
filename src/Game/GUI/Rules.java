package Game.GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Rules extends JFrame{

    JLabel Rules_Header = new JLabel("Rules");

    JLabel Pawns = new JLabel("<html>Pawns can move forward 1 tile <br> Captures any enemy piece in front of it<html>");

    JLabel Rooks = new JLabel("<html>Rooks can move forward or horizontal any number of tiles <br> Captures any piece in it's way<html>");

    JLabel King = new JLabel("<html>Kings can move and direction they choose by 1 tile, including diagonally <br> Captures any piece in it's way<html>");

    JLabel Win = new JLabel("<html>How to win:<br> Capture all enemy pieces or have the most pieces by the end of the timer<html>");

    JButton Back = new JButton("<- Back");

    public Rules(){

        setLayout(null);
        setSize(1200, 1200);
        setResizable(true);
        setLocationRelativeTo(null);//centres window
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

        add(Rules_Header);
        Rules_Header.setFont(new Font("comic sans ms", Font.BOLD, 50));
        Rules_Header.setBounds(25, 0, 1200, 100);

        add(Pawns);
        Pawns.setFont(new Font("comic sans ms", Font.BOLD, 25));
        Pawns.setBounds(25, 100, 1200, 100);

        add(Rooks);
        Rooks.setFont(new Font("comic sans ms", Font.BOLD, 25));
        Rooks.setBounds(25, 200, 1200, 100);

        add(King);
        King.setFont(new Font("comic sans ms", Font.BOLD, 25));
        King.setBounds(25, 300, 1200, 100);

        add(Win);
        Win.setFont(new Font("comic sans ms", Font.BOLD, 25));
        Win.setBounds(25, 400, 1200, 100);

        add(Back);
        Back.setFont(new Font("comic sans ms", Font.BOLD, 25));
        Back.setBounds(950, 0, 250,100);
        Back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Menu();

            }

        });

    }




}
