package jenkins.app

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(controller: "product", action: "index")
        "/index"(controller: "product", action: "index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
