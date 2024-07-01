package net.remgant.graphics.chernoff.examples;

import net.remgant.graphics.chernoff.ChernoffFace;
import net.remgant.graphics.chernoff.InvalidValueException;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.util.Random;

public class RandomImageCreator {
    final static private AffineTransform IDENTITY_TRANSFORM = new AffineTransform(1.0, 0.0, 0.0, 1.0, 0.0, 0.0);

    private RandomImageCreator() {

    }

    static public void createRandomImage(Graphics2D graphics) throws InvalidValueException {
        createRandomImage(graphics, IDENTITY_TRANSFORM);
    }

    static public void createRandomImage(Graphics2D graphics, AffineTransform affineTransform) throws InvalidValueException {
        Random random = new Random();
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
        ChernoffFace.create(graphics, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10);
    }
}
