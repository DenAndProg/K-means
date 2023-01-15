package Den.RSA;

import java.util.ArrayList;

public class CounterCentroids {

    public static void counterOfMass(ArrayList<Point> point, ArrayList<Point> centroids){

        int[] arg = new int[centroids.size()];

        for(Point point2 : point){
            arg[point2.getCluster()]++;
        }

        for(int i = 0; i < centroids.size(); i++){
            for(int j = 0; j < 3; j++){
                centroids.get(i).selColors2(0, j);
            }
        }

        for(Point point2 : point){

            for(int i = 0; i < 3; i++){
              /* centroids.get(point2.getCluster()).getColors2(i) = centroids.get(point2.getCluster()).getColors2(i) +
                        (point2.getColors2(i) / arg[point2.getCluster()]);*/
                centroids.get(point2.getCluster()).selColors2(centroids.get(point2.getCluster()).getColors2(i) + (point2.getColors2(i) / arg[point2.getCluster()]) ,i);
            }
        }

    }
}
