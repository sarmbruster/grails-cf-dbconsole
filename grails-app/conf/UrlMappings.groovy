class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		//"/"(view:"/index")
		"/"(uri:"/dbconsole")
		"500"(view:'/error')
	}
}
