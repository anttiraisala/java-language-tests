package fi.anttiraisala.java_language_tests;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaExpressions {

    public LambdaExpressions(){

        List<Car> cars = new ArrayList();
        cars.add(new Car("Eka", 4));
        cars.add(new Car("Toka", 3));
        cars.add(new Car("Kolmas", 2));
        cars.add(new Car("Neljäs", 4));

        List<Object> collect = cars.stream().filter(c -> c.getWheels().size() == 4).sorted(Comparator.comparing(Car::getName)).collect(Collectors.toList());


        return;

    }

    public class Wheel {
        private float f;

        public Wheel wheel(float f){
            setF(f);
            return this;
        }

        public float getF() {
            return f;
        }

        public void setF(float f) {
            this.f = f;
        }
    }

    public class Car{

        private List<Wheel> wheels ;
        private String name = "";

        public Car(){
            name = "T-Ford";

            wheels = new ArrayList();
            wheels.add(new Wheel());
            wheels.add(new Wheel());
            wheels.add(new Wheel());
            wheels.add(new Wheel());
        }

        public Car(String name, int wheelCount){
            setName(name);

            wheels = new ArrayList<Wheel>();
            for(int i=0; i<wheelCount; i++){
                wheels.add(new Wheel());
            }
        }

        public List<Wheel> getWheels() {
            return wheels;
        }

        public void setWheels(List<Wheel> wheels) {
            this.wheels = wheels;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


    }

}
