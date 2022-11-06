package com.rest.springboot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rest.springboot.entities.Ticket;

public interface TicketBookingDAO extends JpaRepository<Ticket,Integer>{

}
