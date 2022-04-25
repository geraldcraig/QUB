package board;

public class BoardSetup {

	public static Board getNewBoard() {

		Board board = new Board();

		board.addLocation(new Go());
		board.addLocation(new Areas(1, "Falls", "West Belfast", 20, 40, 2, 4, 6, 80, 8, 16, 24));
		board.addLocation(new Areas(2, "Shankill", "West Belfast", 40, 40, 2, 4, 6, 80, 8, 16, 24));
		board.addLocation(new Areas(3, "Castle View", "North Belfast", 60, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new Areas(4, "Cave Hill", "North Belfast", 80, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new Areas(5, "Water Works", "North Belfast", 100, 60, 3, 6, 9, 120, 12, 24, 36));
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(new Areas(7, "Titanic", "East Belfast", 120, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(8, "Victoria-Station", "East Belfast", 140, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(9, "Airport Road", "East Belfast", 160, 80, 4, 8, 12, 160, 16, 32, 48));
		board.addLocation(new Areas(10, "University Square", "South Belfast", 180, 100, 5, 10, 15, 200, 20, 40, 60));
		board.addLocation(new Areas(11, "Botanic", "South Belfast", 200, 100, 5, 10, 15, 200, 20, 40, 60));

		return board;

	}

}
