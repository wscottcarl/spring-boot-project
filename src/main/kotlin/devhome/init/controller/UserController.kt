package devhome.init.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class UserController {

    @GetMapping("/users")
    fun getUsers(): String {
        // Replace with your actual implementation
        return "Return list of users"
    }
}