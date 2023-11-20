//https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class InventoryTableModel extends AbstractTableModel {
    private ArrayList<ItemMultiplicity> allData = new ArrayList<>();
    private ArrayList<ItemMultiplicity> displayData = new ArrayList<>();
    private String[] columnNames = {"Item Name", "Number of Stickers"};

    public int getColumnCount() {
        return columnNames.length;
    }

    public int getRowCount() {
        return displayData.size();
    }

    public String getColumnName(int col) {
        return columnNames[col];
    }

    public Object getValueAt(int row, int col) {
        if(col==0)
            return displayData.get(row).toString();
        return displayData.get(row).getItemNum();
    }


    public boolean isCellEditable(int row, int col) {
        return true;
    }

    public void updateValue(){

    }

    public void search(String searchTerm){
        this.displayData = new ArrayList<>();
        for(ItemMultiplicity current: this.allData){
            if(current.getSearchString().contains(searchTerm))
                this.displayData.add(current);
        }
    }

    public void endSearch(){
        this.displayData = new ArrayList<>(allData);
    }

    public void sort(){
        
    }



}

