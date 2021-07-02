package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;



@RestController
public class TigreController {

    List<Tigre>tigers=new ArrayList<>();

    @GetMapping("tigre")
    public List<Tigre>getTigre(){


		/*tigers.add(new Tigre("pumba","male",8,360));
		tigers.add(new Tigre("rita","female",10,280));
		tigers.add(new Tigre("kaya","female",6,60));
		tigers.add(new Tigre("lord","male",8,360));
		tigers.add(new Tigre("spring","male",8,360));*/
        return tigers;
    }
    @PostMapping("tigre")
    public void insertTiger(@RequestBody Tigre tigre) {
        tigers.add(tigre);
        System.out.println(tigre);

    }



}







