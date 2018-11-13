package de.juli.jelastic;

import java.io.Serializable;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Named;


@Named("home")
@RequestScoped
public class IndexBean implements Serializable {
	private static final long serialVersionUID = 1L;
	private String name = "Uli";
	private int init = 0;
	private int constructor = 0;
	
	public IndexBean() {
		constructor++;
		System.out.println(this.getClass().getName() + " constructor: "+constructor);
	}
	
	@PostConstruct
	public void init() {
		init++;
		System.out.println(this.getClass().getName() + " init: "+init);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
