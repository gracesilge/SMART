import java.util.Timer;

public class TimerRunner {
    private Timer timer = new Timer();
    private TextAutomation task = new TextAutomation();

    public TimerRunner(){
        timer.schedule(task, 1000, 604800000);
    }
}
