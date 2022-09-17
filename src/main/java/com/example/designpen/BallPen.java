package com.example.designpen;

import com.example.designpen.startegies.SmoothWriteBehaviour;

public class BallPen extends Pen {

    public BallPen() {
        super(PenType.BALL,new SmoothWriteBehaviour());
    }


    @Override
    public Colour getColor() {
        return null;
    }
}
