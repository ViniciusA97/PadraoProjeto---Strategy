package PKG;

import java.util.ArrayList;

public class ExportadorHTML implements Exportador {
	
	private static ExportadorHTML  instance;
	
	private ExportadorHTML() {
		
	}
	
	public String exportar(ArrayList<String> paragrafos) {

	    String res = "<html><body>\n";

	    for (String parag : paragrafos) {

	      res += "<p>" + parag + "</p>\n";

	    }

	    return res + "</body></html>";

	  }
	public static ExportadorHTML getInstance() {
		if(instance==null) {
			instance= new ExportadorHTML();
		}
		return instance;
	}
}