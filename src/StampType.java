public class StampType extends ItemType {
    
    public StampType(String name){
        super();
        String[] approved = {"Domestic", "International", "None"};
        super.setName(name, approved);
    }
}
