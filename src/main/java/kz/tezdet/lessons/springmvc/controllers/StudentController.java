package kz.tezdet.lessons.springmvc.controllers;

import kz.tezdet.lessons.springmvc.models.Student;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class StudentController {

    Student stud;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String home(ModelMap model){
        model.addAttribute("message", "Hello! I am testing the REST services!") ;
        return "hello" ;
    }

    @RequestMapping(value = "/student/get/{id}", method = RequestMethod.GET, produces = "application/json")
    @ResponseBody
    public HashMap<String, Object> getStudent(@PathVariable("id") int id){
        HashMap<String, Object> map = new HashMap<String, Object>() ;
        map.put("status", "OK") ;
//        Student student = new Student(id, "Abzal", "Torechanov") ;
        map.put("student", stud) ;

        return map ;
    }

    @RequestMapping(value = "/student/post/", method = RequestMethod.POST, consumes = "application/json")
    public ResponseEntity<String> setStudent(@RequestBody Student student){
        stud = student ;
        return new ResponseEntity<String>(HttpStatus.ACCEPTED) ;
    }
}
