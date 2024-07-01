package net.remgant.graphics.chernoff.examples;

import net.remgant.graphics.chernoff.ChernoffFace;
import net.remgant.graphics.chernoff.InvalidValueException;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Random;

public class CreateExampleImages {

    public static void main(String[] args) throws InvalidValueException, IOException {
        // Create some random images
        Random random = new Random(1L);
        BufferedImage image = new BufferedImage(2000, 400, BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 2000, 400));
        for (int i = 0; i <= 5; i++) {
            double p1 = random.nextDouble();
            double p2 = random.nextDouble();
            double p3 = random.nextDouble();
            double p4 = random.nextDouble();
            double p5 = random.nextDouble();
            double p6 = random.nextDouble();
            double p7 = random.nextDouble();
            double p8 = random.nextDouble();
            double p9 = random.nextDouble();
            double p10 = random.nextDouble();
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
        }
        ImageIO.write(image, "PNG", new File("random.png"));

        // Do min/max
        double[] d = {0.0, 0.25, 0.5, 0.75, 1.0};
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, d[i], d[i], d[i], d[i], d[i], d[i], d[i], d[i], d[i], d[i]);
        }
        ImageIO.write(image, "PNG", new File("min-max.png"));

        // Head shape
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, d[i], 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("head-shape.png"));

        // Eye shape
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, d[i], 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("eye-shape.png"));

        // Pupil size
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, d[i], 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("pupile-size.png"));

        // Eye brow tilt
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, d[i], 0.5, 0.5, 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("eye-brow-tilt.png"));

        // Nose size
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, 0.5, d[i], 0.5, 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("nose-size.png"));

        // Mouth height
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, 0.5, 0.5, d[i], 0.5, 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("mouth-height.png"));

        // Eye spacing
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, d[i], 0.5, 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("eye-spacing.png"));

        // Eye size
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, d[i], 0.5, 0.5);
        }
        ImageIO.write(image, "PNG", new File("eye-size.png"));

        // Mouth width
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.0, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, d[i], 0.5);
        }
        ImageIO.write(image, "PNG", new File("mouth-width.png"));

        // mouth openess
        image = new BufferedImage(400 * d.length, 400, BufferedImage.TYPE_INT_ARGB);
        graphics = image.createGraphics();
        graphics.setColor(Color.WHITE);
        graphics.fill(new Rectangle2D.Double(0, 0, 400 * d.length, 400));
        for (int i = 0; i < d.length; i++) {
            AffineTransform transform = AffineTransform.getTranslateInstance(i * 400.0, 0.0);
            ChernoffFace.create(graphics, transform, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, 0.5, d[i]);
        }
        ImageIO.write(image, "PNG", new File("mouth-openess.png"));
    }
}
