import java.util.TimerTask;
/* 
import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
*/

public class TextAutomation extends TimerTask{

    private OrderTableModel orderInfo;
    private InventoryTableModel inventoryInfo;
    private static final String ACCOUNT_SID = "Hey Girl";
    private static final String AUTH_TOKEN = "Fuck my life";

    public void run(){
        System.out.println("I Hate it here");
    }
    /* 
    public void run(){
        Twilio.init(ACCOUNT_SID, AUTH_TOKEN);
        Message clientMessage = Message.creator(
                new com.twilio.type.PhoneNumber("+18012030302"),
                new com.twilio.type.PhoneNumber("Bought"),
                this.getClientText())
            .create();
        Message clientMessage = Message.creator(
                new com.twilio.type.PhoneNumber("+18014338796"),
                new com.twilio.type.PhoneNumber("Bought"),
                this.getContractorText())
            .create();
        System.out.println(message.getSid());
    }
    */

    private String getContractorText(){
        int[] envelopes = this.orderInfo.getEnvelopeInfo();
        int[] stamps = this.orderInfo.getStampInfo();
        return "There are " + this.orderInfo.getRowCount() + "orders this week with " + this.orderInfo.getNumberOfStickers() + "stickers.\nYou will need " + envelopes[0] + "small envelopes and " + envelopes[1] + " big envelopes.\nYou will need " + stamps[1] + " domestic stamps and " + stamps[2] + " international stamps." ;
    }

    private String getClientText(){
        int rows = inventoryInfo.getRowCount();
        String result = "";
        for(int i = 0; i<rows;i++){
            if(((Integer) inventoryInfo.getValueAt(i, 1))<100)
                result+="Item " + inventoryInfo.getValueAt(i, 0) +  "has " + inventoryInfo.getValueAt(i, 1) + "stock. Reorder soon!\n";
        }
        return result;
    }
}
