package Den.RSA.GlobalVariable;

import java.util.Scanner;

public class GlobalVariable {

    private int heightOfImage;
    private int weightOfImage;
    private String nameOfFile;
    private String nameOfDirective;
    private String nameOfOutputFile;
    private int countOfCluster;
    private int type;
    private int iteration;

    public int getIteration(){
        return iteration;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getHeightOfImage() {
        return heightOfImage;
    }

    public void setHeightOfImage(int heightOfImage) {
        this.heightOfImage = heightOfImage;
    }

    public int getWeightOfImage() {
        return weightOfImage;
    }

    public void setWeightOfImage(int weightOfImage) {
        this.weightOfImage = weightOfImage;
    }

    public String getNameOfFile() {
        return nameOfFile;
    }


    public String getNameOfDirective() {
        return nameOfDirective;
    }


    public String getNameOfOutputFile() {
        return nameOfOutputFile;
    }


    public int getCountOfCluster() {
        return countOfCluster;
    }


    public void GetInformationOfImage(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Please write number of centroids: >>");
        countOfCluster = sc.nextInt(); sc.nextLine();
        System.out.print("\nPlease write a directive: >>");
        nameOfDirective = sc.nextLine();
        System.out.print("\nPlease write a name of file with format(.jpg): >>");
        nameOfFile = sc.nextLine();
        System.out.print("\nPlease write a output name of file with format: >>");
        nameOfOutputFile = sc.nextLine();
        System.out.print("\nPlease write count of iteration: >>");
        iteration = sc.nextInt(); sc.nextLine();
    }
}
