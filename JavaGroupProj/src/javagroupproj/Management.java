package javagroupproj;

import MyLib.*;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Management extends javax.swing.JFrame {
    //========== Blocks List ==========
    //public Blocks(String blockName, String address, ArrayList<Lots> LotsArray)
    Blocks BlockA = new Blocks("BlockA", "New York", null);
    Blocks BlockB = new Blocks("BlockB", "California", null);
    Blocks BlockC = new Blocks("BlockC", "Los Angeles", null);
    Blocks BlockD = new Blocks("BlockD", "Texas", null);
    Blocks BlockE = new Blocks("BlockE", "Virginia", null);
    
    //========== Lots List (New York) ==========
    //public Lots(String lotNum, int lotSize, String lotStatus, int lotLocation)
    Lots LotA1 = new Lots("A1", 17, "Available", 1);
    Lots LotA2 = new Lots("A2", 18,"Available", 2);
    Lots LotA3 = new Lots("A3", 19,"Available", 2);
    Lots LotA4 = new Lots("A4", 20,"Available", 1);
    Lots LotA5 = new Lots("A5", 21,"Available", 2);
    Lots LotA6 = new Lots("A6", 25,"Available", 2);
    Lots LotA7 = new Lots("A7", 26,"Available", 1);
    Lots LotA8 = new Lots("A8", 27,"Sold", 2);
    Lots LotA9 = new Lots("A9", 28,"Available", 1);
    Lots LotA10 = new Lots("A10", 29,"Available",2);
    Lots LotA11 = new Lots("A11", 33,"Available",1);
    Lots LotA12 = new Lots("A12", 34,"Sold",2);
    Lots LotA13 = new Lots("A13", 35,"Available",2);
    Lots LotA14 = new Lots("A14", 36,"Available",1);
    Lots LotA15 = new Lots("A15", 37,"Available",2);
    Lots LotA16 = new Lots("A16", 47, "Sold", 1);
    Lots LotA17 = new Lots("A17", 48,"Available",1);
    Lots LotA18 = new Lots("A18", 49,"Sold", 2);
    Lots LotA19 = new Lots("A19", 50,"Sold", 2);
    Lots LotA20 = new Lots("A20", 51,"Available",1);
    
    //========== Lots List (California) ==========
    Lots LotB1 = new Lots("B1", 23, "Available", 1);
    Lots LotB2 = new Lots("B2", 24, "Available", 2);
    Lots LotB3 = new Lots("B3", 25, "Available", 2);
    Lots LotB4 = new Lots("B4", 26, "Available", 1);
    Lots LotB5 = new Lots("B5", 27, "Sold", 1);
    Lots LotB6 = new Lots("B6", 34, "Available", 2);
    Lots LotB7 = new Lots("B7", 35, "Available", 2);
    Lots LotB8 = new Lots("B8", 36, "Sold", 2);
    Lots LotB9 = new Lots("B9", 37, "Available", 2);
    Lots LotB10 = new Lots("B10", 38, "Available", 1);
    Lots LotB11 = new Lots("B11", 49, "Sold", 1);
    Lots LotB12 = new Lots("B12", 50, "Available", 2);
    Lots LotB13 = new Lots("B13", 51, "Available", 2);
    Lots LotB14 = new Lots("B14", 52, "Available", 2);
    Lots LotB15 = new Lots("B15", 53, "Sold", 1);
    Lots LotB16 = new Lots("B16", 68, "Available", 2);
    Lots LotB17 = new Lots("B17", 69, "Sold", 2);
    Lots LotB18 = new Lots("B18", 70, "Available", 2);
    Lots LotB19 = new Lots("B19", 71, "Sold", 1);
    Lots LotB20 = new Lots("B20", 72, "Available", 2);
    
    //========== Lots List (Los Angeles) ==========
    Lots LotC1 = new Lots("C1", 20, "Available", 1);
    
    //========== Lots List (Texas) ==========
    Lots LotD1 = new Lots("D1", 31, "Available", 1);
    
    //========== Lots List (Virginia) ==========
    Lots LotE1 = new Lots("E1", 28, "Available", 1);
        
    ArrayList<Lots> LotsNewYork; //LotsA
    ArrayList<Lots> LotsCalifornia; //LotsB
    ArrayList<Lots> LotsLosAngeles; //LotsC
    ArrayList<Lots> LotsTexas; //LotsD
    ArrayList<Lots> LotsVirginia; //LotsE
    
    
    //========== Blocks List (California) ==========
    ArrayList<Blocks> BlocksList; //Need to create a list of blocks to make them be selectable by their index
    
    String header[] = new String[]{"ID", "Size", "Price", "Status", "Location", "Area (Block)"};
    DefaultTableModel dtm;
    int row, col;
    /**
     * Creates new form MainFrame
     */
    public Management() {
        initComponents();
        //Instantiate arrays
        BlocksList = new ArrayList<>();
        LotsNewYork = new ArrayList<>();
        LotsCalifornia = new ArrayList<>();
        LotsLosAngeles = new ArrayList<>();
        LotsTexas = new ArrayList<>();
        LotsVirginia = new ArrayList<>();
        
        LotsNewYork.add(LotA1);
        LotsNewYork.add(LotA2);
        LotsNewYork.add(LotA3);
        LotsNewYork.add(LotA4);
        LotsNewYork.add(LotA5);
        LotsNewYork.add(LotA6);
        LotsNewYork.add(LotA7);
        LotsNewYork.add(LotA8);
        LotsNewYork.add(LotA9);
        LotsNewYork.add(LotA10);
        LotsNewYork.add(LotA11);
        LotsNewYork.add(LotA12);
        LotsNewYork.add(LotA13);
        LotsNewYork.add(LotA14);
        LotsNewYork.add(LotA15);
        LotsNewYork.add(LotA16);
        LotsNewYork.add(LotA17);
        LotsNewYork.add(LotA18);
        LotsNewYork.add(LotA19);
        LotsNewYork.add(LotA20);
        
        LotsCalifornia.add(LotB1);
        LotsCalifornia.add(LotB2);
        LotsCalifornia.add(LotB3);
        LotsCalifornia.add(LotB4);
        LotsCalifornia.add(LotB5);
        LotsCalifornia.add(LotB6);
        LotsCalifornia.add(LotB7);
        LotsCalifornia.add(LotB8);
        LotsCalifornia.add(LotB9);
        LotsCalifornia.add(LotB10);
        LotsCalifornia.add(LotB11);
        LotsCalifornia.add(LotB12);
        LotsCalifornia.add(LotB13);
        LotsCalifornia.add(LotB14);
        LotsCalifornia.add(LotB15);
        LotsCalifornia.add(LotB16);
        LotsCalifornia.add(LotB17);
        LotsCalifornia.add(LotB18);
        LotsCalifornia.add(LotB19);
        LotsCalifornia.add(LotB20);
        
        LotsLosAngeles.add(LotC1);
        
        LotsTexas.add(LotD1);
        
        LotsVirginia.add(LotE1);
        
        //set lots of block
        BlockA.setLotsArray(LotsNewYork);
        BlockB.setLotsArray(LotsCalifornia);
        BlockC.setLotsArray(LotsLosAngeles);
        BlockD.setLotsArray(LotsTexas);
        BlockE.setLotsArray(LotsVirginia);
        
        //Add blocks into an array to create an index
        BlocksList.add(BlockA);//New York
        BlocksList.add(BlockB);//California
        BlocksList.add(BlockC);//Los Angeles
        BlocksList.add(BlockD);//Texas
        BlocksList.add(BlockE);//Virginia
        
        dtm = new DefaultTableModel(header,0);//instantiate table
        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);
        
        //clears the table
        dtm.setRowCount(0); 
        
        for(int x = 0; x<BlocksList.size(); x++){
            Blocks CurrentBlock = BlocksList.get(x);
            System.out.println("Current Block: " + CurrentBlock.getAddress());
            
            ArrayList<Lots> LotsArray = CurrentBlock.getLotsArray();
            //System.out.println("Current Lots Array: " + );
            System.out.println("Lots Array Size: " + LotsArray.size());
            
            //Add data from lots array into Jframe table
            for (int i = 0; i<LotsArray.size(); i++){
                Object[] lots = {LotsArray.get(i).getLotNum(), LotsArray.get(i).getLotSize(), LotsArray.get(i).getPrice(),LotsArray.get(i).getLotStatus(), LotsArray.get(i).getLotLocation(), CurrentBlock.getAddress()};
                dtm.addRow(lots);
            }
            System.out.println("Loop: " + x);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        PriceInputField = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        SizeInputField = new javax.swing.JTextField();
        BlockAreaInput = new javax.swing.JComboBox<>();
        Search = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(223, 252, 197));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "lotNum", "lotSize", "lotPrice", "lotStatus"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTextField1.setText(" ");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        jTextField2.setText(" ");
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        jTextField3.setText(" ");
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });

        jTextField4.setText(" ");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Number:");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setText("Customer Information");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setText("Lot Specifications");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setText("Block Area:");

        PriceInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PriceInputFieldActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setText("Price:");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel9.setText("Size:");

        SizeInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SizeInputFieldActionPerformed(evt);
            }
        });

        BlockAreaInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "New York", "California", "Los Angeles", "Texas", "Virginia", "Any" }));
        BlockAreaInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BlockAreaInputActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        jButton2.setText("Reserve");

        jButton3.setText("Buy");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6)
                                .addGap(104, 104, 104))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(111, 111, 111)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PriceInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(SizeInputField, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                                            .addComponent(BlockAreaInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(149, 149, 149)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 36, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlockAreaInput, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SizeInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void PriceInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PriceInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PriceInputFieldActionPerformed

    private void SizeInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SizeInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SizeInputFieldActionPerformed

    private void BlockAreaInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BlockAreaInputActionPerformed
       
    }//GEN-LAST:event_BlockAreaInputActionPerformed

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed
        //Search the lots based on specifications
        Integer PriceInput; 
        Double SizeInput;
        Blocks SelectedBlock = null;
        //Null check for price, If textfield is NOT empty, do the following
        if(PriceInputField.getText().equals(" ") || PriceInputField.getText().equals(""))
            PriceInput = null;
        else
            PriceInput = Integer.parseInt(PriceInputField.getText());
        //Null check for size
        if(SizeInputField.getText().equals(" ") || SizeInputField.getText().equals(""))
            SizeInput = null;
        else
            SizeInput = Double.parseDouble(SizeInputField.getText());
        //check for block
        int AreaInput = BlockAreaInput.getSelectedIndex();
        System.out.println(AreaInput);
        
        //Checks if selected area is any
        if (AreaInput !=5)
            SelectedBlock = BlocksList.get(AreaInput);
        else
            AreaInput = 5;
        
        //debug price
        System.out.println("Input Price: "+PriceInput);
        
        //clears the table
        dtm.setRowCount(0); 
        
        //if selected area is not any, display following block
        if(AreaInput !=5){
            for (int i = 0; i<SelectedBlock.getLotsArray().size(); i++){
            ArrayList<Lots> SelectedArray = SelectedBlock.getLotsArray();
            
            Object[] lots = {SelectedArray.get(i).getLotNum(), SelectedArray.get(i).getLotSize(), SelectedArray.get(i).getPrice(),SelectedArray.get(i).getLotStatus(), SelectedArray.get(i).getLotLocation(), SelectedBlock.getAddress()};
          
                //If both Price and Size input is empty, display everything
                if(PriceInput == null && SizeInput == null){
                    dtm.addRow(lots);
                }
                //If both Price and Size input is NOT empty
                else if(PriceInput != null && SizeInput != null){
                    //If price input is not null AND input price is equal to lot's price, add row to table
                    if(PriceInput.equals(SelectedArray.get(i).getPrice()) && SizeInput.equals(SelectedArray.get(i).getLotSize())){
                        dtm.addRow(lots);
                    }
                }
                //If Price input is not empty but Size input is empty
                else if (PriceInput != null && SizeInput == null){
                    //If price input is not null AND input price is equal to lot's price, add row to table
                    if(PriceInput.equals(SelectedArray.get(i).getPrice())){
                        dtm.addRow(lots);
                    }
                }
                //If Price input is empty but Size input is NOT empty
                else if (PriceInput == null && SizeInput != null){
                    //If size is equal to lot's price, add row to table
                    if(SizeInput.equals(SelectedArray.get(i).getLotSize())){
                        dtm.addRow(lots);
                    }
                }
                System.out.println("Loop has ended: " + i);
            }
        }
        else if(AreaInput==5){
            for(int x = 0; x<BlocksList.size(); x++){
                Blocks CurrentBlock = BlocksList.get(x);
                System.out.println("Current Block: " + CurrentBlock.getAddress());

                ArrayList<Lots> LotsArray = CurrentBlock.getLotsArray();
                //System.out.println("Current Lots Array: " + );
                System.out.println("Lots Array Size: " + LotsArray.size());

                //Add data from lots array into Jframe table
                for (int i = 0; i<LotsArray.size(); i++){
                    Object[] lots = {LotsArray.get(i).getLotNum(), LotsArray.get(i).getLotSize(), LotsArray.get(i).getPrice(),LotsArray.get(i).getLotStatus(), LotsArray.get(i).getLotLocation(), CurrentBlock.getAddress()};
                    dtm.addRow(lots);
                }
                System.out.println("Loop: " + x);
            }
        }
    }//GEN-LAST:event_SearchActionPerformed

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
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> BlockAreaInput;
    private javax.swing.JTextField PriceInputField;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SizeInputField;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
