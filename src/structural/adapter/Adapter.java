package structural.adapter;

public class Adapter extends Service {
    private ExistingClass existingClass;
    
    public Adapter(ExistingClass existingClass) {
        this.existingClass = existingClass;
    }

    @Override
    public double getRadius() {
        return existingClass.getWidth() * 2;
    } 

}
