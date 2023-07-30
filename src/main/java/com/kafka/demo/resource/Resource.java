package com.kafka.demo.resource;

import lombok.*;

@Getter
@Setter
public class Resource {

    public Resource(String id, String kind){
        this.id = id;
        this.kind = kind;
    }

    public String id;
    public String kind;

}
