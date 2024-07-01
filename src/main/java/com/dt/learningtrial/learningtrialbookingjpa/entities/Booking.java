package com.dt.learningtrial.learningtrialbookingjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Booking {

    @Id
    private long bookingId;
    private String category;
    private String name;
    private String location;
    private double totalCharge;
}
