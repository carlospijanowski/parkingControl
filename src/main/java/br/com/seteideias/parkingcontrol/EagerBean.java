package br.com.seteideias.parkingcontrol;

import org.springframework.stereotype.Component;

@Component
public class EagerBean {

    public EagerBean(){
        System.out.println("EagerBean foi executado");
    }

}
