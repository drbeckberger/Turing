
public class Instructions {

		
	int[][] instructions = new int[5][200];
	
	int curChar;
	int curState;
	int changedState;
	int changedChar;
	int direction;
	
	public Instructions(){
		for(r = 0; r < 5; r++){
			for(c = 0; c < 200; c++){
				instructions[r][c] = 0;
			}
		}
	}
	
	public void receiveInfo(){
		
	}
			
		
}
