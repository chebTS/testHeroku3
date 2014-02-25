package ua.ck.cats

class Announcement {
	String title
	int category
	boolean islost
	String description
	double lat
	double lon
	String address
	long date

	public Announcement(String title, int category, boolean islost,
			String description, double lat, double lon, String address,
			long date) {
		super();
		this.title = title;
		this.category = category;
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
	}
}