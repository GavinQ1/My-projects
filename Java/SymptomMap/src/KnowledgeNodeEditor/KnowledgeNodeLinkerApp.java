package KnowledgeNodeEditor;

import Models.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Gavin
 */
public class KnowledgeNodeLinkerApp extends javax.swing.JDialog { 
    public static final void run(KnowledgeMap map, KnowledgeNode node) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnowledgeNodeLinkerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        new KnowledgeNodeLinkerApp(map, node).setVisible(true);
    }
    
    private KnowledgeMap map;
    private KnowledgeNode node, selected;
    private boolean chosen = false; // safe lock for passing selected item
    /**
     * Creates new form KnowledgeNodeAppendApp
     */
    public KnowledgeNodeLinkerApp(KnowledgeMap map, KnowledgeNode node) {
        this.map = map;
        this.node = node;
        this.selected = null;
        initComponents();
        setModal(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        sourceRaido = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        destinationRadio = new javax.swing.JRadioButton();
        neighborRadio = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Knowledge Node Linker");

        DefaultComboBoxModel<String> comboBoxModel = new javax.swing.DefaultComboBoxModel<>();
        comboBoxModel.addElement("Choose a catagory");
        for (String s : map.getMap().keySet()) comboBoxModel.addElement(s);
        jComboBox1.setModel(comboBoxModel);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jList1.setModel(listModelFactory(map.getAllKnowledgeNodes())
        );
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        buttonGroup1.add(sourceRaido);
        sourceRaido.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        sourceRaido.setSelected(true);
        sourceRaido.setText(node.getSources().getName());

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        jLabel1.setText("Add to " + node.getName() + " as a");

        buttonGroup1.add(destinationRadio);
        destinationRadio.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        destinationRadio.setText(node.getDestinations().getName());

        buttonGroup1.add(neighborRadio);
        neighborRadio.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        neighborRadio.setText(node.getNeighbors().getName());

        jLabel2.setFont(new java.awt.Font("华文细黑", 0, 12)); // NOI18N
        jLabel2.setText("Avaliable Nodes");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox1, 0, 120, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(destinationRadio)
                                    .addComponent(sourceRaido)
                                    .addComponent(neighborRadio)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sourceRaido)
                        .addGap(18, 18, 18)
                        .addComponent(destinationRadio)
                        .addGap(18, 18, 18)
                        .addComponent(neighborRadio)
                        .addGap(68, 68, 68)
                        .addComponent(jButton1))
                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 412, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String scope = (String) jComboBox1.getSelectedItem();
            jComboBox1.setSelectedItem(scope);
            updateListItems(scope);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void updateListItems(String scope) {
        ArrayList<KnowledgeNode> a;
        if (scope.equals("Choose a catagory"))
            a = map.getAllKnowledgeNodes();
        else {
            a = map.getCatagory(scope);
            Collections.sort(a, KnowledgeNode.comparatorBySignificance());
        }
        jList1.setModel(listModelFactory(a));
    }
    
    private AbstractListModel<KnowledgeNode> listModelFactory(final ArrayList<KnowledgeNode> accounts) {
        return new AbstractListModel<KnowledgeNode>() {
            ArrayList<KnowledgeNode> accountList = accounts;

            public int getSize() {
                return accountList.size();
            }

            public KnowledgeNode getElementAt(int i) {
                return accountList.get(i);
            }
        };
    }
    
    private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked
        selected = jList1.getSelectedValue();
        if (evt.getClickCount() == 2) 
            KnowledgeNodeWikiApp.run(selected);
    }//GEN-LAST:event_jList1MouseClicked

    private void checkBeforeSubmit() {
        if (selected == null)
            throw new InvalidInputException("Select a node before submit");
        if (selected == node)
            throw new InvalidInputException("Must not be a same node");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            checkBeforeSubmit();
            if (this.sourceRaido.isSelected()) 
                node.addSource(selected);
            else if (this.destinationRadio.isSelected())
                node.addDestination(selected);
            else
                node.addNeighbor(selected);
            chosen = true;
            dispose();
        } catch(InvalidInputException e) {
            GeneralController.errorMessageBox(e.toString());
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    public void run() {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KnowledgeNodeLinkerApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        setVisible(true);
    }
    
    public KnowledgeNode getSelected() {
        if (chosen)
            return selected;
        return null;
    }
    
    public int getExpandedGroup() {
        if (this.sourceRaido.isSelected()) 
            return 1;
        else if (this.destinationRadio.isSelected())
            return 2;
        else
            return 3;
    }
    
    // unit test
    public static void main(String args[]) {
        KnowledgeNode a = new KnowledgeNode("A", "Character", "A", "First", "Source", "Destination", "Neighbor");
        KnowledgeNode b = new KnowledgeNode("B", "Character", "B", "Second", "Source", "Destination", "Neighbor");
        KnowledgeNode c = new KnowledgeNode("C", "String", "C", "Third", "Source", "Destination", "Neighbor");
        KnowledgeNode d = new KnowledgeNode("D", "Character", "D", "Fourth", "Source", "Destination", "Neighbor");
        KnowledgeNode e = new KnowledgeNode("E", "Character", "E", "Fourth", "Source", "Destination", "Neighbor");
        KnowledgeNode f = new KnowledgeNode("F", "Character", "F", "Fourth", "Source", "Destination", "Neighbor");

        
        KnowledgeMap map = new KnowledgeMap("K");
        map.addCatagory("Character");
        map.addCatagory("String");
        map.addKnowledgeNodeTo("Character", a);
        map.addKnowledgeNodeTo("Character", b);
        map.addKnowledgeNodeTo(c.getCatagory(), c);
        map.addKnowledgeNodeTo("Character", d);
        map.addKnowledgeNodeTo("Character", e);
        
        new KnowledgeNodeLinkerApp(map, a).setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton destinationRadio;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<KnowledgeNode> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton neighborRadio;
    private javax.swing.JRadioButton sourceRaido;
    // End of variables declaration//GEN-END:variables
}
