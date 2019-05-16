package com.sak.ambarlar.servicesImpl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sak.ambarlar.dao.IlcelerRepository;
import com.sak.ambarlar.dao.IllerRepository;
import com.sak.ambarlar.dao.RoleRepository;
import com.sak.ambarlar.dao.UserRepository;
import com.sak.ambarlar.model.Ilceler;
import com.sak.ambarlar.model.Iller;
import com.sak.ambarlar.model.IllerLoad;
import com.sak.ambarlar.model.Role;
import com.sak.ambarlar.model.StatuCode;
import com.sak.ambarlar.model.User;
import com.sak.ambarlar.util.IlveIceler;


@Service
public class BootstrapDataService implements ApplicationListener<ContextRefreshedEvent> {
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private IllerRepository illerRepository;
	@Autowired
	private IlcelerRepository ilcelerRepository;

	@Override
	public void onApplicationEvent(ContextRefreshedEvent arg0) {
		insertRoles();
		insertUser();
		try {
			insertIller();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private void insertIller() throws JsonParseException, JsonMappingException, IOException {

		if(illerRepository.findAll().size() == 0) {
			IlveIceler ilveIceler = new IlveIceler();
			ObjectMapper objectMapper = new ObjectMapper();
			List<IllerLoad> readValue = objectMapper.readValue(
					ilveIceler.getJson(),
	             objectMapper.getTypeFactory().constructCollectionType(List.class, IllerLoad.class)
	         );
			for(IllerLoad iller: readValue) {
				illerRepository.save(new Iller(iller.getPlaka(), iller.getIl()));
				for(String s: iller.getIlceleri()) {
					ilcelerRepository.save(new Ilceler(iller.getPlaka(), s));
				}
			}
			
				
			
		}
	}

	private void insertRoles() {
		if(roleRepository.findAll().size() == 0) {
			List<Role> roles = new ArrayList<Role>();
			Role roleMusteri = new Role();
			roleMusteri.setRolAdi("musteri");
			roles.add(roleMusteri);
			
			Role rolePatron = new Role();
			rolePatron.setRolAdi("patron");
			roles.add(rolePatron);
			
			Role rolePersonel = new Role();
			rolePersonel.setRolAdi("personel");
			roles.add(rolePersonel);
			
			
			roleRepository.saveAll(roles);
		}
	}
	
	private void insertUser() {
		if(userRepository.userList().size() == 0) {
			User user = new User();
			user.setPassword(new BCryptPasswordEncoder().encode("1234"));
			user.setUserName("root");
			user.setStatus(StatuCode.SORUNSUZ);
			user.setRol(roleRepository.getOne(1L));
			
			User user1 = new User();
			user1.setPassword(new BCryptPasswordEncoder().encode("1234"));
			user1.setUserName("kamilsak");
			user1.setStatus(StatuCode.SORUNSUZ);
			user1.setRol(roleRepository.getOne(1L));
			
			userRepository.save(user);
			userRepository.save(user1);
		}
	}
}
