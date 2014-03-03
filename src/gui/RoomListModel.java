package gui;
import javax.swing.AbstractListModel;
import entities.Room;
import java.util.Vector;

public class RoomListModel extends AbstractListModel {
    private Vector<Room> data;
    public RoomListModel(Vector<Room> theData){
        data=theData;
        this.fireIntervalAdded(this, 0, data.size()-1);
    }

    public void addElement(Room obj) {
        int index = data.size();
        fireIntervalAdded(this, index, index);
    }

    public void remove(int index) {
        fireIntervalRemoved(this, index, index);
    }

    public Room getElementAt(int index) {
        return data.elementAt(index);
    }
    
    public int getSize(){
        return data.size();
    }

    public Vector<Room> getData() {
        return data;
    }
    
}
