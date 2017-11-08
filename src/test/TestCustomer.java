package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Customer;
import main.Movie;
import main.Rental;

public class TestCustomer {

	
	Movie _movie = new Movie("Sandokan", 1);
	Customer _customer = new Customer("Franco");
	Rental _rental = new Rental(_movie, 2);
	
	@Test
	public void testGetName() {
		
		assertEquals(_customer.getName(), "Franco");
		
	}
	
	@Test
	public void testStatement() {
		
		_customer.addRental(_rental);
		
		assertEquals(_customer.statement(), "Rental Record for Franco\n"+
											 "\tSandokan\t6.0\n"+
											 "Amount owed is 6.0\n"+
											 "You earned 2.0 frequent renter points");
		
	}
	

}
