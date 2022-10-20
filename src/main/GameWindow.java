package main;

import javax.swing.JFrame;

public class GameWindow {
    
    private JFrame gameWindow;

    public GameWindow(GamePanel gamePanel) {
        gameWindow = new JFrame();
        gameWindow.add(gamePanel);
        gameWindow.setSize(400, 400);
        gameWindow.setLocationRelativeTo(null);
        gameWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gameWindow.setVisible(true);
    }
}
