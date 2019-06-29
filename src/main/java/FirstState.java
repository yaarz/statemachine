/*
* First State class - A State where the last event was different to the events before it
* */
public class FirstState extends State {

    public FirstState(Event e){
        super(e);
    }


    public State updateState(Event e) {
        return (lastEvent.equals(e)) ? new SecondState(e) : new FirstState(e);
    }
}
