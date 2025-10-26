package com.mycompany.praktikum8;

public class Calculator extends javax.swing.JFrame {
    String angka = "";
    String historyAngka = "";
    double hasil;
    double bilangan1 = 0.0;
    double bilangan2 = 0.0;
    String operasi;

    public Calculator() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public void nextHistoryAngka(){
        if (!savedNumbersTextField.equals("")){
            savedNumbersTextField.setText(historyAngka);
        }
    }

    @SuppressWarnings("unchecked")                   
    private void initComponents() {

        numbersTextField = new javax.swing.JTextField();
        savedNumbersTextField = new javax.swing.JTextField();
        deleteButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        devideButton = new javax.swing.JButton();
        percentButton = new javax.swing.JButton();
        number8Button = new javax.swing.JButton();
        number7Button = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        number9Button = new javax.swing.JButton();
        number5Button = new javax.swing.JButton();
        number4Button = new javax.swing.JButton();
        minusButton = new javax.swing.JButton();
        number6Button = new javax.swing.JButton();
        number2Button = new javax.swing.JButton();
        number1Button = new javax.swing.JButton();
        plusButton = new javax.swing.JButton();
        number3Button = new javax.swing.JButton();
        number0Button = new javax.swing.JButton();
        EqualButton = new javax.swing.JButton();
        DotButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Calculator");

        numbersTextField.setEditable(false);
        numbersTextField.setBackground(new java.awt.Color(0, 0, 0));
        numbersTextField.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        numbersTextField.setForeground(new java.awt.Color(255, 255, 255));
        numbersTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        numbersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numbersTextFieldActionPerformed(evt);
            }
        });

        savedNumbersTextField.setEditable(false);
        savedNumbersTextField.setBackground(new java.awt.Color(0, 0, 0));
        savedNumbersTextField.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        savedNumbersTextField.setForeground(new java.awt.Color(204, 204, 204));
        savedNumbersTextField.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        savedNumbersTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savedNumbersTextFieldActionPerformed(evt);
            }
        });

        deleteButton.setBackground(new java.awt.Color(10, 10, 10));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(204, 102, 0));
        deleteButton.setText("<-");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        clearButton.setBackground(new java.awt.Color(10, 10, 10));
        clearButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        clearButton.setForeground(new java.awt.Color(204, 102, 0));
        clearButton.setText("AC");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        devideButton.setBackground(new java.awt.Color(10, 10, 10));
        devideButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        devideButton.setForeground(new java.awt.Color(204, 102, 0));
        devideButton.setText("÷");
        devideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devideButtonActionPerformed(evt);
            }
        });

        percentButton.setBackground(new java.awt.Color(10, 10, 10));
        percentButton.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        percentButton.setForeground(new java.awt.Color(204, 102, 0));
        percentButton.setText("%");
        percentButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentButtonActionPerformed(evt);
            }
        });

        number8Button.setBackground(new java.awt.Color(10, 10, 10));
        number8Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number8Button.setForeground(new java.awt.Color(255, 255, 255));
        number8Button.setText("8");
        number8Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number8ButtonActionPerformed(evt);
            }
        });

        number7Button.setBackground(new java.awt.Color(10, 10, 10));
        number7Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number7Button.setForeground(new java.awt.Color(255, 255, 255));
        number7Button.setText("7");
        number7Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number7ButtonActionPerformed(evt);
            }
        });

        multiplyButton.setBackground(new java.awt.Color(10, 10, 10));
        multiplyButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        multiplyButton.setForeground(new java.awt.Color(204, 102, 0));
        multiplyButton.setText("×");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplyButtonActionPerformed(evt);
            }
        });

        number9Button.setBackground(new java.awt.Color(10, 10, 10));
        number9Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number9Button.setForeground(new java.awt.Color(255, 255, 255));
        number9Button.setText("9");
        number9Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number9ButtonActionPerformed(evt);
            }
        });

        number5Button.setBackground(new java.awt.Color(10, 10, 10));
        number5Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number5Button.setForeground(new java.awt.Color(255, 255, 255));
        number5Button.setText("5");
        number5Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number5ButtonActionPerformed(evt);
            }
        });

        number4Button.setBackground(new java.awt.Color(10, 10, 10));
        number4Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number4Button.setForeground(new java.awt.Color(255, 255, 255));
        number4Button.setText("4");
        number4Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number4ButtonActionPerformed(evt);
            }
        });

        minusButton.setBackground(new java.awt.Color(10, 10, 10));
        minusButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        minusButton.setForeground(new java.awt.Color(204, 102, 0));
        minusButton.setText("-");
        minusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                minusButtonActionPerformed(evt);
            }
        });

        number6Button.setBackground(new java.awt.Color(10, 10, 10));
        number6Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number6Button.setForeground(new java.awt.Color(255, 255, 255));
        number6Button.setText("6");
        number6Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number6ButtonActionPerformed(evt);
            }
        });

        number2Button.setBackground(new java.awt.Color(10, 10, 10));
        number2Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number2Button.setForeground(new java.awt.Color(255, 255, 255));
        number2Button.setText("2");
        number2Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number2ButtonActionPerformed(evt);
            }
        });

        number1Button.setBackground(new java.awt.Color(10, 10, 10));
        number1Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number1Button.setForeground(new java.awt.Color(255, 255, 255));
        number1Button.setText("1");
        number1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number1ButtonActionPerformed(evt);
            }
        });

        plusButton.setBackground(new java.awt.Color(10, 10, 10));
        plusButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        plusButton.setForeground(new java.awt.Color(204, 102, 0));
        plusButton.setText("+");
        plusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                plusButtonActionPerformed(evt);
            }
        });

        number3Button.setBackground(new java.awt.Color(10, 10, 10));
        number3Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number3Button.setForeground(new java.awt.Color(255, 255, 255));
        number3Button.setText("3");
        number3Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number3ButtonActionPerformed(evt);
            }
        });

        number0Button.setBackground(new java.awt.Color(10, 10, 10));
        number0Button.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        number0Button.setForeground(new java.awt.Color(255, 255, 255));
        number0Button.setText("0");
        number0Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                number0ButtonActionPerformed(evt);
            }
        });

        EqualButton.setBackground(new java.awt.Color(204, 102, 0));
        EqualButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        EqualButton.setForeground(new java.awt.Color(255, 255, 255));
        EqualButton.setText("=");
        EqualButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EqualButtonActionPerformed(evt);
            }
        });

        DotButton.setBackground(new java.awt.Color(10, 10, 10));
        DotButton.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        DotButton.setForeground(new java.awt.Color(255, 255, 255));
        DotButton.setText(".");
        DotButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DotButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(savedNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(number7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(number8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(number9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(devideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(number4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(number5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(number6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(number0Button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(number2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(number3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, 0)
                                .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(EqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(savedNumbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(numbersTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clearButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(devideButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(percentButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number8Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number7Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multiplyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number9Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number5Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number4Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number6Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number2Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number1Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plusButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(number3Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(number0Button, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EqualButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DotButton, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void savedNumbersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                      
    }                                                     

    private void numbersTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                 
    } 
    
    private void number0ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "0";
        historyAngka += "0";
        numbersTextField.setText(angka);
    }
    
    private void number1ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "1";
        historyAngka += "1";
        numbersTextField.setText(angka);
    }                                             

    private void number2ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "2";
        historyAngka += "2";
        numbersTextField.setText(angka);
    }                                             

    private void number3ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "3";
        historyAngka += "3";
        numbersTextField.setText(angka);
    }                                             

    private void number4ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "4";
        historyAngka += "4";
        numbersTextField.setText(angka);
    }                                             

    private void number5ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "5";
        historyAngka += "5";
        numbersTextField.setText(angka);
    }                                             

    private void number6ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "6";
        historyAngka += "6";
        numbersTextField.setText(angka);
    }                                             

    private void number7ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "7";
        historyAngka += "7";
        numbersTextField.setText(angka);
    }                                             

    private void number8ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "8";
        historyAngka += "8";
        numbersTextField.setText(angka);
    }                                             

    private void number9ButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        nextHistoryAngka();
        angka += "9";
        historyAngka += "9";
        numbersTextField.setText(angka);
    }                                             

    private void DotButtonActionPerformed(java.awt.event.ActionEvent evt) {                                          
        nextHistoryAngka();
        if (!angka.contains(".")) {
            if (angka.isEmpty()) {
                angka = "0.";
                historyAngka += "0.";
            } else {
                angka += ".";
                historyAngka += ".";
            }
            numbersTextField.setText(angka);
        }
    }                                         

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (!angka.isEmpty() && !historyAngka.isEmpty()) {
            angka = angka.substring(0, angka.length() - 1);
            numbersTextField.setText(angka);
            historyAngka = historyAngka.substring(0, historyAngka.length() - 1);
        }
    }                                            

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        bilangan1 = 0.0;
        bilangan2 = 0.0;
        hasil = 0.0;
        angka = "";
        historyAngka = "";
        numbersTextField.setText(angka);
        savedNumbersTextField.setText(angka);
    }                                           

    private void plusButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (!angka.isEmpty()) {
            savedNumbersTextField.setText(historyAngka);
            bilangan1 = Double.parseDouble(angka);
            historyAngka += " + ";
            angka = "";
            operasi = "+";
            numbersTextField.setText("+");
        }
    }                                          

    private void minusButtonActionPerformed(java.awt.event.ActionEvent evt) {
        if (!angka.isEmpty()) {
            savedNumbersTextField.setText(historyAngka);
            bilangan1 = Double.parseDouble(angka);
            historyAngka += " - ";
            angka = "";
            operasi = "-";
            numbersTextField.setText("-");
        } else {
            angka += "-";
            historyAngka += "-";
            numbersTextField.setText(angka);
        }
    }                                           

    private void multiplyButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        if (!angka.isEmpty()) {
            savedNumbersTextField.setText(historyAngka);
            bilangan1 = Double.parseDouble(angka);
            historyAngka += " × ";
            angka = "";
            operasi = "×";
            numbersTextField.setText("×");
        }
    }                                              

    private void devideButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        if (!angka.isEmpty()) {
            savedNumbersTextField.setText(historyAngka);
            bilangan1 = Double.parseDouble(angka);
            historyAngka += " ÷ ";
            angka = "";
            operasi = "÷";
            numbersTextField.setText("÷");
        }
    }                                            

    private void percentButtonActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (!angka.isEmpty()) {
            bilangan2 = Double.parseDouble(angka);
            historyAngka += "% ";
            angka = "";
            numbersTextField.setText("%");
            savedNumbersTextField.setText(historyAngka);
            hasil = bilangan2 / 100;
            angka = Double.toString(hasil);
            if (hasil % 1 == 0){
                numbersTextField.setText(String.valueOf((int) hasil));
            } else {
                numbersTextField.setText(String.valueOf(hasil));
            }
        }
    }                                             
    
    private void EqualButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
        switch (operasi) {
            case "+":
            bilangan2 = Double.parseDouble(angka);
            hasil = bilangan1 + bilangan2;
            angka = Double.toString(hasil);
            savedNumbersTextField.setText(historyAngka);
            break;
            case "-":
            bilangan2 = Double.parseDouble(angka);
            hasil = bilangan1 - bilangan2;
            angka = Double.toString(hasil);
            savedNumbersTextField.setText(historyAngka);
            break;
            case "×":
            bilangan2 = Double.parseDouble(angka);
            hasil = bilangan1 * bilangan2;
            angka = Double.toString(hasil);
            savedNumbersTextField.setText(historyAngka);
            break;
            case "÷":
            bilangan2 = Double.parseDouble(angka);
            hasil = bilangan1 / bilangan2;
            angka = Double.toString(hasil);
            savedNumbersTextField.setText(historyAngka);
            break;
            default:
            break;
        }
        if (hasil % 1 == 0){
            numbersTextField.setText(String.valueOf((int) hasil));
            historyAngka = String.valueOf((int) hasil);
        } else {
            numbersTextField.setText(String.valueOf(hasil));
            historyAngka = String.valueOf(hasil);
        }
    }                                           

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TetsCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TetsCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TetsCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TetsCalc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TetsCalc().setVisible(true);
            }
        });
    }
                 
    private javax.swing.JButton DotButton;
    private javax.swing.JButton EqualButton;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton devideButton;
    private javax.swing.JButton minusButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton number0Button;
    private javax.swing.JButton number1Button;
    private javax.swing.JButton number2Button;
    private javax.swing.JButton number3Button;
    private javax.swing.JButton number4Button;
    private javax.swing.JButton number5Button;
    private javax.swing.JButton number6Button;
    private javax.swing.JButton number7Button;
    private javax.swing.JButton number8Button;
    private javax.swing.JButton number9Button;
    private javax.swing.JTextField numbersTextField;
    private javax.swing.JButton percentButton;
    private javax.swing.JButton plusButton;
    private javax.swing.JTextField savedNumbersTextField;               
}
