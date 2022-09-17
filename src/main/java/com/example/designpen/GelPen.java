package com.example.designpen;

import com.example.designpen.startegies.SmoothWriteBehaviour;
import com.example.designpen.startegies.WriteBehaviour;

public class GelPen extends Pen {
    private Refil refill;
    private boolean canChangeRefill=false;

    private GelPen(WriteBehaviour writeBehaviour) {
        super(PenType.GEL,writeBehaviour);
    }

    public static class Builder{
        private Refil refill;
        private boolean canChangeRefill=false;

        private WriteBehaviour writeBehaviour;

        public Builder setRefill(Refil refill){
             this.refill=refill;
             return this;
        }

        public Builder canChangeRefill(boolean canChangeRefill){
            this.canChangeRefill=canChangeRefill;
            return  this;
        }

        public GelPen build(){
            GelPen gelPen=new GelPen(new SmoothWriteBehaviour());
            gelPen.refill=this.refill;
            gelPen.canChangeRefill=this.canChangeRefill;
            return gelPen;
        }
    }

    @Override
    public Colour getColor() {
        return null;
    }

    public Refil getRefill() {
        return this.refill;
    }

    public void setRefill(Refil refill) {
        this.refill = refill;
    }

    public boolean isCanChangeRefill() {
        return this.canChangeRefill;
    }

    public void setCanChangeRefill(boolean canChangeRefill) {
        this.canChangeRefill = canChangeRefill;
    }
}
