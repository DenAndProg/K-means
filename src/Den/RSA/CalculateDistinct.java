package Den.RSA;

import java.util.ArrayList;

public class CalculateDistinct {

    public void calculate(ArrayList<Point> arrayPoint, ArrayList<Point> centroids){

        for(int point = 0; point < arrayPoint.size(); point++){

            double number = 0;
            double sum = 999999.0;

            for(int centroid = 0; centroid < centroids.size(); centroid++){

                for(int p = 0; p < 3; p++){
                    number = number + Math.pow(arrayPoint.get(point).getColorsFromArray(p) - centroids.get(centroid).getColorsFromArray(p),2);
                }

                number = Math.sqrt(number);

                if(number < sum){
                    sum = number;
                    arrayPoint.get(point).setCluster(centroid);
                }
            }
        }
    }
}
