package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Movie;

public class TestMovie {

	
	Movie movie = new Movie("Terminator", Movie.NEW_RELEASE);
	
	@Test
	public void testTitle() {
		assertEquals(movie.getTitle(), "Terminator");
	}
		
	@Test
	public void testSetPriceCode(){
		assertEquals(movie.getPriceCode(), Movie.NEW_RELEASE);
	}
	
	@Test
	public void testgetCharge(){
		assertEquals(movie.getCharge(2), 6.0, 0.0);
	}
	

}
