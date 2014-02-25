package ua.ck.cats

import grails.converters.JSON

class AnnouncementsController {

    def index() {
		def res = Announcement.list()
		def result = [announcements: res]
		render result as JSON
	}
}
