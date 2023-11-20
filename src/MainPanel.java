import javax.swing.*;

public class MainPanel extends JPanel{
    private OrderPanel orders = new OrderPanel(new JTable(new OrderTableModel()));
    private InventoryPanel inventory = new InventoryPanel(new JTable(new InventoryTableModel()));

    public MainPanel(){
        super();
        JTabbedPane pane = new JTabbedPane();
        pane.addTab("Orders", orders);
        pane.addTab("Inventory", inventory);
        this.add(pane);
    }
}
