public class Example {

    public static void main(String[] args){
        String filePath = "state.txt";
        Machine m = new Machine();
        Machine m2;
        Event e1 = new EventOne("eventOne", 1);
        Event e2 = new EventTwo("eventTwo", 2);
        m.receiveEvent(e1);
        m.receiveEvent(e1);
        m.saveStateToFile(filePath);
        m.receiveEvent(e2);
        m.getStateFromFile(filePath);
        m.receiveEvent(e1);
        m.receiveEvent(e1);
        m.receiveEvent(e2);
        m.receiveEvent(e2);
        m.receiveEvent(e2);
        m2 = new Machine(filePath);
        m2.receiveEvent(e1);
    }
}
