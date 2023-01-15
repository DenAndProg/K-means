package Den.RSA;

import java.util.ArrayList;

public class Point {

    private double[] colors = new double[3];    //[0] - red; [1] - green; [2] - blue
    private int cluster;

    public double[] getColors() {
        return colors;
    }
    public void setColors(double[] colors) {
        this.colors = colors;
    }

    public double getColors2(int i){  // not good
        if(i <= 3)
        return colors[i];
        else return 0;
    }
    public void selColors2(double colors, int i){   //not good
        this.colors[i] = colors;
    }
    public int getCluster() {return cluster;}
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
        System.out.println("|Red " + colors[0] + " | |Green " + colors[1] + " | |Blue " + colors[2] +" |");
    }

    public static void showClusters(ArrayList<Point> list, int centroids){
       int[] clusters = new int[centroids];
        for (Point point : list) {
            clusters[point.getCluster()]++;
        }
        for(int i = 0; i < centroids; i++){
            System.out.println("[" + i +"] >> " + clusters[i]);
        }
    }
}
