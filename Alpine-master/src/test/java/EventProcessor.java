import me.zero.alpine.listener.EventHandler;
import me.zero.alpine.listener.Listenable;
import me.zero.alpine.listener.Listener;

public class EventProcessor implements Listenable {

    @EventHandler
    private Listener<String> stringListener = new Listener<>(str -> {
        System.out.println(str);
    }, new LengthOf3Filter());
}
