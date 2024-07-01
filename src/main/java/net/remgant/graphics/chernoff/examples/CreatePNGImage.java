package net.remgant.graphics.chernoff.examples;

import net.remgant.graphics.chernoff.InvalidValueException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class CreatePNGImage {
    public static void main(String[]  args) throws InvalidValueException, IOException {
        BufferedImage buffferedImage = new BufferedImage(400, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = buffferedImage.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400, 400));
        RandomImageCreator.createRandomImage(graphics);
        ImageIO.write(buffferedImage, "PNG", new File(args[0]));
    }
}
