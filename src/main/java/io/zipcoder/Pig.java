package io.zipcoder;

public class Pig extends Pet{
    public Pig(String name) {
        super(name);
    }
    @Override
    public String speak(){
        return "Hru-hru";
    }


    @Override
    public String toString() {
        return "Pig"+" "+speak();
    }
}
