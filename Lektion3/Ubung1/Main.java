package Lektion3.Ubung1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        int zeilen = 10;
        int spalten = 10;

        // Grid ve görselleştirme
        Brett brett = new Brett(zeilen, spalten);
        JFrame frame = new JFrame("Zellulärer Automat");
        GridVisualisierung panel = new GridVisualisierung(brett.getBrett(), zeilen, spalten);

        frame.add(panel);
        frame.setSize(500, 500); //
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        // Iterasyonları görselleştir
        for (int i = 1; i <= 10; i++) { // 10 iterasyon
            System.out.println("\nIterasyon " + i + ":");
            brett.brettAktualiseren(); // Grid'i güncelle
            panel.setBrett(brett.getBrett()); // Görselleştirmeyi güncelle
            Thread.sleep(2000); // 1 saniye bekle
        }
    }
}
