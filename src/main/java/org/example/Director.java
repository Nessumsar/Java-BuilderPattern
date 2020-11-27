package org.example;

public class Director {

    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void changeBuilder(Builder builder){
        this.builder = builder;
    }

    public void makeBuilding(String type){
        if (type.equals("simple")){
            builder.buildStepA();
            builder.buildStepB();
        }
        else{
            builder.buildStepA();
            builder.buildStepB();
            builder.buildStepC();
            builder.buildStepD();
        }
    }
}
