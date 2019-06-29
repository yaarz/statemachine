import java.io.Serializable;

public abstract class Event implements Serializable {
    private String eventName;
    private int eventId;

    public Event(String event,int id){
        eventName=event;
        eventId = id;
    }

    public  String getEventName(){ return eventName;    }

    public int getEventId() {        return eventId;    }

    @Override
    public boolean equals(Object o){
        if(o == null){
            return false;
        }
        Event e =(Event)o;
        if(e.getEventId()==this.eventId&&e.getEventName().equals(this.eventName)) {
            return true;
        }
        return false;
    }


}
