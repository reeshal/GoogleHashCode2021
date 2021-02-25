import java.util.*;

public class Intersection {
    Integer intersection_id;
    CarQueues carQueues;

    Intersection(int id, CarQueues cq){
        this.intersection_id = id;
        this.carQueues = cq;
    }
    Integer getId(){
        return this.intersection_id;
    }

    CarQueues getQueues(){
        return this.carQueues;
    }
}
