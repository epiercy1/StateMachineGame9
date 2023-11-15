
public class NutralEnding3 {
private Model model;
	
	public NutralEnding3(Model model) {
		this.model = model;
	}

	public String description() {
		String description = "You choose to not to join the club. You leave the auditorium.";
		return description;
	}
	
	public void EndGame() {
		model.setCurrentState(StateType.EndOfGame);
	}
}
