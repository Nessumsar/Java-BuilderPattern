package org.example;

public class CabinBuilder implements Builder {

    Cabin cabin = new Cabin();

    @Override
    public void reset() {
        cabin = new Cabin();
    }

    public CabinBuilder() {
        this.reset();
    }

    @Override
    public void buildStepA() {
        cabin.walls = true;
        cabin.door = true;
        cabin.roof = true;
        cabin.windows = true;
    }

    @Override
    public void buildStepB() {
        cabin.fence = true;
    }

    @Override
    public void buildStepC() {
        cabin.garage = true;
    }

    @Override
    public void buildStepD() {
        cabin.fireplace = true;
    }

    public Cabin getResult(){
        Cabin result = this.cabin;
        this.reset();
        return result;
    }

}
