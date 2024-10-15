package presentation;

import java.util.ArrayList;

public class UpdateAux {
    private int numOfChanges;
    private int numOfConditions;

    private ArrayList<UpdateComponent> fieldsChanged;
    private ArrayList<UpdateComponent> conditions;

    public UpdateAux(ArrayList<UpdateComponent> fieldsChanged,ArrayList<UpdateComponent> conditions){
        this.numOfChanges = fieldsChanged.size();
        this.numOfConditions = conditions.size();

        this.fieldsChanged=fieldsChanged;
        this.conditions=conditions;
    }

    public int getNumOfConditions(){
        return numOfConditions;
    }
    public int getNumOfChanges(){
        return numOfChanges;
    }

    public ArrayList<UpdateComponent> getConditions() {
        return conditions;
    }

    public ArrayList<UpdateComponent> getFieldsChanged() {
        return fieldsChanged;
    }
}
