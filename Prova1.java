/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package avaliacao.n1;

/**
 *
 * @author Luiz Bastos <luizfelipebastossantana@gmail.com>
 * @date 08/03/2024
 * @brief Class Prova1
 */
import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        
       //Declarando variáveis e atribuindo valores.
        int opcao=0, qde_expresso=0, qde_capuccino=0,
                qde_leite_com_cafe=0, qde_cafes_vendios, qde_pao_de_queijo=0, qde_torrada=0, qde_leite_achocolatado=0;
        
        double valor_expresso, valor_capuccino,valor_leite_com_cafe, valor_cafes_vendidos, valor_pao_de_queijo, valor_leite_achocolatado, valor_torrada;
        
        Scanner sc = new Scanner(System.in);
        
        //Utilização do "do/while, afim de atribuir funcionalidade para cada opção selecionada pelo usuário.
        
        do {
            System.out.println("Forneça uma opção: \n"+
                    "1 - café expresso; \n"+
                    "2 - café capuccino; \n"+
                    "3 - leite com café; \n"+
                    "4 - leite com achocolatado; \n"+
                    "5 - pão de queijo; \n"+
                    "6 - torrada; \n"+
                    "7 - totaliza6 vendas;");
            
            opcao = sc.nextInt();
            
            //Atribuição de condicional para opção escolhida.
            
                if(opcao == 1)qde_expresso++;
            else 
                if(opcao == 2)qde_capuccino++;
            else 
                if(opcao == 3)qde_leite_com_cafe++;
            else
                if(opcao == 4)qde_leite_achocolatado++;
            else
                if(opcao == 5)qde_pao_de_queijo++;
            else
                if(opcao ==6)qde_torrada++;
            else
                if(opcao != 7)
                    System.out.println("Opção inválida");
        
        } while (opcao != 4);
        
        //Atribuição de valores considerando cada variável anteriormente declarada.
        
        valor_expresso = qde_expresso * 0.75;
        valor_capuccino = qde_capuccino * 1.50; 
        valor_leite_com_cafe = qde_leite_com_cafe * 1.25;
        valor_leite_achocolatado = qde_leite_achocolatado * 2.0;
        valor_pao_de_queijo = qde_pao_de_queijo * 1.50;
        valor_torrada = qde_torrada * 3.0;
        valor_cafes_vendidos = valor_expresso + valor_capuccino + valor_leite_com_cafe;
        
        //Saída.
        
        System.out.println("Qde café expresso: " + qde_expresso + " - valor: " + valor_expresso);
        System.out.println("Qde café capuccino: " + qde_capuccino + " - valor: " + valor_capuccino);
        System.out.println("Qde leite com café: " + qde_leite_com_cafe + " - valor: " + valor_leite_com_cafe);
        System.out.println("Total de cafés vendidos: " + (qde_expresso + qde_capuccino + qde_leite_com_cafe) + " - valor total de vendas: " + valor_cafes_vendidos);
    }
}