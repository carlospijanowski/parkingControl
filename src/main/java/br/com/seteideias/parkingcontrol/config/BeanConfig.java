package br.com.seteideias.parkingcontrol.config;

import br.com.seteideias.parkingcontrol.MyBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public MyBean myBean(){
        return new MyBean();
    }

}
