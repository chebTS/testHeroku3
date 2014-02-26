package ua.ck.cats
import grails.converters.JSON
class CategoriesController {

	def index() {
		def categoriesList = Category.list();
		def res = [categories: categoriesList]
		render res as JSON
	}
}
