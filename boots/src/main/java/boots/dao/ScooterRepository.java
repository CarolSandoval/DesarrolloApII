package boots.dao;

import org.springframework.data.repository.CrudRepository;

import boots.model.Scooter;

public interface ScooterRepository extends CrudRepository<Scooter, Integer> {

}
