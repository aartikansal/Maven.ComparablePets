package io.zipcoder;

import java.lang.Comparable;

    public abstract class Pet implements Comparable<Pet>{
        public String name;

        public Pet(String name){
            this.name = name;
        }

        abstract public String speak();

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        @Override
        public String toString() {
            return "Pet" +
                    "name='" + name + '\'' +
                    '}';
        }

        @Override
        public int compareTo(Pet o) {
            return this.getName().compareTo(o.getName());
        }
    }

