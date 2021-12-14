package com.hw;

import lombok.Data;

@Data
abstract class Wonderbeasts {

    private String name;

    public abstract String getPortionOfCuteness();



}
