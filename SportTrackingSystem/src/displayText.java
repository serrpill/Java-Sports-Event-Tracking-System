/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ramco
 */
class displayText extends MainForm {
    /**
     * Overrides the displayMessage method from the parent class.
     */
    @Override
    public void displayMessage() {
        System.out.println("Displaying a message from SubForm class");
    }

//overloaded method
    public void displayMessage(javax.swing.JComboBox<String> comboBox) {
            String selectedValue = (String) comboBox.getSelectedItem();
            System.out.println("Selected Value: " + selectedValue);
    }

}