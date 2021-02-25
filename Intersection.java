import java.util.*;

public class Intersection {
    Integer intersection_id;
    CarQueues carQueues;
    LinkedList<Integer> timers;

    Intersection(Integer id, CarQueues cq){
        this.intersection_id = id;
        this.carQueues = cq;
        this.timers = new LinkedList<>();
    }

    Integer getId(){
        return this.intersection_id;
    }

    void setTimerByIndex(Integer index, Integer value){
        this.timers.set(index, value);
    }

    void addTimer(Integer value){
        this.timers.add(value);
    }

    CarQueues getQueues(){
        return this.carQueues;
    }
}
