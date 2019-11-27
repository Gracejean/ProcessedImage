package processedimage;

import java.awt.*;
import java.awt.image.BufferedImage;

import java.io.*;

import javax.imageio.ImageIO;

public class NoScale {

    BufferedImage image;
    int width;
    int height;

    public NoScale() {

        try {
            File input = new File("C:\\Users\\mendozaje_sd2082\\Desktop\\flower.jpg");
            image = ImageIO.read(input);
            width = image.getWidth();
            height = image.getHeight();

            for (int i = 0; i < height; i++) {

                for (int j = 0; j < width; j++) {

                    Color c = new Color(image.getRGB(j, i));

                    Color black = new Color(0, 0, 0);
                    int light = 50;

                    if (c.getRGB() == black.getRGB() || (c.getBlue() < light && c.getGreen() < light && c.getRed() < light)) {

                    } else {
                        Color white = new Color(255, 255, 255);
                        image.setRGB(j, i, white.getRGB());
                    }
//                   
                }
            }

            File ouptut = new File("C:\\Users\\mendozaje_sd2082\\Desktop\\whitescale.jpg");
            ImageIO.write(image, "jpg", ouptut);

        } catch (Exception e) {
        }
    }

}
