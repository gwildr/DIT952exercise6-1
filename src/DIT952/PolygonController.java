package DIT952;

/**
 * Created by asam82 on 2016-02-22.
 */
public class PolygonController {
    private PolygonModel model;
    private PolygonViewer view;

    PolygonController(PolygonModel model, PolygonViewer view){
        this.model = model;
        this.view = view;
    }

    public void initiateView(){
        view.setupViewFrame();
    }

}
