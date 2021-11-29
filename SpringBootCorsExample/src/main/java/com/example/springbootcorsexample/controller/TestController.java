package com.example.springbootcorsexample.controller;

//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin("http://127.0.0.1:5500")  // Thanks to the method we override in the config package,
                                        //  there is no need for the definitions here.
public class TestController {
   // @CrossOrigin( "http://127.0.0.1:5500")
    @GetMapping("/test")
    public String test(){

        return  "test";
    }

    @GetMapping("/test2")
    public String test2(){
        return "Test2";

    }

}
