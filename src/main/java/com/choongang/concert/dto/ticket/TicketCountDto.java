package com.choongang.concert.dto.ticket;

import lombok.Data;

@Data
public class TicketCountDto {

	private String checkUserId;
	private int concertId;
	private String concertDate;
}
