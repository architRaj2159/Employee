package com.lti.codility.lesson1;

public class MoneyChange {
	public int solution(int N) {
		int amount = N;
		int count200 = 0;
		int count100 = 0;
		int count50 = 0;
		while(amount != 0) {
			if(amount>=200) {
				count200++;
				amount -= 200;
			}
			else if(amount < 200 && amount >= 100) {
				count100++;
				amount -= 100;
			}
			else if(amount <100 && amount >= 50) {
				count50++;
				amount -= 50;
			}
		}
		System.out.println(count200);
		System.out.println(count100);
		System.out.println(count50);
		return 0;
	}
	public static void main(String[] args) {
		MoneyChange mc = new MoneyChange();
		int N = 550;
		System.out.println(mc.solution(N));
	}
}
