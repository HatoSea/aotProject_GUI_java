package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ImageIcon rightImage=new ImageIcon("aotSS4.jpeg");
        ImageIcon leftImage=new ImageIcon("iconAOT.png");

        JLabel rightLabel=new JLabel();
        rightLabel.setSize(640,905);
        rightLabel.setIcon(rightImage);

        JPanel rightPanel=new JPanel();
        rightPanel.setBounds(520,0,640,905);
        rightPanel.add(rightLabel);

        JLabel leftLabel=new JLabel();
        leftLabel.setSize(520,905);
        leftLabel.setIcon(leftImage);
        leftLabel.setVerticalAlignment(JLabel.CENTER);
        leftLabel.setHorizontalAlignment(JLabel.CENTER);

        JPanel leftPanel=new JPanel();
        leftPanel.setBounds(0,0,520,905);
        leftPanel.setBackground(Color.BLACK);
        leftPanel.add(leftLabel);
        leftPanel.setLayout(new BorderLayout());


        JFrame frame=new JFrame();
        frame.setVisible(true);
        frame.setTitle("Attack of Titan season 4 poster");
        frame.setSize(1160,905);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(rightPanel);
        frame.add(leftPanel);

    }
}
