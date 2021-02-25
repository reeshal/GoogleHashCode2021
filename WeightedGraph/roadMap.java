package WeightedGraph;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class roadMap {

    static class Streets {
        int source;
        int destination;
        String streetName;
        int timeDuration;

        public Streets(int source, int destination, int weight, String streetName) {
            this.source = source;
            this.destination = destination;
            this.timeDuration = weight;
            this.streetName= streetName;
        }
    }

    static class RoadMapGraph {
        int vertices;
        LinkedList<Streets> [] adjacencylist;

        RoadMapGraph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            //initialize adjacency lists for all the vertices
            for (int i = 0; i <vertices ; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addStreet(int source, int destination, int weight, String streetName) {
            Streets edge = new Streets(source, destination, weight, streetName);
            adjacencylist[source].addFirst(edge); //for directed graph
        }

        public void printGraph(){
            for (int i = 0; i <vertices ; i++) {
                LinkedList<Streets> list = adjacencylist[i];
                for (int j = 0; j <list.size() ; j++) {
                    System.out.println("vertex-" + i + " is connected to " +
                            list.get(j).destination + " with weight " +  list.get(j).timeDuration+ " "+ list.get(j).streetName);
                }
            }
        }
    }

    public static void main(String[] args){
        int simulationTime=0, noOfIntersections=0, noOfStreets=0, noOfCars=0, pointPerCar=0;
        try{
            Scanner read= new Scanner(new File("/home/reeshar/Documents/GoogleHashCode2021/WeightedGraph/input.txt"));
			simulationTime= read.nextInt();
            noOfIntersections= read.nextInt();
            noOfStreets= read.nextInt();
            noOfCars= read.nextInt();
            pointPerCar= read.nextInt();

            RoadMapGraph graph = new RoadMapGraph(noOfIntersections);

            for(int i=0;i<noOfStreets;i++){
                int source=read.nextInt();
                int destination=read.nextInt();
                String name= read.next();
                int duration= read.nextInt();

                graph.addStreet(source, destination, duration, name);
            }
           
            ArrayList<Car> carList = new ArrayList<Car>();
            //reading trajectory of car
            for(int i=0;i<noOfCars;i++){
                int noOfStreetsTravelled= read.nextInt();
                System.out.println(noOfStreetsTravelled);
                Car carObject= new Car();

                for(int j=0;j<noOfStreetsTravelled;j++)
                    carObject.addPath(read.next());
                    
                carList.add(carObject);               
            }

            // for(Car e: carList)
            //     System.out.println(e.getPaths());

			read.close();

            graph.printGraph();
		    
        }
        catch(Exception e) {
			System.out.println(e);
		}	
    }
}
