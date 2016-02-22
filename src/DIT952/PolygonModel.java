package DIT952;

import DIT952.adapter.IPolygon;
import DIT952.adapter.PolygonFactory;

import java.util.ArrayList;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonModel {
    public ArrayList<IPolygon> polygons;

    public PolygonModel(){
        polygons = new ArrayList<>(10);

        polygons.add(PolygonFactory.createSquare(50, 50));
        polygons.add(PolygonFactory.createTriangle(100,100));
        polygons.add(PolygonFactory.createRectangle(50,150));

    }//constructor
}
