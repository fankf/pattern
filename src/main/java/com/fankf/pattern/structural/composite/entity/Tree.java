package com.fankf.pattern.structural.composite.entity;

import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Tree {
	private String treeName;
	private List<Threaf> list;
	
	public Tree(String treeName) {
		super();
		this.treeName = treeName;
		list = new ArrayList<>();
	}
	
	public void add(Threaf threaf) {
		this.list.add(threaf);
	}

	public void remove(Threaf threaf) {
		this.list.remove(threaf);
	}
}
