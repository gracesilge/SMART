import java.awt.event.*;
import javax.swing.*;

public class MainWindow extends JFrame implements MouseListener{
    public static void main(String[] args) throws Exception {
        new TimerRunner();
        new MainWindow();
    }

    public MainWindow(){
        this.setSize(600, 600);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("SMART");
        this.addMouseListener(this);
        JPanel content = new MainPanel();
        this.setContentPane(content);
        this.setVisible(true);
    }

        @Override
    public void mouseEntered(MouseEvent e){

    }

    @Override
    public void mouseExited(MouseEvent e){
        
    }

    @Override
    public void mousePressed(MouseEvent e){
        
    }


    @Override
    public void mouseClicked(MouseEvent e){

    }

    @Override
    public void mouseReleased(MouseEvent e){
        
    }
}
