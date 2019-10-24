package PKG;


import java.util.ArrayList;

public class FachadaEditor {

	  private ArrayList<String> paragrafos = new ArrayList<String>();
	  private Exportador exportador;
	 
	  public ArrayList<String> getParagrafos() {

		  return paragrafos;
	  }

	  public void adicionarParagrafo(String texto) {

	    paragrafos.add(texto);
	  }

	  public String exportar() {

	    return exportador.exportar(paragrafos);
	  }

	  public void setExportadorHTML() {

	    exportador = ExportadorHTML.getInstance();
	  }

	  public void setExportadorTXT() {

	    exportador = ExportadorTXT.getInstance();
	  }

	  public void setExportadorXML() {

	    exportador = ExportadorXML.getInstance();

	  }

	}