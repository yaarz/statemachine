import java.io.Serializable;

public abstract class State implements Serializable {
    public Event lastEvent;

    public abstract State updateState(Event e);

    public State (Event e){
        lastEvent = e;
    }

}
