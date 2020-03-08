package io.zipcoder;



    public class Cat extends Pet{
        public Cat(String name) {
            super(name);
        }

        @Override
        public String speak(){
            return "Meow - meow";
        }


        @Override
        public String toString() {
            return "Cat"+ " " +speak();
        }
    }

