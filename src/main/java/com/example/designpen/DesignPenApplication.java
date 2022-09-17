package com.example.designpen;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class DesignPenApplication {

    public static void main(String[] args) {
        SpringApplication.run(DesignPenApplication.class, args);
        List<Pen> pens=new ArrayList<>();

        Pen renolydsFighterGelPen=PenFactory
                .createGelPen()
                .canChangeRefill(true)
                .setRefill(new Refil())
                .build();
        renolydsFighterGelPen.setCompany("Renyolds");
        renolydsFighterGelPen.setPrice(200);
        renolydsFighterGelPen.setName("Fighter");
        PensRegistry.putPenInRegistry("RenyoldsFighter",renolydsFighterGelPen);

        Pen renolydsTechnoGelPen=PenFactory
                .createGelPen()
                .canChangeRefill(true)
                .setRefill(new Refil())
                .build();
        renolydsTechnoGelPen.setCompany("Renyolds");
        renolydsTechnoGelPen.setPrice(200);
        renolydsTechnoGelPen.setName("Techno");
        PensRegistry.putPenInRegistry("RenyoldsTechno",renolydsFighterGelPen);
        pens.add(renolydsFighterGelPen);

        pens.add(PensRegistry.getPen("RenyoldsFighter"));
        pens.add(PensRegistry.getPen("RenyoldsFighter"));
        pens.add(PensRegistry.getPen("RenyoldsFighter"));

        pens.add(PensRegistry.getPen("RenyoldsTechno"));
        pens.add(PensRegistry.getPen("RenyoldsTechno"));




        for(Pen pen:pens){
            if(pen.getPenType().equals(PenType.GEL)){
                System.out.println("Gel Pen Created");
                pen.write();
            }
        }

    }

}
