package br.metodista.dp.singleton;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação I
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  23/08/2018 - 22:00
 */
public final class Singleton {
        // Objeto singleton que será retornado
        private static final Singleton singleton = new Singleton();
        private FileWriter arquivo;
        private static Cliente index;
        // O construtor é privado, pois impede a instanciação pelos clientes
        private Singleton(){
            try {
                this.arquivo= new FileWriter("C:\\NetBeansProjects\\PadraoCriacao\\src\\br\\metodista\\dp\\singleton\\index");
            } catch (IOException ex) {
                Logger.getLogger(Singleton.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        // retorna o objeto estático singleton
        public static Singleton getInstance() {
             return singleton;
        }
}

