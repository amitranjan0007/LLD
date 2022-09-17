package com.example.designpen;

public interface RefillPen {
     Refil getRefill();
     boolean canRefillable();
     void changeRefill(Refil newRefill);
}
