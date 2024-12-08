package Lektion2.Ubung2b;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Liste {
        Candle[] array = new Candle[1];
        int size = 0;
        int capacity = 1;

        public Candle get(int i) {
            if(i>=size || i<0) throw new IndexOutOfBoundsException("Wrong index");
            return this.array[i];
        }

        public int size() {
            return size;
        }

        public void add(Candle y) {
            if (size == capacity) {
                this.capacity *= 2 ;

                Candle[] neu =new  Candle[capacity];
                int i = 0;
                while (i < size) {
                    neu[i] = array[i];
                    i++;
                }
                array = neu;
            }
            array[size] = y;
            size++;
        }

        public Candle getLast() {
            if(size==0) throw new IllegalStateException("List is empty");
            Candle a = array[size - 1];
            size-=1;
            return a;
        }
        public int search(Candle y){
            for(int i =0;i<size;i++){
                if(array[i].equals(y)){
                    return i;
                }
            }
            return  -1;
        }
        public void loadFile(String fileName){
            try(BufferedReader buf = new BufferedReader(new FileReader(fileName))){
                String line;
                 line=buf.readLine();
                while((line= buf.readLine())!=null){
                    if (line.trim().isEmpty()) {
                        continue;
                    }

                    String[] wert=line.split(",");
                    if(wert.length!=6){
                        continue;
                    }
                    Candle neu=new Candle(wert[0],
                            Double.parseDouble(wert[1]),
                            Double.parseDouble( wert[2]),
                            Double.parseDouble(wert[3]),
                            Double.parseDouble(wert[4]),
                            Integer.parseInt(wert[5]));

                    this.add(neu);

                }
            }catch (IOException e){
                System.out.println(e.getMessage());
            }catch(NumberFormatException e){
                System.out.println(e.getMessage());
            }
        }
}



