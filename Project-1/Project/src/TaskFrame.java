//Ryan Schan
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class TaskFrame extends javax.swing.JFrame {

    /**
     * Creates new form TaskFrame
     */
    public TaskFrame() {
        initComponents();
         this.employeeModel = new DefaultListModel<String>();
       this.employee = new ArrayList<String>();
        this.project = new ArrayList<String>();
       this.projectModel = new DefaultListModel<String>();
        this.workon = new LinkedHashMap<String,ArrayList>();
        TaskData.readWorkOn(workon);//calls the method to read workon.txt
        TaskData.ReadEmpolyee(employee);//calls the method to read employee.txt
        TaskData.ReadProject(project);//calls the method to read project.txt
        for(int i = 0; i<employee.size(); i++)
        {
            employeeModel.addElement(employee.get(i));//adds the employees to the employee model
            
        }
        for(int i = 0; i<project.size(); i++)
        {
            projectModel.addElement(project.get(i));//adds the projects to the project model
            
        }
        employeeList.setModel(employeeModel);//assigns the employee model to the employee List
        projectList.setModel(projectModel);//assigns the project model to the project list
             
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        employeeList = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        projectList = new javax.swing.JList();
        employeeLabel = new javax.swing.JLabel();
        projectLabel = new javax.swing.JLabel();
        assignButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        deleteButton = new javax.swing.JButton();
        hoursComboBox = new javax.swing.JComboBox();
        exitButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task Assignment");

        jScrollPane1.setViewportView(employeeList);

        projectList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(projectList);

        employeeLabel.setText("Employee:");

        projectLabel.setText("Project:");

        assignButton.setMnemonic('s');
        assignButton.setText("Assign to");
        assignButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignButtonActionPerformed(evt);
            }
        });

        addButton.setMnemonic('d');
        addButton.setText("Add Record");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        deleteButton.setMnemonic('l');
        deleteButton.setText("Delete Record");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        hoursComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "5", "10", "15", "20", "25", "30", "35", "40" }));

        exitButton.setMnemonic('x');
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Hour:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(employeeLabel)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(25, 25, 25)
                                .addComponent(hoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(deleteButton)
                            .addComponent(addButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(assignButton, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(exitButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(projectLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hoursComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(38, 38, 38)
                        .addComponent(assignButton)
                        .addGap(18, 18, 18)
                        .addComponent(addButton)
                        .addGap(18, 18, 18)
                        .addComponent(deleteButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(employeeLabel)
                            .addComponent(projectLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // TODO add your handling code here:
        System.exit(0);//closes the program
    }//GEN-LAST:event_exitButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        // TODO add your handling code here:
        String name = null;
        Object[] options = {"Employee", "Project"};
        int n = JOptionPane.showOptionDialog(this, "Add a new employee or project?", "Add a New Employee or Project Record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        if (n== -1)//cancel
       {
           //doesnt do anything if canceled.
       }
        else
        if (n== 0)//employee selected
        {
        name =  JOptionPane.showInputDialog(null, "Enter the name for a new employee(Name cant be duplicated)");
             if (name == null)//if canceled.
            {
                  //doesnt do anything if canceled.
            }
            else
              if (name.isEmpty())//if left blank.
            {
                   String message = "You must enter a name";
             String title = "failed to add";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
            }
        else
                  if(name.contains("<>") == true)//if enters the delimiter in the name.
                  {
                         String message = name + "not been added. Cannot contain \"<>\".";
             String title = "failed to add";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
                                          
                  }
                 else   
        if(!employee.contains(name))//if the name is not already there.
             {
                  employeeModel.addElement(name);//adds the name.
                 String message = name + " has been sucessfully added.";
             String title = "successfully added";
             TaskData.appendEmployee(name);//appends the employee text file with the new name.
                 JOptionPane.showMessageDialog(this,message ,title, JOptionPane.INFORMATION_MESSAGE);
            
             }
            else//if the name is there.
            {
                    
             String message = name + "  has not been added.";
             String title = "failed to add";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
            }
          
        }
        else
            if (n == 1)//if project is selected.
        {
             name =  JOptionPane.showInputDialog(null, "Enter the name for a new Project(Name cant be duplicated)");
              if (name == null)//if canceled
            {
                   //if canceled doesn't do anything.
            }
            else
              if (name.isEmpty())//if left blank.
            {
                   String message = "You must enter a name";
             String title = "failed to add";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
            }
        else
             if(project.contains(name))//if the project already exists.
             {
             String message = name + " has not been added.";
             String title = "failed to add";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
             }
            else//if the project does not exist.
            {
                projectModel.addElement(name);
                 String message = name + " has been sucessfully added.";
             String title = "successfully added";
             TaskData.appendProject(name);//appends the project.txt file with the new name. 
                 JOptionPane.showMessageDialog(this,message ,title, JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        // TODO add your handling code here:
        Object[] options = {"Employee", "Project"};
         int n = JOptionPane.showOptionDialog(this, "Delete an employee or project?", "Delete an Employee or Proejct Record", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
       if (n== -1)//if canceled.
       {
           //if canceled doesnt do anything.
       }
         else
         if (n==0)//selects employee
        {
            if(employeeList.getSelectedValue() == null)//if there isnt a selected name.
             {
            String message = " Select employee(s) to delete";
             String title = "Delete employee";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
             }
            else//if there are selected name(s).
            {
            int indexes[];
            indexes = employeeList.getSelectedIndices();
              
         
            
            for (int i = indexes.length -1; i>=0; i--)//loops though all the selected names.
            {
                String removed = employeeModel.get(indexes[i]);
                employee.remove(removed);
         
                 String projectName = null;
               Iterator itr =  workon.entrySet().iterator();
     
            while (itr.hasNext())//loops though the hash map to remove the employees from workon.txt
            {
              HashMap.Entry pair = (HashMap.Entry)itr.next();
              projectName= (String) pair.getKey();
              
                ArrayList<String> projectInfo = new ArrayList<String>();
                   projectInfo = (ArrayList) workon.get(projectName);//gets the hours and employees for the project
                
                if(projectInfo.contains(removed))
                {
                     int workHours =  projectInfo.indexOf(removed)+ 1;//arrayList has employee firzt, then hour, so the next one is hours.
                 
                 projectInfo.remove(workHours);//removes workhours for employee
                 projectInfo.remove(removed);//removes the employee.
                
                }
            }
               employeeModel.removeElementAt(indexes[i]);
               employee.remove(removed);
                
            
        }
                  TaskData.WriteEmployee(employee);//overrides the employee.txt
              TaskData.writeWorkOn(workon);//overrides the workon.txt.
        }
        }
        else
        {
           if(projectList.getSelectedValue() == null)//if there is no project selected.
        {
            String message = " Select project to delete";
             String title = "Delete Project";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
        } 
           else
           if (n==1)//if project is selected.
           {
             int index = projectList.getSelectedIndex();
             String removed = (String) projectList.getSelectedValue();
             workon.remove(removed);//removes slected project from the hashmap.
             
             TaskData.writeWorkOn(workon);//overrides the workon.txt
              projectModel.removeElementAt(index);//removes the selected project from the list
              project.remove(removed);//removes the selected project from the arrayList 
             TaskData.WriteProject(project);//overrides the project.txt
           }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void assignButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignButtonActionPerformed

        String messageFinal = "Employee: " + "\n";  //starts the final message.
        //gets the selected items.
        int hours =  Integer.parseInt((String) hoursComboBox.getSelectedItem());
        int employeeIndexes[];
            employeeIndexes = employeeList.getSelectedIndices();
              int projectIndex = projectList.getSelectedIndex();
              String selectedProject = (String) projectList.getSelectedValue();
        if ( employeeIndexes.length == 0 | projectIndex == -1) //if no project or employee is selectge
        {
             String message = " Select employee(s) and project to assign.";
             String title = "Assign employee(s) to project.";
            JOptionPane.showMessageDialog(this,message ,title, JOptionPane.ERROR_MESSAGE);
            
        }
        
        else  //if there are selected employee(s) and project
        {
          for (int i = 0; i< employeeIndexes.length; i++)//loops though selected employees
          {
              String employeeName = employeeModel.get(employeeIndexes[i]);
    
              if (!workon.containsKey(selectedProject))//if the project does not already exists.
              {
                ArrayList<String> projectInfo = new ArrayList<String>();//creats new array list to store employee name and hours worked.
                projectInfo.add(employeeName);
                String strHours= Integer.toString(hours);
                projectInfo.add(strHours);
                workon.put(selectedProject, projectInfo);
                messageFinal += employeeName;
              }
              else//if it does contain the selected project
              {
              Iterator itr =  workon.entrySet().iterator();
            while (itr.hasNext())//loops though hashmap to check if the arraylist already contains the employee
            {
                 HashMap.Entry pair = (HashMap.Entry)itr.next();
              String projectName= (String) pair.getKey();
              
                ArrayList<String> projectInfo = new ArrayList<String>();
                   projectInfo = (ArrayList) workon.get(projectName);
                   if(projectInfo.contains(employeeName) & projectName.equals(selectedProject) )//if the project already contains the employee.
                   {
                       int hoursIndex = projectInfo.indexOf(employeeName)+ 1;//employee hours is one after the name.
                       int oldHours = Integer.parseInt(projectInfo.get(hoursIndex));
                       int newHours = hours + oldHours;
                       String strNewHours = Integer.toString(newHours);
                   
                       projectInfo.set(hoursIndex, strNewHours);
                       messageFinal += employeeName+  "\n";
                   }
                   else
                   if (projectName.equals(selectedProject))//if the project name is there but the employee isnt.
                   {
                       projectInfo.add(employeeName);
                       String strHours= Integer.toString(hours);
                       projectInfo.add(strHours);
                          messageFinal += employeeName+  "\n";
                   }
                        
                   
                }
              }
          }
          messageFinal += "have been assigned ot the project, " + selectedProject;
               String title = "Assigning employee to project";
            JOptionPane.showMessageDialog(this,messageFinal ,title, JOptionPane.INFORMATION_MESSAGE);
            
            TaskData.writeWorkOn(workon);//overrides the workon.txt
        }
    }//GEN-LAST:event_assignButtonActionPerformed

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
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new TaskFrame().setVisible(true);
                TaskFrame frame = new TaskFrame();
                frame.setVisible(true);//makes the frame visiable.
                frame.setLocationRelativeTo(null);//centers the frame.
                
            }
        });
    }
    
   LinkedHashMap<String,ArrayList> workon;
   DefaultListModel<String> projectModel;
   ArrayList<String> project;
   ArrayList<String> employee;
  DefaultListModel<String> employeeModel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton assignButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel employeeLabel;
    private javax.swing.JList employeeList;
    private javax.swing.JButton exitButton;
    private javax.swing.JComboBox hoursComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JList projectList;
    // End of variables declaration//GEN-END:variables
}
