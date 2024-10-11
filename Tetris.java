package com.zetcode;

import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.*;
import com.zetcode.*;

/*
Java Tetris game clone

Author: Jan Bodnar
Website: https://zetcode.com
 */
public class Tetris extends JFrame {

    private JLabel statusbar;
    private JPanel InfoPanel;       //점수 및 다음 블럭 표시 등의 정보표시패널
    private JPanel StatusPanel;
    private JPanel ScorePanel;
    private Shape ShowPiece;

    public Tetris() {

        initUI();
    }

    private void initUI() {

        statusbar = new JLabel(" 0");
        InfoPanel = new JPanel(new GridLayout(3,1));
        StatusPanel = new JPanel();
        ScorePanel = new JPanel();

        add(InfoPanel, BorderLayout.EAST);
        InfoPanel.setPreferredSize(new Dimension(120,20));
//        InfoPanel.;
        InfoPanel.setBackground(Color.WHITE);
        InfoPanel.add(ScorePanel);
        InfoPanel.add(StatusPanel);
        InfoPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        StatusPanel.setBackground(Color.lightGray);
        StatusPanel.add(statusbar);


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
