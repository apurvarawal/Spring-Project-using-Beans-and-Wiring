package com.example.main;

import com.example.Config.ProjectConfig;
import com.example.beans.Person;
import com.example.services.VehicleServices;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4_Prototype {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        VehicleServices vehicleServices1 = context.getBean(VehicleServices.class);
        VehicleServices vehicleServices2 = context.getBean(VehicleServices.class);
        System.out.println(vehicleServices1.hashCode());
        System.out.println(vehicleServices2.hashCode());
        if(vehicleServices1==vehicleServices2){
            System.out.println("vehicleServices1 = vehicleServices2");
        }
        else{
            System.out.println("vehicleServices1 != vehicleServices2");
        }
    }
}
