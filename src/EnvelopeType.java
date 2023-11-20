public class EnvelopeType extends ItemType {
    public EnvelopeType(String name){
        super();
        String[] approved = {"Big", "Small"};
        super.setName(name, approved);
    }
}
