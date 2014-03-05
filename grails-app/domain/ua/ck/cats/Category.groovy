package ua.ck.cats

class Category {

	
	private String catName;

	public Category( String catName) {
		super();
	
		this.catName = catName
	}

	static constraints = {
    }
}

/*
{
	categories: [
		{
			class: "ua.ck.cats.Category",
			id: 1
		},
		{
			class: "ua.ck.cats.Category",
			id: 2
		},
		{
			class: "ua.ck.cats.Category",
			id: 3
		}
	]
}
*/