import java.util.ArrayList;
import java.util.List;

// Before you commit and push write your student ID and finish time here.
// Finish time: 
// Student ID: IT56/2015

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus;
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		//to be implemented
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		//to be implemented
		int score;
		for(int i=0; i<frames.size(); i++){
			if(frames.get(i).isStrike() && i<frames.size()-1){
				score = 10 + frames.get(i+1).getFirstThrow() + frames.get(i+1).getSecondThrow();
			}
			else if (frames.get(i).isSpare() && i<frames.size()-1){
				score = 10 + frames.get(i+1).getFirstThrow();
			}
			else if(frames.get(i).isStrike() && i<frames.size()){
				score = 10 + bonus.getFirstThrow() + bonus.getSecondThrow();
			}
			else if (frames.get(i).isSpare() && i<frames.size()){
				score = 10 + bonus.getFirstThrow();
			}
			else{
				score = frames.get(i).getFirstThrow() + frames.get(i).getSecondThrow();
			}
		}
	}
	
	// Returns the game score
	public int score(){
		//to be implemented: should return game score 
		int rez=0;
		/*for (int i=0; i<frames.size(); i++){
			rez= rez + ;
		}*/
		return 0;
	}
}
