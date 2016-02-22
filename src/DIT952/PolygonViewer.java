package DIT952;

import javax.swing.*;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonViewer extends JComponent{
    PolygonViewer() {
        JFrame frame = new JFrame();

        polygons.frame = frame;

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setBounds(30, 30, 300, 300);
        frame.getContentPane().add(polygons);
        frame.setVisible(true);
    }
}
