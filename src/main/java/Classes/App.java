package Classes;

import java.util.HashSet;
import java.util.Set;

public class App {
	public Set<User> Users;
	public Set<String> Resultset;

	public App() {
		Users = new HashSet<User>();
	}
	public boolean AddNewUser(String Name,String Email)
	{			
		User u = new User(Name, Email);
		if(Validation.isValidEmailAddress(Email)) {
			if(!Users.contains(u))
		return Users.add(u);
		}
		return false;
	}
	public boolean AddNewGroupe(String Name,String Email)
	{			
		Group u = new Group(Name, Email);
		if(Validation.isValidEmailAddress(Email)) {
			if(!Users.contains(u))
		return Users.add(u);
		}
		return false;
	}
	public Set<User> getUsers() {
		return Users;
	}
	public void setUsers(Set<User> users) {
		Users = users;
	}
	public boolean AddUserToGroupe(String Name,String Email,String GroupeName)
	{
		User u = new User(Name, Email);
		Users.add(u);
		if(Validation.isValidEmailAddress(Email))
		{
			Users.forEach((User us) -> {if(us.getName()==GroupeName)
			{
//				System.out.println("////////////////////////////////////if1");
				if(us.getClass()==Group.class) {
//					System.out.println("////////////////////////////////if2");
					Group g = (Group)us;
					g.AddUserToGroupe(u);
					}
			}
				
			});
			return true;
		}
		return false;
		
	}
	public void getAllMails()
	{
		
		Resultset = new HashSet<String>();
		Users.forEach((User us) ->{
			if(!CheckIfGroup(us))
			{
				Resultset.add(us.getEmail());
			}
			else {
				Resultset.add(us.getEmail());
				getAllMails((Group)us);
			}
		});
	}
	public void getAllMails(Group g)
	{
		Set<User>a = g.getGroupeMembers();
		a.forEach((User us) ->{
			if(!CheckIfGroup(us))
			{
				Resultset.add(us.getEmail());
			}
			else {
				Resultset.add(us.getEmail());
				getAllMails((Group)us);
			}
		});
	}
	public boolean CheckIfGroup(User u)
	{
		if (u.getClass()==Group.class) {
			return true;
		}
		else
			return false;
	}
	@Override
	public String toString() {
		return "App [Users=\n" + Users + "\n ------------------------------------------------------------ \nResultset=" + Resultset + "]\nSize = "+Resultset.size();
	}
	public void toStringGroup() {
		Users.forEach((User us) ->{
			if(CheckIfGroup(us))
			{
				Group g = (Group)us;
				System.out.println(g.toString());
			}
		});
		
	}
	
}
