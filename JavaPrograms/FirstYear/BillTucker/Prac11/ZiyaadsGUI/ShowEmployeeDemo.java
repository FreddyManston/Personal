
/**
 * @description Creates a database for Employees
 * 
 * @authors Ziyaad Jaffer, Nuraan Khan 
 * @version Awesomeness
 *      
 * @methods ActionPerformed()
 *          initComponents()
 *          AddbtnActionPerformed()
 *          viewbtnActionPerformed()
 *@exceptions IDCharacterException: catches if the user typed in an illegal character in their ID number
 *             IDLengthException: catches if the user typed in more than 13 characters for their ID Number
 *             ArrayFullException: catches if the user typed in more than 10 employees in the list
 *             NumberFormatException: catches if the user typed in a non integer for the salary
 * @inputs ID number(String), name(String), salary(Double)
 * @outputs Displays a sorted list(based on the employees name) along with their details
 * @classes Scanner(),ArrayList(),Collections(), swing(), JFrame()
 */
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
public class ShowEmployeeDemo extends javax.swing.JFrame {

    /**
     * Creates new form ShowEmployeeDemo
     */
    int counter = 0;
    private ArrayList<Employee> data = new ArrayList<>();
    public ShowEmployeeDemo() {
        initComponents();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();//creating the labels for the Gui
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField(); // creating the textfields where the user must type in their details for each label
        salarytxt = new javax.swing.JTextField();
        idnumtxt = new javax.swing.JTextField();
        addbtn = new javax.swing.JButton(); // creating the buttons for the gui so that the user is able to add details and view the sorted list
        viewbtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane(); // providing the side scroll which enables the users to view the list
                                                      // 
        jOut = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(250, 100, 0, 0));

        jLabel1.setText("Name :");

        jLabel2.setText("Salary :");

        jLabel3.setText("SA ID number :");

        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        viewbtn.setText("View");
        viewbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewbtnActionPerformed(evt);
            }
        });

        jButton2.setText("Reset");

        jOut.setColumns(20);
        jOut.setRows(5);
        jScrollPane1.setViewportView(jOut);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(89, 89, 89)
                                .addComponent(viewbtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                                .addComponent(jButton2))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nametxt)
                                    .addComponent(salarytxt)
                                    .addComponent(idnumtxt, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE))))
                        .addGap(19, 19, 19))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbtn, jButton2, viewbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nametxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(salarytxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idnumtxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbtn)
                    .addComponent(viewbtn)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        
        String name = nametxt.getText();
        double salary = 0.0;
        try
        {
            salary = Double.parseDouble(salarytxt.getText());
            
        }
        catch(NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
            String con = JOptionPane.showInputDialog("Continue or not (Y/N)");
            if(con.equalsIgnoreCase("y"))
            {
                new ShowEmployeeDemo().setVisible(true);
                dispose();
            }
            else
            {
                System.exit(0);
            }
        }
        String id = "";
        try
        {
            id = idnumtxt.getText();
            if(id.length() != 13)
            {
                throw new IDLengthException();
            }
        }
        catch(IDLengthException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
            String con = JOptionPane.showInputDialog("Continue or not (Y/N)");
            if(con.equalsIgnoreCase("y"))
            {
                new ShowEmployeeDemo().setVisible(true);
                dispose();
            }
            else
            {
                //System.exit(0);
            }
        }
        try
        {
            for(int i = 0;i < id.length();i++)
            {
                if(Character.isLetter(id.charAt(i)))
                {
                    throw new IDCharacterException();
                }
            }
            
            
        }
        catch(IDCharacterException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage(),"",JOptionPane.INFORMATION_MESSAGE);
            String con = JOptionPane.showInputDialog("Continue or not (Y/N)");
            if(con.equalsIgnoreCase("y"))
            {
                new ShowEmployeeDemo().setVisible(true);
                dispose();
            }
            else
            {
                //System.exit(0);
            }
            
        }
        
        try
        {
            if(counter > 10)
            {
                throw new ArrayFullException();
            }
            data.add(new Employee(name,salary,id));
        }
        catch(ArrayFullException e)
        {
            JOptionPane.showMessageDialog(null,e.getMessage());
            
            for(int i = 0;i < counter;i++)
            {
                jOut.append("\n"+data.get(i).getName()+"\n"+data.get(i).getSalary()+"\n"+data.get(i).getIDnum());
            }
            
        }
        
        
        nametxt.setText("");
        salarytxt.setText("");
        idnumtxt.setText("");
        
        counter = counter + 1;
        jOut.setText("Number of employees added :"+counter);
        
    }//GEN-LAST:event_addbtnActionPerformed

    private void viewbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewbtnActionPerformed
       
       Collections.sort(data);
       double sum = 0.0;
            for(int x = 0;x < data.size();x++)
            {
                sum =  sum + data.get(x).getSalary();
            }
            double avg = sum/data.size();
            jOut.append("\nAverage salary : R"+avg);
            for(int i = 0;i < counter;i++)
            {
                if(data.get(i).getSalary() > avg)
                {
                jOut.append("\n"+data.get(i).getName()+"\nR"+data.get(i).getSalary()+"\n"+data.get(i).getIDnum()+"\nIs above average salary");
                }
                else if(data.get(i).getSalary() < avg)
                {
                jOut.append("\n"+data.get(i).getName()+"\nR"+data.get(i).getSalary()+"\n"+data.get(i).getIDnum()+"\nIs below average salary");
                }
                else
                {
                jOut.append("\n"+data.get(i).getName()+"\nR"+data.get(i).getSalary()+"\n"+data.get(i).getIDnum()+"\nIs equal to average salary");
                }
            }
            
    }//GEN-LAST:event_viewbtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ShowEmployeeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShowEmployeeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShowEmployeeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShowEmployeeDemo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShowEmployeeDemo().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addbtn;
    private javax.swing.JTextField idnumtxt;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextArea jOut;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nametxt;
    private javax.swing.JTextField salarytxt;
    private javax.swing.JButton viewbtn;
    // End of variables declaration//GEN-END:variables
}