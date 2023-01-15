package Den.RSA;



import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please write number of centroids: >>");
        int centroid = sc.nextInt();

        Image image = new Image();
        CalculateDistinct calculateDistinct = new CalculateDistinct();

        ArrayList<Point>allPoint = new ArrayList<>();
        ArrayList<Point>centroids = new ArrayList<>();

        image.getImage(allPoint, centroids, centroid);
        calculateDistinct.calculate(allPoint, centroids, centroid);
        allPoint.get(35366).showClusters(allPoint, centroid);

    }
}
