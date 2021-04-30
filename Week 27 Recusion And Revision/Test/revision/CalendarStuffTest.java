package revision;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalendarStuffTest {
	String one, two, three, four, five, six;
	String seven, eight, nine, ten, eleven, twelve;

	@BeforeEach
	void setUp() throws Exception {
		one = "Jan";
		two = "Feb";
		three = "Mar";
		four = "Apr";
		five = "May";
		six = "Jun";
		seven = "Jul";
		eight = "Aug";
		nine = "Sep";
		ten = "Oct";
		eleven = "Nov";
		twelve = "Dec";
	}

	@Test
	void testMonthToString() {
		assertEquals(one, CalendarStuff.monthToString(1));
		assertEquals(two, CalendarStuff.monthToString(2));
		assertEquals(three, CalendarStuff.monthToString(3));
		assertEquals(four, CalendarStuff.monthToString(4));
		assertEquals(five, CalendarStuff.monthToString(5));
		assertEquals(six, CalendarStuff.monthToString(6));
		assertEquals(seven, CalendarStuff.monthToString(7));
		assertEquals(eight, CalendarStuff.monthToString(8));
		assertEquals(nine, CalendarStuff.monthToString(9));
		assertEquals(ten, CalendarStuff.monthToString(10));
		assertEquals(eleven, CalendarStuff.monthToString(11));
		assertEquals(twelve, CalendarStuff.monthToString(12));
	}
	
	@Test
		void testInvalidMonth() {
			NumberFormatException numberFormatException = assertThrows(NumberFormatException.class, () -> {
				CalendarStuff.monthToString(13);
			});
			
			assertEquals("Invalid month number", numberFormatException.getMessage());
			System.out.println(numberFormatException.getMessage());
		}

}
