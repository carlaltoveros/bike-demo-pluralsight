package com.projects.globomatics.bike.repositories;

import com.projects.globomatics.bike.models.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {

}
