package com.Actitime.testScript;

import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.ActitimeGenricLibrary.Baseclass;
import com.ActitimeGenricLibrary.Filelibrary;
import com.ActitimeGenricLibrary.ListerImplemention;

import Objectreposetry.HomePage;
import Objectreposetry.Taskpage;
@Listeners(ListerImplemention.class)
public class Createcustomer extends Baseclass {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getTask().click();
		Taskpage tp=new Taskpage(driver);
		tp.getAddnew().click();
		tp.getNewcust().click();
		Filelibrary f=new Filelibrary();
		String name = f.readdataExcel("PAWAN", 1, 1);
		tp.getCustname().sendKeys(name);
		f.readdataExcel("PAWAN", 1, 2);
		tp.getDsccutomer().click();
		tp.getNewcust().click();
		
		
		
	}

}
