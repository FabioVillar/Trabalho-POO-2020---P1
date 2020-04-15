package trabalho;

import java.util.Objects;

public class Movimentacao{
    Tabuleiro t;
    String vetor[];
    static int tamanho;
    static int jogadas = 0;
    int numerizarcoluna(String c){
    	if(Objects.equals(c,"a") == true) {
    		return 0;
    	}
    	if(Objects.equals(c,"b") == true) {
    		return 1;
    	}
    	if(Objects.equals(c,"c") == true) {
    		return 2;
    	}
    	if(Objects.equals(c,"d") == true) {
    		return 3;
    	}
    	if(Objects.equals(c,"e") == true) {
    		return 4;
    	}
    	if(Objects.equals(c,"f") == true) {
    		return 5;
    	}
    	if(Objects.equals(c,"g") == true) {
    		return 6;
    	}
    	return -1;
    }
    Movimentacao(Tabuleiro t, String vetor[]){
        this.t = t;
        this.vetor = vetor;
        String comando = vetor[jogadas];
        String mov[] = comando.split(":");
        String ci = mov[0].substring(0,1);
        String li = mov[0].substring(1,2);
        String cf = mov[1].substring(0,1);
        String lf = mov[1].substring(1,2);
        int l1 = Integer.parseInt(li) - 1;
        int l2 = Integer.parseInt(lf) - 1;
        int c1 = numerizarcoluna(ci);
        int c2 = numerizarcoluna(cf);
        Boolean verif = true;
        //Hora de analisar o movimento da peça
        if(t.p[l2][c2].emjogo != -1 && t.p[l2][c2].emjogo != 1 && t.p[l1][c1].emjogo == 1){
		        if(l1 == l2) {//mov horizontal
		        	if(c1 > c2) {//foi pra esquerda
		        		if(c1 == c2 + 2) {
		        			t.p[l1][c1].emjogo = 0;
		    		        t.p[l2][c2].emjogo = 1;
		        			t.p[l1][c1-1].emjogo = 0;
		        			}
		        		else
		        			verif = false;
		        	}
		        	else if(c1 < c2) {//foi pra direita
		        		if(c2 == c1 + 2) {
		        			t.p[l1][c1].emjogo = 0;
		    		        t.p[l2][c2].emjogo = 1;
		        			t.p[l1][c1+1].emjogo = 0;
		        		}
		        		else
		        			verif = false;
		        	}
		        }
		        else if(c1 == c2) {//movimento vertical
		        	if(l1 > l2) {//desceu
		        		if(l1 == l2 + 2) {
		        			t.p[l1][c1].emjogo = 0;
		    		        t.p[l2][c2].emjogo = 1;
		        			t.p[l1-1][c1].emjogo = 0;
		        		}
		        		else
		        			verif = false;
		        	}
		        	else if(l1 < l2) {//subiu
		        		if(l2 == l1 + 2) {
		        			t.p[l1][c1].emjogo = 0;
		    		        t.p[l2][c2].emjogo = 1;
		        			t.p[l1+1][c1].emjogo = 0;
		        			}
		        		else
		        			verif = false;
		        	}
		        }
		        else if(c1 != c2 && l1 != l2) {//mov impossivel
		        	verif = false;
		        }
		        if(verif == true){
			        System.out.println("\nSource: "+mov[0]);
			        System.out.println("Target: "+mov[1]);
			        t.imprimirtabuleiro();
		        }
        }
        jogadas = jogadas + 1;
    }
}
        
