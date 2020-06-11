package Game.GUI;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Menu extends JFrame{

    private JFrame f = new JFrame("5x5 Chess");

    private JButton play = new JButton("Play");

    private JButton rules = new JButton("Rules");

    private JLabel header = new JLabel("5x5 Chess", SwingConstants.CENTER);


    public Menu() {

        Container contentPane;
        contentPane = getContentPane();
        contentPane.setLayout(null);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Board();

            }


        });

        rules.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Rules();

            }


        });

        add(header);
        header.setFont(new Font("comic sans ms", Font.BOLD, 100));
        header.setBounds(300, 100, 600, 200);

        add(play);
        play.setFont(new Font("comic sans ms", Font.BOLD, 69));
        play.setBounds(300, 400, 600, 200);

        add(rules);
        rules.setFont(new Font("comic sans ms", Font.BOLD, 69));
        rules.setBounds(300, 700, 600, 200);



        setSize(1200, 1200);
        setResizable(true);
        setLocationRelativeTo(null);//centres window
        setVisible(true);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

    }


}
