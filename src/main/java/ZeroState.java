/*
* Initial State that all machine start with, has no event history
* */
public class ZeroState extends State {
    public ZeroState(){
        super(null);
    }

    //No matter which event we receive we will move to the first state that has a last event
    public State updateState(Event e) {
        return new FirstState(e);
    }
}
