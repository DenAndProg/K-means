package Den.RSA;

import Den.RSA.Exception.IndexOutOfBoundsofArrayException;

import java.util.ArrayList;

public class Point {

    private double[] colors = new double[3];    //[0] - red; [1] - green; [2] - blue      <<--RGB-->>
    private int cluster;


    public double[] getColors() {
        return colors;
    }
    public void setColors(double[] colors) {

        this.colors = colors;
    }

    public double getColorsFromArray(int index){    //get color from array
        try {
            if (index < 0 || index >= 3)
                throw new IndexOutOfBoundsofArrayException("Your index =" + index + " But can be only [0], [1], [2]");
        }
        catch (IndexOutOfBoundsofArrayException e){
            e.printStackTrace();
            return 0;
        }
        return colors[index];
    }

    public void selColorsInArray(double colors, int index){   //put color in array
        try {
            if (index < 0 || index >= 3)
                throw new IndexOutOfBoundsofArrayException("Your index =" + index + " But can be only [0], [1], [2]");
            else this.colors[index] = colors;
        }
        catch (IndexOutOfBoundsofArrayException e){
            e.printStackTrace();
        }
    }


    public int getCluster() {
        return cluster;
    }
    public void setCluster(int cluster) {
        this.cluster = cluster;
    }


   public Point(double red, double green, double blue){
        colors[0] = red;
        colors[1] = green;
        colors[2] = blue;
        cluster = 0;
    }

    public void showPoint(){
        System.out.println("|Red " + colors[0] + " | |Green " + colors[1] + " | |Blue " + colors[2] +" | |Cluster " + cluster +" |");
    }

    public static void showClusters(ArrayList<Point> list, int centroids){
       int[] clusters = new int[centroids];
        for (Point point : list) {
            clusters[point.getCluster()]++;
        }
        for(int i = 0; i < centroids; i++){
            System.out.println("[" + (i + 1) +"] >> " + clusters[i]);
        }
    }
}
