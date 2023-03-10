package com.example.services;

import com.example.interfaces.Speakers;
import com.example.interfaces.Tyres;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(BeanDefinition.SCOPE_SINGLETON) //creates a single bean inside spring context *****[for example2]*****
@Scope(BeanDefinition.SCOPE_PROTOTYPE) //creates different objects using the same bean *****[for example4]*****

public class VehicleServices {

    @Autowired
    private Speakers speakers;
    private Tyres tyres;

    public void playMusic(){
        String music = speakers.makeSound();
        System.out.println(music);
    }

    public void moveVehicle(){
        String status = tyres.rotate();
        System.out.println(status);
    }

    public Speakers getSpeakers(){
        return speakers;
    }

    public void setSpeakers(Speakers speakers){
        this.speakers = speakers;
    }

    public Tyres getTyres(){
        return tyres;
    }

    @Autowired
    public void setTyres(Tyres tyres){
        this.tyres = tyres;
    }
}
