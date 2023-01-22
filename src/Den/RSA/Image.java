package Den.RSA;

import Den.RSA.Exception.NotFoundImageException;
import Den.RSA.GlobalVariable.GlobalVariable;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Image {

    public void getImage(ArrayList<Point> arrayPoint,
                         ArrayList<Point> centroids,
                         int countCentroids,
                         GlobalVariable variable){

        File file;
         try{
        file = new File(variable.getNameOfDirective() + "/" + variable.getNameOfFile());
        if(file.exists()) System.out.println("<***Open file***>");
        else throw new NotFoundImageException("<***Not found Image***>");
         }
        catch (NotFoundImageException e){
             e.printStackTrace();
             return;
        }

        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e ) {
            e.printStackTrace();
        }


        assert bufferedImage != null;

        if(bufferedImage.getWidth() != 0 && bufferedImage.getHeight() != 0)
        variable.setWeightOfImage(bufferedImage.getWidth());   //save wight of image
        variable.setHeightOfImage(bufferedImage.getHeight());  //save height of image

        variable.setType(bufferedImage.getType());

        for(int x = 0; x < bufferedImage.getWidth(); x++) {
            for (int y = 0; y < bufferedImage.getHeight(); y++) {

                Color color = new Color(bufferedImage.getRGB(x, y));

                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();

                Point point = new Point(red, green, blue);
                arrayPoint.add(point);

            }
        }

        for(int i = 0; i < countCentroids; i++){   //to select the first centroids (need update)
            double a = 20 + Math.random() * 400;
            centroids.add(arrayPoint.get((int) a));
        }

    }
}
