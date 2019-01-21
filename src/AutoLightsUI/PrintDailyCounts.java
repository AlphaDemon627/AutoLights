/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AutoLightsUI;

import autolightstests.ArrayTime;
import autolightstests.PrintTest;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Desktop;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author Mido Austin
 */
public class PrintDailyCounts extends  javax.swing.JFrame {
    DailyCountsData dc = new DailyCountsData();
    DBData dbd = new DBData();
    /**
     * Creates new form PrintDailyCounts
     */
    public PrintDailyCounts() {
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

        PrintMon = new javax.swing.JButton();
        PrintTue = new javax.swing.JButton();
        PrintWed = new javax.swing.JButton();
        PrintThur = new javax.swing.JButton();
        PrintFri = new javax.swing.JButton();
        PrintSat = new javax.swing.JButton();
        Return = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PrintMon.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintMon.setText("Print Monday Counts");
        PrintMon.setSize(10, 100);
        PrintMon.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintMonActionPerformed(evt);
            }
        });

        PrintTue.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintTue.setText("Print Tuesday Counts");
        PrintTue.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintTue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintTueActionPerformed(evt);
            }
        });

        PrintWed.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintWed.setText("Print Wednesday Counts");
        PrintWed.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintWed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintWedActionPerformed(evt);
            }
        });

        PrintThur.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintThur.setText("Print Thursday Counts");
        PrintThur.setMaximumSize(new java.awt.Dimension(1, 23));
        PrintThur.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintThur.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintThurActionPerformed(evt);
            }
        });

        PrintFri.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintFri.setText("Print Friday Counts");
        PrintFri.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintFri.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintFriActionPerformed(evt);
            }
        });

        PrintSat.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        PrintSat.setText("Print Saturday Counts");
        PrintSat.setPreferredSize(new java.awt.Dimension(405, 23));
        PrintSat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrintSatActionPerformed(evt);
            }
        });

        Return.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        Return.setText("DONE");
        Return.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReturnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PrintTue, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrintMon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrintWed, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrintThur, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrintFri, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(PrintSat, javax.swing.GroupLayout.DEFAULT_SIZE, 605, Short.MAX_VALUE)
            .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(PrintMon, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintTue, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintWed, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintThur, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintFri, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PrintSat, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addGap(53, 53, 53)
                .addComponent(Return, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrintMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintMonActionPerformed
        
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"MondayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.MonCounts.getRowCount(); a++){
                
                String move_id = dc.MonCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.MonCounts.getValueAt(a, 3).toString();
                String date = dc.MonCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.MonCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.MonCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.MonCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Monday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsMondayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_PrintMonActionPerformed

    private void PrintSatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintSatActionPerformed
        
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"SaturdayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.SatCounts.getRowCount(); a++){
                
                String move_id = dc.SatCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.SatCounts.getValueAt(a, 3).toString();
                String date = dc.SatCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.SatCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.SatCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.SatCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Saturday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsSaturdayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintSatActionPerformed

    private void ReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReturnActionPerformed
        this.dispose();
        
        if(new DailyCountsData().isVisible()){
            
        }else{
            new DailyCountsData().setVisible(true);
        }
    }//GEN-LAST:event_ReturnActionPerformed

    private void PrintTueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintTueActionPerformed
        
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"TuesdayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.TueCounts.getRowCount(); a++){
                
                String move_id = dc.TueCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.TueCounts.getValueAt(a, 3).toString();
                String date = dc.TueCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.TueCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.TueCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.TueCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Tuesday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsTuesdayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintTueActionPerformed

    private void PrintWedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintWedActionPerformed
       
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"WednesdayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.WedCounts.getRowCount(); a++){
                
                String move_id = dc.WedCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.WedCounts.getValueAt(a, 3).toString();
                String date = dc.WedCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.WedCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.WedCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.WedCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Wednesday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsWednesdayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintWedActionPerformed

    private void PrintThurActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintThurActionPerformed
        
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"ThursdayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.ThuCounts.getRowCount(); a++){
                
                String move_id = dc.ThuCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.ThuCounts.getValueAt(a, 3).toString();
                String date = dc.ThuCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.ThuCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.ThuCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.ThuCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Thursday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsThursdayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintThurActionPerformed

    private void PrintFriActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrintFriActionPerformed
        
        String path = "";
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = jfc.showSaveDialog(this);
        
        if(x == JFileChooser.APPROVE_OPTION){
            path= jfc.getSelectedFile().getPath();
        }
        
        Document doc = new Document();
        
        try {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"FridayCounts.pdf"));
            doc.open();
            
            PdfPTable tbl = new PdfPTable(7);
            
            //cell headers
            tbl.addCell("Movement Id");
            tbl.addCell("Time Id");
            tbl.addCell("Day");
            tbl.addCell("Date");
            tbl.addCell("Highest HGV Count");
            tbl.addCell("Lowest LGV Count");
            tbl.addCell("Total Vehicle Count");
            
            for (int a=0; a<dc.FriCounts.getRowCount(); a++){
                
                String move_id = dc.FriCounts.getValueAt(a, 1).toString();
                String time_id = time.get(a);
                String day = dc.FriCounts.getValueAt(a, 3).toString();
                String date = dc.FriCounts.getValueAt(a, 4).toString();
                String highestHgv = dc.FriCounts.getValueAt(a, 5).toString();
                String highestLgv = dc.FriCounts.getValueAt(a, 6).toString();
                String totalVeh = dc.FriCounts.getValueAt(a, 7).toString();
                
                if(time_id !=""){
                    tbl.addCell(move_id);
                    tbl.addCell(time_id);
                    tbl.addCell(day);
                    tbl.addCell(date);
                    tbl.addCell(highestHgv);
                    tbl.addCell(highestLgv);
                    tbl.addCell(totalVeh);
                }
            }
            
            doc.add(tbl);
            int n = JOptionPane.showConfirmDialog(
                            this, "pdf file generated for Friday counts \n would you like to open?",
                            "",
                            JOptionPane.YES_NO_OPTION);
            if (n == JOptionPane.YES_OPTION) {
                doc.close();
                try {
                    //Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    //open file directly
                    if (Desktop.isDesktopSupported()) {
                        try {
                            File myFile = new File("C:\\Users\\Mido Austin\\DocumentsFridayCounts.pdf");
                            Desktop.getDesktop().open(myFile);
                        } catch (IOException ex) {
                            // no application registered for PDFs
                        }
                    }else{
                        //open file location
                        JOptionPane.showMessageDialog(null, "no suitable application found", "ERROR MESSAGE", JOptionPane.ERROR_MESSAGE);
                        Desktop.getDesktop().open(new File("C:\\Users\\Mido Austin"));
                    }
   
                } catch (IOException ex) {
                    Logger.getLogger(HighestCountsData.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else if (n == JOptionPane.NO_OPTION) {
                doc.close();
            } else {
                doc.close();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (DocumentException ex) {
            Logger.getLogger(PrintTest.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_PrintFriActionPerformed

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
            java.util.logging.Logger.getLogger(PrintDailyCounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintDailyCounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintDailyCounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintDailyCounts.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                PrintDailyCounts pdc = new PrintDailyCounts();
                pdc.fillArray();
                pdc.setVisible(true);
            }
        });
    }
    public void fillArray(){
        for(int a = 31; a <90; a++){
            time_slot = password(a);
            for(int i=0; i<12;i++){
                time.add(time_slot); 
            }
        }
    }
    public String password(int time){
        String querry = "SELECT time_slot FROM time WHERE time_id="+time+";";
        Connection con;
        pass="";
        con = new DBConnector().connect();
        
        PreparedStatement pst;
        try {
            pst = con.prepareStatement(querry);
            ResultSet rs = pst.executeQuery();
                while(rs.next()){
                 pass = rs.getString("time_slot");
                }
            //System.out.println(pass);
            return pass;
        } catch (SQLException ex) {
            Logger.getLogger(LogIn.class.getName()).log(Level.SEVERE, null, ex);
            return "";
        }
    }
    
    Connection con = new DBConnector().connect();
    String pass;
    String time_slot;
    ArrayList <String> time = new ArrayList();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton PrintFri;
    private javax.swing.JButton PrintMon;
    private javax.swing.JButton PrintSat;
    private javax.swing.JButton PrintThur;
    private javax.swing.JButton PrintTue;
    private javax.swing.JButton PrintWed;
    private javax.swing.JButton Return;
    // End of variables declaration//GEN-END:variables
}