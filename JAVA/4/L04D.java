/*Elaborar um programa que efetue o c�lculo e no final apresente o somat�rio do n�mero de gr�os de
trigo que se pode obter num tabuleiro de xadrez, obedecendo � seguinte regra: colocar um gr�o de
trigo no primeiro quadro e nos quadros seguintes o dobro do quadro anterior. Ou seja, no primeiro
quadro coloca-se 1 gr�o, no segundo quadro colocam-se 2 gr�os (neste momento t�m-se 3 gr�os),
no terceiro quadro colocam-se 4 gr�os (tendo neste momento 7 gr�os), no quarto colocam-se 8
gr�os (tendo-se ent�o 15 gr�os) at� atingir o sexag�simo quarto (64o
) quadro. Utilize vari�veis do
tipo real como acumuladores. */

package exercicioApostilaManzano;

public class L04D {
	 public static void main(String[] args) {
		
		 int cont = 1;
		 int soma = 0;
		 int quadro = 1;
		 
		 do {
			 System.out.println("No quadro " + cont + " teremos " + quadro + " gr�os.");
			 soma += quadro;
			 quadro += quadro;
			 cont++;
		 } while (cont <= 64);
		 System.out.println(" O resultado da soma de todos os quadros �: " + soma + ".");
	}
}
