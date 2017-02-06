package jsonmodelnaming


import grails.rest.*
import grails.converters.*

/**
 * `intended` don't work, but represent how I feel they should work
 * `working` are current working examples
 *
 * The convention seems to differ between templates and views, which is confusing
 */
class ByConventionController {
	static responseFormats = ['json', 'xml']
	
    def index() { }

    def working() {
        respond("Hello World")
    }

    def alsoWorking() {
        respond("Hello World")
    }

    def workingWithCollections() {
        respond(["Hello", "World"])
    }

    def intended() {
        respond("Hello World")
    }

    def alsoIntended() {
        respond(["Hello", "World"])
    }

}
