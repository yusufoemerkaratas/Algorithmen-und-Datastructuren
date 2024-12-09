package Lektion3.Ubung1;

import javax.swing.*;
import java.awt.*;

public class GridVisualisierung extends JPanel {
    private int[][] brett;
    private int zeilen;
    private int spalten;

    public GridVisualisierung(int[][] brett, int zeilen, int spalten) {
        this.brett = brett;
        this.zeilen = zeilen;
        this.spalten = spalten;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int zellenBreite = getWidth() / spalten; // Her hücrenin genişliği
        int zellenHoehe = getHeight() / zeilen; // Her hücrenin yüksekliği

        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                if (brett[i][j] == 1) {
                    g.setColor(Color.BLACK); // Siyah hücre
                } else {
                    g.setColor(Color.WHITE); // Beyaz hücre
                }
                g.fillRect(j * zellenBreite, i * zellenHoehe, zellenBreite, zellenHoehe);
                g.setColor(Color.GRAY); // Hücre kenarları
                g.drawRect(j * zellenBreite, i * zellenHoehe, zellenBreite, zellenHoehe);
            }
        }
    }

    public void setBrett(int[][] neuesBrett) {
        this.brett = neuesBrett;
        repaint(); // Pencereyi güncelle
    }
}
