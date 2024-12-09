package Lektion3.Ubung2;

public class Game {
    private int[][] brett;
    private int zeilen;
    private int spalten;

    Game(int zeilen, int spalten) {
        this.zeilen = zeilen;
        this.spalten = spalten;
        this.brett = new int[zeilen][spalten];
        erstell();
        brettAktuallisieren();
    }

    public void erstell() {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                brett[i][j] = (Math.random() < 0.5) ? 0 : 1;
            }
        }
    }

    public void brettAusgeben() {
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                System.out.print(brett[i][j] + " ");
            }
            System.out.println();
        }
    }

    public int nachbarZaehler(int zeile, int spalte) {
        int schwarz = 0;
        int weiss = 0;
        for (int i = zeile - 1; i <= zeile + 1; i++) {
            for (int j = spalte - 1; j <= spalte + 1; j++) {
                if (i == zeile && j == spalte) continue;
                if (i < 0 || i >= zeilen || j < 0 || j >= spalten) continue;
                if (this.brett[i][j] == 1) schwarz++;
                else weiss++;
            }
        }
        return schwarz;
    }


    public int[][] getBrett() {
        return brett;
    }

    public void brettAktuallisieren() {
        int[][] neuesBrett = new int[zeilen][spalten];
        for (int i = 0; i < zeilen; i++) {
            for (int j = 0; j < spalten; j++) {
                int a = nachbarZaehler(i, j);
                if (brett[i][j] == 0) {
                    if (a == 3) neuesBrett[i][j] = 1;
                     else {
                    if (a < 2 || a > 3) neuesBrett[i][j] = 0;
                    else neuesBrett[i][j] = 1;
                }
            }
         }
        brett = neuesBrett;
        }
    }



}

