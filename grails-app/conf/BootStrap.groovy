import ua.ck.cats.User
import ua.ck.cats.Announcement

class BootStrap {

    def init = { servletContext ->
		if(!Announcement.count()){
			new Announcement("Lost cat", 1, true, "bla bla", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)
			new Announcement("Lost dog", 2, false, "bla bla", 4.4d, 5.5d, "Cherkassy", 1392766862).save(failOnError: true)
		}
		if (!User.count()){
			new User("chebTS@gmail.com", "qwerty", 0.55 , "Cheb1", "Sergey", "Tsybrovskyi", "123456", "Cherkasy").save(failOnError: true)
			new User("chebTS2@gmail.com", "qwerty", 0.56 , "Cheb2", "Sergey", "Tsybrovskyi", "123456", "Cherkasy").save(failOnError: true)
			new User("chebTS3@gmail.com", "qwerty", 0.57 , "Cheb3", "Sergey", "Tsybrovskyi", "123456", "Cherkasy").save(failOnError: true)
			new User("chebTS4@gmail.com", "qwerty", 0.58 , "Cheb4", "Sergey", "Tsybrovskyi", "123456", "Cherkasy").save(failOnError: true)
		}
    }
    def destroy = {
    }
}

