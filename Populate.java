import java.util.*;

public class Populate {
Queue<Car> car_queue;

Populate(){
    this.car_queue = new LinkedList<>();
}

void addCar(Car car){
    this.car_queue.add(car);
}

void populateString(){
    
}

Queue<Car> getCarsQueue(){
    return this.car_queue;
}
}