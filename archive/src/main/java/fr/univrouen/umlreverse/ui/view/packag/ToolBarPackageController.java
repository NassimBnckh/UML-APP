package fr.univrouen.umlreverse.ui.view.packag;

import fr.univrouen.umlreverse.model.project.TypeEntity;
import fr.univrouen.umlreverse.util.Contract;
import javafx.fxml.FXML;

public class ToolBarPackageController {

	// ATTRIBUTES
    /**
     * The package diagram that will correspond to this tool bar.
     */
    private PackageDiagramEditor diagram;

    // COMMANDS
    /**
     * Set the current diagram to the parameter.
     * @param d the class diagram editor that will be set as current diagram
     */
    public void setDiagram(PackageDiagramEditor d) {
         Contract.check(d != null, "d must not be null.");
         diagram = d;
    }

	/**
     * Create a new package.
     */
	@FXML
	public void createPackage() {
		Contract.check(diagram != null, "diagram must be instantiated.");
        diagram.createPackage(0, 0);
	}

	/**
     * Create a new interface.
     */
    @FXML
    public void createInterface(){
        Contract.check(diagram != null, "diagram must be instantiated.");
        diagram.createEntity(0, 0, TypeEntity.Interface);
    }

    /**
     * Create a new class.
     */
    @FXML
    public void createClass(){
        Contract.check(diagram != null, "diagram must be instantiated.");
        diagram.createEntity(0, 0, TypeEntity.Clazz);
    }

    /**
     * Create a new abstract class.
     */
    @FXML
    public void createAbstract(){
        Contract.check(diagram != null, "diagram must be instantiated.");
        diagram.createEntity(0, 0, TypeEntity.Abstract);
    }

    /**
     * Create a New Enumeration.
     */
    @FXML
    public void createEnum(){
        Contract.check(diagram != null, "diagram must be instantiated.");
        diagram.createEntity(0, 0, TypeEntity.Enumeration);
    }

    /**
     * Create a new note.
     */
    @FXML
    public void createNote(){
         Contract.check(diagram != null, "diagram must be instantiated.");
         diagram.createNote(0, 0);
     }
}
