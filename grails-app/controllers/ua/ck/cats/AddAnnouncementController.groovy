package ua.ck.cats

class AddAnnouncementController {

    def index() { 
		
		if (params.containsKey("title") && params.containsKey("category")){
			String title = params.get("title", "default")
			String category = params.get("category","default")
			def ann = new Announcement(title: title, category: category )
			ann.save()
		}else{		
			
		}
	}
}
