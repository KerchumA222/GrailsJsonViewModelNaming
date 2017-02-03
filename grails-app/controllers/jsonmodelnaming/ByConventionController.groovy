package jsonmodelnaming


import grails.rest.*
import grails.converters.*

class ByConventionController {
	static responseFormats = ['json', 'xml']
	
    def index() { }

    def working() {
        respond("Hello World")
    }

    def alsoWorking() {
        respond("Hello World")
    }

    def intended() {
        respond("Hello World")
    }
}
