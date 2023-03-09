package riccardo.reali.airticket.tests;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.cc.airline.passengers.Passenger;
import com.cc.airline.passengers.PassengerName;
import com.cc.airline.passengers.StaffPassenger;
import com.cc.airline.ticketing.Seat;
import com.cc.airline.ticketing.SeatingClass;
import com.cc.airline.ticketing.SeatingPlan;
import com.cc.airline.ticketing.Ticket;

public class SellTicketTest {

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        System.out.println("Starting test of the SeatingPlan default constructor:setUpBeforeClass(:setUp())");
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        System.out.println("Test of the SeatingPlan default constructor complete:setUpBeforeClass():tearDown()");
    }

    @Test
    public void sellTicket1() {
        SeatingClass sClass = SeatingClass.ECONOMY;
        Passenger passenger = new Passenger(new PassengerName("Mary", "I", "Worth"));
        Seat seat = new Seat();
        seat.setRow(3);
        seat.setLetter('D');
        double price = sClass.getPrice();
        Ticket ticket = new Ticket(passenger, seat, price);
        System.out.println("Ticket issued: " + ticket);
        assertEquals(500.0, ticket.getPrice(), 0.005);
    }

    @Test
    public void sellTicket2() {
        // Test selling a ticket to an airline employee at half price

        // Create a staff passenger
        PassengerName pName = new PassengerName("Mary", "I", "Worth");
        StaffPassenger passenger = new StaffPassenger(pName, "EMP123");

        // Create a seating plan
        SeatingPlan seatingPlan = new SeatingPlan();

        // Sell a ticket to the staff passenger
        double price = seatingPlan.getSeatReserver().sellTicketToStaff(passenger, SeatingClass.ECONOMY);

        // Verify that the ticket was sold at the expected price
        assertEquals(250.0, price, 0.001);
    }
    
    @Test
    public void sellTicket3() {
        // Test selling a business class ticket to an airline employee at full price

        // Create a staff passenger
        PassengerName pName = new PassengerName("John", "D", "Doe");
        StaffPassenger passenger = new StaffPassenger(pName, "EMP456");

        // Create a seating plan
        SeatingPlan seatingPlan = new SeatingPlan();

        // Sell a ticket to the staff passenger
        double price = seatingPlan.sellTicketToStaff(passenger, SeatingClass.BUSINESS);

        // Verify that the ticket was sold at the expected price
        assertEquals(1000.0, price, 0.001);
    
}
