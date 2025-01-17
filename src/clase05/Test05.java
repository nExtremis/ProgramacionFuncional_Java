package clase05;

import javax.swing.*;

public class Test05{
    public static  void main(String[] args) {
        String cadena = "Hello";
        JFrame ventana = new JFrame();

        ventana.setSize(500,500);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton b = new JButton("Hola mundo");

        b.addActionListener(e -> System.out.println(cadena));

        ventana.add(b);

        ventana.setVisible(true);


    }


}
