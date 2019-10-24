package PKG;

import java.util.ArrayList;

public class ExportadorXML implements Exportador {

	private static ExportadorXML instance;	
	
	  public String exportar(ArrayList<String> paragrafos) {

	    String res = "<doc>\n";

	    for (String parag : paragrafos) {

	      res += "<parag>" + parag + "</parag>\n";

	    }

	    return res + "</doc>";

	  }
	 private ExportadorXML() {
		 
	 }
	 public static ExportadorXML getInstance() {
		 if(instance==null) instance= new ExportadorXML();
		 return instance;
	 }

	}