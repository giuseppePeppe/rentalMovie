package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Movie;
import main.Rental;

public class TestRental {

	Movie  _movie = new Movie("Don Camillo e Peppone", 2);
	Rental _rent = new Rental(_movie, 1);
	
	
	@Test
	public void testGetMovie() {
		assertEquals(_rent.getMovie(), _movie);
	}
	
	@Test
	public void testGetDaysRented() {
		assertEquals(_rent.getDaysRented(), 1);
	}
	
	@Test
	public void testGetCharge() {
		assertEquals(_rent.getCharge(), 1.5, 0.0);
	}

}
