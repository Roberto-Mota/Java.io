package Projeto.src.testes;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * testesMain
 */
public class triadCamadasDecorator { // 00101110 -> [][][][] -> lorem line bla bla bla || br(isr(fis(lorem.txt)))
    public static void main(String[] args) throws IOException {

            // Fluxo de entrada com um arquivo (tem exceção checked, precisa tratar)
            // Primeira camada:
            FileInputStream fis = new FileInputStream("lorem.txt");
            // O FileInputStream é uma camada que, com o fis.read() lê apenas bits e bytes
            // O FileInputStream especificamente é um dos InputStreams, sendo que existem vários para várias funcionalidades, (Web, Files, etc)

            // Precisa da segunda camada:
            InputStreamReader isr = new InputStreamReader(fis);
            // Aqui transforma os bits e bytes em caracteres (array de caracteres)

            // Terceira camada:
            BufferedReader br = new BufferedReader(isr);
            String linha = br.readLine();
            // O BufferedReader precisa ser fechado

            while(linha != null) {
                System.out.println(linha);
                linha = br.readLine();
            }

            br.close();
    }

}