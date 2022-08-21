package one.digitalinnovation.antoniocloudparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import one.digitalinnovation.antoniocloudparking.model.Parking;

@Repository
public interface ParkingRepository extends JpaRepository<Parking, String> {
}
