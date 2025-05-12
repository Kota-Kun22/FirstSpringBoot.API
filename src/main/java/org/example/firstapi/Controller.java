package org.example.firstapi;


import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @GetMapping("/hello")
    public ApiResponse helloWorld() {
        return  new ApiResponse(" Hello Rastogi jii ");
    }

    @PostMapping("/welcome")
    public ApiResponse PostRequest(@RequestBody String name){
        return new ApiResponse("Hallo "+ name);

    }

    @GetMapping("/hello/{name}")
    public ApiResponse dynamic(@PathVariable String name) {
        return  new ApiResponse(" Hello" + name );
    }

}
