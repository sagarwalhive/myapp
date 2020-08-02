package util;

import java.util.Random;

public class RandomGeneration {
	static Random rand = new Random();
	public static String getRandomName(String pre) {
		return pre + rand.nextInt(10000);
	}
	// For testing git
	public static void main(String[] args) {
		System.out.println(RandomGeneration.getRandomName("Title"));
	}

}
