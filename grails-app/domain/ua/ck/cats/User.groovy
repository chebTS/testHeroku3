package ua.ck.cats

class User {
	String email
	String password
	double rating
	String nick
	String name
	String soname
	String phone
	String city

	public User(String email, String password, double rating, String nick,
	String name, String soname, String phone, String city) {
		super();
		this.email = email;
		this.password = password;
		this.rating = rating;
		this.nick = nick;
		this.name = name;
		this.soname = soname;
		this.phone = phone;
		this.city = city;
	}


	static constraints = {
		email email: true, unique: true, blank: false
		password blank: false
	}
}
