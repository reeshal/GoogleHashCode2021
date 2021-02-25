import java.util.*;

public class Car {
ArrayList<String> paths;

Car(){
this.paths = new ArrayList<>();
}

void addPath(String path){
this.paths.add(path);
}
void deletePath(String path){
    this.paths.remove(this.paths.indexOf(path));
}

ArrayList<String> getPaths(){
    return this.paths;
}
}
