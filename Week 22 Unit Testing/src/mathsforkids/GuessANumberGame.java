package mathsforkids;

public class GuessANumberGame {

	public int roundToTen(int testNumber) {
		int answer = (int) (Math.rint((double) testNumber / 10) * 10);
		return answer;
	}
	
	

}
