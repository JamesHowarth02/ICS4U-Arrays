/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SamplePrograms;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jame1850
 */
public class Search2 extends javax.swing.JFrame {

    /**
     * Creates new form Search2
     */
    static String product[] = new String[50];
    static double price[] = new double[50];
    static String category[] = new String[50];
    
    public Search2() {
        initComponents();
        loadData();
        this.setTitle("Grocery Inventory");
    }
    
    public String[] search(String cat) {
        String result = "";
        jProgressBar.setValue(0);
        for (int i = 0; i < category.length; i++) {
            if(cat.equals(category[i])) {
                result = result + product[i] + ",";
            }    
        }
        jProgressBar.setValue(50);    
        if(result.equals("")) {
            return new String[0];
        }
        return result.split(",");
    }
    public static void loadData(){
        product [0] = "Chai";
        product [1] = "Chang";
        product [2] = "Aniseed Syrup";
        product [3] = "Chef Anton's Cajun Seasoning";
        product [4] = "Chef Anton's Gumbo Mix";
        product [5] = "Grandma's Boysenberry Spread";
        product [6] = "Uncle Bob's Organic Dried Pears";
        product [7] = "Northwoods Cranberry Sauce";
        product [8] = "Mishi Kobe Niku";
        product [9] = "Ikura";
        product [10] = "Queso Cabrales";
        product [11] = "Queso Manchego La Pastora";
        product [12] = "Konbu";
        product [13] = "Tofu";
        product [14] = "Genen Shouyu";
        product [15] = "Pavlova";
        product [16] = "Alice Mutton";
        product [17] = "Carnarvon Tigers";
        product [18] = "Teatime Chocolate Biscuits";
        product [19] = "Sir Rodney's Marmalade";
        product [20] = "Sir Rodney's Scones";
        product [21] = "Nord-Ost Matjeshering";
        product [22] = "Gorgonzola Telino";
        product [23] = "Mascarpone Fabioli";
        product [24] = "Geitost";
        product [25] = "Sasquatch Ale";
        product [26] = "Steeleye Stout";
        product [27] = "Boston Crab Meat";
        product [28] = "Jack's New England Clam Chowder";
        product [29] = "Ipoh Coffee";
        product [30] = "Gula Malacca";
        product [31] = "Spegesild";
        product [32] = "Zaanse koeken";
        product [33] = "Chocolade";
        product [34] = "Maxilaku";
        product [35] = "Valkoinen suklaa";
        product [36] = "Manjimup Dried Apples";
        product [37] = "Filo Mix";
        product [38] = "Perth Pasties";
        product [39] = "Tourtisre";
        product [40] = "Gnocchi di nonna Alice";
        product [41] = "Ravioli Angelo";
        product [42] = "Escargots de Bourgogne";
        product [43] = "Vegie-spread";
        product [44] = "Louisiana Fiery Hot Pepper Sauce";
        product [45] = "Louisiana Hot Spiced Okra";
        product [46] = "Laughing Lumberjack Lager";
        product [47] = "Scottish Longbreads";
        product [48] = "Gudbrandsdalsost";
        product [49] = "Outback Lager";

        price [0] = 18.00;
        price [1] = 19.00;
        price [2] = 10.00;
        price [3] = 22.00;
        price [4] = 21.35;
        price [5] = 25.00;
        price [6] = 30.00;
        price [7] = 40.00;
        price [8] = 97.00;
        price [9] = 31.00;
        price [10] = 21.00;
        price [11] = 38.00;
        price [12] = 6.00;
        price [13] = 23.25;
        price [14] = 15.50;
        price [15] = 17.45;
        price [16] = 39.00;
        price [17] = 62.50;
        price [18] = 9.20;
        price [19] = 81.00;
        price [20] = 10.00;
        price [21] = 25.89;
        price [22] = 12.50;
        price [23] = 32.00;
        price [24] = 2.50;
        price [25] = 14.00;
        price [26] = 18.00;
        price [27] = 18.40;
        price [28] = 9.65;
        price [29] = 46.00;
        price [30] = 19.45;
        price [31] = 12.00;
        price [32] = 9.50;
        price [33] = 12.75;
        price [34] = 20.00;
        price [35] = 16.25;
        price [36] = 53.00;
        price [37] = 7.00;
        price [38] = 32.80;
        price [39] = 7.45;
        price [40] = 38.00;
        price [41] = 19.50;
        price [42] = 13.25;
        price [43] = 43.90;
        price [44] = 21.05;
        price [45] = 17.00;
        price [46] = 14.00;
        price [47] = 12.50;
        price [48] = 36.00;
        price [49] = 15.00;

        category [0] = "Beverages";
        category [1] = "Beverages";
        category [2] = "Condiments";
        category [3] = "Condiments";
        category [4] = "Condiments";
        category [5] = "Condiments";
        category [6] = "Produce";
        category [7] = "Condiments";
        category [8] = "Meat/Poultry";
        category [9] = "Seafood";
        category [10] = "Dairy Products";
        category [11] = "Dairy Products";
        category [12] = "Seafood";
        category [13] = "Produce";
        category [14] = "Condiments";
        category [15] = "Confections";
        category [16] = "Meat/Poultry";
        category [17] = "Seafood";
        category [18] = "Confections";
        category [19] = "Confections";
        category [20] = "Confections";
        category [21] = "Seafood";
        category [22] = "Dairy Products";
        category [23] = "Dairy Products";
        category [24] = "Dairy Products";
        category [25] = "Beverages";
        category [26] = "Beverages";
        category [27] = "Seafood";
        category [28] = "Seafood";
        category [29] = "Beverages";
        category [30] = "Condiments";
        category [31] = "Seafood";
        category [32] = "Confections";
        category [33] = "Confections";
        category [34] = "Confections";
        category [35] = "Confections";
        category [36] = "Produce";
        category [37] = "Grains/Cereals";
        category [38] = "Meat/Poultry";
        category [39] = "Meat/Poultry";
        category [40] = "Grains/Cereals";
        category [41] = "Grains/Cereals";
        category [42] = "Seafood";
        category [43] = "Condiments";
        category [44] = "Condiments";
        category [45] = "Condiments";
        category [46] = "Beverages";
        category [47] = "Confections";
        category [48] = "Dairy Products";
        category [49] = "Beverages";
    } //end load data
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        inputField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jProgressBar = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Enter Search Category:");

        searchButton.setText("GO");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(inputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jProgressBar.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jProgressBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jProgressBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String catSearch = inputField.getText();
        
        String result[] = search(catSearch);
        jTextArea1.setText("");
        if(result.length != 0) {
            for (int i = 0; i < result.length; i++) {
                jTextArea1.append(result[i] + "\n");
            }
            jProgressBar.setValue(100);   
        }else{
            jProgressBar.setValue(0);
            jTextArea1.setText("Unable to find an item with the given category.");
        }
    
    }//GEN-LAST:event_searchButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField inputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton searchButton;
    // End of variables declaration//GEN-END:variables
}
