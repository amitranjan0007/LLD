package com.example.designpen;

import com.example.designpen.startegies.HardWriteBehaviour;

public class Marker extends Pen {
    public Marker() {
        super(PenType.MARKER,new HardWriteBehaviour());
    }


    @Override
    public Colour getColor() {
        return null;
    }
}
