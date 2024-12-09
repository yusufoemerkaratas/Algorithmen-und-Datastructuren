package Lektion3.Ubung1;

public class Brett {
    private int[][] brett;
    private int zeilen;
    private int spalten;


    Brett(int zeilen,int spalten){
    this.zeilen=zeilen;
    this.spalten=spalten;
    this.brett= new int[zeilen][spalten];
    brettInitalisieren();
     }
     public void brettInitalisieren(){
        for(int i=0;i<zeilen;i++){
            for(int j =0;j < spalten;j++){
                if(i==0 || i==zeilen-1 || j==0 || j==spalten-1) {
                    brett[i][j]=1;
                }else{
                    if((i+j)%2==0) brett[i][j]=1;
                    else brett[i][j]=0;
                }

            }
        }
     }
     public void brettAusgeben() {
         for (int i = 0; i < zeilen; i++) {
             for (int j = 0; j < spalten; j++) {
                 System.out.print(brett[i][j]+" ");
             }
             System.out.println();
         }
     }
     public void brettAktualiseren(){
        int[][] neubrett=new int[zeilen][spalten];
        for(int i =0;i<zeilen;i++){
            for(int j =0;j<spalten;j++){
             neubrett[i][j] = nachbarZaehler(i,j);
            }
        }
        brett=neubrett;

     }
     public int nachbarZaehler(int zeile,int spalte){
        int schwarz=0;
        int weiss=0;
        for(int i =zeile-1;i<=zeile+1;i++){
            for(int j =spalte-1;j<=spalte+1;j++){
                if(i==zeile && j==spalte) continue;
                if (i < 0 || i >= zeilen || j < 0 || j >= spalten) continue;
                if(this.brett[i][j]==1) schwarz++;
                else weiss++;
            }
        }
        if(schwarz>weiss) return 1;
        else return 0;
     }


    public int[][] getBrett() {
        return brett;
    }
}
