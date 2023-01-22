package Den.RSA;

import Den.RSA.GlobalVariable.GlobalVariable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MakeImage {

    public static void makeImage(ArrayList<Point> point,
                                 ArrayList<Point> cent,
                                 GlobalVariable variable) throws IOException {

        BufferedImage result = new BufferedImage(variable.getWeightOfImage(),
                                                 variable.getHeightOfImage(),
                                                 variable.getType());

        int i = 0;

        for(int x = 0; x < variable.getWeightOfImage(); x++) {
            for (int y = 0; y < variable.getHeightOfImage(); y++) {
                Color newColor = new Color((int) cent.get(point.get(i).getCluster()).getColorsFromArray(0),
                        (int) cent.get(point.get(i).getCluster()).getColorsFromArray(1),
                        (int) cent.get(point.get(i).getCluster()).getColorsFromArray(2));
                i++;
                result.setRGB(x,y,newColor.getRGB());
            }
            }


        File output = new File(variable.getNameOfDirective() + "/" + variable.getNameOfOutputFile());
        if(output.createNewFile()){
            System.out.println("<***File " + variable.getNameOfOutputFile() + " is created***>");
        }
        else
            System.out.println("<***File " + variable.getNameOfOutputFile() + " is exist***>");
        ImageIO.write(result, "jpg", output);
    }

}
