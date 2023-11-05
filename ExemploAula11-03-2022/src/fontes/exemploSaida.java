
package fontes;
//Maneiras de mostrar algo na tela

import javax.swing.JOptionPane;

public class exemploSaida { //No começo deixar sempre a opção de main desativada
    public static void main(String[] args) { //Main=principal - começa com isso - ctrl barra de espaço, facilita
        /*
       //Shift F6 = Executar - Console, abre um output
        System.out.println("Hello World");  //Escreva - atalho, sout    
        //Concatenando um inteiro com uma string - soma entre string e inteiro resulta/entende que o resultado final seja string
        System.out.println("Valor inteiro: "+15); //Tudo isso se tornou uma string
        System.out.println("Valor da Soma: "+(15+10)); //precedencia de operadores, O que é feito primeiro o () 
        //- somar /Amarelo mostra de quem é o ()
        int x = 10;
        int y = 3; //Java - Não faz distinção de operação - entende = inteiro de um lado e do outro, resultado inteiro
        //-string com string, resultado é uma string
        System.out.println("Valor da Divisão:"+(x/(double)y)); //("Valor da Divisão:"+(x/3));=alguém tem que deixar de ser inteiro
        //Type Casting - informando ao Java que o que está ali, não é do tipo que ele acha, considera que só o y é um double, mas nem sempre dá certo
        
        //JOptionPane = escreva e leia -option - Usar esse
        JOptionPane.showMessageDialog(null, "Hello World"); //Null, indicar algum outro componente visual, component parent
        //null significa que não está vinculado a nada, mostrar só no meio da tela, pois não tem nehuma tela, etc
        //Classe em Java - portabilidade - executar em qualquer lugar - não tem nenhuma API do Windows - só objetos Java
        JOptionPane.showMessageDialog(null,"Valor inteiro: "+15);
        //Customização
        JOptionPane.showMessageDialog(null, "Hello World","Título",JOptionPane.ERROR_MESSAGE); //Texto, Título, Ícone e Erro)

       //Questionar algo para o usuário - imput=saída
       */
        
        //minusculo = tipos primitivos / tipos compostos = maiusculo, não é tão comm
        String nome = JOptionPane.showInputDialog("Nome"); //Modelo único - resultado=string
        //O nome que foi digitado vai para a string=guardado
        
        /*String s_idade = JOptionPane.showInputDialog("Idade"); - não faz sentido ter essa linha
        int idade = Integer.parseInt(s_idade);*/ //s_idade = JOptionPane.showInputDialog("Idade");
        int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade")); //erro com todo valor que não seja string int idade = 
        //O parenteses mais interno é executado primeiro - 1 variável e encurta uma linha
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário"));
    }   
    
}
