// AUTOMATICALLY GENERATED by FreeHEP JAVAGraphics2D

package org.freehep.graphicsio.java.test;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import org.freehep.graphics2d.VectorGraphics;
import org.freehep.graphicsio.java.JAVAGeneralPath;
import org.freehep.graphicsio.test.TestingPanel;

public class TestCustomStrokes extends TestingPanel {

    public TestCustomStrokes(String[] args) throws Exception {
        super(args);
        setName("TestCustomStrokes");
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
            vg[2] = (VectorGraphics)vg[1].create();
            vg[2].setColor(new Color(0, 0, 0, 255));
            vg[2].translate(10, 175);
            vg[2].setStroke(new BasicStroke(
                4.0f, 2, 
                0, 10.0f, 
                null, 0.0f
            ));
            vg[2].draw(new JAVAGeneralPath(1, new JAVAGeneralPath.PathElement[] {
                new JAVAGeneralPath.MoveTo(66.71875f, -52.65625f),
                new JAVAGeneralPath.QuadTo(80.859375f, -49.359375f, 86.578125f, -44.671875f),
                new JAVAGeneralPath.QuadTo(94.78125f, -38.015625f, 94.78125f, -27.390625f),
                new JAVAGeneralPath.QuadTo(94.78125f, -16.1875f, 85.765625f, -8.859375f),
                new JAVAGeneralPath.QuadTo(74.703125f, 0.0f, 53.609375f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, -2.703125f),
                new JAVAGeneralPath.QuadTo(10.03125f, -2.703125f, 12.484375f, -3.9921875f),
                new JAVAGeneralPath.QuadTo(14.9375f, -5.28125f, 15.9296875f, -7.328125f),
                new JAVAGeneralPath.QuadTo(16.921875f, -9.375f, 16.921875f, -17.4375f),
                new JAVAGeneralPath.LineTo(16.921875f, -81.890625f),
                new JAVAGeneralPath.QuadTo(16.921875f, -89.9375f, 15.9296875f, -92.02344f),
                new JAVAGeneralPath.QuadTo(14.9375f, -94.109375f, 12.453125f, -95.359375f),
                new JAVAGeneralPath.QuadTo(9.96875f, -96.609375f, 3.15625f, -96.609375f),
                new JAVAGeneralPath.LineTo(3.15625f, -99.3125f),
                new JAVAGeneralPath.LineTo(50.75f, -99.3125f),
                new JAVAGeneralPath.QuadTo(67.828125f, -99.3125f, 74.92969f, -96.27344f),
                new JAVAGeneralPath.QuadTo(82.03125f, -93.234375f, 86.13281f, -87.19531f),
                new JAVAGeneralPath.QuadTo(90.234375f, -81.15625f, 90.234375f, -74.34375f),
                new JAVAGeneralPath.QuadTo(90.234375f, -67.15625f, 85.03125f, -61.554688f),
                new JAVAGeneralPath.QuadTo(79.828125f, -55.953125f, 66.71875f, -52.65625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.QuadTo(50.46875f, -54.640625f, 55.414062f, -56.984375f),
                new JAVAGeneralPath.QuadTo(60.359375f, -59.328125f, 62.992188f, -63.578125f),
                new JAVAGeneralPath.QuadTo(65.625f, -67.828125f, 65.625f, -74.421875f),
                new JAVAGeneralPath.QuadTo(65.625f, -81.0f, 63.023438f, -85.21094f),
                new JAVAGeneralPath.QuadTo(60.421875f, -89.421875f, 55.585938f, -91.625f),
                new JAVAGeneralPath.QuadTo(50.75f, -93.828125f, 40.0625f, -93.75f),
                new JAVAGeneralPath.LineTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -48.921875f),
                new JAVAGeneralPath.LineTo(40.0625f, -17.0625f),
                new JAVAGeneralPath.LineTo(39.984375f, -13.40625f),
                new JAVAGeneralPath.QuadTo(39.984375f, -9.453125f, 42.0f, -7.4375f),
                new JAVAGeneralPath.QuadTo(44.015625f, -5.421875f, 47.96875f, -5.421875f),
                new JAVAGeneralPath.QuadTo(53.828125f, -5.421875f, 58.773438f, -8.0234375f),
                new JAVAGeneralPath.QuadTo(63.71875f, -10.625f, 66.359375f, -15.5703125f),
                new JAVAGeneralPath.QuadTo(69.0f, -20.515625f, 69.0f, -26.59375f),
                new JAVAGeneralPath.QuadTo(69.0f, -33.546875f, 65.77344f, -39.078125f),
                new JAVAGeneralPath.QuadTo(62.546875f, -44.609375f, 56.90625f, -46.804688f),
                new JAVAGeneralPath.QuadTo(51.265625f, -49.0f, 40.0625f, -48.921875f),
                new JAVAGeneralPath.ClosePath()
            }));
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].draw(new JAVAGeneralPath(1, new JAVAGeneralPath.PathElement[] {
                new JAVAGeneralPath.MoveTo(66.71875f, -52.65625f),
                new JAVAGeneralPath.QuadTo(80.859375f, -49.359375f, 86.578125f, -44.671875f),
                new JAVAGeneralPath.QuadTo(94.78125f, -38.015625f, 94.78125f, -27.390625f),
                new JAVAGeneralPath.QuadTo(94.78125f, -16.1875f, 85.765625f, -8.859375f),
                new JAVAGeneralPath.QuadTo(74.703125f, 0.0f, 53.609375f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, -2.703125f),
                new JAVAGeneralPath.QuadTo(10.03125f, -2.703125f, 12.484375f, -3.9921875f),
                new JAVAGeneralPath.QuadTo(14.9375f, -5.28125f, 15.9296875f, -7.328125f),
                new JAVAGeneralPath.QuadTo(16.921875f, -9.375f, 16.921875f, -17.4375f),
                new JAVAGeneralPath.LineTo(16.921875f, -81.890625f),
                new JAVAGeneralPath.QuadTo(16.921875f, -89.9375f, 15.9296875f, -92.02344f),
                new JAVAGeneralPath.QuadTo(14.9375f, -94.109375f, 12.453125f, -95.359375f),
                new JAVAGeneralPath.QuadTo(9.96875f, -96.609375f, 3.15625f, -96.609375f),
                new JAVAGeneralPath.LineTo(3.15625f, -99.3125f),
                new JAVAGeneralPath.LineTo(50.75f, -99.3125f),
                new JAVAGeneralPath.QuadTo(67.828125f, -99.3125f, 74.92969f, -96.27344f),
                new JAVAGeneralPath.QuadTo(82.03125f, -93.234375f, 86.13281f, -87.19531f),
                new JAVAGeneralPath.QuadTo(90.234375f, -81.15625f, 90.234375f, -74.34375f),
                new JAVAGeneralPath.QuadTo(90.234375f, -67.15625f, 85.03125f, -61.554688f),
                new JAVAGeneralPath.QuadTo(79.828125f, -55.953125f, 66.71875f, -52.65625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.QuadTo(50.46875f, -54.640625f, 55.414062f, -56.984375f),
                new JAVAGeneralPath.QuadTo(60.359375f, -59.328125f, 62.992188f, -63.578125f),
                new JAVAGeneralPath.QuadTo(65.625f, -67.828125f, 65.625f, -74.421875f),
                new JAVAGeneralPath.QuadTo(65.625f, -81.0f, 63.023438f, -85.21094f),
                new JAVAGeneralPath.QuadTo(60.421875f, -89.421875f, 55.585938f, -91.625f),
                new JAVAGeneralPath.QuadTo(50.75f, -93.828125f, 40.0625f, -93.75f),
                new JAVAGeneralPath.LineTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -48.921875f),
                new JAVAGeneralPath.LineTo(40.0625f, -17.0625f),
                new JAVAGeneralPath.LineTo(39.984375f, -13.40625f),
                new JAVAGeneralPath.QuadTo(39.984375f, -9.453125f, 42.0f, -7.4375f),
                new JAVAGeneralPath.QuadTo(44.015625f, -5.421875f, 47.96875f, -5.421875f),
                new JAVAGeneralPath.QuadTo(53.828125f, -5.421875f, 58.773438f, -8.0234375f),
                new JAVAGeneralPath.QuadTo(63.71875f, -10.625f, 66.359375f, -15.5703125f),
                new JAVAGeneralPath.QuadTo(69.0f, -20.515625f, 69.0f, -26.59375f),
                new JAVAGeneralPath.QuadTo(69.0f, -33.546875f, 65.77344f, -39.078125f),
                new JAVAGeneralPath.QuadTo(62.546875f, -44.609375f, 56.90625f, -46.804688f),
                new JAVAGeneralPath.QuadTo(51.265625f, -49.0f, 40.0625f, -48.921875f),
                new JAVAGeneralPath.ClosePath()
            }));
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].draw(new JAVAGeneralPath(1, new JAVAGeneralPath.PathElement[] {
                new JAVAGeneralPath.MoveTo(66.71875f, -52.65625f),
                new JAVAGeneralPath.QuadTo(80.859375f, -49.359375f, 86.578125f, -44.671875f),
                new JAVAGeneralPath.QuadTo(94.78125f, -38.015625f, 94.78125f, -27.390625f),
                new JAVAGeneralPath.QuadTo(94.78125f, -16.1875f, 85.765625f, -8.859375f),
                new JAVAGeneralPath.QuadTo(74.703125f, 0.0f, 53.609375f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, -2.703125f),
                new JAVAGeneralPath.QuadTo(10.03125f, -2.703125f, 12.484375f, -3.9921875f),
                new JAVAGeneralPath.QuadTo(14.9375f, -5.28125f, 15.9296875f, -7.328125f),
                new JAVAGeneralPath.QuadTo(16.921875f, -9.375f, 16.921875f, -17.4375f),
                new JAVAGeneralPath.LineTo(16.921875f, -81.890625f),
                new JAVAGeneralPath.QuadTo(16.921875f, -89.9375f, 15.9296875f, -92.02344f),
                new JAVAGeneralPath.QuadTo(14.9375f, -94.109375f, 12.453125f, -95.359375f),
                new JAVAGeneralPath.QuadTo(9.96875f, -96.609375f, 3.15625f, -96.609375f),
                new JAVAGeneralPath.LineTo(3.15625f, -99.3125f),
                new JAVAGeneralPath.LineTo(50.75f, -99.3125f),
                new JAVAGeneralPath.QuadTo(67.828125f, -99.3125f, 74.92969f, -96.27344f),
                new JAVAGeneralPath.QuadTo(82.03125f, -93.234375f, 86.13281f, -87.19531f),
                new JAVAGeneralPath.QuadTo(90.234375f, -81.15625f, 90.234375f, -74.34375f),
                new JAVAGeneralPath.QuadTo(90.234375f, -67.15625f, 85.03125f, -61.554688f),
                new JAVAGeneralPath.QuadTo(79.828125f, -55.953125f, 66.71875f, -52.65625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.QuadTo(50.46875f, -54.640625f, 55.414062f, -56.984375f),
                new JAVAGeneralPath.QuadTo(60.359375f, -59.328125f, 62.992188f, -63.578125f),
                new JAVAGeneralPath.QuadTo(65.625f, -67.828125f, 65.625f, -74.421875f),
                new JAVAGeneralPath.QuadTo(65.625f, -81.0f, 63.023438f, -85.21094f),
                new JAVAGeneralPath.QuadTo(60.421875f, -89.421875f, 55.585938f, -91.625f),
                new JAVAGeneralPath.QuadTo(50.75f, -93.828125f, 40.0625f, -93.75f),
                new JAVAGeneralPath.LineTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -48.921875f),
                new JAVAGeneralPath.LineTo(40.0625f, -17.0625f),
                new JAVAGeneralPath.LineTo(39.984375f, -13.40625f),
                new JAVAGeneralPath.QuadTo(39.984375f, -9.453125f, 42.0f, -7.4375f),
                new JAVAGeneralPath.QuadTo(44.015625f, -5.421875f, 47.96875f, -5.421875f),
                new JAVAGeneralPath.QuadTo(53.828125f, -5.421875f, 58.773438f, -8.0234375f),
                new JAVAGeneralPath.QuadTo(63.71875f, -10.625f, 66.359375f, -15.5703125f),
                new JAVAGeneralPath.QuadTo(69.0f, -20.515625f, 69.0f, -26.59375f),
                new JAVAGeneralPath.QuadTo(69.0f, -33.546875f, 65.77344f, -39.078125f),
                new JAVAGeneralPath.QuadTo(62.546875f, -44.609375f, 56.90625f, -46.804688f),
                new JAVAGeneralPath.QuadTo(51.265625f, -49.0f, 40.0625f, -48.921875f),
                new JAVAGeneralPath.ClosePath()
            }));
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].draw(new JAVAGeneralPath(1, new JAVAGeneralPath.PathElement[] {
                new JAVAGeneralPath.MoveTo(66.71875f, -52.65625f),
                new JAVAGeneralPath.QuadTo(80.859375f, -49.359375f, 86.578125f, -44.671875f),
                new JAVAGeneralPath.QuadTo(94.78125f, -38.015625f, 94.78125f, -27.390625f),
                new JAVAGeneralPath.QuadTo(94.78125f, -16.1875f, 85.765625f, -8.859375f),
                new JAVAGeneralPath.QuadTo(74.703125f, 0.0f, 53.609375f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, -2.703125f),
                new JAVAGeneralPath.QuadTo(10.03125f, -2.703125f, 12.484375f, -3.9921875f),
                new JAVAGeneralPath.QuadTo(14.9375f, -5.28125f, 15.9296875f, -7.328125f),
                new JAVAGeneralPath.QuadTo(16.921875f, -9.375f, 16.921875f, -17.4375f),
                new JAVAGeneralPath.LineTo(16.921875f, -81.890625f),
                new JAVAGeneralPath.QuadTo(16.921875f, -89.9375f, 15.9296875f, -92.02344f),
                new JAVAGeneralPath.QuadTo(14.9375f, -94.109375f, 12.453125f, -95.359375f),
                new JAVAGeneralPath.QuadTo(9.96875f, -96.609375f, 3.15625f, -96.609375f),
                new JAVAGeneralPath.LineTo(3.15625f, -99.3125f),
                new JAVAGeneralPath.LineTo(50.75f, -99.3125f),
                new JAVAGeneralPath.QuadTo(67.828125f, -99.3125f, 74.92969f, -96.27344f),
                new JAVAGeneralPath.QuadTo(82.03125f, -93.234375f, 86.13281f, -87.19531f),
                new JAVAGeneralPath.QuadTo(90.234375f, -81.15625f, 90.234375f, -74.34375f),
                new JAVAGeneralPath.QuadTo(90.234375f, -67.15625f, 85.03125f, -61.554688f),
                new JAVAGeneralPath.QuadTo(79.828125f, -55.953125f, 66.71875f, -52.65625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.QuadTo(50.46875f, -54.640625f, 55.414062f, -56.984375f),
                new JAVAGeneralPath.QuadTo(60.359375f, -59.328125f, 62.992188f, -63.578125f),
                new JAVAGeneralPath.QuadTo(65.625f, -67.828125f, 65.625f, -74.421875f),
                new JAVAGeneralPath.QuadTo(65.625f, -81.0f, 63.023438f, -85.21094f),
                new JAVAGeneralPath.QuadTo(60.421875f, -89.421875f, 55.585938f, -91.625f),
                new JAVAGeneralPath.QuadTo(50.75f, -93.828125f, 40.0625f, -93.75f),
                new JAVAGeneralPath.LineTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -48.921875f),
                new JAVAGeneralPath.LineTo(40.0625f, -17.0625f),
                new JAVAGeneralPath.LineTo(39.984375f, -13.40625f),
                new JAVAGeneralPath.QuadTo(39.984375f, -9.453125f, 42.0f, -7.4375f),
                new JAVAGeneralPath.QuadTo(44.015625f, -5.421875f, 47.96875f, -5.421875f),
                new JAVAGeneralPath.QuadTo(53.828125f, -5.421875f, 58.773438f, -8.0234375f),
                new JAVAGeneralPath.QuadTo(63.71875f, -10.625f, 66.359375f, -15.5703125f),
                new JAVAGeneralPath.QuadTo(69.0f, -20.515625f, 69.0f, -26.59375f),
                new JAVAGeneralPath.QuadTo(69.0f, -33.546875f, 65.77344f, -39.078125f),
                new JAVAGeneralPath.QuadTo(62.546875f, -44.609375f, 56.90625f, -46.804688f),
                new JAVAGeneralPath.QuadTo(51.265625f, -49.0f, 40.0625f, -48.921875f),
                new JAVAGeneralPath.ClosePath()
            }));
            Paint0s1.paint(vg);
        } // paint
    } // class Paint0s0

    private static class Paint0s1 {
        public static void paint(VectorGraphics[] vg) {
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].draw(new JAVAGeneralPath(1, new JAVAGeneralPath.PathElement[] {
                new JAVAGeneralPath.MoveTo(66.71875f, -52.65625f),
                new JAVAGeneralPath.QuadTo(80.859375f, -49.359375f, 86.578125f, -44.671875f),
                new JAVAGeneralPath.QuadTo(94.78125f, -38.015625f, 94.78125f, -27.390625f),
                new JAVAGeneralPath.QuadTo(94.78125f, -16.1875f, 85.765625f, -8.859375f),
                new JAVAGeneralPath.QuadTo(74.703125f, 0.0f, 53.609375f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, 0.0f),
                new JAVAGeneralPath.LineTo(3.15625f, -2.703125f),
                new JAVAGeneralPath.QuadTo(10.03125f, -2.703125f, 12.484375f, -3.9921875f),
                new JAVAGeneralPath.QuadTo(14.9375f, -5.28125f, 15.9296875f, -7.328125f),
                new JAVAGeneralPath.QuadTo(16.921875f, -9.375f, 16.921875f, -17.4375f),
                new JAVAGeneralPath.LineTo(16.921875f, -81.890625f),
                new JAVAGeneralPath.QuadTo(16.921875f, -89.9375f, 15.9296875f, -92.02344f),
                new JAVAGeneralPath.QuadTo(14.9375f, -94.109375f, 12.453125f, -95.359375f),
                new JAVAGeneralPath.QuadTo(9.96875f, -96.609375f, 3.15625f, -96.609375f),
                new JAVAGeneralPath.LineTo(3.15625f, -99.3125f),
                new JAVAGeneralPath.LineTo(50.75f, -99.3125f),
                new JAVAGeneralPath.QuadTo(67.828125f, -99.3125f, 74.92969f, -96.27344f),
                new JAVAGeneralPath.QuadTo(82.03125f, -93.234375f, 86.13281f, -87.19531f),
                new JAVAGeneralPath.QuadTo(90.234375f, -81.15625f, 90.234375f, -74.34375f),
                new JAVAGeneralPath.QuadTo(90.234375f, -67.15625f, 85.03125f, -61.554688f),
                new JAVAGeneralPath.QuadTo(79.828125f, -55.953125f, 66.71875f, -52.65625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.QuadTo(50.46875f, -54.640625f, 55.414062f, -56.984375f),
                new JAVAGeneralPath.QuadTo(60.359375f, -59.328125f, 62.992188f, -63.578125f),
                new JAVAGeneralPath.QuadTo(65.625f, -67.828125f, 65.625f, -74.421875f),
                new JAVAGeneralPath.QuadTo(65.625f, -81.0f, 63.023438f, -85.21094f),
                new JAVAGeneralPath.QuadTo(60.421875f, -89.421875f, 55.585938f, -91.625f),
                new JAVAGeneralPath.QuadTo(50.75f, -93.828125f, 40.0625f, -93.75f),
                new JAVAGeneralPath.LineTo(40.0625f, -54.640625f),
                new JAVAGeneralPath.ClosePath(),
                new JAVAGeneralPath.MoveTo(40.0625f, -48.921875f),
                new JAVAGeneralPath.LineTo(40.0625f, -17.0625f),
                new JAVAGeneralPath.LineTo(39.984375f, -13.40625f),
                new JAVAGeneralPath.QuadTo(39.984375f, -9.453125f, 42.0f, -7.4375f),
                new JAVAGeneralPath.QuadTo(44.015625f, -5.421875f, 47.96875f, -5.421875f),
                new JAVAGeneralPath.QuadTo(53.828125f, -5.421875f, 58.773438f, -8.0234375f),
                new JAVAGeneralPath.QuadTo(63.71875f, -10.625f, 66.359375f, -15.5703125f),
                new JAVAGeneralPath.QuadTo(69.0f, -20.515625f, 69.0f, -26.59375f),
                new JAVAGeneralPath.QuadTo(69.0f, -33.546875f, 65.77344f, -39.078125f),
                new JAVAGeneralPath.QuadTo(62.546875f, -44.609375f, 56.90625f, -46.804688f),
                new JAVAGeneralPath.QuadTo(51.265625f, -49.0f, 40.0625f, -48.921875f),
                new JAVAGeneralPath.ClosePath()
            }));
            vg[2].translate(100, 0);
            vg[2].translate(-500, 0);
            vg[2].translate(10, 100);
            vg[2].setStroke(new BasicStroke(
                4.0f, 2, 
                0, 10.0f, 
                null, 0.0f
            ));
            vg[2].drawRect(10, 10, 80, 50);
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].drawRect(10, 10, 80, 50);
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].drawRect(10, 10, 80, 50);
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].drawRect(10, 10, 80, 50);
            vg[2].translate(100, 0);
            System.err.println("class org.freehep.graphicsio.java.JAVAGraphics2D: setStroke(Stroke) not implemented.");
            vg[2].drawRect(10, 10, 80, 50);
            vg[2].translate(100, 0);
            vg[1].dispose();
        } // paint
    } // class Paint0s1

    private VectorGraphics vg[] = new VectorGraphics[3];

    public static void main(String[] args) throws Exception {
        new TestCustomStrokes(args).runTest(600, 600);
    }
} // class
