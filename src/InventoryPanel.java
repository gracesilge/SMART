import javax.swing.*;
import java.awt.event.*;

public class InventoryPanel extends TablePanel{
    public InventoryPanel(JTable table){
        super(table);
        JRadioButton[] buttons = {
            new JRadioButton("Name (Alphabetical)"),
            new JRadioButton("Number of Stickers (High to Low)")
            };
        this.add(new ButtonPanel(buttons), 0);
    }

    public void actionPerformed(ActionEvent e){
        if(super.getButton(e) == 1)
            ((OrderTableModel) super.getModel()).search(super.getSearchTerm());
        if(super.getButton(e) == 2)
            ((OrderTableModel) super.getModel()).endSearch();
    }
}
