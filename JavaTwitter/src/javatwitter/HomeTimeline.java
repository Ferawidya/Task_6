/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javatwitter;

import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author Ferawidya
 */
public class HomeTimeline extends javax.swing.JFrame implements View {

    /**
     * Creates new form HomeTimeline
     */
    public HomeTimeline() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        txAreaTimeline = new javax.swing.JTextArea();
        btnCompose = new javax.swing.JButton();
        btnFollow = new javax.swing.JButton();
        btnRefresh = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txAreaTimeline.setEditable(false);
        txAreaTimeline.setColumns(20);
        txAreaTimeline.setRows(5);
        jScrollPane1.setViewportView(txAreaTimeline);

        btnCompose.setText("Compose");

        btnFollow.setText("Follow User");

        btnRefresh.setText("Refresh");

        btnExit.setText("Exit");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCompose)
                        .addGap(18, 18, 18)
                        .addComponent(btnFollow)
                        .addGap(18, 18, 18)
                        .addComponent(btnRefresh)
                        .addGap(18, 18, 18)
                        .addComponent(btnExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCompose)
                    .addComponent(btnFollow)
                    .addComponent(btnRefresh)
                    .addComponent(btnExit))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */

    public JButton getBtnCompose() {
        return btnCompose;
    }

    public JButton getBtnExit() {
        return btnExit;
    }

    public JButton getBtnFollow() {
        return btnFollow;
    }

    public JButton getBtnRefresh() {
        return btnRefresh;
    }
    public void setTimeline(String s){
        txAreaTimeline.setText(s);
    }
    @Override
    public void addListener(ActionListener e){
        btnCompose.addActionListener(e);
        btnExit.addActionListener(e);
        btnFollow.addActionListener(e);
        btnRefresh.addActionListener(e);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCompose;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFollow;
    private javax.swing.JButton btnRefresh;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txAreaTimeline;
    // End of variables declaration//GEN-END:variables
}
