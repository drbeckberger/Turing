
public class Tape {
	
	int curChar, location, direction;
	public final int MAXSIZE = 1000;
	private final int OFFTAPE = -1;
	int[] tapeArray;
	
	public Tape(String initialTape){
		tapeArray = new int[MAXSIZE + 2];
		tapeArray[0] = OFFTAPE;
		tapeArray[tapeArray.length - 1] = OFFTAPE;
		for(int i = 1; i < tapeArray.length - 1; i++){
			tapeArray[i] = initialTape.charAt(i-1);
		}
		location = 500;
	}
	
	public int getCurChar(){
		return curChar;
	}
	
	
	public void changeChar(int newChar){
		tapeArray[location] = newChar;
	}
	
	public void move(){
		//TODO make a moveLeft and a moveRight method
		location = location + direction;
	}
}
