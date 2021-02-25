import java.util.*;

public class CarQueues {
Queue<Car> car_queue;

CarQueues(){
    this.car_queue = new LinkedList<>();
}

void addCar(Car car){
    this.car_queue.add(car);
}

Boolean populateString(String curr_string){
String buffer[] = curr_string.split(" ");
if(buffer[1].matches("[A-Za-z]+")){
    Car c = new Car();
    for(int i=2;i<buffer.length;i++){
        c.addPath(buffer[i]);
    }
    this.addCar(c);
    return true;
}
return false;
}

Queue<Car> getCarsQueue(){
    return this.car_queue;
}
}