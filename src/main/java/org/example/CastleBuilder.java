package org.example;

public class CastleBuilder implements Builder{

    private Castle castle = new Castle();

    @Override
    public void reset() {
        this.castle = new Castle();
    }

    public CastleBuilder() {
        this.reset();
    }

    @Override
    public void buildStepA() {
        this.castle.walls = true;
    }

    @Override
    public void buildStepB() {
        this.castle.outerTowers = true;
        this.castle.centerTower = true;
    }

    @Override
    public void buildStepC() {
        this.castle.bridge = true;
    }

    @Override
    public void buildStepD() {
        this.castle.soliders = true;
    }

    public Castle getResult(){
        Castle result = this.castle;
        this.reset();
        return result;
    }
}
