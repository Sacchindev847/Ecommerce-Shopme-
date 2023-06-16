package com.shopme.admin.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shopme.common.entity.User;
import com.shopme.common.entity.Role;

@Service
public class userService {

	@Autowired
	private UserRepository UserRepo;
	
	@Autowired
	private RoleRepository RolesRepo;
	
	public List<User> listAll(){
		return (List<User>)UserRepo.findAll();
	}
	
	public List<Role> listRoles(){
		return (List<Role>) RolesRepo.findAll();
	}
	
}
