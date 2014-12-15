package modelo;

import java.util.Arrays;
import java.util.Random;

public class Dado {

	private int cara;
	private int testAleatorio[] = { 0, 0, 0, 0, 0, 0, 0 };

	public Dado() {

	}

	public int getCara() {
		return cara;
	}

	public void setCara(int cara) {
		this.cara = cara;
	}

	public int lanzarDado() {
		Random random = new Random();
		cara = random.nextInt(6) + 1;
		return cara;
	}
	public void realizarTest(int numerotiradas){
		Random random = new Random();
		int sumatorio1=0,sumatorio2=0,sumatorio3=0,sumatorio4=0,sumatorio5=0,sumatorio6=0,i;
		for (i=0;i<numerotiradas;i++){
			cara = random.nextInt(6) + 1;
			switch(cara){
			case 1:
				sumatorio1=sumatorio1+1;
				testAleatorio[1]=sumatorio1;
				break;
			case 2:
				sumatorio2=sumatorio2+1;
				testAleatorio[2]=sumatorio2;
				break;
			case 3:
				sumatorio3=sumatorio3+1;
				testAleatorio[3]=sumatorio3;
				break;
			case 4:
				sumatorio4=sumatorio4+1;
				testAleatorio[4]=sumatorio4;
				break;
				
			case 5:
				sumatorio5=sumatorio5+1;
				testAleatorio[5]=sumatorio5;
				break;
				
			case 6:
				sumatorio6=sumatorio6+1;
				testAleatorio[6]=sumatorio6;
				break;
			}
		}
		System.out.println(" ");
		System.out.println("------Lanzamientos del dado-------");
		System.out.println(" ");
		System.out.println("Cara 1 Ha salido: " +testAleatorio[1] + " veces ");
		System.out.println("Cara 2 Ha salido: " +testAleatorio[2] + " veces");
		System.out.println("Cara 3 Ha salido: " +testAleatorio[3] + " veces");
		System.out.println("Cara 4 Ha salido: " +testAleatorio[4] + " veces");
		System.out.println("Cara 5 Ha salido: " +testAleatorio[5] + " veces");
		System.out.println("Cara 6 Ha salido: " +testAleatorio[6]+ " veces" );
		
	}

}
