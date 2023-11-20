public class ItemMultiplicity {
    private ItemType itemType;
    private int itemNum;

    public ItemMultiplicity(ItemType itemType, int itemNum){
        this.itemType = itemType;
        this.itemNum = itemNum;
    }

    public ItemType getItemType(){
        return this.itemType;
    }

    public int getItemNum(){
        return this.itemNum;
    }

    public void setItumNum(int newNum){
        this.itemNum = newNum;
    }

    public String getSearchString(){
        return this.itemType.toString() + this.itemNum;
    }

    public String toString(){
        return this.itemType.toString();
    }
}
