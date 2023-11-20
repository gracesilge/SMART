import java.security.InvalidParameterException;

public class ItemType {
    private String name;

    public ItemType(){

    }

    public void setName(String name, String[] approved){
        for(String approvedName: approved){
            if(name.equals(approvedName)){
                this.name = name;
                return;
            } 
        }
        throw new InvalidParameterException();
    }
    public String toString(){
        return this.name;
    }
}
