package structural.facade;

public class Facade {

    private SubsystemClass linksToSubsystemObjects;
    private AdditionalFacade optionalAdditionalFacade;

    public SubsystemClass subsystemOperation() {
        this.linksToSubsystemObjects = new SubsystemClass();
        return linksToSubsystemObjects;
    }
    
}
