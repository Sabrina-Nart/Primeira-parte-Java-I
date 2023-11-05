
package Exercicio4;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class Exercicio4 {
    public static void main(String[] args) {
        
        //Criação objeto Java = trata todos os ojetos igual 
        //Toda vez que tiver NEW é um objeto
        //Como se fosse o Memo do Delphi   - //5 * 10 = 50 - 7 colunas - Cada caracter é uma coluna
        //Java tem um For pronto
        
        //SetText = Substitui - substitui algo que já existe
        //Append = Acrescenta - acrescenta ao que já existe
        
        JTextArea area = new JTextArea(10, 20); //Precisa passar o número de linhas e coluunas
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número "));
        
        for (int i = 1; i <= 10; i++) { //Se cria dentro do escopo, só vale aqui dentro
            area.append(numero + " x " + i + " = " + (numero * i) + "\n"); //O setText não surge do nada - precisa de algo
                                                                    // \n = Quebra de Linha
        }
        JOptionPane.showInputDialog(null, area); //Fora do For - o setText = aparece só o número * 10, substitui sobra só o último
    
    }
    
}
