package io.zipcoder;
import java.util.ArrayList;
import java.util.Comparator;

class PetsComparator implements Comparator<Pet> {



    @Override
    public int compare(Pet o1, Pet o2) {
        return o1.getClass().getName().compareTo(o2.getClass().getName());
    }
}
