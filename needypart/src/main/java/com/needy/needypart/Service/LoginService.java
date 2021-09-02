package com.needy.needypart.Service;

import java.util.Optional;

import javax.transaction.Transactional;

import org.omg.CORBA.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.needy.needypart.Repository.LoginRepository;
import com.needy.needypart.model.Needy;

@Service
@Transactional
public class LoginService {
	
	@Autowired
	private LoginRepository loginRepository;
	
	public Needy fetchNeedyByusernameAndpassword(String username, String password) {
		return loginRepository.findByUsernameAndPassword(username, password);
	}
	   
}
