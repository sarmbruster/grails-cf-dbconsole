class BootStrap {

    def init = { servletContext ->
		println "VCAP_SERVICES: ${System.getenv('VCAP_SERVICES')}"
    }
    def destroy = {
    }
}
