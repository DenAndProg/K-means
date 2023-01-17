package Den.RSA;



import org.w3c.dom.css.Counter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws IOException {
        long startTime = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number of centroids: >>");
        int centroid = sc.nextInt();

        Image image = new Image();
        CalculateDistinct calculateDistinct = new CalculateDistinct();

        ArrayList<Point>allPoint = new ArrayList<>();
        ArrayList<Point>centroids = new ArrayList<>();

        image.getImage(allPoint, centroids, centroid);

        for(int i = 0; i < 30; i++) {
            calculateDistinct.calculate(allPoint, centroids);
            Point.showClusters(allPoint, centroid);
            CounterCentroids.counterOfMass(allPoint, centroids);
        }
        MakeImage.makeImage(allPoint, centroids);


        long endTime = System.nanoTime();
        long timeElapsed = endTime - startTime;
        System.out.println("Execution time in nanoseconds: " + timeElapsed);
        System.out.println("Execution time in milliseconds: " + timeElapsed / 1000000);
    }
}
