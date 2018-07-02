/**
 *  @author Dhananjay
 */
package com.cql.loader;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import org.hl7.elm.r1.Library;

/**
 * @author Dhananjay
 *
 */
public class ELMLoader {

	private static JAXBContext jaxbContext;
	public static void main(String[] args) throws JAXBException {
		jaxbContext = JAXBContext.newInstance(Library.class);
		
		Unmarshaller um = jaxbContext.createUnmarshaller();
		Library library = (Library)um.unmarshal(new File("AdultMajorDepressiveDisorderMDDSuicideRiskAssessment-7.2.000.xml"));
		library.getStatements().getDef().stream().forEach(e -> { System.out.println(e.getName());});
	}
	
}
