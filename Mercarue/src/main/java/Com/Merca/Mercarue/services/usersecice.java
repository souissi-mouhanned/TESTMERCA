package Com.Merca.Mercarue.services;

import java.util.List;

import Com.Merca.Mercarue.models.User;


public interface usersecice {
	public User saveuser(User u) ;
	public List<User> showall();
}
