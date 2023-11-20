import java.util.ArrayList;

public class Order {
    private int orderNum;
    private Date dateCreated;
    private ArrayList<ItemMultiplicity> itemTypes;
    private StampType stampType;
    private EnvelopeType envelopeType;

    public Order(int orderNum, Date dateCreated, ArrayList<ItemMultiplicity> itemTypes){
        this.orderNum = orderNum;
        this.dateCreated = dateCreated;
        this.itemTypes = itemTypes;
        this.envelopeType = new EnvelopeType("Big");
        this.envelopeType = (this.getNumberOfStickers()>20)? new EnvelopeType("Big") : new EnvelopeType("Small"); 
        this.stampType = new StampType("None");
    }

    public int getOrderNum(){return this.orderNum;}

    public Date getDateCreated(){return this.dateCreated;}

    public ArrayList<ItemMultiplicity> getItemTypes(){return this.itemTypes;}

    public StampType getStampType(){return this.stampType;}

    public EnvelopeType getEnvelopeType(){return this.envelopeType;}

    public int getNumberOfStickers(){
        int sum = 0;
        for(ItemMultiplicity item: this.itemTypes){
            sum+=item.getItemNum();
        }
        return sum;
    }

    @Override
    public String toString(){
        return "" + this.orderNum + this.dateCreated.toString() + this.itemTypes.toString() + this.stampType.toString() + this.envelopeType.toString();
    }

    public int compareTo(Order other, String compareType){
        if (compareType.equals("date"))
            return this.getDateCreated().compareTo(other.getDateCreated());
        if (compareType.equals("orderNum"))
            return Integer.compare(this.getOrderNum(), other.getOrderNum());
        int sumThis = 0;
        int sumOther = 0;
        for(ItemMultiplicity item: this.itemTypes){
            sumThis+=item.getItemNum();
        }
        for(ItemMultiplicity item: other.itemTypes){
            sumOther+=item.getItemNum();
        }
        return sumThis - sumOther;
    }
}
