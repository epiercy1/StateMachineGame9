
public class NutralEnding1 {
private Model model;
	
	public NutralEnding1(Model model) {
		this.model = model;
	}

	public String description() {
		String description = "You choose to stay at home. You walk back to your house and go inside.";
		return description;
	}
		
	public void EndGame() {
		model.setCurrentState(StateType.EndOfGame);
	}
	
}
