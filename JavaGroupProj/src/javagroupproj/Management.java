package javagroupproj;

import MyLib.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
    Lots LotC1 = new Lots("C1", 20, "Sold", 1);
    Lots LotC2 = new Lots("C2", 21, "Available", 2);
    Lots LotC3 = new Lots("C3", 22, "Available", 1);
    Lots LotC4 = new Lots("C4", 23, "Sold", 1);
    Lots LotC5 = new Lots("C5", 24, "Available", 2);
    Lots LotC6 = new Lots("C6", 28, "Available", 1);
    Lots LotC7 = new Lots("C7", 29, "Sold", 1);
    Lots LotC8 = new Lots("C8", 30, "Available", 2);
    Lots LotC9 = new Lots("C9", 31, "Available", 1);
    Lots LotC10 = new Lots("C10", 32, "Sold", 1);
    Lots LotC11 = new Lots("C11", 36, "Available", 1);
    Lots LotC12 = new Lots("C12", 37, "Available", 2);
    Lots LotC13 = new Lots("C13", 38, "Available", 1);
    Lots LotC14 = new Lots("C14", 39, "Sold", 1);
    Lots LotC15 = new Lots("C15", 40, "Available", 1);
    Lots LotC16 = new Lots("C16", 45, "Available", 1);
    Lots LotC17 = new Lots("C17", 46, "Available", 2);
    Lots LotC18 = new Lots("C18", 47, "Sold", 1);
    Lots LotC19 = new Lots("C19", 48, "Available", 1);
    Lots LotC20 = new Lots("C20", 49, "Available", 2);
    
    //========== Lots List (Texas) ==========
    Lots LotD1 = new Lots("D1", 31, "Available", 1);
    Lots LotD2 = new Lots("D2", 32, "Available", 1);
    Lots LotD3 = new Lots("D3", 34, "Sold", 2);
    Lots LotD4 = new Lots("D4", 35, "Available", 1);
    Lots LotD5 = new Lots("D5", 36, "Available", 2);
    Lots LotD6 = new Lots("D6", 41, "Sold", 2);
    Lots LotD7 = new Lots("D7", 42, "Available", 1);
    Lots LotD8 = new Lots("D8", 43, "Available", 2);
    Lots LotD9 = new Lots("D9", 44, "Available", 1);
    Lots LotD10 = new Lots("D10", 45, "Available", 1);
    Lots LotD11 = new Lots("D11", 52, "Sold", 1);
    Lots LotD12 = new Lots("D12", 53, "Available", 1);
    Lots LotD13 = new Lots("D13", 54, "Available", 2);
    Lots LotD14 = new Lots("D14", 55, "Available", 1);
    Lots LotD15 = new Lots("D15", 56, "Sold", 1);
    Lots LotD16 = new Lots("D16", 62, "Available", 2);
    Lots LotD17 = new Lots("D17", 63, "Available", 1);
    Lots LotD18 = new Lots("D18", 64, "Sold", 1);
    Lots LotD19 = new Lots("D19", 65, "Available", 1);
    Lots LotD20 = new Lots("D20", 66, "Available", 2);
    
    //========== Lots List (Virginia) ==========
    Lots LotE1 = new Lots("E1", 28, "Sold", 1);
    Lots LotE2 = new Lots("E2", 29, "Available", 2);
    Lots LotE3 = new Lots("E3", 30, "Sold", 1);
    Lots LotE4 = new Lots("E4", 31, "Available", 1);
    Lots LotE5 = new Lots("E5", 32, "Available", 2);
    Lots LotE6 = new Lots("E6", 39, "Sold", 1);
    Lots LotE7 = new Lots("E7", 40, "Available", 1);
    Lots LotE8 = new Lots("E8", 41, "Available", 2);
    Lots LotE9 = new Lots("E9", 42, "Sold", 1);
    Lots LotE10 = new Lots("E10", 43, "Available", 1);
    Lots LotE11 = new Lots("E11", 46, "Available", 1);
    Lots LotE12 = new Lots("E12", 47, "Available", 2);
    Lots LotE13 = new Lots("E13", 48, "Available", 1);
    Lots LotE14 = new Lots("E14", 49, "Sold", 1);
    Lots LotE15 = new Lots("E15", 50, "Available", 1);
    Lots LotE16 = new Lots("E16", 55, "Sold", 1);
    Lots LotE17 = new Lots("E17", 56, "Sold", 2);
    Lots LotE18 = new Lots("E18", 57, "Available", 1);
    Lots LotE19 = new Lots("E19", 58, "Sold", 1);
    Lots LotE20 = new Lots("E20", 59, "Available", 2);
        
    ArrayList<Lots> LotsNewYork; //LotsA
    ArrayList<Lots> LotsCalifornia; //LotsB
    ArrayList<Lots> LotsLosAngeles; //LotsC
    ArrayList<Lots> LotsTexas; //LotsD
    ArrayList<Lots> LotsVirginia; //LotsE
    
    
    //========== Blocks List (California) ==========
    ArrayList<Blocks> BlocksList; //Need to create a list of blocks to make them be selectable by their index
    
    
    //========== Customer List ==========
    public static ArrayList<Customer> customerList;
    
    String header[] = new String[]{"ID", "Size", "Price", "Status", "Location", "Area (Block)"};
    String headerCustomer[] = new String[]{"ID", "First Name", "Last Name", "Email", "Number"};
    DefaultTableModel dtm, dtmCustomer;
    int row, col;
    

    Patrons Patronlist = new Patrons();
    String[] TempPatronList = new String[20];
    int tempcnt;
    
    public static Overview overviewFrame = new Overview();
    
    /**
     * Creates new form MainFrame
     */
    public Management() {
        initComponents();
        //Instantiate arrays
        BlocksList = new ArrayList<>();
        customerList = new ArrayList<>();
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
        LotsLosAngeles.add(LotC2);
        LotsLosAngeles.add(LotC3);
        LotsLosAngeles.add(LotC4);
        LotsLosAngeles.add(LotC5);
        LotsLosAngeles.add(LotC6);
        LotsLosAngeles.add(LotC7);
        LotsLosAngeles.add(LotC8);
        LotsLosAngeles.add(LotC9);
        LotsLosAngeles.add(LotC10);
        LotsLosAngeles.add(LotC11);
        LotsLosAngeles.add(LotC12);
        LotsLosAngeles.add(LotC13);
        LotsLosAngeles.add(LotC14);
        LotsLosAngeles.add(LotC15);
        LotsLosAngeles.add(LotC16);
        LotsLosAngeles.add(LotC17);
        LotsLosAngeles.add(LotC18);
        LotsLosAngeles.add(LotC19);
        LotsLosAngeles.add(LotC20);
        
        LotsTexas.add(LotD1);
        LotsTexas.add(LotD2);
        LotsTexas.add(LotD3);
        LotsTexas.add(LotD4);
        LotsTexas.add(LotD5);
        LotsTexas.add(LotD6);
        LotsTexas.add(LotD7);
        LotsTexas.add(LotD8);
        LotsTexas.add(LotD9);
        LotsTexas.add(LotD10);
        LotsTexas.add(LotD11);
        LotsTexas.add(LotD12);
        LotsTexas.add(LotD13);
        LotsTexas.add(LotD14);
        LotsTexas.add(LotD15);
        LotsTexas.add(LotD16);
        LotsTexas.add(LotD17);
        LotsTexas.add(LotD18);
        LotsTexas.add(LotD19);
        LotsTexas.add(LotD20);
        
        LotsVirginia.add(LotE1);
        LotsVirginia.add(LotE2);
        LotsVirginia.add(LotE3);
        LotsVirginia.add(LotE4);
        LotsVirginia.add(LotE5);
        LotsVirginia.add(LotE6);
        LotsVirginia.add(LotE7);
        LotsVirginia.add(LotE8);
        LotsVirginia.add(LotE9);
        LotsVirginia.add(LotE10);
        LotsVirginia.add(LotE11);
        LotsVirginia.add(LotE12);
        LotsVirginia.add(LotE13);
        LotsVirginia.add(LotE14);
        LotsVirginia.add(LotE15);
        LotsVirginia.add(LotE16);
        LotsVirginia.add(LotE17);
       LotsVirginia.add(LotE18);
       LotsVirginia.add(LotE19);
       LotsVirginia.add(LotE20);
        
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
        
        //Make tables editable
        dtm = new DefaultTableModel(header,0);//instantiate table
        jTable1.setModel(dtm);
        this.setLocationRelativeTo(null);
        
        dtmCustomer = new DefaultTableModel(headerCustomer,0);//instantiate table
        jTable2.setModel(dtmCustomer);
        
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
                Object[] lots = {LotsArray.get(i).getLotID(), LotsArray.get(i).getLotSize(), LotsArray.get(i).getPrice(),LotsArray.get(i).getLotStatus(), LotsArray.get(i).getLotLocation(), CurrentBlock.getAddress()};
                dtm.addRow(lots);
            }
            System.out.println("Loop: " + x);
        }
        
        //overview Frame
        overviewFrame.setVisible(false);
        overviewFrame.pack();
        overviewFrame.setLocationRelativeTo(null);
        overviewFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
    }
    
    //Call to add customer instances created from jframe to accessible static customer list of main function
    public static void addRowToCustomerList(ArrayList<Customer> customerList){
        System.out.println("addRowToCustomerList has been invoked");
        Management.customerList = customerList;
    }

    public static ArrayList<Customer> getCustomerArrayList() {
        return customerList;
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
        FirstNameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        LastNameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        EmailField = new javax.swing.JTextField();
        NumberField = new javax.swing.JTextField();
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
        Reserve = new javax.swing.JButton();
        Buy = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        Enlist = new javax.swing.JButton();
        SelectedCustomerField = new javax.swing.JTextField();
        Overview = new javax.swing.JButton();
        AddtoPatrons = new javax.swing.JButton();
        PatronMessage = new javax.swing.JTextField();
        SetPatronMessage = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        NotifyPatrons = new javax.swing.JButton();

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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        FirstNameField.setText(" ");
        FirstNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameFieldActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("First Name:");

        LastNameField.setText(" ");
        LastNameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Last Name:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Email:");

        EmailField.setText(" ");
        EmailField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmailFieldActionPerformed(evt);
            }
        });

        NumberField.setText(" ");
        NumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberFieldActionPerformed(evt);
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

        Reserve.setText("Reserve");
        Reserve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ReserveActionPerformed(evt);
            }
        });

        Buy.setText("Buy");
        Buy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuyActionPerformed(evt);
            }
        });

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "Email", "Number"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        Enlist.setText("Enlist");
        Enlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnlistActionPerformed(evt);
            }
        });

        SelectedCustomerField.setText("Selected Costumer");
        SelectedCustomerField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SelectedCustomerFieldActionPerformed(evt);
            }
        });

        Overview.setText("Overview");
        Overview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OverviewActionPerformed(evt);
            }
        });

        AddtoPatrons.setText("Add to Patrons");
        AddtoPatrons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddtoPatronsActionPerformed(evt);
            }
        });

        SetPatronMessage.setText("Set Patron Message");
        SetPatronMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SetPatronMessageActionPerformed(evt);
            }
        });

        jLabel10.setText("Patron Message:");

        NotifyPatrons.setText("Notify Patrons");
        NotifyPatrons.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NotifyPatronsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(96, 96, 96)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Enlist, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(FirstNameField)
                                    .addComponent(LastNameField)
                                    .addComponent(EmailField)
                                    .addComponent(NumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(AddtoPatrons, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(PatronMessage)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(SetPatronMessage)
                                .addGap(6, 6, 6))
                            .addComponent(jLabel10)
                            .addComponent(NotifyPatrons, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(73, 73, 73)
                                        .addComponent(jLabel6))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(PriceInputField)
                                            .addComponent(SizeInputField)
                                            .addComponent(BlockAreaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(SelectedCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(93, 93, 93))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(12, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(FirstNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LastNameField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(EmailField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(BlockAreaInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(19, 19, 19)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(PriceInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(SizeInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Search, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Reserve, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Buy, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Enlist, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SelectedCustomerField, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Overview, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(AddtoPatrons, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(PatronMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(SetPatronMessage)
                        .addGap(113, 113, 113)
                        .addComponent(NotifyPatrons))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            
            Object[] lots = {SelectedArray.get(i).getLotID(), SelectedArray.get(i).getLotSize(), SelectedArray.get(i).getPrice(),SelectedArray.get(i).getLotStatus(), SelectedArray.get(i).getLotLocation(), SelectedBlock.getAddress()};
          
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
                    Object[] lots = {LotsArray.get(i).getLotID(), LotsArray.get(i).getLotSize(), LotsArray.get(i).getPrice(),LotsArray.get(i).getLotStatus(), LotsArray.get(i).getLotLocation(), CurrentBlock.getAddress()};
                    dtm.addRow(lots);
                }
                System.out.println("Loop: " + x);
            }
        }
    }//GEN-LAST:event_SearchActionPerformed
    
    private void BuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuyActionPerformed
        // Buy Button
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel modelCustomer = (DefaultTableModel)jTable2.getModel();
        Blocks currentBlock = null;
        Lots currentLot=null;
        
        int selectedRowLot = jTable1.getSelectedRow();
        int selectedRowCustomer = jTable2.getSelectedRow();
        
        Customer customerToOverview = null;
        
        String selectedLotID = model.getValueAt(selectedRowLot, 0).toString();
        String selectedLotSize = model.getValueAt(selectedRowLot, 1).toString();
        String selectedLotPrice = model.getValueAt(selectedRowLot, 2).toString();
        String selectedLotArea = model.getValueAt(selectedRowLot, 5).toString();
        String selectedLotAvailability = model.getValueAt(selectedRowLot, 3).toString();
        
        int selectedCustomerID = Integer.parseInt(modelCustomer.getValueAt(selectedRowCustomer, 0).toString());
        String customerName = SelectedCustomerField.getText();
        
        //Find block of selected lot
        for(Blocks block: BlocksList){
            if(block.getAddress().equals(selectedLotArea))
                currentBlock=block;
        }
        
        if(selectedLotAvailability.equals("Sold")||selectedLotAvailability.equals("Reserved")){
            JOptionPane.showMessageDialog(this, "This lots is unavailable, please choose another lot");
        }
        else{
            //searches for each cutomer inside customerList; if selected customer on jframe and customer inside customerList has the same ID, set customerToOverview = customer
            System.out.println("before the search loop");
            for(Customer cus: customerList){
                int cnt=1;
                System.out.println("Current customer is "+ cus.getFname());
                System.out.println("Search Customer ID: "+ cus.getID());
                System.out.println("Selected Customer ID: "+ selectedCustomerID);
                if(cus.getID() == selectedCustomerID){
                    System.out.println("Selected Customer ID: "+ selectedCustomerID);
                    customerToOverview = cus;
                    System.out.println("Inside the first loop: "+customerToOverview.getFname());
                    JOptionPane.showMessageDialog(this, "Customer: " + customerName + "\n" + 
                                                "Lot: " + selectedLotID + "\n" +
                                                "Size: " + selectedLotSize + "\n" +
                                                "Area: " + selectedLotArea + "\n" +
                                                "Price: " + selectedLotPrice);
                }
                else if(!(cus.getID() == (selectedCustomerID +1))){
                    System.out.println("No match for loop: " +cnt);
                }
                
                //Search for lot
                for(Lots lot: currentBlock.getLotsArray()){
                    if(lot.getLotID().equals(selectedLotID)){
                        currentLot=lot;
                        currentLot.setLotStatus("Sold");
                        
                        model.setValueAt("Sold", selectedRowLot, 3);
                    }
                }
                if(cus.getID() == selectedCustomerID){
                    System.out.println("Selected Customer ID: "+ selectedCustomerID);
                    customerToOverview = cus;
                    System.out.println("Inside the first loop: "+customerToOverview.getFname());
                cnt++;
                }
            }
            
            String customerNameConcat = customerToOverview.getFname() + " " + customerToOverview.getFname();
            Object[] toOverview = new Object[]{customerToOverview.getID(), customerName, customerToOverview.getEmail(), customerToOverview.getPNumber(), currentLot.getLotID(), currentLot.getLotSize(),currentLot.getPrice(),currentLot.getLotLocation(),currentLot.getLotStatus()};
            
            overviewFrame.AddRowToJTable(toOverview);
            
            System.out.println("after the search loop");
            //Receipt
            
        }
    }//GEN-LAST:event_BuyActionPerformed
    
    private void ReserveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ReserveActionPerformed
        // Reserve Button
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel modelCustomer = (DefaultTableModel)jTable2.getModel();
        Blocks currentBlock = null;
        Lots currentLot=null;
        
        int selectedRowLot = jTable1.getSelectedRow();
        int selectedRowCustomer = jTable2.getSelectedRow();
        
        Customer customerToOverview = null;
        
        String selectedLotID = model.getValueAt(selectedRowLot, 0).toString();
        String selectedLotSize = model.getValueAt(selectedRowLot, 1).toString();
        String selectedLotPrice = model.getValueAt(selectedRowLot, 2).toString();
        String selectedLotArea = model.getValueAt(selectedRowLot, 5).toString();
        String selectedLotAvailability = model.getValueAt(selectedRowLot, 3).toString();
        
        int selectedCustomerID = Integer.parseInt(modelCustomer.getValueAt(selectedRowCustomer, 0).toString());
        String customerName = SelectedCustomerField.getText();
        
        //Find block of selected lot
        for(Blocks block: BlocksList){
            if(block.getAddress().equals(selectedLotArea))
                currentBlock=block;
        }
        
        if(selectedLotAvailability.equals("Sold")||selectedLotAvailability.equals("Reserved")){
            JOptionPane.showMessageDialog(this, "This lots is unavailable, please choose another lot");
        }
        else{
            //searches for each cutomer inside customerList; if selected customer on jframe and customer inside customerList has the same ID, set customerToOverview = customer
            System.out.println("before the search loop");
            for(Customer cus: customerList){
                int cnt=1;
                System.out.println("Current customer is "+ cus.getFname());
                System.out.println("Search Customer ID: "+ cus.getID());
                System.out.println("Selected Customer ID: "+ selectedCustomerID);
                if(cus.getID() == selectedCustomerID){
                    System.out.println("Selected Customer ID: "+ selectedCustomerID);
                    customerToOverview = cus;
                    System.out.println("Inside the first loop: "+customerToOverview.getFname());
                    JOptionPane.showMessageDialog(this, "Customer: " + customerName + "\n" + 
                                                "Lot: " + selectedLotID + "\n" +
                                                "Size: " + selectedLotSize + "\n" +
                                                "Area: " + selectedLotArea + "\n" +
                                                "Price: " + selectedLotPrice);
                }
                else if(!(cus.getID() == (selectedCustomerID +1))){
                    System.out.println("No match for loop: " +cnt);
                }
                
                //Search for lot
                for(Lots lot: currentBlock.getLotsArray()){
                    if(lot.getLotID().equals(selectedLotID)){
                        currentLot=lot;
                        currentLot.setLotStatus("Reserved");
                        
                        model.setValueAt("Reserved", selectedRowLot, 3);
                    }
                }
                if(cus.getID() == selectedCustomerID){
                    System.out.println("Selected Customer ID: "+ selectedCustomerID);
                    customerToOverview = cus;
                    System.out.println("Inside the first loop: "+customerToOverview.getFname());
                cnt++;
                }
            }
            
            String customerNameConcat = customerToOverview.getFname() + " " + customerToOverview.getFname();
            Object[] toOverview = new Object[]{customerToOverview.getID(), customerName, customerToOverview.getEmail(), customerToOverview.getPNumber(), currentLot.getLotID(), currentLot.getLotSize(),currentLot.getPrice(),currentLot.getLotLocation(),currentLot.getLotStatus()};
            
            overviewFrame.AddRowToJTable(toOverview);
            
            System.out.println("after the search loop");
            //Receipt
            
        }
    }//GEN-LAST:event_ReserveActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRowIndex = jTable1.getSelectedRow();
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void NumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberFieldActionPerformed

    private void EmailFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmailFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmailFieldActionPerformed

    private void LastNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameFieldActionPerformed

    private void FirstNameFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameFieldActionPerformed

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        //Selecting Customer
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int selectedRowIndex = jTable2.getSelectedRow();
        
        //Finds the customer name of the Customer instance inside the customerList awit AHAHHAHAHAH
        String currentCustomerName = customerList.get(selectedRowIndex).getCustomerName(customerList.get(selectedRowIndex));
        
        SelectedCustomerField.setText(currentCustomerName);
    }//GEN-LAST:event_jTable2MouseClicked

    private void EnlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EnlistActionPerformed
        //Enlist Customer
        DefaultTableModel model = (DefaultTableModel)jTable2.getModel();
        int ID;
        
        String Fname = FirstNameField.getText();
        String Lname = LastNameField.getText();
        String Email = EmailField.getText();
        String PNumber = NumberField.getText();
        
        
        //If any field is empty, do not create customer instance
        if(Fname.equals(" ") || Lname.equals(" ") || Email.equals(" ") ||PNumber.equals(" ")){
            JOptionPane.showMessageDialog(this, "Please fill every required information.");
        }
        else{
            Customer createCustomer = new Customer(Fname, Lname, Email, PNumber);
            customerList.add(createCustomer);
            
            addRowToCustomerList(customerList);
            String customerName = Management.customerList.get(0).getFname();
            System.out.println(customerName);
        
            //Customer cus = new Customer(Fname, Lname, Email, Number);
            Object[] cus = {createCustomer.getID(), createCustomer.getFname(), createCustomer.getLname(), createCustomer.getEmail(), createCustomer.getPNumber()};
            dtmCustomer.addRow(cus);
        }
    }//GEN-LAST:event_EnlistActionPerformed

    private void SelectedCustomerFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SelectedCustomerFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SelectedCustomerFieldActionPerformed

    private void OverviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OverviewActionPerformed
        //Show or Hide Overview table
        System.out.println(overviewFrame.isVisible());
        
        if(overviewFrame.isVisible())
            overviewFrame.setVisible(false);
        else if(!overviewFrame.isVisible())
            overviewFrame.setVisible(true);
    }//GEN-LAST:event_OverviewActionPerformed

    private void AddtoPatronsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddtoPatronsActionPerformed
        // TODO add your handling code here:
        String Fname = FirstNameField.getText();
        String Lname = LastNameField.getText();

        Patronlist.subscribe(new LotUpdates(Patronlist, Fname, Lname));
        TempPatronList[tempcnt] = Lname + ", " + Fname;
        tempcnt++;
    }//GEN-LAST:event_AddtoPatronsActionPerformed

    private void SetPatronMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SetPatronMessageActionPerformed
        // TODO add your handling code here:
        String PatronMSG = PatronMessage.getText();
        Patronlist.setNewlotupdate(PatronMSG);
    }//GEN-LAST:event_SetPatronMessageActionPerformed

    private void NotifyPatronsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NotifyPatronsActionPerformed
        // TODO add your handling code here:
        String AppendedList = "\n";
        int j = 1;
        
        for (int i = 0; i < tempcnt ; i++) {
            j++;
            
            if (j == tempcnt) {
                AppendedList = AppendedList + TempPatronList[i];
                break;
            }
            AppendedList = AppendedList + TempPatronList[i] + "\n";
        }
        
        Patronlist.notifyPatrons();
        JOptionPane.showMessageDialog(this, "Subscribed Patrons have been notified: " 
                + AppendedList + "\n With the message: " + Patronlist.getNewlotupdate());
    }//GEN-LAST:event_NotifyPatronsActionPerformed

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
    private javax.swing.JButton AddtoPatrons;
    private javax.swing.JComboBox<String> BlockAreaInput;
    private javax.swing.JButton Buy;
    private javax.swing.JTextField EmailField;
    private javax.swing.JButton Enlist;
    private javax.swing.JTextField FirstNameField;
    private javax.swing.JTextField LastNameField;
    private javax.swing.JButton NotifyPatrons;
    private javax.swing.JTextField NumberField;
    private javax.swing.JButton Overview;
    private javax.swing.JTextField PatronMessage;
    private javax.swing.JTextField PriceInputField;
    private javax.swing.JButton Reserve;
    private javax.swing.JButton Search;
    private javax.swing.JTextField SelectedCustomerField;
    private javax.swing.JButton SetPatronMessage;
    private javax.swing.JTextField SizeInputField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
