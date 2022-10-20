package inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import main.GamePanel;

public class KeyboardInputs implements KeyListener  {

    private GamePanel gamePanel;

    public KeyboardInputs(GamePanel gamePanel) {
        this.gamePanel = gamePanel;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_W:
                System.out.println("Up");
                gamePanel.setDeltaY(gamePanel.getDeltaY()-5);
                break;
            case KeyEvent.VK_A:
                gamePanel.setDeltaX(gamePanel.getDeltaX()-5);
                System.out.println("Left");
                break;
            case KeyEvent.VK_S:
                gamePanel.setDeltaY(gamePanel.getDeltaY()+5);
                System.out.println("Down");
                break;
            case KeyEvent.VK_D:
                gamePanel.setDeltaX(gamePanel.getDeltaX()+5);
                System.out.println("Right");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        
    }
    
}
