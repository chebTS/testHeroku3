package ua.ck.cats

class Announcement {
	Category category
	User user
	String title
	boolean islost
	String description
	double lat
	double lon
	String address
	long date

	

	public Announcement(Category category, User user, String title,
			boolean islost, String description, double lat, double lon,
			String address, long date) {
		super();
		this.category = category;
		this.user = user;
		this.title = title;
		this.islost = islost;
		this.description = description;
		this.lat = lat;
		this.lon = lon;
		this.address = address;
		this.date = date;
	}


	static constraints = {
		title blank:false
		category blank:false
		user blank:false
	}
}