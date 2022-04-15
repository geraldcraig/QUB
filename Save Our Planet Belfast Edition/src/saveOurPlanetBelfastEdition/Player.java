package saveOurPlanetBelfastEdition;

public class Player {
	
	/**
	 * Only playerName is valid for now for testing as board is not currently 
	 * made so can't get index
	 */

	private String playerName;
	private Marker marker;
	private int boardPosition;

	//==================================================
	//==============::Player Constructor::==============
	//==================================================
	/**
	 *constructs player using playerName, marker and playerPosition
	 */
	public Player(String playerName, Marker marker) {

		this.playerName = playerName;
		this.marker = marker;
		this.boardPosition = 0;

	}

	//==================================================
	//================::Get Player Name::===============
	//==================================================
	/**
	 * returns playerName
	 */
	public String getPlayerName() {
		return playerName;
	}
	
	//==================================================
	//================::Get Player Marker::===============
	//==================================================
	/**
	 * returns playerMarker
	 */

	public Marker getMarker() {
		return marker;
	}

	//============================================================
	//================::Get Player Board Position::===============
	//============================================================
	/**
	 * returns the index of the players board position
	 */
	public int getBoardPosition() {
	return boardPosition;
	}
	
	//============================================================
	//================::Set Player Board Position::===============
	//============================================================
	/**
	 * Sets the players board position based on the supplied board index
	 */
	public void setBoardPosition(int boardPosition) {
	this.boardPosition = boardPosition;
	}

	//==================================================
	//=================::Name ToString::================
	//==================================================
	/**
	 * basic toString to display playerName to the console
	 */
	@Override
	public String toString() {
		return playerName;
	}
}
