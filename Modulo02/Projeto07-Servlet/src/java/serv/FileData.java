
package serv;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileData 
{
    private List<String> texto = new ArrayList<String>(); 
    private String dir;
    private String arq;
    
    public FileData()
    {
        //referencia arquivo de dados
        this.dir = "C:\\User\\Rogerio\\Documents\\Alfamídia\\Java\\Módulo02\\Projeto07-Servlet\\build\\web\\txt\\";
        this.arq = this.dir + "dados.txt";         
    }

    public List<String> getTexto() throws FileNotFoundException, IOException 
    {
            //referencia arquivo de dados
            String dir = "C:\\User\\Rogerio\\Documents\\Alfamídia\\Java\\Módulo02\\Projeto07-Servlet\\build\\web\\txt\\";
            String arq = dir + "dados.txt";

            //abre fluxo de leitura de texto
            FileReader fr = new FileReader(this.arq);
            BufferedReader br = new BufferedReader(fr);

            //faz a leitura por linha
            String linha = "";
            while ((linha = br.readLine()) != null) 
            {
                this.texto.add(linha);
            }

            return texto;
     }
}
