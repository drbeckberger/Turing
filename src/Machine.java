
public class Machine {
	public int state;
	public Tape tape;
	public Instructions instructions;
	private IOSystem IO;
	
	public Machine(){
		state = 0;
	}
	
	public int getState(){
		return state;
	}
	
	public void changeState(int newState){
		state = newState;
	}

}
