/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * MainWindow.java
 *
 * Created on Jun 26, 2012, 3:04:38 PM
 */
package universal.g.code.sender;

import gnu.io.CommPortIdentifier;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.List;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author wwinder
 */
public class MainWindow extends javax.swing.JFrame {

    /** Creates new form MainWindow */
    public MainWindow() {
        initComponents();
        initProgram();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lineBreakGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        commandLabel = new javax.swing.JLabel();
        lineBreakNR = new javax.swing.JRadioButton();
        lineBreakRN = new javax.swing.JRadioButton();
        commandTextField = new javax.swing.JTextField();
        commPortComboBox = new javax.swing.JComboBox();
        refreshButton = new javax.swing.JButton();
        openButton = new javax.swing.JButton();
        closeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        consoleTextArea = new javax.swing.JTextArea();
        scrollWindowCheckBox = new javax.swing.JCheckBox();
        jPanel2 = new javax.swing.JPanel();
        browseButton = new javax.swing.JButton();
        printButton = new javax.swing.JButton();
        stopButton = new javax.swing.JButton();
        fileTextField = new javax.swing.JTextField();
        fileLabel = new javax.swing.JLabel();
        overrideSpeedCheckBox = new javax.swing.JCheckBox();
        overrideSpeedValueSpinner = new javax.swing.JSpinner();
        sentRowsLabel = new javax.swing.JLabel();
        sentRowsValueLabel = new javax.swing.JLabel();
        rowsLabel = new javax.swing.JLabel();
        rowsValueLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Serial"));

        commandLabel.setText("Command");

        lineBreakGroup.add(lineBreakNR);
        lineBreakNR.setText("\\n\\r");

        lineBreakGroup.add(lineBreakRN);
        lineBreakRN.setSelected(true);
        lineBreakRN.setText("\\r\\n");

        commandTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commandTextFieldActionPerformed(evt);
            }
        });

        commPortComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                commPortComboBoxActionPerformed(evt);
            }
        });

        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        closeButton.setText("Close");
        closeButton.setEnabled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(commandTextField)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(commandLabel)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(lineBreakNR)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(lineBreakRN))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(commPortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(refreshButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 25, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(openButton)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(closeButton)
                        .add(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(lineBreakNR)
                        .add(lineBreakRN))
                    .add(commandLabel))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(commandTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(commPortComboBox, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(refreshButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 24, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(openButton)
                    .add(closeButton))
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        consoleTextArea.setColumns(20);
        consoleTextArea.setRows(5);
        jScrollPane2.setViewportView(consoleTextArea);

        scrollWindowCheckBox.setText("Scroll output window");
        scrollWindowCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scrollWindowCheckBoxActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("File transfer"));

        browseButton.setText("Browse");
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        printButton.setText("Print");
        printButton.setEnabled(false);

        stopButton.setText("Stop");
        stopButton.setEnabled(false);

        fileTextField.setEnabled(false);

        fileLabel.setText("File");

        overrideSpeedCheckBox.setText("Override speed");
        overrideSpeedCheckBox.setEnabled(false);

        overrideSpeedValueSpinner.setModel(new javax.swing.SpinnerNumberModel(Integer.valueOf(60), Integer.valueOf(0), null, Integer.valueOf(1)));
        overrideSpeedValueSpinner.setEnabled(false);

        sentRowsLabel.setText("Sent rows:");

        sentRowsValueLabel.setText("0");

        rowsLabel.setText("Rows:");

        rowsValueLabel.setText("0");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(fileTextField)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(browseButton))
                    .add(jPanel2Layout.createSequentialGroup()
                        .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(fileLabel)
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(printButton, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 68, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(stopButton)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(overrideSpeedValueSpinner, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(overrideSpeedCheckBox))
                            .add(jPanel2Layout.createSequentialGroup()
                                .add(sentRowsLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(sentRowsValueLabel)
                                .add(49, 49, 49)
                                .add(rowsLabel)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(rowsValueLabel)))
                        .add(0, 231, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel2Layout.createSequentialGroup()
                .add(fileLabel)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fileTextField, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(browseButton))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(printButton)
                    .add(stopButton)
                    .add(overrideSpeedCheckBox)
                    .add(overrideSpeedValueSpinner))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(sentRowsLabel)
                    .add(sentRowsValueLabel)
                    .add(rowsLabel)
                    .add(rowsValueLabel))
                .add(8, 8, 8))
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jScrollPane2)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(scrollWindowCheckBox)
                            .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(layout.createSequentialGroup()
                        .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(scrollWindowCheckBox))
                    .add(jPanel2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jScrollPane2, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 261, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void scrollWindowCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scrollWindowCheckBoxActionPerformed
        DefaultCaret caret = (DefaultCaret)consoleTextArea.getCaret();
        if (scrollWindowCheckBox.isSelected()) {
            System.out.println("SCROLL ON...");
          caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
          consoleTextArea.setCaretPosition(consoleTextArea.getDocument().getLength());
        } else {
            System.out.println("SCROLL OFF...");
            caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        }
    }//GEN-LAST:event_scrollWindowCheckBoxActionPerformed

    private void commandTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commandTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commandTextFieldActionPerformed

    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        System.out.println("Trying to open port: '"+commPortComboBox.getSelectedItem().toString()+"'");
        commPort.openCommPort(commPortComboBox.getSelectedItem().toString(), 9600, consoleTextArea);
        /*
        serialPort1.PortName = comboBox1.SelectedItem.ToString();
        serialPort1.BaudRate = 9600;

        serialPort1.Open();
        if (serialPort1.IsOpen) {
            comboBox1.Enabled = false;
            ReloadBtn.Enabled = false;
            StartBtn.Enabled = false;
            StopBtn.Enabled = true;
            textBox3.ReadOnly = false;
            enableControlsForPrinting();
        }
        */
    }//GEN-LAST:event_openButtonActionPerformed

    private void commPortComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_commPortComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_commPortComboBoxActionPerformed

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        loadPortSelector();
    }//GEN-LAST:event_refreshButtonActionPerformed

    private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            fileTextField.setText(fileChooser.getSelectedFile().getAbsolutePath());
            processFile(fileChooser.getSelectedFile());
        } else {
            System.out.println("Open command cancelled by user.");
        }
    }//GEN-LAST:event_browseButtonActionPerformed
    
    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed

        /*
        if (serialPort1.IsOpen) {
            serialPort1.Close();
            comboBox1.Enabled = true;
            ReloadBtn.Enabled = true;
            StartBtn.Enabled = true;
            StopBtn.Enabled = false;
            textBox3.ReadOnly = true;
            transfer = false;
            disableControlsForPrinting();
            BrowseBtn.Enabled = true;
            stopPrintBtn.Enabled = false;
        }*/
    }//GEN-LAST:event_closeButtonActionPerformed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    
    private void initProgram() {
        loadPortSelector();
        fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new GcodeFileTypeFilter());
        commPort = new CommPortHelper();
        
        // Hook into command text field so that enter sends the command.
        commandTextField.addActionListener(
                new ActionListener(){
                    public void actionPerformed(ActionEvent e){
                        String str = commandTextField.getText().replaceAll("(\\r|\\n)", "");
                        consoleTextArea.append(">>> "+str+"\n");
                        commPort.sendCommandToComm(str + getNewline());
                        commandTextField.setText("");
                    }});
    }
    // Utility functions.
    
    // Scans for comm ports and puts them in the comm port combo box.
    private void loadPortSelector() {
        System.out.println("loadPortSelector...");
        commPortComboBox.removeAllItems();
        
        List<CommPortIdentifier> portList =
                CommPortHelper.getSerialPortList();
        
        if (portList.size() < 1) {
            JOptionPane.showMessageDialog(new JFrame(), "No serial ports found.", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            // Sort?
            //java.util.Collections.sort(portList);

            java.util.Iterator<CommPortIdentifier> portIter = portList.iterator();

            while ( portIter.hasNext() ) 
            {
                CommPortIdentifier portIdentifier = portIter.next();
                commPortComboBox.addItem(portIdentifier.getName());
            }
            
            commPortComboBox.setSelectedIndex(0);
        }
    }
    
    // Processes input file.
    // This could theoretically scan it for errors, but GcodeSender just counts
    // how many lines are in it.
    private void processFile(File file) {
        gcodeFile = file;
        Integer numRows = 0;
        try {
            InputStream is = new BufferedInputStream(new FileInputStream(file));

            byte[] c = new byte[1024];

            int readChars;
            while ((readChars = is.read(c)) != -1) {
                for (int i = 0; i < readChars; ++i) {
                    if (c[i] == '\n')
                        ++numRows;
                }
            }
            
            is.close();
        }catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(new JFrame(), "Could not find file '"+file.getName()+"'", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        } catch (IOException e) {
            System.out.println( "Caught an exception in processFile IOException." );
            //e.printStackTrace();
            JOptionPane.showMessageDialog(new JFrame(), "Unknown IOException: "+e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        rowsValueLabel.setText(numRows.toString());
    }
    
    private String getNewline() {
        if (lineBreakNR.isSelected())
            return "\n\r";
        else if (lineBreakRN.isSelected())
            return "\r\n";
        else
            return "wtfbbq";
    }
    
    private javax.swing.JFileChooser fileChooser;
    private java.io.File gcodeFile;
    private CommPortHelper commPort;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browseButton;
    private javax.swing.JButton closeButton;
    private javax.swing.JComboBox commPortComboBox;
    private javax.swing.JLabel commandLabel;
    private javax.swing.JTextField commandTextField;
    private javax.swing.JTextArea consoleTextArea;
    private javax.swing.JLabel fileLabel;
    private javax.swing.JTextField fileTextField;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup lineBreakGroup;
    private javax.swing.JRadioButton lineBreakNR;
    private javax.swing.JRadioButton lineBreakRN;
    private javax.swing.JButton openButton;
    private javax.swing.JCheckBox overrideSpeedCheckBox;
    private javax.swing.JSpinner overrideSpeedValueSpinner;
    private javax.swing.JButton printButton;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel rowsLabel;
    private javax.swing.JLabel rowsValueLabel;
    private javax.swing.JCheckBox scrollWindowCheckBox;
    private javax.swing.JLabel sentRowsLabel;
    private javax.swing.JLabel sentRowsValueLabel;
    private javax.swing.JButton stopButton;
    // End of variables declaration//GEN-END:variables
}
