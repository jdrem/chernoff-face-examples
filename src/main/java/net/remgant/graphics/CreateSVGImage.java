package net.remgant.graphics;

import org.apache.batik.dom.GenericDOMImplementation;
import org.apache.batik.svggen.SVGGeneratorContext;
import org.apache.batik.svggen.SVGGraphics2D;
import org.apache.batik.svggen.SVGGraphics2DIOException;
import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class CreateSVGImage {
    public static void main(String[] args) throws InvalidValueException, FileNotFoundException, SVGGraphics2DIOException {
        DOMImplementation domImpl = GenericDOMImplementation.getDOMImplementation();
        // Create an instance of org.w3c.dom.Document.
        String svgNS = "http://www.w3.org/2000/svg";
        Document document = domImpl.createDocument(svgNS, "svg", null);
        SVGGeneratorContext context = SVGGeneratorContext.createDefault(document);
        context.setEmbeddedFontsOn(true);
        // Create an instance of the SVG Generator.
        SVGGraphics2D svgGenerator = new SVGGraphics2D(context, true);
        svgGenerator.setColor(Color.WHITE);
        svgGenerator.fill(new Rectangle2D.Double(0, 0, 400, 400));
        RandomImageCreator.createRandomImage(svgGenerator);
        Writer out = new OutputStreamWriter(new FileOutputStream(args[0]), StandardCharsets.UTF_8);
        svgGenerator.stream(out, true);
    }
}
