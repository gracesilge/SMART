import javax.swing.*;
import java.awt.event.*;

public class OrderPanel extends TablePanel{

    public OrderPanel(JTable table){
        super(table);
        ((OrderTableModel) table.getModel()).update();
        JRadioButton[] buttons = {
            new JRadioButton("Date (Old to New)"),
            new JRadioButton("Order Number (Low to High)"),
            new JRadioButton("Envelope"),
            new JRadioButton("Stamp"),
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
