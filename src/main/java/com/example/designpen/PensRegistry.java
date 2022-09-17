package com.example.designpen;

import java.util.HashMap;

public class PensRegistry {
    static HashMap<String,Pen> map=new HashMap<>();

    public static Pen getPen(String penName){
        return map.get(penName);
    }

    public static void putPenInRegistry(String penName,Pen pen){
        map.put(penName,pen);
    }
}
