package com.example.demo2.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {
    @Id
    @GeneratedValue
    private int Id;
    private String amount;
    private String category;

    public Ticket(@JsonProperty("amount") String amount, @JsonProperty("Category") String category) {
        this.amount = amount;
        this.category = category;
    }
}
