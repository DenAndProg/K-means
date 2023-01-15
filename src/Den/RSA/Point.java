package Den.RSA;

import java.util.ArrayList;

public class Point {

    //private int[] colors = new int[3];    //[0] - red; [1] - green; [2] - blue
    private double red;
    private double green;
    private double blue;
    private int cluster;

    public double getRed() {
        return red;
    }
    public void setRed(double red) {
        this.red = red;
    }
    public double getGreen() {
        return green;
    }
    public double getBlue() {
        return blue;
    }
    public void setBlue(double blue) {
        this.blue = blue;
    }
    public int getCluster() {
        return cluster;
    }
    public void setCluster(int cluster) {
        this.cluster = cluster;
    }


   /* public int[] getColors() {
        return colors;
    }
    public void setColors(int[] colors) {
        this.colors = colors;
    }*/

   public Point(double red, double green, double blue){
        /*colors[0] = red;
        colors[1] = green;
        colors[2] = blue;*/
        this.red = red;
        this.green = green;
        this.blue = blue;
        cluster = 0;
    }

    public void showPoint(){
        /*System.out.println("|Red " + colors[0] + " | |Green " + colors[1] + " | |Blue " + colors[2] +" |");*/
        System.out.println("|Red " + red + " | |Green " + green + " | |Blue " + blue +" |");
    }

    public void showClusters(ArrayList<Point> list, int centroids){
       int[] clasters = new int[centroids];
        for (Point point : list) {
            clasters[point.getCluster()]++;
            System.out.println(point.getCluster());
        }
        for(int i = 0; i < centroids; i++){
            System.out.println("[" + i +"] >> " + clasters[i]);
        }
    }
}
