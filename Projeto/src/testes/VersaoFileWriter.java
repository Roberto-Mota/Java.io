package Projeto.src.testes;

import java.io.IOException;
import java.io.FileWriter;

public class VersaoFileWriter {

    public static void main(String[] args) throws IOException {
        
    

        //Gero o buffer do Output:
        // OutputStream fos = new FileOutputStream("teste.txt");
        // Writer osw = new OutputStreamWriter(fos);
        // BufferedWriter bw = new BufferedWriter(osw);

        // FileWriter estende a classe OutputStreamWriter, que por sua vez estende a classe Writer.
        // Então o FileWriter é um OutputStreamWriter e é um Writer.
        FileWriter fw = new FileWriter("loremFileWriter.txt");
            
                fw.write("1° linha");
                fw.write("\n"); // Não tem newLine no FileWriter, dai tem que ser na mão
                fw.write(System.lineSeparator()); //Essa versão mais generica para interpretar o OS do usuario e fazer uma separação de linhas
                fw.write("3° linha");
            
            fw.close();
        }
}
