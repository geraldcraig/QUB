package board;

public class BoardSetup {

	public static Board getNewBoard() {

		Board board = new Board();

		board.addLocation(new Go());
		board.addLocation(new Areas(1, "Falls", "West Belfast", 20, .05, 40, .02, 80, .08));
		board.addLocation(new Areas(2, "Shankill", "West Belfast", 40, .05, 40, .02, 80, .08));
		board.addLocation(new Areas(3, "Castle View", "North Belfast", 60, .10, 60, .03, 120, .12));
		board.addLocation(new Areas(4, "Cave Hill", "North Belfast", 80, .10, 60, .03, 120, .12));
		board.addLocation(new Areas(5, "Water Works", "North Belfast", 100, .10, 60, .03, 120, .12));
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(new Areas(7, "Titanic", "East Belfast", 120, .15, 80, .04, 160, .16));
		board.addLocation(new Areas(8, "Victoria-Station", "East Belfast", 140, .15, 80, .04, 160, .16));
		board.addLocation(new Areas(9, "Airport Road", "East Belfast", 160, .15, 80, .04, 160, .16));
		board.addLocation(new Areas(10, "University Square", "South Belfast", 180, .20, 100, .05, 200, .20));
		board.addLocation(new Areas(11, "Botanic", "South Belfast", 200, .20, 100, .05, 200, .20));

		return board;

	}

}
