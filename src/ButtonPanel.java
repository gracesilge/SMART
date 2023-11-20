import javax.swing.*;
import java.awt.*;

public class ButtonPanel extends JPanel {
    public ButtonPanel(JRadioButton[] buttons){
        ButtonGroup group = new ButtonGroup();
        this.setLayout(new GridLayout((buttons.length + 1)/2, 2));
        for(int i = 0; i < buttons.length; i++){
            this.add(buttons[i], i);
            group.add(buttons[i]);
        }
    }
}