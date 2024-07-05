package com.dt.learningtrial.learningtrialbookingjpa.june18and23.repository;

import com.dt.learningtrial.learningtrialbookingjpa.june18and23.entities.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BookingRepo extends JpaRepository<Booking, Long> {
//Above Long is datatype of Primary Key
// Based on <Booking, Long> this elements, it is forming all the queries. On CompileTime not during RunTime


//    @Query("SELECT * FROM booking WHERE category = ?") JPQL: Jakarta Persistence Query Lanuage
    Optional<Booking> findByCategory(String category);

//    @Query("Select b from Booking b Where b.location =?1")
    @Query(value = "Select * from Booking b Where b.location =?1",nativeQuery = true)
    List<Booking> findByLocation(String location);

}
