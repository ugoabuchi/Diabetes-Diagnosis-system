/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mrsokiki;

import weka.core.Instances;
import weka.experiment.InstanceQuery;

/**
 *
 * @author hp
 */
public class InstanceFromDatabase 
{
	//method to get instances from database
	//@ return instances 
	public static Instances getInstanceDataFromDatabase(String pSql)
	{
	try 
	{	InstanceQuery query = new InstanceQuery();
		query.setUsername("root");
		query.setPassword("");
		query.setQuery(pSql);
		
		Instances data = query.retrieveInstances();

		if (data.classIndex() == -1)
		{	data.setClassIndex(data.numAttributes() - 1);
		}
		return data;
		} catch (Exception e) {
		throw new RuntimeException(e);
		}
	}
}
