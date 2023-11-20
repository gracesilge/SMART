import javax.swing.*;
import javax.swing.table.TableModel;
import java.awt.event.*;
import java.awt.*;
import java.security.InvalidParameterException;


public abstract class TablePanel extends JPanel implements ActionListener{
    private JRadioButton[] sorting;
    
    private ButtonGroup group = new ButtonGroup();

    private JTable table;

    private JTextField searchBar = new JTextField();
    
    private JButton endSearch = new JButton("End Search");
    private JButton searchActivate = new JButton("Search");

    public TablePanel(JTable table){
        super();
        this.table = table;
        this.searchActivate.addActionListener(this);
        this.searchBar.addActionListener(this);
        this.endSearch.addActionListener(this);
        this.searchBar.setPreferredSize(new Dimension(300, 20));
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));
        this.add(new SearchPanel(searchBar, searchActivate, endSearch));
        this.add(table);
    }

    protected TableModel getModel(){
        return this.table.getModel();
    }

    protected String getSearchTerm(){
        return searchBar.getText();
    }

    public void addButtons(JRadioButton[] sorting){
        this.sorting = sorting;

        for(JRadioButton button: this.sorting){
            this.add(button);
            this.group.add(button);
        }
    }

    public int getButton(ActionEvent e){
        //return 1 for start search and 2 for end search
        if(e.getSource().equals(this.searchActivate))
            return 1;
        if(e.getSource().equals(this.endSearch))
            return 2;
        throw new InvalidParameterException();
    }

    public abstract void actionPerformed(ActionEvent e);
}
