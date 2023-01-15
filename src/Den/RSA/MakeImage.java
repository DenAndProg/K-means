package Den.RSA;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

public class MakeImage {

    public static void makeImage(ArrayList<Point> point, ArrayList<Point> cent) throws IOException {
        File file = new File("C:/1p/rr.jpg");
        if(file.exists()) System.out.println("Open");

        BufferedImage bufferedImage = null;
        try {
            bufferedImage = ImageIO.read(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        int size = bufferedImage.getHeight() * bufferedImage.getWidth();
        assert bufferedImage != null;
        BufferedImage result = new BufferedImage(bufferedImage.getWidth(), bufferedImage.getHeight(), bufferedImage.getType());
        int i = 0;

        for(int x = 0; x < bufferedImage.getWidth(); x++) {
            for (int y = 0; y < bufferedImage.getHeight(); y++) {
                Color newColor = new Color((int) cent.get(point.get(i).getCluster()).getColors2(0), (int) cent.get(point.get(i).getCluster()).getColors2(1), (int) cent.get(point.get(i).getCluster()).getColors2(2));
                i++;
                result.setRGB(x,y,newColor.getRGB());
            }
            }




        File output = new File("C:/1p/Cat222.jpg");
        ImageIO.write(result, "jpg", output);
    }

}
