package boots.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import boots.dao.ScooterRepository;
import boots.model.Scooter;

@Service @Transactional
public class ScooterService {
	private final ScooterRepository scooterRepository;
	
	public ScooterService(ScooterRepository scooterRepository){
		super();
		this.scooterRepository=scooterRepository;
	}
	
	public List<Scooter> findAll(){
		List<Scooter> scooters = new ArrayList<Scooter>();
		for(Scooter scooter : scooterRepository.findAll()){
			scooters.add(scooter);
		}
		return scooters;
	}
	
	public void save(Scooter scooter){
		scooterRepository.save(scooter);
	}
	
	public void delete(int id){
		scooterRepository.delete(id);
	}
	
	public Scooter findOne(int id){
		return scooterRepository.findOne(id);
	}

}
