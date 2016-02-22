package DIT952;

import javax.swing.*;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonViewer extends JFrame{
    public PolygonViewer() {//constructor
    }

    public void setupViewFrame (){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setBounds(30, 30, 300, 300);
//            this.getContentPane().add(polygons);
        this.setVisible(true);
    }
}
