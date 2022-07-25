package proxy.virtual.states;

import proxy.virtual.ImageProxy;

import javax.swing.*;
import java.awt.*;

public class ImageRetrievedState implements State{
    private final ImageIcon imageIcon;

    public ImageRetrievedState(ImageProxy imageProxy) {
        this.imageIcon = imageProxy.imageIcon;
    }

    @Override
    public int getIconWidth() {
        return imageIcon.getIconWidth();
    }

    @Override
    public int getIconHeight() {
        return imageIcon.getIconHeight();
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        imageIcon.paintIcon(c, g, x, y);
    }
}
