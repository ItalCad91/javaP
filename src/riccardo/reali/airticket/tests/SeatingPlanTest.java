package riccardo.reali.airticket.tests;

import org.junit.Test;

import com.cc.airline.ticketing.SeatingPlan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;


public class SeatingPlanTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass()");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass():tearDownAfterClass()");
	}

	@Before
	public void setUp() throws Exception {
		System.out.println(
				"Starting test of the SeatingPlan default constructor:setUpBeforeClass(:setUp())");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println(
				"Test of the SeatingPlan default constructor complete:setUpBeforeClass():tearDown()");
	}

	@Test
	public void testSeatingPlan() {
		//fail("Not yet implemented");
		
		SeatingPlan sp = new SeatingPlan();
		assertNotNull(sp);
		
		int actualNumBusSeats = sp.getNumBusSeats();
		int actualNumTotalRows = sp.getTotalRows();
		int actualNumTotalSeats = sp.getTotalSeats();
		
		int expectedNumBusSeats	= 2;
		int expectedNumTotalRows = 4;
		int expectedNumTotalSeats = 14;
		
		assertEquals(expectedNumBusSeats, actualNumBusSeats);
		assertEquals(expectedNumTotalRows, actualNumTotalRows);
		assertEquals(expectedNumTotalSeats, actualNumTotalSeats);
		
	}

	
	
	
}
