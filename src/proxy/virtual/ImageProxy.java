package proxy.virtual;

import proxy.virtual.states.ImageNotRetrievedState;
import proxy.virtual.states.ImageRetrievedState;
import proxy.virtual.states.State;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class ImageProxy implements Icon {
    public volatile ImageIcon imageIcon;

    public final URL imageUrl;
    private State state;

    public ImageProxy(URL imageUrl) {
        this.imageUrl = imageUrl;
        state = new ImageNotRetrievedState(this);
    }

    public int getIconWidth() {
        return state.getIconWidth();
    }

    public int getIconHeight() {
        return state.getIconHeight();
    }

    synchronized public void setImageIcon(ImageIcon imageIcon) {
        this.imageIcon = imageIcon;
    }

    public void paintIcon(final Component c, Graphics g, int x, int y) {
        state.paintIcon(c, g, x, y);
    }

    public State getImageNotRetrievedState() {
        return new ImageNotRetrievedState(this);
    }

    public State getImageRetrievedState() {
        return new ImageRetrievedState(this);
    }

    public void setState(State state) {
        this.state = state;
    }
}
