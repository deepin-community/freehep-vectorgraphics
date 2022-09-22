// AUTOMATICALLY GENERATED by FreeHEP JAVAGraphics2D

package org.freehep.graphicsio.java.test;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import org.freehep.graphics2d.VectorGraphics;
import org.freehep.graphicsio.test.TestingPanel;

public class TestColors extends TestingPanel {

    public TestColors(String[] args) throws Exception {
        super(args);
        setName("TestColors");
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
            vg[1].fillRect(0, 0, 600, 200);
            vg[1].setColor(new Color(0, 0, 0, 255));
            vg[1].fillRect(0, 200, 600, 200);
            vg[1].setColor(new Color(255, 0, 0, 128));
            vg[1].fillOval(59, 9, 110, 110);
            vg[1].setColor(new Color(0, 255, 0, 128));
            vg[1].fillOval(132, 9, 110, 110);
            vg[1].setColor(new Color(0, 0, 255, 128));
            vg[1].fillOval(95, 82, 110, 110);
            vg[1].setColor(new Color(0, 255, 255, 128));
            vg[1].fillOval(359, 9, 110, 110);
            vg[1].setColor(new Color(255, 0, 255, 128));
            vg[1].fillOval(432, 9, 110, 110);
            vg[1].setColor(new Color(255, 255, 0, 128));
            vg[1].fillOval(395, 82, 110, 110);
            vg[1].setColor(new Color(255, 0, 0, 128));
            vg[1].fillOval(59, 209, 110, 110);
            vg[1].setColor(new Color(0, 255, 0, 128));
            vg[1].fillOval(132, 209, 110, 110);
            vg[1].setColor(new Color(0, 0, 255, 128));
            vg[1].fillOval(95, 282, 110, 110);
            vg[1].setColor(new Color(0, 255, 255, 128));
            vg[1].fillOval(359, 209, 110, 110);
            vg[1].setColor(new Color(255, 0, 255, 128));
            vg[1].fillOval(432, 209, 110, 110);
            vg[1].setColor(new Color(255, 255, 0, 128));
            vg[1].fillOval(395, 282, 110, 110);
            vg[1].setColor(new Color(255, 0, 0, 128));
            vg[1].fillOval(59, 409, 110, 110);
            vg[1].setColor(new Color(0, 255, 0, 128));
            vg[1].fillOval(132, 409, 110, 110);
            vg[1].setColor(new Color(0, 0, 255, 128));
            vg[1].fillOval(95, 482, 110, 110);
            vg[1].setColor(new Color(0, 255, 255, 128));
            vg[1].fillOval(359, 409, 110, 110);
            vg[1].setColor(new Color(255, 0, 255, 128));
            vg[1].fillOval(432, 409, 110, 110);
            vg[1].setColor(new Color(255, 255, 0, 128));
            vg[1].fillOval(395, 482, 110, 110);
            vg[1].dispose();
        } // paint
    } // class Paint0s0

    private VectorGraphics vg[] = new VectorGraphics[2];

    public static void main(String[] args) throws Exception {
        new TestColors(args).runTest(600, 600);
    }
} // class
