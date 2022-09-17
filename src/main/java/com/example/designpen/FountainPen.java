package com.example.designpen;

import com.example.designpen.startegies.HardWriteBehaviour;

public class FountainPen extends Pen {

    public FountainPen() {
        super(PenType.FOUNTAIN,new HardWriteBehaviour());
    }

    @Override
    public void write() {

    }

    @Override
    public Colour getColor() {
        return null;
    }
}
