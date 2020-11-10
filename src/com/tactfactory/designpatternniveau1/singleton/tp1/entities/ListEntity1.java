package com.tactfactory.designpatternniveau1.singleton.tp1.entities;

import java.util.ArrayList;
import java.util.List;

public class ListEntity1 {
	
	List<Entity1> list;
	
    private ListEntity1() {
    	list = new ArrayList<Entity1>();
    	
    	for (int i = 0; i < 20; i++) {
  	      Entity1 e1 = new Entity1();
  	      e1.setId(i);
  	      list.add(e1);
  	    }
    }
     
    private static ListEntity1 INSTANCE = null;
     
    public static final synchronized ListEntity1 getInstance() {           
        if (INSTANCE == null) {   
        	INSTANCE = new ListEntity1(); 
        }
        return INSTANCE;
    }
    
}
