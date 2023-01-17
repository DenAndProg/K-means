package Den.RSA.GlobalVariable;

import java.util.Scanner;

public class GlobalVariable {

    private int heightOfImage;
    private int weightOfImage;
    private String nameOfFile;
    private String nameOfDirective;
    private String nameOfOutputFile;
    private int countOfCluster;

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
        countOfCluster = sc.nextInt();
        System.out.print("\nPlease write a directive: >>");
        nameOfDirective = sc.nextLine();
        System.out.print("\nPlease write a name of file with format(.jpeg): >>");
        nameOfFile = sc.nextLine();
        System.out.print("\nPlease write a output name of file with format: >>");
        nameOfOutputFile = sc.nextLine();
    }
}
