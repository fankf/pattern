package com.fankf.pattern.structural.composite.test;

import com.fankf.pattern.structural.composite.entity.Threaf;
import com.fankf.pattern.structural.composite.entity.Tree;

public class TestComposite {
	public static void main(String[] args) {
		Tree tree = new Tree("ÑîÊ÷");
		Threaf threaf = new Threaf("big","yellow");
		Threaf threaf2 = new Threaf("small","green");
		tree.add(threaf);
		tree.add(threaf2);
		System.out.println(tree);
		tree.remove(threaf2);
		System.out.println(tree);
	}
}
