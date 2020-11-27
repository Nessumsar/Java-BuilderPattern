package org.example;


public class App 
{
    public static void main( String[] args )
    {
        CastleBuilder castleBuilder = new CastleBuilder();
        CabinBuilder cabinBuilder = new CabinBuilder();

        Director director = new Director(castleBuilder);
        director.makeBuilding("simple");

        Castle castle = castleBuilder.getResult();


        director.changeBuilder(cabinBuilder);
        director.makeBuilding("complex");

        Cabin cabin = cabinBuilder.getResult();

    }
}
