package com.example.uniroomhubbackend.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Table(name = "room")
@Data
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "room")
    private String room;


    @Column(name = "building")
    private String building;

    @Column(name = "floor")
    private String floor;

    @Column(name = "seating")
    private String seating;

    @Column(name = "date")
    private String date;


}

