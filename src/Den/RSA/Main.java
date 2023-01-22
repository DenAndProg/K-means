package Den.RSA;

import Den.RSA.GlobalVariable.GlobalVariable;

import java.io.IOException;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {


        GlobalVariable globalVariable = new GlobalVariable();
        Image image = new Image();
        CalculateDistinct calculateDistinct = new CalculateDistinct();

        globalVariable.GetInformationOfImage();

        long startTime = System.nanoTime();
        ArrayList<Point>allPoint = new ArrayList<>();
        ArrayList<Point>centroids = new ArrayList<>();
        ArrayList<Point>allPoint2 = new ArrayList<>();

        image.getImage(allPoint, centroids, globalVariable.getCountOfCluster(), globalVariable);

        allPoint2.addAll(allPoint);
        for(int i = 0; i < globalVariable.getIteration(); i++) {
            calculateDistinct.calculate(allPoint, centroids);
            CounterCentroids.counterOfMass(allPoint, centroids);
        }
        Point.showClusters(allPoint, globalVariable.getCountOfCluster());
        MakeImage.makeImage(allPoint, centroids, globalVariable);


        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
