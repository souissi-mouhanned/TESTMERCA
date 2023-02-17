package Com.Merca.Mercarue.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Com.Merca.Mercarue.models.User;
import Com.Merca.Mercarue.repository.UserRepository;


@Service
public class usimpl implements usersecice{
@Autowired
UserRepository userRepository;


	@Override
	public User saveuser(User u) {
		return userRepository.save(u);
	}


	@Override
	public List<User> showall() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

}
