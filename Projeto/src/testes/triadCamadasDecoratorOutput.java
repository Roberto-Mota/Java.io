package Projeto.src.testes;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class triadCamadasDecoratorOutput { //Conceitos iniciais no arquivo de Input

    public static void main(String[] args) throws IOException {


            OutputStream fos = new FileOutputStream("loremWrite.txt");
            Writer osw = new OutputStreamWriter(fos);
            BufferedWriter bw = new BufferedWriter(osw);
            
            bw.write("teste, teste, teste");


            bw.close();
    }

}

