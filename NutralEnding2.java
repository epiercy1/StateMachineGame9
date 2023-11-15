
public class NutralEnding2 {
private Model model;
	
	public NutralEnding2(Model model) {
		this.model = model;
	}

	public String description() {
		String description = "You choose to not to go to the club meeting because you are not interested in Musical Theater.";
		return description;
	}
	
	public void EndGame() {
		model.setCurrentState(StateType.EndOfGame);
	}
}
