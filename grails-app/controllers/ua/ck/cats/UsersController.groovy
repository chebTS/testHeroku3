package ua.ck.cats

import grails.converters.JSON

class UsersController {

      def index() { 
		def usersList = User.list()
		def res = [users: usersList]
		render res as JSON
	}
}
