package PDF;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.junit.Assert;

public class PDFValidation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		File  file = new File("C:\\Users\\Mohammad Hasan\\Documents\\PDFFile\\605tv_03172020.pdf");
	
	
	FileInputStream fi = new FileInputStream (file);
	
	PDFParser parser = new PDFParser(fi);
	
	parser.parse();
	
	 COSDocument cosdoc =   parser.getDocument();
	
	PDDocument  pddoc = new PDDocument(cosdoc);
	
	PDFTextStripper strip = new PDFTextStripper ();
	
	String data =strip.getText(pddoc);
	
	System.out.println(data);
	
	//Assert.assertTrue(data.contains("Chart title"));
	
	//cosdoc.close();
   //pddoc.close();
	
// System.out.println("Text found on the PDF File");
	
	}

}
