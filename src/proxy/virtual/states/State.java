package proxy.virtual.states;

import java.awt.*;

public interface State {
    int getIconWidth();
    int getIconHeight();
    void paintIcon(Component c, Graphics g, int x, int y);
}
