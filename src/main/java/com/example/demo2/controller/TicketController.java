package com.example.demo2.controller;

import com.example.demo2.dao.TicketDao;
import com.example.demo2.model.Ticket;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ticket")
public class TicketController {
    @Autowired
    private TicketDao dao;

    @PostMapping("/bookTicket")
    public String bookTicket(@RequestBody  List<Ticket> tickets){
        dao.saveAll(tickets);
        return "tickets booked : " + tickets.size();
    }

    @GetMapping("/getTicket")
    public Iterable <Ticket> getTicket(){
        return dao.findAll();
    }
}
