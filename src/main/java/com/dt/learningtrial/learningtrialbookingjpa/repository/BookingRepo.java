package com.dt.learningtrial.learningtrialbookingjpa.repository;

import com.dt.learningtrial.learningtrialbookingjpa.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
//Above Long is datatype of Primary Key
// Based on <Booking, Long> this elements, it is forming all the queries. On CompileTime not during RunTime


//    @Query("SELECT * FROM booking WHERE category = ?")
    Optional<Booking> findByCategory(String category);

}
