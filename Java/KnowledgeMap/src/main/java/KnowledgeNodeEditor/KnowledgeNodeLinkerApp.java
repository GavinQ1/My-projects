package KnowledgeNodeEditor;

import KnowledgeNodeModels.KnowledgeNodeList;
import KnowledgeNodeModels.KnowledgeMapImpl;
import KnowledgeNodeModels.KnowledgeMap;
import KnowledgeNodeModels.KnowledgeNodeImpl;
import KnowledgeNodeModels.KnowledgeNode;
import Lib.EnhanceAppView;
import Lib.InvalidInputException;
import Lib.GeneralController;
import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.AbstractListModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Gavin
 */
public class KnowledgeNodeLinkerApp extends javax.swing.JDialog { 
    
    private KnowledgeMap map;
    private KnowledgeNode node, selected;
    /**
     * Creates new form KnowledgeNodeAppendApp
     */
    public KnowledgeNodeLinkerApp(KnowledgeMap map, KnowledgeNode node) {
        this.map = map;
        this.node = node;
        this.selected = null;
        initComponents();
        setModal(true);
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                int dialogResult = JOptionPane.showConfirmDialog(null,
                        "Would You Like to Submit the changes and Leave?"
                );
                if (dialogResult == JOptionPane.YES_OPTION) {
                    submitButtonActionPerformed(null);
                } else if (dialogResult ==  JOptionPane.NO_OPTION) {
                    dispose();
                }
            }
        });
        getContentPane().setBackground(Color.white);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup1 = new javax.swing.ButtonGroup();
        nodeCatagoryComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        avaliableNodeList = new javax.swing.JList<>();
        sourceRaido = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();
        destinationRadio = new javax.swing.JRadioButton();
        neighborRadio = new javax.swing.JRadioButton();
        nodeListTitleLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        selectedListString = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Knowledge Node Linker");
        setResizable(false);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        DefaultComboBoxModel<String> comboBoxModel = new javax.swing.DefaultComboBoxModel<>();
        comboBoxModel.addElement("Choose a catagory");
        for (String s : map.getMap().keySet()) comboBoxModel.addElement(s);
        nodeCatagoryComboBox.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        nodeCatagoryComboBox.setModel(comboBoxModel);
        nodeCatagoryComboBox.setBorder(null);
        nodeCatagoryComboBox.setMinimumSize(new java.awt.Dimension(50, 30));
        nodeCatagoryComboBox.setPreferredSize(new java.awt.Dimension(50, 30));
        nodeCatagoryComboBox.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                nodeCatagoryComboBoxItemStateChanged(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 130;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 0, 0);
        getContentPane().add(nodeCatagoryComboBox, gridBagConstraints);

        jScrollPane1.setMinimumSize(new java.awt.Dimension(256, 128));

        avaliableNodeList.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        avaliableNodeList.setFont(new java.awt.Font("华文细黑", 0, 14)); // NOI18N
        avaliableNodeList.setModel(listModelFactory(filterList(
            (ArrayList<KnowledgeNode>) map.getAllKnowledgeNodes())
    )
    );
    avaliableNodeList.setName(""); // NOI18N
    avaliableNodeList.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            avaliableNodeListMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(avaliableNodeList);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.gridheight = 6;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.ipadx = 318;
    gridBagConstraints.ipady = 387;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(6, 6, 69, 0);
    getContentPane().add(jScrollPane1, gridBagConstraints);

    sourceRaido.setBackground(new java.awt.Color(255, 255, 255));
    buttonGroup1.add(sourceRaido);
    sourceRaido.setFont(new java.awt.Font("华文细黑", 1, 14)); // NOI18N
    sourceRaido.setForeground(new java.awt.Color(153, 153, 153));
    sourceRaido.setSelected(true);
    sourceRaido.setText(node.getSources().getName());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 3;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(10, 24, 0, 0);
    getContentPane().add(sourceRaido, gridBagConstraints);

    submitButton.setBackground(new java.awt.Color(51, 51, 51));
    submitButton.setFont(new java.awt.Font("华文琥珀", 0, 14)); // NOI18N
    submitButton.setForeground(new java.awt.Color(204, 204, 204));
    submitButton.setText("Submit");
    submitButton.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            submitButtonActionPerformed(evt);
        }
    });
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 6;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.ipadx = 32;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
    gridBagConstraints.insets = new java.awt.Insets(265, 97, 69, 44);
    getContentPane().add(submitButton, gridBagConstraints);

    destinationRadio.setBackground(new java.awt.Color(255, 255, 255));
    buttonGroup1.add(destinationRadio);
    destinationRadio.setFont(new java.awt.Font("华文细黑", 1, 14)); // NOI18N
    destinationRadio.setForeground(new java.awt.Color(153, 153, 153));
    destinationRadio.setText(node.getDestinations().getName());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 4;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
    getContentPane().add(destinationRadio, gridBagConstraints);

    neighborRadio.setBackground(new java.awt.Color(255, 255, 255));
    buttonGroup1.add(neighborRadio);
    neighborRadio.setFont(new java.awt.Font("华文细黑", 1, 14)); // NOI18N
    neighborRadio.setForeground(new java.awt.Color(153, 153, 153));
    neighborRadio.setText(node.getNeighbors().getName());
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 5;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(18, 24, 0, 0);
    getContentPane().add(neighborRadio, gridBagConstraints);

    nodeListTitleLabel.setBackground(new java.awt.Color(102, 102, 102));
    nodeListTitleLabel.setFont(new java.awt.Font("华文琥珀", 0, 24)); // NOI18N
    nodeListTitleLabel.setForeground(new java.awt.Color(0, 51, 51));
    nodeListTitleLabel.setLabelFor(avaliableNodeList);
    nodeListTitleLabel.setText("Avaliable Nodes");
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.insets = new java.awt.Insets(34, 6, 0, 0);
    getContentPane().add(nodeListTitleLabel, gridBagConstraints);

    jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

    selectedListString.setText("Add\n\n[" + "]\n\nto " + node.getName() + " as");
    selectedListString.setEditable(false);
    selectedListString.setColumns(20);
    selectedListString.setFont(new java.awt.Font("华文细黑", 0, 18)); // NOI18N
    selectedListString.setLineWrap(true);
    selectedListString.setRows(6);
    selectedListString.setToolTipText("");
    selectedListString.setWrapStyleWord(true);
    selectedListString.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 51, 255)));
    jScrollPane3.setViewportView(selectedListString);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 3;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.gridheight = 2;
    gridBagConstraints.ipadx = 100;
    gridBagConstraints.ipady = 106;
    gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    gridBagConstraints.insets = new java.awt.Insets(6, 24, 0, 44);
    getContentPane().add(jScrollPane3, gridBagConstraints);

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nodeCatagoryComboBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_nodeCatagoryComboBoxItemStateChanged
        if(evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            String scope = (String) nodeCatagoryComboBox.getSelectedItem();
            nodeCatagoryComboBox.setSelectedItem(scope);
            updateListItems(scope);
        }
    }//GEN-LAST:event_nodeCatagoryComboBoxItemStateChanged

    private void updateListItems(String scope) {
        ArrayList<KnowledgeNode> a;
        if (scope.equals("Choose a catagory"))
            a = (ArrayList<KnowledgeNode>) map.getAllKnowledgeNodes();
        else {
            a = (ArrayList<KnowledgeNode>) map.getCatagory(scope);
            Collections.sort(a, KnowledgeNodeList.comparatorBySignificance());
        }
        avaliableNodeList.setModel(listModelFactory(filterList(a)));
    }
    
    private ArrayList<KnowledgeNode> filterList(ArrayList<KnowledgeNode> a) {
        ArrayList<KnowledgeNode> newa = new ArrayList<KnowledgeNode>();
        a.stream().filter((k) -> (
                node != k &&
                !node.getSources().contains(k) &&
                !node.getDestinations().contains(k) &&
                !node.getNeighbors().contains(k))).forEach((k) -> {
                    newa.add(k);
        });
        return newa;
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
    
    private void avaliableNodeListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_avaliableNodeListMouseClicked
        selected = avaliableNodeList.getSelectedValue();
        if (selected == null) return;
        selectedListString.setText("Add\n\n[" + selected.getName() + "]\n\nto " + node.getName() + " as");
        if (evt.isControlDown()) {
            String nodelist = "[";
            int listSize = avaliableNodeList.getSelectedValuesList().size();
            for (int i = 0; i < listSize-1; i++) {
                KnowledgeNode k = avaliableNodeList.getSelectedValuesList().get(i);
                nodelist += k.getName() + ", ";
            }
            nodelist += avaliableNodeList.getSelectedValuesList().get(listSize-1).getName();

            selectedListString.setText("Add\n\n" + nodelist + "]\n\nto " + node.getName() + " as");
        } else if (evt.getClickCount() == 2) 
            KnowledgeNodeViewerApp.run(selected);
    }//GEN-LAST:event_avaliableNodeListMouseClicked

    private void checkBeforeSubmit() {
        if (selected == null)
            throw new InvalidInputException("Select a node before submit");
        else if (selected == node)
            throw new InvalidInputException("Must not be a same node");
    }
    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        try {
            checkBeforeSubmit();
            dispose();
        } catch(InvalidInputException e) {
            GeneralController.errorMessageBox(e.getMessage());
        }
    }//GEN-LAST:event_submitButtonActionPerformed

    public void run(boolean center) {
        EnhanceAppView.enhanceVision();
        if (center)
            setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public ArrayList<KnowledgeNode> getSelected() {
        List<KnowledgeNode> nodelist = avaliableNodeList.getSelectedValuesList();
        if (nodelist.isEmpty())
            return null;
        return (ArrayList<KnowledgeNode>) nodelist;
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
        KnowledgeNode a = new KnowledgeNodeImpl("A", "Character", "A", "First", "Source", "Destination", "Neighbor");
        KnowledgeNode b = new KnowledgeNodeImpl("B", "Character", "B", "Second", "Source", "Destination", "Neighbor");
        KnowledgeNode c = new KnowledgeNodeImpl("C", "String", "C", "Third", "Source", "Destination", "Neighbor");
        KnowledgeNode d = new KnowledgeNodeImpl("D", "Character", "D", "Fourth", "Source", "Destination", "Neighbor");
        KnowledgeNode e = new KnowledgeNodeImpl("E", "Character", "E", "Fourth", "Source", "Destination", "Neighbor");
        KnowledgeNode f = new KnowledgeNodeImpl("F", "Character", "F", "Fourth", "Source", "Destination", "Neighbor");

        
        KnowledgeMap map = new KnowledgeMapImpl("K");
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
    private javax.swing.JList<KnowledgeNodeModels.KnowledgeNode> avaliableNodeList;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JRadioButton destinationRadio;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton neighborRadio;
    private javax.swing.JComboBox<String> nodeCatagoryComboBox;
    private javax.swing.JLabel nodeListTitleLabel;
    private javax.swing.JTextArea selectedListString;
    private javax.swing.JRadioButton sourceRaido;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}
