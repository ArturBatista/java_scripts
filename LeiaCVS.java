import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class LeiaCVS {

    public static void main(String[] args) {

        LeiaCVS obj = new LeiaCVS();
        obj.run();

    }

    public void run() {

        //String arquivoCSV = "arquivo.csv";
        String arquivoCSV = "arquivo.csv";
        BufferedReader br = null;
        String linha = "";
        String csvDivisor = ",";

        Integer pub = 0;
        Integer pubP = 0;
        Integer pubV = 0 ;
        Integer pubH = 0 ;
        Integer pubR = 0 ;
        Integer pubE = 0 ;

        Integer pa = 0;
        Integer paP = 0;
        Integer paV = 0;
        Integer paH = 0;
        Integer paR = 0;
        Integer paE = 0;

        Integer pr = 0;
        Integer prP = 0;
        Integer prV = 0;
        Integer prH = 0;
        Integer prR = 0;
        Integer prE = 0;

        try {

            br = new BufferedReader(new FileReader(arquivoCSV));
            while ((linha = br.readLine()) != null) {

                String[] line =  linha.split(csvDivisor);

                if(!line[1].equalsIgnoreCase("pub")){

                    if(line[6].equalsIgnoreCase("p")){
                        pub++;
                        pubP = pubP + Integer.parseInt(line[1]);
                    }

                    if(line[6].equalsIgnoreCase("pa")){
                        pa++;
                        paP = paP + Integer.parseInt(line[1]);
                    }

                    if(line[6].equalsIgnoreCase("pr")){
                        pr++;
                        prP = prP + Integer.parseInt(line[1]);
                    }
                    
                }

                if(!line[2].equalsIgnoreCase("videos")){

                    if(line[6].equalsIgnoreCase("p")){
                        pubV = pubV + Integer.parseInt(line[2]);
                    }

                    if(line[6].equalsIgnoreCase("pa")){
                        paV = paV + Integer.parseInt(line[2]);
                    }

                    if(line[6].equalsIgnoreCase("pr")){
                        prV = prV + Integer.parseInt(line[2]);
                    }
                    
                }

                if(!line[3].equalsIgnoreCase("horas")){

                    if(line[6].equalsIgnoreCase("p")){
                        pubH = pubH + Integer.parseInt(line[3]);
                    }

                    if(line[6].equalsIgnoreCase("pa")){
                        paH = paH + Integer.parseInt(line[3]);
                    }

                    if(line[6].equalsIgnoreCase("pr")){
                        prH = prH + Integer.parseInt(line[3]);
                    }
                    
                }

                if(!line[4].equalsIgnoreCase("revisita")){

                    if(line[6].equalsIgnoreCase("p")){
                        pubR = pubR + Integer.parseInt(line[4]);
                    }

                    if(line[6].equalsIgnoreCase("pa")){
                        paR = paR + Integer.parseInt(line[4]);
                    }

                    if(line[6].equalsIgnoreCase("pr")){
                        prR = prR + Integer.parseInt(line[4]);
                    }
                    
                }

                if(!line[5].equalsIgnoreCase("estudo")){

                    if(line[6].equalsIgnoreCase("p")){
                        pubE = pubE + Integer.parseInt(line[5]);
                    }

                    if(line[6].equalsIgnoreCase("pa")){
                        paE = paE + Integer.parseInt(line[5]);
                    }

                    if(line[6].equalsIgnoreCase("pr")){
                        prE = prE + Integer.parseInt(line[5]);
                    }
                    
                }
                
            }

            System.out.println("=========================Publicadores===========================");

            System.out.println("Total de relatorios: " + pub );
            System.out.println("Total de publicacoes: " + pubP );
            System.out.println("Total de videos: " + pubV );
            System.out.println("Total de horas: " + pubH );
            System.out.println("Total de revisitas: " + pubR );
            System.out.println("Total de estudos: " + pubE );

            System.out.println("================================================================");


            System.out.println("=========================Pioneiros Auxiliares====================");

            System.out.println("Total de relatorios: " + pa );
            System.out.println("Total de publicacoes: " + paP );
            System.out.println("Total de videos: " + paV );
            System.out.println("Total de horas: " + paH );
            System.out.println("Total de revisitas: " + paR );
            System.out.println("Total de estudos: " + paE );

            System.out.println("================================================================");

            System.out.println("=========================Pioneiros Regulares====================");

            System.out.println("Total de relatorios: " + pr );
            System.out.println("Total de publicacoes: " + prP );
            System.out.println("Total de videos: " + prV );
            System.out.println("Total de horas: " + prH );
            System.out.println("Total de revisitas: " + prR );
            System.out.println("Total de estudos: " + prE );

            System.out.println("================================================================");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}