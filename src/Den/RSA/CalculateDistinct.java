package Den.RSA;

import java.util.ArrayList;

public class CalculateDistinct {

    public void calculate(ArrayList<Point> arrayPoint, ArrayList<Point> centroids, int countCentroids){
        for(int i = 0; i < arrayPoint.size(); i++){

            double number = 0;
            double sum = 999999.0;
            for(int j = 0; j < centroids.size(); j++){
                for(int p = 0; p < 3; p++){
                    number = number + Math.pow(arrayPoint.get(i).getColors2(p) - centroids.get(j).getColors2(p),2);
                }

                number = Math.sqrt(number);
                if(number < sum){
                    sum = number;
                    arrayPoint.get(i).setCluster(j);
                }
            }

        }

    }
}
