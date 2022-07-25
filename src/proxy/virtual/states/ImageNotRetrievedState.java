package proxy.virtual.states;

import proxy.virtual.ImageProxy;

import javax.swing.*;
import java.awt.*;

public class ImageNotRetrievedState implements State {
    private final ImageProxy imageProxy;
    private boolean retrieving = false;

    public ImageNotRetrievedState(ImageProxy imageProxy) {
        this.imageProxy = imageProxy;
    }

    @Override
    public int getIconWidth() {
        return 800;
    }

    @Override
    public int getIconHeight() {
        return 600;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        drawLoadingMessage(g, x, y);
        if (!retrieving) {
            retrieving = true;
            startImageRetrievalAndPaintJob(c);
        }
    }

    private void drawLoadingMessage(Graphics g, int x, int y) {
        g.drawString("Loading...", x + 100, y + 100);
    }

    private void startImageRetrievalAndPaintJob(Component c) {
        Thread retrievalThread = new Thread(() -> retrieveAndPaintImage(c));
        retrievalThread.start();
    }

    private void retrieveAndPaintImage(Component c) {
        try {
            retrieveImage();
            c.repaint();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            imageProxy.setState(imageProxy.getImageRetrievedState());
        }
    }

    private void retrieveImage() {
        var imageUrl = imageProxy.imageUrl;
        imageProxy.setImageIcon(new ImageIcon(imageUrl, "Album cover"));
    }
}
