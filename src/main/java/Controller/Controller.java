package Controller;

import Model.Model;
import Viewer.Viewer;

public class Controller {
    private final Model model;
    private Viewer viewer;

    public Controller(Model model) {
        this.model = model;
    }

    public void addViewer(Viewer viewer) {
        this.viewer = viewer;
    }

    public void runApp() {
        viewer.setSourcePath(model.getSourcePath());
        viewer.setDestinationPath(model.getDestinationPath());
        viewer.runMainPage();
    }

    public void runExecuteCopyPhoto() {
        model.copy(model.getSourcePath());
        viewer.runMainPage();
    }
}
