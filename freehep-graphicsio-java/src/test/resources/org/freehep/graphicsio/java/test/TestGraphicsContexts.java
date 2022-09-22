// AUTOMATICALLY GENERATED by FreeHEP JAVAGraphics2D

package org.freehep.graphicsio.java.test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.freehep.graphics2d.VectorGraphics;
import org.freehep.graphicsio.test.TestingPanel;

public class TestGraphicsContexts extends TestingPanel {

    public TestGraphicsContexts(String[] args) throws Exception {
        super(args);
        setName("TestGraphicsContexts");
    } // contructor

    public void paint(Graphics g) {
        vg[0] = VectorGraphics.create(g);
        vg[0].setCreator("FreeHEP JAVAGraphics2D");
        Paint0s0.paint(vg);
    } // paint

    private static class Paint0s0 {
        public static void paint(VectorGraphics[] vg) {
            vg[0].setColor(new Color(51, 51, 51, 255));
            vg[0].setFont(new Font("Dialog", 0, 12));
            vg[1] = (VectorGraphics)vg[0].create();
            vg[1].setClip(0, 0, 600, 600);
            vg[1].setColor(new Color(255, 255, 255, 255));
            vg[1].fillRect(0, 0, 600, 600);
            vg[1].setColor(new Color(0, 0, 0, 255));
            vg[1].setStroke(new BasicStroke(
                5.0f, 2, 
                0, 10.0f, 
                null, 0.0f
            ));
            vg[1].drawLine(200, 25, 350, 25);
            vg[1].drawSymbol(400, 25, 40, 5);
            vg[2] = (VectorGraphics)vg[1].create();
            vg[2].setStroke(new BasicStroke(
                10.0f, 0, 
                2, 10.0f, 
                new float[] {
                    5.0f, 4.0f
                }, 0.0f
            ));
            vg[2].setColor(new Color(0, 255, 0, 255));
            vg[2].translate(-137.5, 0.0);
            vg[2].scale(1.5, 1.0);
            vg[2].drawLine(200, 125, 350, 125);
            vg[2].drawSymbol(400, 125, 40, 6);
            vg[3] = (VectorGraphics)vg[2].create();
            vg[3].setStroke(new BasicStroke(
                2.0f, 2, 
                0, 10.0f, 
                null, 0.0f
            ));
            vg[3].setColor(new Color(0, 0, 255, 255));
            vg[3].drawLine(200, 225, 350, 225);
            vg[3].fillSymbol(400, 225, 40, 7);
            vg[3].dispose();
            vg[2].drawLine(200, 325, 350, 325);
            vg[2].drawSymbol(400, 325, 40, 6);
            vg[2].dispose();
            vg[1].drawLine(200, 425, 350, 425);
            vg[1].drawSymbol(400, 425, 40, 5);
            vg[1].dispose();
        } // paint
    } // class Paint0s0

    private VectorGraphics vg[] = new VectorGraphics[4];

    public static void main(String[] args) throws Exception {
        new TestGraphicsContexts(args).runTest(600, 600);
    }
} // class
