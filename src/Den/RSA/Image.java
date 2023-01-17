package Den.RSA;

import Den.RSA.Exception.NotFoundImageException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class Image {

    public void getImage(ArrayList<Point> arrayPoint, ArrayList<Point> centroids, int countCentroids){
        File file = null;
         try{
        file = new File("C:/1p/1115.jpg");
        if(file.exists()) System.out.println("Open");
        else throw new NotFoundImageException("Not found Image");}
        catch (NotFoundImageException e){
             e.printStackTrace();
        }

        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }

        assert bufferedImage != null;

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
            double a = (int) 20 + Math.random() * 400;
            centroids.add(arrayPoint.get((int) a));
        }

    }
}
