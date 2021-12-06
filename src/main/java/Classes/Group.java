package Classes;

import java.util.HashSet;
import java.util.Set;

public class Group extends User {
private Set<User>groupeMembers;




	
public Group(String name, String email) {
	super(name, email);
	groupeMembers = new HashSet<User>();

}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + ((groupeMembers == null) ? 0 : groupeMembers.hashCode());
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Group other = (Group) obj;
	if (groupeMembers == null) {
		if (other.groupeMembers != null)
			return false;
	} else if (!groupeMembers.equals(other.groupeMembers))
		return false;
	return true;
}

public Boolean AddUserToGroupe(User u)
{
//	System.out.println("---------------------------");
//	if(groupeMembers.isEmpty())
//		System.out.println(groupeMembers.size()+"----------");
//	if(groupeMembers.contains(u))
//		return false;
	return groupeMembers.add(u);
}
@Override
public String toString() {
	return super.toString()+"Group [groupeMembers=" + groupeMembers + "]\n";
}

public Set<User> getGroupeMembers() {
	return groupeMembers;
}

public void setGroupeMembers(Set<User> groupeMembers) {
	this.groupeMembers = groupeMembers;
}

}
