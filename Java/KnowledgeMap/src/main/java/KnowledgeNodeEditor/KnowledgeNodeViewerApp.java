package KnowledgeNodeEditor;

import KnowledgeNodeModels.KnowledgeNodeImpl;
import KnowledgeNodeModels.KnowledgeNode;
import Lib.EnhanceAppView;
import java.awt.Color;

/**
 *
 * @author Gavin
 */
public class KnowledgeNodeViewerApp extends javax.swing.JDialog {
    
    public static final void run(KnowledgeNode k) {
        KnowledgeNodeViewerApp.run(k, true);
    }

    public static final void run(KnowledgeNode k, boolean center) {
        EnhanceAppView.enhanceVision();
        KnowledgeNodeViewerApp view = new KnowledgeNodeViewerApp(k);
        if (center)
            view.setLocationRelativeTo(null);
        view.setVisible(true);
    }

    /**
     * Creates new form KnowledgeNodeWikiApp
     */
    public KnowledgeNodeViewerApp(KnowledgeNode k) {
        initComponents();
        informationArea.setText(k.chineseFormattedInformation());
        getContentPane().setBackground(Color.white);
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

        titleLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        informationArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Knowledge Node Wiki");

        titleLabel.setFont(new java.awt.Font("华文琥珀", 0, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(0, 51, 51));
        titleLabel.setText("             详细内容");
        titleLabel.setToolTipText("");
        titleLabel.setBorder(null);

        informationArea.setEditable(false);
        informationArea.setColumns(20);
        informationArea.setFont(new java.awt.Font("华文细黑", 0, 15)); // NOI18N
        informationArea.setLineWrap(true);
        informationArea.setRows(5);
        informationArea.setWrapStyleWord(true);
        informationArea.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(51, 51, 255)));
        informationArea.setDisabledTextColor(new java.awt.Color(0, 51, 51));
        jScrollPane1.setViewportView(informationArea);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(titleLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(titleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        KnowledgeNode a = new KnowledgeNodeImpl("A", "Character", "A", "First", "Source", "Destination", "Neighbor");
        KnowledgeNode b = new KnowledgeNodeImpl("B", "Character", "B", "Second", "Source", "Destination", "Neighbor");
        KnowledgeNode c = new KnowledgeNodeImpl("C", "Character", "C", "Third", "Source", "Destination", "Neighbor");
        KnowledgeNode d = new KnowledgeNodeImpl("D", "Character", "D", "Fourth", "Source", "Destination", "Neighbor");
        KnowledgeNode e = new KnowledgeNodeImpl("E", "Character", "E", "Fourth", "Source", "Destination", "Neighbor");
        a.addDestination(d);
        d.addSource(c);
        d.addSource(b);
        e.addDestination(d);

        KnowledgeNodeViewerApp.run(a);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea informationArea;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel titleLabel;
    // End of variables declaration//GEN-END:variables
}
