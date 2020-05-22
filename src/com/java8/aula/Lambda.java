package com.java8.aula;

public class Lambda {
	public static void main (String[] arg) {

		Runnable r = new Runnable() {
		     public void run() {
		         System.out.println("Thread com classe interna!");
		     }
		};
		new Thread(r).start();

		new Thread(() -> System.out.println("Thread com função lambda!")).start();
	}
}
