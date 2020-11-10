package com.tactfactory.designpatternniveau1.singleton.tp1;

import java.util.ArrayList;
import java.util.List;

import com.tactfactory.designpatternniveau1.singleton.tp1.entities.$missing$;
import com.tactfactory.designpatternniveau1.singleton.tp1.entities.Entity1;

/**
*
* @author tactfactory
*
* - Modifier le programme pour :
*   - 1 : permettre d'accéder n'importe où dans le projet à la liste d'Entity1
*   - 2 : faire en sorte que les ajouts, suppresions sur la liste d'Entity1 soient préservés durant l'exécution du
*       programme
*   - 3 : que les id des éléments dans la liste ne soient plus saisissables par le développeur et qu'ils deviennent
*       auto-incrémentés
*/
public class SingletonTp1 {
  public static void main(String[] args) {

    System.out.println(String.format("Nombre d'Entity1 %d", getEntity1s().stream().count()));

    Entity1 e11 = new Entity1();
    e11.setId(15);
    e11.setData("data e1 15");

    getEntity1s().add(e11);

    Entity1 e12 = new Entity1();
    e12.setId(16);
    e12.setData("data e1 16");

    getEntity1s().add(e12);

    for (Entity1 item : getEntity1s()) {
      System.out.println(item);
    }
  }

  private static List<Entity1> getEntity1s(){
	    for (int i = 0; i < 20; i++) {
	      Entity1 e1 = new Entity1();
	      e1.setId(i % 15);
	      e1.setData("data " + i);
	      result.add(e1);
	    }

	    return result;
	  }
}
