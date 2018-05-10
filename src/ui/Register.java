/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import dal.Database;
import dal.DerbyDatabase;
import entity.CurrentUser;
import entity.User;
import entity.UserType;
import factory.View;
import factory.ViewFactory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import virtaulclassroom.IChangeView;

/**
 *
 * @author sagar
 */
public class Register extends javax.swing.JPanel{

    /**
     * Creates new form Register
     */
    
    private IChangeView parent;
    private Database db;
    
    private boolean inputStatus;
    
    public Register() {
        initComponents();
    }
    
    public Register (IChangeView frame){
        this();
        parent = frame;
        inputStatus = false;
        db = new DerbyDatabase();
        setCourses();
    }
    
    private void setCourses(){
        ArrayList<String> course = db.getAllCourses();
        
        for (String c : course){
            courseComboBox.addItem(c);
        }
    }
    
    private void setBranch( String course ){
        
        ArrayList<String> branch = db.getAllBranch(course);
        
        for (String b : branch){
            branchComboBox.addItem(b);
        }
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        userType = new javax.swing.ButtonGroup();
        LoginHeader = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        LoginBody = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        registerButton = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        warningLabel = new javax.swing.JLabel();
        facultyRadioButton = new javax.swing.JRadioButton();
        studentRadioButton = new javax.swing.JRadioButton();
        passwordField = new javax.swing.JPasswordField();
        userIdLabel = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        courseLabel = new javax.swing.JLabel();
        courseComboBox = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        idField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        branchLabel = new javax.swing.JLabel();
        branchComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(33, 137, 212));

        LoginHeader.setBackground(new java.awt.Color(33, 137, 212));
        LoginHeader.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Registration");
        LoginHeader.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 290, 59));

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel11.setForeground(java.awt.Color.white);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/icons/group_52px_1.png"))); // NOI18N
        LoginHeader.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 30, -1, -1));

        LoginBody.setBackground(new java.awt.Color(33, 137, 212));
        LoginBody.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Full Name");
        LoginBody.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 170, -1, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("Password");
        LoginBody.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, -1));

        nameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        nameField.setInputVerifier(new validation.FullNameVerifier());
        LoginBody.add(nameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 160, 320, 30));

        registerButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        registerButton.setForeground(new java.awt.Color(33, 137, 212));
        registerButton.setText("Register");
        registerButton.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        LoginBody.add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 130, 40));

        jLabel6.setBackground(java.awt.Color.white);
        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(java.awt.Color.white);
        jLabel6.setText("Already have an Account? Login");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        LoginBody.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 530, 261, -1));

        warningLabel.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        warningLabel.setForeground(new java.awt.Color(101, 1, 1));
        LoginBody.add(warningLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, 340, 30));

        userType.add(facultyRadioButton);
        facultyRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        facultyRadioButton.setForeground(java.awt.Color.white);
        facultyRadioButton.setText("Faculty");
        facultyRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                facultyRadioButtonMouseClicked(evt);
            }
        });
        LoginBody.add(facultyRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 60, -1, -1));

        userType.add(studentRadioButton);
        studentRadioButton.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        studentRadioButton.setForeground(java.awt.Color.white);
        studentRadioButton.setSelected(true);
        studentRadioButton.setText("Student");
        studentRadioButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentRadioButtonMouseClicked(evt);
            }
        });
        LoginBody.add(studentRadioButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, -1, -1));

        passwordField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LoginBody.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 260, 320, 30));

        userIdLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        userIdLabel.setForeground(java.awt.Color.white);
        userIdLabel.setText("University Roll no.");
        LoginBody.add(userIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        phoneField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        phoneField.setInputVerifier(new validation.PhoneNumberVerifier());
        LoginBody.add(phoneField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 320, 30));

        courseLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        courseLabel.setForeground(java.awt.Color.white);
        courseLabel.setText("Course");
        LoginBody.add(courseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 370, -1, -1));

        courseComboBox.setBackground(java.awt.Color.white);
        courseComboBox.setForeground(java.awt.Color.white);
        courseComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Any One" }));
        courseComboBox.setToolTipText("");
        courseComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                courseComboBoxItemStateChanged(evt);
            }
        });
        LoginBody.add(courseComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 360, 246, 34));

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(java.awt.Color.white);
        jLabel10.setText("Phone Number");
        LoginBody.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 320, -1, -1));

        idField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        LoginBody.add(idField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 320, 30));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(java.awt.Color.white);
        jLabel7.setText("Username");
        LoginBody.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, -1));

        usernameField.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        usernameField.setInputVerifier(new validation.FullNameVerifier());
        LoginBody.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 320, 30));

        branchLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        branchLabel.setForeground(java.awt.Color.white);
        branchLabel.setText("Branch");
        LoginBody.add(branchLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 420, -1, -1));

        branchComboBox.setBackground(java.awt.Color.white);
        branchComboBox.setForeground(java.awt.Color.white);
        branchComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Any One" }));
        LoginBody.add(branchComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 410, 246, 34));

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 16)); // NOI18N
        jLabel12.setForeground(java.awt.Color.white);
        jLabel12.setText("I am a");
        LoginBody.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 70, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(LoginBody, javax.swing.GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LoginHeader, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LoginBody, javax.swing.GroupLayout.PREFERRED_SIZE, 613, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
         parent.requestView(ViewFactory.getView(parent, View.Login));
    }//GEN-LAST:event_jLabel6MouseClicked

    private void facultyRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultyRadioButtonMouseClicked
        courseLabel.setEnabled (false);
        branchLabel.setEnabled (false);
        courseComboBox.setEnabled (false);
        branchComboBox.setEnabled (false);
        userIdLabel.setText ("Faculty Id no.");
    }//GEN-LAST:event_facultyRadioButtonMouseClicked

    private void studentRadioButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentRadioButtonMouseClicked
        courseLabel.setEnabled (true);
        branchLabel.setEnabled(true);
        courseComboBox.setEnabled (true);
        branchComboBox.setEnabled (true);
        userIdLabel.setText ("University Roll no.");
        
    }//GEN-LAST:event_studentRadioButtonMouseClicked

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerButtonActionPerformed
        
        UserType type = (facultyRadioButton.isSelected())? UserType.FACULTY : UserType.STUDENT;
                                                                          // type of user
        String username = usernameField.getText();                        // username of user
        String password = String.valueOf (passwordField.getPassword());   // password of user
        String fullName = nameField.getText();                            // full name of user
        String phone = phoneField.getText();                              // phone no. of user
        String id = idField.getText();                                    // id of user
        
        
        boolean status = db.registerUser( type , new String[]{
                        username, password, fullName, id, phone
            });
        
        if (status == true){
            CurrentUser.setCurrentUser(new User(username , type));
            parent.requestView(ViewFactory.getView(parent, View.Home));
        
        }
        
        else
            JOptionPane.showMessageDialog(this, "Unsccessful");
        
    }//GEN-LAST:event_registerButtonActionPerformed

    private void courseComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_courseComboBoxItemStateChanged
        
        if (courseComboBox.getSelectedIndex() == 0)
            return;
        
        String course = courseComboBox.getSelectedItem().toString();
        
        setBranch (course);
        
    }//GEN-LAST:event_courseComboBoxItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LoginBody;
    private javax.swing.JPanel LoginHeader;
    private javax.swing.JComboBox<String> branchComboBox;
    private javax.swing.JLabel branchLabel;
    private javax.swing.JComboBox<String> courseComboBox;
    private javax.swing.JLabel courseLabel;
    private javax.swing.JRadioButton facultyRadioButton;
    private javax.swing.JTextField idField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nameField;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton registerButton;
    private javax.swing.JRadioButton studentRadioButton;
    private javax.swing.JLabel userIdLabel;
    private javax.swing.ButtonGroup userType;
    private javax.swing.JTextField usernameField;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables

    
}
