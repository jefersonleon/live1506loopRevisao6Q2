
package live1506desafio6q2;

import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Live1506Desafio6Q2 {

    /**
     *Foi feita uma pesquisa entre os habitantes de uma região. Foram coletados
     * os dados de idade, sexo (M/F) e salário. Faça um algoritmo que informe:
     *  a média de salário do grupo;
     *  maior e menor idade do grupo;
     *  quantidade de mulheres com salário até R$100,00.
     * Encerre a entrada de dados quando for digitada uma idade negativa.
     * (Use o comando while).
     */
    public static void main(String[] args) {
       int idade, sexo, contPessoa,maiorIdade, menorIdade, contM100;
       double salario,acSalario;
       contPessoa = 0; contM100 = 0; idade = 0; acSalario = 0; maiorIdade = -9999;
       menorIdade = 9999;
       
       while(idade>=0){
            idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a idade"
                 + "\nou digite uma idade negativa para sair.\nEscolha:"));
           if(idade>=0){
               if(idade > maiorIdade){
                   maiorIdade = idade;
               }
               if(idade < menorIdade){
                   menorIdade = idade;
               }
              sexo = Integer.parseInt(JOptionPane.showInputDialog("Informe o sexo"
                 + "\n1 - Masculino ou 2 - Feminino;\nEscolha:"));
          salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salario"
                 + "\nDigite aqui:"));
           acSalario += salario;// acumula os salario 
           contPessoa++;//conta a quantas pessoas - para calcular a media salarial
           if(sexo == 2 && salario <= 100 ){
               contM100++;
           }
           
           }else{
               JOptionPane.showMessageDialog(null, "Fim da Pesquisa");
               JOptionPane.showMessageDialog(null, "A média de salários é: R$"
                       +(acSalario/contPessoa)
               +"\nexiste(m) "+contM100+" mulher(es) com salario até R$ 100,00"
               +"\nMaior idade do grupo: "+maiorIdade
               +"\nMenor idade do grupo: "+menorIdade);
               
           }   
       }
       
    }
    
}
