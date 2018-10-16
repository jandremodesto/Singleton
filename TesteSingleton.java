package br.metodista.dp.singleton;
/**
 *ANÁLISE E DESENVOLVIMENTO DE SISTEMAS - Polo Mauá
 * Modulo: Desenvolvimento Avançado
 * Tópico Avançado em Programação I
 * Prof: Rafael Guimarães Sakurai
 * @author Jandre Modesto da Silva Filho - matrícula 251532
 *  23/08/2018 - 22:00
 */
public class TesteSingleton {
     public static void main(String[] args) {
         
            // Declara as variáveis do tipo Singleton
            Singleton arquivo;
            Singleton index;
            
            // Inicializa as variáveis declaradas, em outras palavras, cria os objetos
            arquivo = Singleton.getInstance();
            index = Singleton.getInstance();
            
            // Os dois objetos devem se referir a mesma instância da classe Singleton
                if (arquivo == index) {
                System.out.println("Os objetos Cliente e Singleton "
                                                 + "são da mesma instância");
                }
        }  
}
           

