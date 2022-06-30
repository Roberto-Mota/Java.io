package Projeto.src.testes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class TriadInputTeclado {
    public static void main(String[] args) throws IOException {
        
    

    //Gero o buffer do Input e Output:
            InputStream fis = System.in; //Esse System.in tá estranho, me lembro de existir um Scanner
            Reader isr = new InputStreamReader(fis);
            BufferedReader br = new BufferedReader(isr);
            
            OutputStream fos = new FileOutputStream("loremWriteKeyboard.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            
            
            
            String linha = br.readLine();
            
            while(linha != null && !linha.isEmpty()) {
                System.out.println(linha);
                bw.write(linha);
                bw.newLine();
                linha = br.readLine();
            }
            
            bw.close();
            br.close();
        }
}
