import ua.ck.cats.Category;
import ua.ck.cats.User
import ua.ck.cats.Announcement

class BootStrap {

    def init = { servletContext ->

		if(!Category.count()){
			new Category("Pets").save(failOnError: true)
			new Category("People").save(failOnError: true)
			new Category("Things").save(failOnError: true)
		}
		
		if (!User.count()){
			new User("chebTS@gmail.com", "qwerty", 4.4d, "Cheb", "Serg", "TS", "+380935522110", "Cherkasy").save(failOnError: true)
			new User("chebTS2@gmail.com", "qwerty", 4.4d, "Cheb2", "Serg2", "TS2", "+380935522110", "Cherkasy").save(failOnError: true)
		}
		
		if(!Announcement.count()){
			new Announcement(Category.first(), User.first(), "Lost cat", true, "Lost red cat", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)
			new Announcement(Category.first(), User.first(), "Lost dog", true, "Lost black dog", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)
		}
    }
    def destroy = {
    }
}

