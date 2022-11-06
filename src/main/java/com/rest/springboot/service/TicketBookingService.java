package com.rest.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.rest.springboot.dao.TicketBookingDAO;
import com.rest.springboot.entities.Ticket;

@Service
public class TicketBookingService {
	@Autowired
	private TicketBookingDAO ticketBookingDAO;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDAO.save(ticket);
	}
	public Ticket getTicketById(Integer ticketId) {
		return ticketBookingDAO.findById(ticketId).get();
	}
	public Iterable<Ticket> getAllBookedTickets() {
		return ticketBookingDAO.findAll();
	}
	public void deleteTicket(Integer ticketId) {
		ticketBookingDAO.deleteById(ticketId);
	}
	public Ticket updateTicket(Integer ticketId, String newEmail) {
Ticket ticketFromDb = ticketBookingDAO.findById(ticketId).get();
ticketFromDb.setEmail(newEmail);
Ticket upadedTicket = ticketBookingDAO.save(ticketFromDb);
	return upadedTicket;
   }
}
