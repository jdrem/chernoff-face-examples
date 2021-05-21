package net.remgant.graphics;

import org.apache.xmlgraphics.java2d.ps.EPSDocumentGraphics2D;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class CreateEPSImage {
    public static void main(String[] args) throws InvalidValueException, IOException {
        EPSDocumentGraphics2D g2d = new EPSDocumentGraphics2D(false);
        g2d.setGraphicContext(new org.apache.xmlgraphics.java2d.GraphicContext());
        OutputStream out = new FileOutputStream(args[0]);
        g2d.setupDocument(out, 400, 400); 
        RandomImageCreator.createRandomImage(g2d);
        g2d.finish();
    }
}
