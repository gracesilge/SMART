import javax.swing.*;

public class SearchPanel extends JPanel{
    public SearchPanel(JTextField searchBar, JButton searchActivate, JButton endSearch){
        super();
        this.add(searchBar);
        this.add(searchActivate);
        this.add(endSearch);
    }
}
