package view;

import java.util.ArrayList;
import javax.swing.AbstractListModel;
import model.ECG;

/**
 *
 */
public class ECGListModel extends AbstractListModel{
    ArrayList<ECG> bpm;
            
    public ECGListModel(ArrayList<ECG> bpms){
        this.bpm = bpms;
    }
            
    @Override
    public int getSize() {
        return bpm.size();
    }

    @Override
    public Object getElementAt(int index) {
        return bpm.get(index);
    }
}
