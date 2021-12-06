package Classes;

public class Main {

	public static void main(String[] args) {
		App a = new App()	;
		a.AddNewUser("aaaaaaaaaaa", "adem.kafia@esprit.tn");
		//System.out.println(a.Users);
		a.AddNewUser("aaaaaaaaaaaa", "adem@esprit.tn");
		//System.out.println(a.Users);
		a.AddNewGroupe("groupe1", "groupe@esprit.tn");
		//System.out.println(a.Users);
		a.AddNewUser("11", "adem.kafia@esprit.TN");
		a.AddNewUser("22", "adem.kafia@esprit.tnn");
		a.AddNewUser("33", "adem.kafia@esprit.com");
		a.AddNewUser("44", "adem.kafia@esprit.com");
		a.AddUserToGroupe("1", "adem.kafia@esprit.TN", "groupe1");
		a.AddUserToGroupe("1", "adem.kafia@esprit.TN", "groupe1");
		a.AddUserToGroupe("2", "adem.kafia@esprit.tnn", "groupe1");
		a.AddUserToGroupe("3", "adem.kafia@esprit.com", "groupe1");
		a.AddUserToGroupe("4", "adem.kafia@esprit.com","groupe1");
		a.toStringGroup();
		System.out.println(a.Users+"\n"+"Size="+a.Users.size());
		a.getAllMails();
		System.out.println(a);
	}
}
