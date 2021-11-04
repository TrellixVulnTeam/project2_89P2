/**
 * Repository Interface for p2_reservations table
 */
package com.revature.hotelmagicbook.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.revature.hotelmagicbook.model.Reservation;

/**
 * @author Dipanjali Ghosh
 *
 */
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {
	public List<Reservation> findReservationsByCustomer(int customerId);
	
	public List<Reservation> findReservationsByRoom(int roomId);
	
	public List<Reservation> findReservationsPaidFor(boolean isPaid);
	
	public boolean findIfRoomBooked(int roomId, Date startDate, Date endDate);
}
