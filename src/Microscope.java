public class Microscope extends LabEquipment{

    private int magnification;

    public Microscope(String manufacturer, String model, int year, int magnification) {
        super(manufacturer, model, year);
        setMagnification(magnification);
    }

    public Microscope(Microscope source) {
        super(source);
        setMagnification(source.magnification);
    }

    public int getMagnification() {
        return magnification;
    }

    public void setMagnification(int magnification) {
        int minMagnification = 1;
        if(magnification < minMagnification){
            throw new IllegalArgumentException("Magnification must be greater than or equal to the minimum magnification.");
        }
        this.magnification = magnification;
    }

    @Override
    public String performMaintenance(){
        return "Microscope maintenance: Clean the lenses and check the light source.";
    }

    @Override
    public LabEquipment clone(){ // returns a copy of the object that invokes this method
        return new Microscope(this); //'this' is the object calling the method
    }
}
