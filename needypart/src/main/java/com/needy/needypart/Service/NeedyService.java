package com.needy.needypart.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needy.needypart.Repository.AddRepository;
import com.needy.needypart.Repository.NeedyRepository;
import com.needy.needypart.model.Donation;
import com.needy.needypart.model.Needy;
import com.needy.needypart.model.Request;

@Service
public class NeedyService  {

	@Autowired
	private NeedyRepository needyrepository;
	
	@Autowired
	private AddRepository addrepository;
	
	public List<Donation> getDonations(){
	return (List<Donation>) 	needyrepository.findAll();
		
		
	}
	
	public void deleteDonation(Integer dId) {
		needyrepository.deleteById(dId);
	}
	
	public Request addrequest(Request request) {
		return addrepository.save(request);
		
	}
	
	public List<Request> getRequest(){
		return (List<Request>) 	addrepository.findAll();
			
			
		}
	
}
