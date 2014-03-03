package gui;
import java.awt.event.*;
import javax.swing.*;
import functions.*;
import java.util.Vector;
import entities.*;
import java.sql.SQLException;

public class AdminDialog extends javax.swing.JDialog {
    private AdminEmpTableModel aetm;
    private Vector<Employee> empList;
    private RoomListModel theRoomListModel;
    public AdminDialog(javax.swing.JDialog parent, boolean modal) {
        super(parent, modal);
        empList=MainProgram.getEmployeeList();
        aetm=new AdminEmpTableModel(empList);
        theRoomListModel=new RoomListModel(MainProgram.getRoomList());
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        accountPanel = new javax.swing.JPanel();
        createAccBtn = new javax.swing.JButton();
        delAccBtn = new javax.swing.JButton();
        resetPassBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        accInfoTable = new javax.swing.JTable();
        roomPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        roomList = new javax.swing.JList(theRoomListModel);
        createRoomBtn = new javax.swing.JButton();
        delRoomBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Administrative Functions");

        createAccBtn.setMnemonic('c');
        createAccBtn.setText("Create Account...");
        createAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAccBtnActionPerformed(evt);
            }
        });

        delAccBtn.setMnemonic('d');
        delAccBtn.setText("Delete Account");
        delAccBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delAccBtnActionPerformed(evt);
            }
        });

        resetPassBtn.setMnemonic('r');
        resetPassBtn.setText("Reset Password");
        resetPassBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetPassBtnActionPerformed(evt);
            }
        });

        accInfoTable.setModel(aetm);
        accInfoTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        jScrollPane2.setViewportView(accInfoTable);

        javax.swing.GroupLayout accountPanelLayout = new javax.swing.GroupLayout(accountPanel);
        accountPanel.setLayout(accountPanelLayout);
        accountPanelLayout.setHorizontalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(createAccBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(delAccBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(resetPassBtn)
                .addContainerGap(20, Short.MAX_VALUE))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 375, Short.MAX_VALUE)
        );
        accountPanelLayout.setVerticalGroup(
            accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(accountPanelLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(accountPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAccBtn)
                    .addComponent(delAccBtn)
                    .addComponent(resetPassBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Employees", accountPanel);
        jTabbedPane1.setMnemonicAt(0, KeyEvent.VK_A);

        roomList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        roomList.setCellRenderer(new RoomListRenderer());
        jScrollPane1.setViewportView(roomList);

        createRoomBtn.setMnemonic('c');
        createRoomBtn.setText("Create New Room...");
        createRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createRoomBtnActionPerformed(evt);
            }
        });

        delRoomBtn.setMnemonic('d');
        delRoomBtn.setText("Delete Selected Room");
        delRoomBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delRoomBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout roomPanelLayout = new javax.swing.GroupLayout(roomPanel);
        roomPanel.setLayout(roomPanelLayout);
        roomPanelLayout.setHorizontalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 365, Short.MAX_VALUE)
                    .addGroup(roomPanelLayout.createSequentialGroup()
                        .addComponent(createRoomBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(delRoomBtn)
                        .addContainerGap(91, Short.MAX_VALUE))))
        );
        roomPanelLayout.setVerticalGroup(
            roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roomPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(roomPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createRoomBtn)
                    .addComponent(delRoomBtn))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Rooms", roomPanel);
        jTabbedPane1.setMnemonicAt(1, KeyEvent.VK_O);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void createAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAccBtnActionPerformed
    helperCreateAcc();
}//GEN-LAST:event_createAccBtnActionPerformed

private void helperCreateAcc(){
    Employee newEm=new CreateAccountDialog(this,true).openDialog();
    if(newEm!=null){
        aetm.rowAdded();
    }
}

private void createRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createRoomBtnActionPerformed
    helperCreateRoom();
}//GEN-LAST:event_createRoomBtnActionPerformed

private void helperCreateRoom(){
    String name=JOptionPane.showInputDialog(this,"Enter room name:");
    try{
        Room newRoom=AdminActions.createRoom(name);
        theRoomListModel.addElement(newRoom);
        JOptionPane.showMessageDialog(this, "Room created");
    }catch(RoomExistsException e){
        JOptionPane.showMessageDialog(this, "Room already exists",null,JOptionPane.ERROR_MESSAGE); 
    }catch(SQLException e){
        JOptionPane.showMessageDialog(this, "Error creating: "+e.getMessage(),null,JOptionPane.ERROR_MESSAGE); 
    }
  
}

private void delAccBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delAccBtnActionPerformed
    helperDeleteAcc();
}//GEN-LAST:event_delAccBtnActionPerformed

private void helperDeleteAcc(){
    int selectedIndex=accInfoTable.getSelectedRow();
    if(selectedIndex<0) {
        JOptionPane.showMessageDialog(this, "Nothing selected",null,JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the account?")>0){
        return;
    }
        if(empList.get(selectedIndex).stillHasMeeting()){
            int option=JOptionPane.showConfirmDialog(this, "Warning! the employee still own meetings, continue to delete?");  
            if(option>0) return;
        }
    try{
        AdminActions.deleteEmployee(empList.get(selectedIndex).getEmployeeID());
        aetm.removeRow(selectedIndex);
        JOptionPane.showMessageDialog(this, "Account deleted");
    }catch(SQLException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
    }catch(DeleteAdminException e){
        JOptionPane.showMessageDialog(this, "cannot delete admin",null,JOptionPane.ERROR_MESSAGE);
    }
}

private void resetPassBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetPassBtnActionPerformed
    helperResetPass();
}//GEN-LAST:event_resetPassBtnActionPerformed

private void helperResetPass(){
    int selectedIndex=accInfoTable.getSelectedRow();
    if(selectedIndex<0){
        JOptionPane.showMessageDialog(this, "Nothing selected",null,JOptionPane.ERROR_MESSAGE);
    }else{
        int option=JOptionPane.showConfirmDialog(this, "Are you sure you want to reset the password?");       
        if(option==0 && AdminActions.resetPass(empList.get(selectedIndex))) {
            JOptionPane.showMessageDialog(this, "Password reset to username");
        } 
    }
       
}

private void delRoomBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delRoomBtnActionPerformed
    helperDeleteRoom();
}//GEN-LAST:event_delRoomBtnActionPerformed

private void helperDeleteRoom(){
    int selectedIndex=roomList.getSelectedIndex();
    if(selectedIndex<0) {
        JOptionPane.showMessageDialog(this, "Nothing selected",null,JOptionPane.ERROR_MESSAGE);
        return;
    }
    if(JOptionPane.showConfirmDialog(this, "Are you sure you want to delete the room?")>0){
        return;
    }
        if(theRoomListModel.getData().get(selectedIndex).stillHasMeeting()){
            int option=JOptionPane.showConfirmDialog(this, "Room has meetings, delete room and cancel all meetings in the room?");  
            if(option>0) return;
        }    
    try{
        AdminActions.deleteRoom(theRoomListModel.getElementAt(selectedIndex).getRoomID());
        theRoomListModel.remove(selectedIndex);
        JOptionPane.showMessageDialog(this, "Room deleted");
    }catch(SQLException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(this, e.getMessage(),null,JOptionPane.ERROR_MESSAGE);
    }
    
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable accInfoTable;
    private javax.swing.JPanel accountPanel;
    private javax.swing.JButton createAccBtn;
    private javax.swing.JButton createRoomBtn;
    private javax.swing.JButton delAccBtn;
    private javax.swing.JButton delRoomBtn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JButton resetPassBtn;
    private javax.swing.JList roomList;
    private javax.swing.JPanel roomPanel;
    // End of variables declaration//GEN-END:variables

}
