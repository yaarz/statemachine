
public class Machine {
    private State currentState;

    public Machine(){
        currentState = new ZeroState();
    }
    public Machine(String filePath){
        getStateFromFile(filePath);
    }

    /*
    * Change event based on current state and event sent
    * */
    public void receiveEvent(Event event){
        currentState = currentState.updateState(event);
    }

    public void saveStateToFile(String filePath){
        ObjectFileIO.writeObjectToFile(currentState,filePath);
    }

    public void getStateFromFile(String filePath){
        currentState = (State)ObjectFileIO.readObjectFromFile(filePath);
    }

    public State getCurrentState() {
        return currentState;
    }
}
