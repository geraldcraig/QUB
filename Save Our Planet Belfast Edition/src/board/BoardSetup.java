package board;




public class BoardSetup  {
	
	public static Board getNewBoard() {
		
		Board board = new Board();
		
		board.addLocation(new Go());
		board.addLocation(new Areas(1, "Falls", 20));
		board.addLocation(new Areas(2, "Shankill", 40));
		board.addLocation(new Areas(3, "Castle View", 60));
		board.addLocation(new Areas(4, "Cave Hill", 80));
		board.addLocation(new Areas(5, "Water Works", 100));
		board.addLocation(new PSNI_Holding_Area());
		board.addLocation(new Areas(7, "Titanic", 100));
		board.addLocation(new Areas(8, "Victoria-Station", 100));
		board.addLocation(new Areas(9, "Airport Road", 100));
		board.addLocation(new Areas(10, "University Square", 100));
		board.addLocation(new Areas(11, "Botanic", 100));
		
		return board;
		
	}
	

}
