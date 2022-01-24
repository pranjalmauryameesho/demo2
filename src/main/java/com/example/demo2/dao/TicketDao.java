package com.example.demo2.dao;

import com.example.demo2.model.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface TicketDao extends CrudRepository<Ticket, Integer> {
}
