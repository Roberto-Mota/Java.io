package Projeto.src.testes;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TesteSerializacao {
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

        // // Gravando um objeto em bin (serializando um objeto String)
        // String name = "Paulo Mota";
        // ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objeto.bin"));
        // oos.writeObject(name);
        // oos.close();

        // // Lendo um arquivo bin e atribuindo em um objeto (desserialização)
        // ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objeto.bin"));
        // String nome = (String) ois.readObject();
        // ois.close();
        // System.out.println(nome);

        // Serialização com um objeto custom

        Cliente cliente = new Cliente();
        cliente.setCpf("00033355599");
        cliente.setNome("Paulo");
        cliente.setProfissao("Desenvolvedor Cloud");

        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("objetoCliente.bin"));
        oos.writeObject(cliente);
        oos.close();

                // Lendo um arquivo bin e atribuindo em um objeto custom (desserialização)
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("objetoCliente.bin"));
        Cliente clienteLido = (Cliente) ois.readObject();
        System.out.println("Cliente lido: " + clienteLido.getNome());
        System.out.println();
        ois.close();
    }
}
