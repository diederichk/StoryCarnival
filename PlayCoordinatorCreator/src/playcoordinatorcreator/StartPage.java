/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package playcoordinatorcreator;

import java.awt.FlowLayout;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author alexa
 */
public class StartPage extends javax.swing.JFrame {

    /**
     * Creates new form StartPage
     */
    final JFileChooser fc = new JFileChooser(); //used for importing images
    public ArrayList<File> roles = new ArrayList<File>(); //list of roles, populated with image files
    public ArrayList<File> explanations = new ArrayList<File>(); //list of explanations for roles, populated with image files
    public ArrayList people = new ArrayList(); //list of students
    
    public ArrayList<JLabel> labels = new ArrayList<JLabel>(); //list of images, used to undraw when a picture is deleted
    public ArrayList<JButton> buttons = new ArrayList<JButton>(); //list of buttons, used to undraw when a button is deleted
    
    public File background = null; //background or context image file
    public JLabel backlabel = null; //background or context image
    
    public StartPage() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jButton3 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanel2 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jProgressBar2 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Play Coordinator Setup"));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("Class roster (1 name per line)");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextField1.setText("Class title");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel2.setText("role images- 400px by 400px (.png)");

        jLabel3.setText("context image- 2200px by 1238px (.png)  ");

        jLabel4.setText("explanation images- 2200px by 1238px (.png)");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setText("Recommended formats");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel5))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        jTabbedPane1.addTab("Class Roster", jPanel1);

        jProgressBar1.setMaximum(12);
        jProgressBar1.setToolTipText("");

        jButton3.setText("Import");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jPanel2.setMaximumSize(new java.awt.Dimension(32767, 400));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 627, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 353, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanel2);

        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jProgressBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(10, 10, 10)
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jProgressBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton3)
                        .addComponent(jButton4)))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Roles", jPanel3);

        jButton5.setText("Import");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Delete");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(487, Short.MAX_VALUE)
                        .addComponent(jButton6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Context", jPanel4);

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jProgressBar2.setMaximum(9);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jProgressBar2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jProgressBar2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void explanationButtonActionPerformed(Object e){
        //handles clicks of explanation buttons
        JButton button = buttons.get(buttons.indexOf(e)); //get the button that was clicked
        if (explanations.get(buttons.indexOf(e)) == null){ //if the corresponding explanation for the button has not been added yet
            int returnVal = fc.showOpenDialog(jPanel1); //open file picker
            if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
                File file = fc.getSelectedFile(); //get the selected file
                explanations.set(buttons.indexOf(e), file); //add it to the list of explanations
                button.setText("explanation set, click to delete"); //change the button text to reflect that the image has been added
            }
        }
        else{ //if the corresponding explanation has already been added
            explanations.set(buttons.indexOf(e),null); //remove the explanation from the list of explanations
            button.setText("pick explanation"); //change the button text to reflect that the image has been deleted
        }
    }
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //handles clicks of save button
        
        //loop through the explanations list to make sure all explanations have been set
        boolean explanationsSet = true;
        for(File explanation:explanations){
            if(explanation == null) explanationsSet = false;
        }
        
        //make sure there is a class title, between 1 and 12 roles, explanations for those roles and a context
        if(jTextField1.getText().equals("Class title")) JOptionPane.showMessageDialog(null, "Please set a class title before saving","class title not found",JOptionPane.WARNING_MESSAGE);
        else if(background == null) JOptionPane.showMessageDialog(null, "Please set a context before saving","context not found",JOptionPane.WARNING_MESSAGE);
        else if(roles.size() == 0) JOptionPane.showMessageDialog(null, "Please set at least 1 role","roles not found",JOptionPane.WARNING_MESSAGE);
        else if(roles.size() > 12) JOptionPane.showMessageDialog(null, "Please decrease number of roles to 12","too many roles selected",JOptionPane.WARNING_MESSAGE);
        else if(!explanationsSet) JOptionPane.showMessageDialog(null, "Please set all explanations before saving","explanations not set",JOptionPane.WARNING_MESSAGE);
        else{ //if all the checks are passed
            try {
                String current = new java.io.File( "." ).getCanonicalPath(); //find working directory
                
                //make folders for pictures and audio
                File folder = new File(current+"\\"+jTextField1.getText());
                if (!folder.exists()) {
                    if (folder.mkdir()) {
                        System.out.println("Directory is created!");
                    } else {
                        System.out.println("Failed to create directory!");
                    }
                }
                
                folder = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3");
                if (!folder.exists()) {
                    if (folder.mkdir()) {
                        System.out.println("Directory is created!");
                    } else {
                        System.out.println("Failed to create directory!");
                    }
                }
                
                //copy background
                File outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\story1-newratio-00.png");
                copyFile(background, outfile);
                jProgressBar2.setValue(1);
                
                //copy roles
                for(int i = 0; i < roles.size(); i++){
                    if(i<9) outfile = new File(current+"\\"+jTextField1.getText()+"\\"+"Story_Images_3\\role"+(i+1)+".png");
                    copyFile(roles.get(i),outfile);
                }
                jProgressBar2.setValue(2);
                
                //copy explanations
                for(int i = 0; i < explanations.size(); i++){
                    if(i<9) outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\story1-newratio-0"+(i+1)+".png");
                    else outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\story1-newratio-"+(i+1)+".png");
                    copyFile(explanations.get(i),outfile);
                }
                jProgressBar2.setValue(3);
                
                //copy arrows
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\check_arrow.png");
                File infile = new File(current+"\\resources\\check_arrow.png");
                copyFile(infile,outfile);
                jProgressBar2.setValue(4);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\left_arrow.png");
                infile = new File(current+"\\resources\\left_arrow.png");
                copyFile(infile,outfile);
                jProgressBar2.setValue(5);
                
                outfile = new File(current+"\\"+jTextField1.getText()+"\\Story_Images_3\\right_arrow.png");
                infile = new File(current+"\\resources\\right_arrow.png");
                copyFile(infile,outfile);
                jProgressBar2.setValue(6);
                
                //copy html file
                outfile = new File(current+"\\"+jTextField1.getText()+"\\playcoordinator.html");
                infile = new File(current+"\\resources\\playcoordinator.html");
                copyFile(infile,outfile);
                jProgressBar2.setValue(7);
                
                //copy css file
                outfile = new File(current+"\\"+jTextField1.getText()+"\\storystyle.css");
                infile = new File(current+"\\resources\\storystyle.css");
                copyFile(infile,outfile);
                jProgressBar2.setValue(8);
                
                //import javascript file
                infile = new File(current+"\\resources\\playcoordinator.html.0.js");
                outfile = new File(current+"\\"+jTextField1.getText()+"\\playcoordinator.html.0.js");
                
                if(!outfile.exists()) { //if the output location doesn't have a javascript file
                    outfile.createNewFile(); //make a new javascript file
                }
                
                //get list of students
                ArrayList<String> people = new ArrayList<String>();
                String lines[] = jTextArea1.getText().split("\\n"); //split the string of students into an array
                for(String line: lines) {
                    people.add(line); //add contents of array into an arraylist
                }
                
                String peopleList = "var people = ["; //start the string for the list of people
                for(int i = 0; i < people.size(); i++){ //for every person in the list
                    peopleList = peopleList + "{name:\"" + people.get(i) + "\",role:-1}"; //add them to the output string
                    if(i < people.size()-1) peopleList = peopleList +","; //if this person is not the last person add a comma
                    else peopleList = peopleList + "];"; //if this person is the last person finish the string
                }
                try(BufferedReader br = new BufferedReader(new FileReader(infile))) { //open a file reader for the reference javascript file
                    try(FileWriter fw = new FileWriter(outfile)){ //open a file writer for the new javasctipt file
                        for(String line; (line = br.readLine()) != null; ) { //loop through the reference file by line
                            if(line.contains("var people = [")) line = peopleList; //if this line is the list of people, replace with the new list of people
                            if(line.contains("var NUM_ROLES = ")) line = "var NUM_ROLES = "+roles.size()+";"; //if this line says how many roles there are, replace with the correct number
                            fw.write(line+"\n"); //write the line to the new javascript file
                        }
                    }
                }
                jProgressBar2.setValue(9);
                JOptionPane.showMessageDialog(null, "Save succesful"); //if everything worked, report to user
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the save directory can't be made or files can't be saved)
                JOptionPane.showMessageDialog(null, "Save failed"); //tell the user the save didn't work
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        //handles clicks of delete context button
        if(background != null){ //if there is a context
            jPanel5.remove(backlabel); //undraw the context
            background = null; //remove the context file
            backlabel = null; //remove the context image
            jPanel5.revalidate(); //redraw the page
            jPanel5.repaint(); //redraw the background of the page
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //handles clicks of add context button
        if(background != null) return; //if there already is a context, do nothing
        int returnVal = fc.showOpenDialog(jPanel5); //open file picker
        if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
            background = fc.getSelectedFile(); //import the file
        }

        Image image = null;
        try {
            image = ImageIO.read(background); //convert file to image
        } catch (IOException ex) {
            Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the file is not an image)
            return;
        }
        image = image.getScaledInstance(600, 338, Image.SCALE_DEFAULT); //scale the image down to fit in the window
        ImageIcon icon = new ImageIcon(image); //make an image icon from the image
        jPanel5.setLayout(new FlowLayout()); //set the layout for the image

        backlabel = new JLabel(); //make a new label
        backlabel.setIcon(icon); //add the image icon to a label

        jPanel5.add(backlabel); //draw the label
        jPanel5.revalidate(); //redraw and scale page
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //handles clicks of delete role button
        if(labels.size() > 0){ //if there are roles
            jPanel2.remove(labels.get(labels.size()-1)); //undraw the label (image) of the role
            jPanel2.remove(buttons.get(buttons.size()-1)); //undraw the button of the role

            roles.remove(roles.size()-1); //remove the role from the list of roles
            labels.remove(labels.size()-1); //remove the corresponding label from the list of labels
            buttons.remove(buttons.size()-1); //remove the corresponding button from the list of buttons
            explanations.remove(explanations.size()-1); //remove the corresponding explanation from the list of explanations

            jPanel2.revalidate(); //redraw the page
            jPanel2.repaint(); //redraw the background of the page

            jProgressBar1.setValue(roles.size()); //show that the role has been deleted on the progress bar
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //handles clicks of add role button
        if(roles.size() >= 12) return; //the player can't display more than 12 roles, so prevent the user from adding more

        int returnVal = fc.showOpenDialog(jPanel1); //open file picker
        if(returnVal == JFileChooser.APPROVE_OPTION){ //when a file is selected
            File file = fc.getSelectedFile();
            roles.add(file); //add the file to roles
            explanations.add(null); //add a space to explanations (to be filled later)
            jProgressBar1.setValue(roles.size()); //show that the role has been added on the progress bar
            Image image = null;
            GridBagConstraints c = new GridBagConstraints(); //used to position image
            c.insets = new Insets(3,3,3,3); //specifies margins around image
            try {
                image = ImageIO.read(roles.get(roles.size()-1)); //convert file to image
            } catch (IOException ex) {
                Logger.getLogger(StartPage.class.getName()).log(Level.SEVERE, null, ex); //BAD THINGS (can happen if the file is not an image)
                return;
            }
            image = image.getScaledInstance(200, 200, Image.SCALE_DEFAULT); //scale the image down to fit in the window
            ImageIcon icon = new ImageIcon(image); //make an image icon from the image

            if(roles.size() == 1){
                jPanel2.setLayout(new GridBagLayout()); // if this is the first image, set up the image layout
            }

            JLabel picLabel = new JLabel(); //make a new label
            picLabel.setIcon(icon); //add the image icon to the label
            picLabel.setText(roles.get(roles.size()-1).getName()); //set the label text to the filename of the image

            JButton picButton = new JButton(); //make a new button (for picking an explanation)
            picButton.setText("pick explanation");

            picButton.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){ //if the button is clicked, handle in explanationButtonActionPerformed
                    explanationButtonActionPerformed(e.getSource()); //pass the button to explanationButtonActionPerformed
                }
            });

            labels.add(picLabel); //add the new label to the list of labels
            buttons.add(picButton); //add the new button to the list of buttons

            //set position of label in grid
            c.gridx = 0;
            c.gridy = (roles.size()-1)*2;
            jPanel2.add(picLabel,c); //draw image

            //set position of button in grid
            c.gridx = 1;
            jPanel2.add(picButton,c); //draw button

            jPanel2.revalidate(); //redraw and scale page
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    
    public static void copyFile(File sourceFile, File destFile) throws IOException {
        if(!destFile.exists()) {
            destFile.createNewFile();
        }

        FileChannel source = null;
        FileChannel destination = null;

        try {
            source = new FileInputStream(sourceFile).getChannel();
            destination = new FileOutputStream(destFile).getChannel();
            destination.transferFrom(source, 0, source.size());
        }
        finally {
            if(source != null) {
                source.close();
            }
            if(destination != null) {
                destination.close();
            }
        }
    }
    
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JProgressBar jProgressBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}