package com.example.registerofvehicles.repository;

import com.example.registerofvehicles.domain.Vehicle;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VehicleRepository extends JpaRepository<Vehicle, Long> {
    @Query(value="select * from vdb.vehicle where nregnew= :vin", nativeQuery=true)
    List<Vehicle> findVehiclesByNREGNEW(String vin);
}
