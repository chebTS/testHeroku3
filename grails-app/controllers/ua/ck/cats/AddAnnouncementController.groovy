package ua.ck.cats

class AddAnnouncementController {

    def index() { 
		
		if (params.containsKey("title") && params.containsKey("category")){
			String title = params.get("title", "default")
			int category = params.get("category","default")
			//def ann = new Announcement(title: title, category: category )
			def ann = new Announcement(title, category, true, "bla bla", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)
			ann.save()
		}else{		
			
		}
	}
}

//new Announcement("Lost cat", 1, true, "bla bla", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)