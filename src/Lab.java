import java.util.ArrayList;

public class Lab {

    private ArrayList<LabEquipment> labEquipments;

    public Lab() {
        this.labEquipments = new ArrayList<>();
    }

    public LabEquipment getLabEquipment(int index){ // returns a copy of the lab equipment at index in the Lab array
        return (this.labEquipments.get(index)).clone();
    }

    public void setLabEquipment(int index, LabEquipment setEquipment){ // sets the LabEquipment object at the specified index to a deep copy of the given object.
        this.labEquipments.set(index, setEquipment);
    }

    public void addLabEquipment(LabEquipment addEquipment){ // adds a deep copy of the object to the ArrayList.
        this.labEquipments.add(addEquipment.clone());
    }
}
