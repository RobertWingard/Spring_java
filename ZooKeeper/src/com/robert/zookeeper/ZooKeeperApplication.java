package com.robert.zookeeper;

public class ZooKeeperApplication {

	public static void main(String[] args) {
		Mammal ZooKeeper = new Mammal(1000);
		Gorilla Monkey1 = new Gorilla(100);
			ZooKeeper.displayEnergy();
			ZooKeeper.getEatBananas();
			ZooKeeper.getClimb();
			Monkey1.displayEnergy();
			Monkey1.throwSomething("apple");
			Monkey1.eatBananas("banana");
			Monkey1.climb("rock");
		Gorilla Monkey2 = new Gorilla(100);
			Monkey2.throwSomething("grape");
			Monkey2.throwSomething("grape");
			Monkey2.throwSomething("grape");
			Monkey2.eatBananas("banana");
			Monkey2.eatBananas("banana");
			Monkey2.climb("tree");
	}

}
