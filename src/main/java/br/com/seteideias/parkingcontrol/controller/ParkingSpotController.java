package br.com.seteideias.parkingcontrol.controller;

import br.com.seteideias.parkingcontrol.MyBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parking-spot")
public class ParkingSpotController {

    @Autowired(required = false)
    private MyBean myBean;


    @GetMapping("/teste")
    public void teste(){
        myBean.method();
    }

}
