/*
 * Second State class - A State where the last two events were the same
 * */
public class SecondState extends State {


    public SecondState(Event e) {
        super(e);
    }

    public State updateState(Event e) {
        if(lastEvent.equals(e)){
            System.out.println("Last 3 events were the same");
            return new ThirdState(e);
        }else{
            return new FirstState(e);
        }
    }
}
