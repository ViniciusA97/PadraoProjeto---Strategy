package PKG;

import java.util.ArrayList;

public class ExportadorTXT implements Exportador {

	private static ExportadorTXT instance;   
	public String exportar(ArrayList<String> paragrafos) {

	    String res = "";

	    for (String parag : paragrafos) {

	      res += parag + "\n";

	    }
	    return res;

	  }
	private ExportadorTXT() {
		
	}
	public static ExportadorTXT getInstance() {
		if(instance==null) {
			instance= new ExportadorTXT();
		}
		return instance;
	}


	}