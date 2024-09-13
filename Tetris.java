package com.zetcode;

import java.awt.*;
import javax.swing.*;

/*
Java Tetris game clone

Author: Jan Bodnar
Website: https://zetcode.com
 */
public class Tetris extends JFrame {

    private JLabel statusbar;
    private JPanel InfoPanel;       //점수 및 다음 블럭 표시 등의 정보표시패널
    private JPanel InsidePanel;

    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        InfoPanel = new JPanel(new GridLayout(3,1));
        InsidePanel = new JPanel();

        add(InfoPanel, BorderLayout.EAST);
        InfoPanel.setPreferredSize(new Dimension(120,60));
        InfoPanel.add(new JLabel("test panel"));
        InfoPanel.setBackground(Color.lightGray);
        InfoPanel.add(InsidePanel);
        InsidePanel.setBackground(Color.lightGray);
        InfoPanel.add(statusbar);


        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(600, 800);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusBar() {

        return statusbar;
    }

    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {

            var game = new Tetris();
            game.setVisible(true);
        });
    }
}
