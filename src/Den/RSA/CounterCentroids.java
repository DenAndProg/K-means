package Den.RSA;

import java.util.ArrayList;

public class CounterCentroids {

    public static void counterOfMass(ArrayList<Point> point, ArrayList<Point> centroids){

        int[] arg = new int[centroids.size()];

        for(Point point2 : point){
            arg[point2.getCluster()]++;
        }

        for(int i = 0; i < centroids.size(); i++){               //red = 0; green = 0; blue = 0;
            for(int j = 0; j < 3; j++){
                centroids.get(i).setColorsInArray(0, j);
            }
        }

        for(Point point2 : point){
            for(int i = 0; i < 3; i++){
                centroids.get(point2.getCluster()).setColorsInArray(centroids.get(point2.getCluster()).getColorsFromArray(i) + (point2.getColorsFromArray(i) / arg[point2.getCluster()]) ,i);
            }
        }

    }
}
