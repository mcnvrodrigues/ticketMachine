package br.calebe.ticketmachine.core;


import br.calebe.ticketmachine.exception.PapelMoedaInvalidaException;
import br.calebe.ticketmachine.exception.SaldoInsuficienteException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class TicketMachinePrincipal 
{
    public static void main(String [] args)
    {
        TicketMachine tm = new TicketMachine(5);
        int escolha;
        int sair = 0;
        Scanner sc = new Scanner(System.in); 
        
        while(sair != 1)
        {            
            System.out.printf("Valor do ticket = R$ 5,00\n");                                 
            
            
            System.out.printf("Escolha=\n1 - Inserir\n2 - Emitir\n3 - Troco\n4 - Sair\nX = ");
            escolha = sc.nextInt();
            
            switch(escolha)
            {
                case 1:
                    System.out.printf("Insira uma nota por vez:\nValor = ");
            {
                try {
                    tm.inserir(sc.nextInt());
                } catch (PapelMoedaInvalidaException ex) {
                    System.out.printf(ex.getErro());
                }
            }
                    break;
                case 2:
                    System.out.printf("\n*************Imprimindo Bilhete****************\n");
                    tm.saldo = tm.saldo - tm.valor;
                    break;
                case 3:
                    System.out.printf("\n*******************************************\n");
                    System.out.printf("TROCO\n");
                    for(int i = 0; i < 6; i++)
                    {
                        if(tm.getTroco().papeisMoeda[i].getQuantidade() > 0)
                        {
                            System.out.printf("Notas de %d = %d\n", tm.getTroco().papeisMoeda[i].getValor(), tm.getTroco().papeisMoeda[i].getQuantidade() );
                        }
                    }
                    tm.saldo = 0;
                    System.out.printf("\n*******************************************\n");
                    break;
                case 4:
                   
                    sair = 1;
                    
                    break;
                default:
                    System.out.println("Opcao Invalida!");
            }
            
            try {
                System.out.printf("\nSaldo = %s\n\n",tm.imprimir());
            } catch (SaldoInsuficienteException ex) {
                System.out.printf(ex.getErro());
            }
            
           
        }
    }
    
}
