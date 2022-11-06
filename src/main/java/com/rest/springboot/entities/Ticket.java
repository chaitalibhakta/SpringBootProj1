package com.rest.springboot.entities;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ticket")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ticket {
	@Id
	@Column(name="ticket_id")
	private Integer ticketId;
	
	@Column(name="passenger_name",nullable=false)
	private String passengerName;
			
	@Column(name="source_station")
	private String sourceStation;
	
	@Column(name="dest_station")
	private String destStation;
	
	@Column(name="email")
	private String email;
}
