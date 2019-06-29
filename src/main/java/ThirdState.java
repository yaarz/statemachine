/*
 * Third State class - A State where we have informed of the first time
 * we had 3 consecutive events and now don't want to change state anymore
 * */
public class ThirdState extends State {


    public ThirdState(Event e) {
        super(e);
    }

    public State updateState(Event e) {
        return this;
    }
}
