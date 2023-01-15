package Den.RSA;

import java.util.ArrayList;

public class CalculateDistinct {

    public void calculate(ArrayList<Point> arrayPoint, ArrayList<Point> centroids, int countCentroids){
        for(int i = 0; i < arrayPoint.size(); i++){

            double number = 0;
            double sum = 999999.0;
            for(int j = 0; j < centroids.size(); j++){
                number  =   ((arrayPoint.get(i).getRed() - centroids.get(j).getRed()) *
                            (arrayPoint.get(i).getRed() - centroids.get(j).getRed())) +
                            ((arrayPoint.get(i).getGreen() - centroids.get(j).getGreen()) *
                            (arrayPoint.get(i).getGreen() - centroids.get(j).getGreen())) +
                            ((arrayPoint.get(i).getBlue() - centroids.get(j).getBlue()) *
                            (arrayPoint.get(i).getBlue() - centroids.get(j).getBlue()));

                number = Math.sqrt(number);
                if(number < sum){
                    sum = number;
                    arrayPoint.get(i).setCluster(j);
                }
            }

        }

    }
}
