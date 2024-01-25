public class Centrifuge extends LabEquipment{

    private int maxRPM;

    public Centrifuge(String manufacturer, String model, int year, int maxRPM) {
        super(manufacturer, model, year);
        setMaxRPM(maxRPM);
    }

    public Centrifuge(Centrifuge source) {
        super(source);
        setMaxRPM(source.maxRPM);
    }

    public int getMaxRPM() {
        return maxRPM;
    }

    public void setMaxRPM(int maxRPM) {
        int minRPM = 500;
        if(maxRPM < minRPM){
            throw new IllegalArgumentException("MaxRPM must be greater than or equal to the minimum RPM.");
        }
        this.maxRPM = maxRPM;
    }

    @Override
    public String performMaintenance(){
        return "Centrifuge maintenance: Check the rotor, clean the chamber, and lubricate the spindle.";
    }

    @Override
    public LabEquipment clone(){
        return new Centrifuge(this); //'this' is the object calling the method
    }
}
