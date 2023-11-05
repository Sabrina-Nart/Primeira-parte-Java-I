
package fontes;

import javax.swing.JOptionPane;

public class exemploMetodo {
    
    public static int calculaQuadrado(int numero){//Diga o que vai retornar - devolver um inteiro, até isso não acontecer da erro
        return (numero * numero); //Estava dando erro de retorno, até não colocar o retorno que ele espera, vai continuar dando erro 
    
    }
    
    public static int retornaSoma(int numero1, int numero2) { //da para colocar mais de um método = tem que declarar todas, mesmo sendo as mesmas
       return (numero1 + numero2);
       
    }
    
/////////////////////////////////////////////////////////////
    
    public static void mostraMensagem(String exemplo){ 
        JOptionPane.showMessageDialog(null, exemplo);
        
    } //O nome de um não tem nenhuma relação com o outro
    
    public static void main(String[] args) { //nome = variável - []Array - Nome() é um método = assim o java identifica quem é quem
       String exemplo = "Teste de mensagem"; //Conteúdo da mensagem seja visto no Static Void de cima
       mostraMensagem(exemplo);//Vem para cima e executa = está dizendo que é uma String
       mostraMensagem("Outro exemplo de texto"); //Chama o método, vai para cima e depois devolve
        //Variável criada aqui dentro - só aqui = não da só para colocar em cima
        
       //calculaQuadrado(10); Método com retorna e não faz nada
       /* Só para armazenar a variável
       int quadrado = calculaQuadrado(10);
       mostraMensagem("Quadrado: " + quadrado);
       */
       mostraMensagem("Quadrado: " + calculaQuadrado(123)); //Possibilidade melhor
       mostraMensagem("Soma: " + retornaSoma(123, 321)); //Virou uma String = se não da erro
       
    }
    
}
