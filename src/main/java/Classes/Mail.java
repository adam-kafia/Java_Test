package Classes;

import java.util.Set;


public class Mail {

	public void sendMail(String Mail,Object u)
	{
		if (u.getClass() == User.class)
		{
			User temp = (User)u;
			System.out.println("Mail sent to User"+temp.getName()+"Email: "+temp.getEmail());
		}
		if (u.getClass()==Group.class)
		{
			Group temp = (Group) u;
			Set<User> us = temp.getGroupeMembers();
			us.forEach((User user)->{System.out.println("Email sent to user: "+user.getName()+"Email: "+user.getEmail());;
			});
				
			}
		}
			
	}
	

