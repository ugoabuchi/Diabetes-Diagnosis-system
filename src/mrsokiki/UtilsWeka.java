/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrsokiki;

/**
 *
 * @author hp
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import weka.core.Instances;
import java.io.BufferedReader;
import java.io.FileReader;
import weka.core.converters.ConverterUtils.DataSource;

public class UtilsWeka {
	
	//method to save instances to file
	//@ return instances
	public static Instances getSampleInstances() {
	    Instances dataset = null;
	    try {
	    		BufferedReader reader = new BufferedReader(new FileReader(
	                "src/mrsokiki/header.arff"));
	        dataset = new Instances(reader);
	        reader.close();
	        dataset.setClassIndex(dataset.numAttributes() - 1);
	    }
	    catch (Exception e) {
	        throw new RuntimeException(e);
	    } 
	    return dataset;

	}
	
	//method to save instances to file
	//@param the information or content and file name
	public static void instancesToFile(Instances contents, String filename) {

	     FileWriter fstream;
	    try {
	        fstream = new FileWriter(filename);
	      BufferedWriter out = new BufferedWriter(fstream);
	      out.write(contents.toString()); 
	      out.close();      
	    } catch (Exception ex) {
	        throw new RuntimeException(ex);
	    }
	}
	
	//method to save instances to file
	//@param the information or content and file name
	public static void saveInstancesToFileSB(String contents, String filename) {

	     FileWriter fstream;
	    try {
	        fstream = new FileWriter(filename);
	      BufferedWriter out = new BufferedWriter(fstream);
	      out.write(contents.toString()); 
	      out.close(); 
	    } catch (Exception ex) {
	        throw new RuntimeException(ex);
	    }
	}
}
