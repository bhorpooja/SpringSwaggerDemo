package com.melayer.springswaggerdemo.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@CrossOrigin(allowedHeaders = ["Origin", "X-Requested-With", "Content-Type", "Accept", "Authorization"],
        methods = [RequestMethod.POST, RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE])
@RequestMapping("/api/swagger")
class SwaggerController {

    private val logger = LoggerFactory.getLogger(SwaggerController::class.java)
    private val map = HashMap<String, Any>()

    @GetMapping("/demo")
    fun swagger(): ResponseEntity<*> {
        map.clear()
        logger.info("This is swagger config")
        map["status"] = "success"
        map["message"] = "Welcome to Swagger"
        return ResponseEntity.ok(map)
    }
}