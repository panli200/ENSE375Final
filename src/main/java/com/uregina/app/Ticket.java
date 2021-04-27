package com.uregina.app;

import com.uregina.exceptions.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Class Ticket, a List of Flights in ordered sequences
 *
 */
public class Ticket {

	private static final String[] SchengenAirportsCode = new String[] { "VIE", "BRU", "PRG", "CPH", "TLL", "HEL", "CDG",
			"FRA", "MUC", "ATH", "BUD", "KEF", "CIA", "RIX", "VNO", "LUX", "MLA", "AMS", "OSL", "WAW", "LIS", "LJU",
			"KSC", "MAD", "ARN", "BRN" };

	/**
	 * The function checks the validaity of a ticket It checks 1. airports code are
	 * in IATA format (any three uppercases letters) 2. maximum flights Count <=
	 * number of flights in the ticket 3. maximum flight time <= Total flight times
	 * ( sum of flight time of each flight) 4. maximum layover time <= Total layover
	 * times ( sum of layover time between each consequative flight) 5. no flight
	 * between two airports in the Schengen area unless the passenger has a valid
	 * SchengenVisa 6. no cyclic trip 7. The sequence of flights in correct ( the
	 * arrival airport of a flight is the departure airport of the next flight) 8.
	 * any other logical constraints
	 * 
	 * @param ticket          List of ordered sequences of flights
	 * @param maxFlightsCount Maximum number of flights in the ticket
	 * @param maxFlightTime   Maximum allowable total flight times in minutes
	 * @param maxLayoverTime  Maximum allowable total layover times in minutes
	 * @param hasSchengenVisa to indicate if the passenger has a valid Schengen Visa
	 *                        or not
	 * @return true if the ticket is valid, false otherwise usefeul functions that
	 *         you may use (class: Flight , method: getArrivalAirport) (class:
	 *         Flight , method: getDepatureAirport) (class: Flight , method:
	 *         calculateFlightTime) (class: Flight , method: calculateLayoverTime)
	 *         (class: ticket , method: hasCyclicTrip)
	 */
	public static boolean checkTicket(ArrayList<Flight> ticket, int maxFlightsCount, int maxFlightTime,
			int maxLayoverTime, boolean hasSchengenVisa) {
		// Todo: add your code here
	
		for(Flight flight:ticket){

			for(int i=0;i<flight.getDepatureAirport().length();i++)
			{
				if(flight.getDepatureAirport().length()!=3 || flight.getDepatureAirport().charAt(i)>90 || flight.getDepatureAirport().charAt(i)<65)
				return false;
			}

			for(int i=0;i<flight.getArrivalAirport().length();i++)
			{
				if(flight.getArrivalAirport().length()!=3 || flight.getArrivalAirport().charAt(i)>90 || flight.getArrivalAirport().charAt(i)<65)
				return false;
			}
		}

	
		 if (ticket.size() > maxFlightsCount || ticket.size()<1)
			return false;

		int flightTime=0;
		
		for(int i=0;i<ticket.size();i++){
			flightTime += ticket.get(i).calculateFlightTime();
		}


		if (flightTime > maxFlightTime)
			return false;

		
		int layoverTime =0;

		for(int i=0;i<ticket.size() -1;i++){
		
			layoverTime += Flight.calculateLayoverTime(ticket.get(i), ticket.get(i+1));
		}

		if (layoverTime > maxLayoverTime)
			return false;


		for(Flight flight:ticket){
			
			for (int i = 0; i < Ticket.SchengenAirportsCode.length; i++){
				
				if (flight.getDepatureAirport().equals(Ticket.SchengenAirportsCode[i])&& (!hasSchengenVisa))
					return false;

				if (flight.getArrivalAirport().equals(Ticket.SchengenAirportsCode[i])&& (!hasSchengenVisa))
					return false;
			}
			
		}
		
		
		if (hasCyclicTrip(ticket))
			return false;

		
		for(int i=0;i<ticket.size() -1;i++){
			if (!ticket.get(i).getArrivalAirport().equals(ticket.get(i+1).getDepatureAirport()))
				return false;
			
		}


		// end of your code
		return true;
	}

	/**
	 * The function checks if the ticket has a cyclic trip (that is, no passenger
	 * can arrive at the same airport more than once within the same ticket)
	 * 
	 * @param ticket List of ordered sequences of flights
	 * @return true if the ticket has a cyclic trip, false otherwise usefeul
	 *         functions that you may use (class: Flight , method:
	 *         getArrivalAirport) (class: Flight , method: getDepatureAirport)
	 */
	public static boolean hasCyclicTrip(ArrayList<Flight> ticket) {
		// Todo : add your code here

		for (int i=0;i<ticket.size();i++){
			if(ticket.get(i).getDepatureAirport().equals(ticket.get(i).getArrivalAirport()))
				return false;		
		}

		if(ticket.get(0).getDepatureAirport().equals(ticket.get(ticket.size()).getArrivalAirport()))
			return true;

		// Todo : end of your code
		return false;
	}
}