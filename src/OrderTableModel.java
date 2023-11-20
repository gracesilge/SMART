//https://docs.oracle.com/javase/tutorial/uiswing/components/table.html
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class OrderTableModel extends AbstractTableModel {
    private ArrayList<Order> displayData = new ArrayList<>();
    private ArrayList<Order> allData = new ArrayList<>();
    private String[] columnNames = {"Order Number", "Number of Stickers", "Date Created", "Stamp", "Envelope", "Items"};
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
        switch(col){
            case 0:
            return displayData.get(row).getOrderNum();

            case 1:
            return displayData.get(row).getNumberOfStickers();

            case 2:
            return displayData.get(row).getDateCreated().toString();

            case 3:
            return displayData.get(row).getStampType().toString();

            case 4:
            return displayData.get(row).getEnvelopeType().toString();

            default:
            return displayData.get(row).getItemTypes().toString();
        }
    }

    public boolean isCellEditable(int row, int col) {
        return true;
    }

    public void update(){
        ArrayList<ItemMultiplicity> tester = new ArrayList<>();
        for(int i = 0; i < 20;i++){
            tester.add(new ItemMultiplicity(new StickerType("stringr"), i));
        }
        displayData.add(new Order(123, new Date(3, 2, 1), tester));
        displayData.add(new Order(654, new Date(4, 5, 6), new ArrayList<ItemMultiplicity>()));
        displayData.add(new Order(987, new Date(7, 8, 9), new ArrayList<ItemMultiplicity>()));
        
        allData.add(new Order(123, new Date(3, 2, 1), tester));
        allData.add(new Order(654, new Date(4, 5, 6), new ArrayList<ItemMultiplicity>()));
        allData.add(new Order(987, new Date(7, 8, 9), new ArrayList<ItemMultiplicity>()));
        
        this.fireTableDataChanged();
    }

    public void sort(){
        
    }

    public void search(String searchTerm){
        this.displayData = new ArrayList<>();
        for(Order current: this.allData){
            if(current.toString().contains(searchTerm))
                this.displayData.add(current);
        }
        this.fireTableDataChanged();
    }

    public void endSearch(){
        this.displayData = new ArrayList<>(allData);
        this.fireTableDataChanged();
    }

    public int[] getEnvelopeInfo(){
        //[0] is small, [1] is big
        int[] envelopes = {0, 0};
        for(Order current: this.allData){
            if(current.getEnvelopeType().toString().equals("Small"))
                envelopes[0]++;
            envelopes[1]++;
        }
        return envelopes;
    }

    public int[] getStampInfo(){
        //[0] is none, [1] is domestic, [2] is international
        int[] stamps = {0, 0, 0};
        for(Order current: this.allData){
            if(current.getStampType().toString().equals("None"))
                stamps[0]++;
            if(current.getStampType().toString().equals("Domestic"))
                stamps[1]++;
            stamps[2]++;
        }
        return stamps;
    }

    public int getNumberOfStickers(){
        int sum = 0;
        for(Order current: this.allData){
            sum+=current.getNumberOfStickers();
        }
        return sum;
    }

}
