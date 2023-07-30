package com.kafka.demo.resource;

import lombok.*;

@Data
public class Resource {

    public Resource(String id, String kind){
        this.id = id;
        this.kind = kind;
    }

    private String id;
    public String kind;

}
