package io.zipcoder;


    public class Dog extends Pet {
        public Dog(String name) {
            super(name);
        }
        @Override
        public String speak(){
            return "Bark-bark";
        }


        @Override
        public String toString() {
            return "Dog"+ " "+speak();
        }
    }

