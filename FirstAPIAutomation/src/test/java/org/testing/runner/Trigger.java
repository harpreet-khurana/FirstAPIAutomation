package org.testing.runner;

import java.io.IOException;

import org.testing.testcases.TC1_PostRequest;
import org.testing.testcases.TC2_replaceVarPost;
import org.testing.testcases.TC3_getAllRequest;
import org.testing.testcases.TC3_getAllRequestUsingOrgJson;
import org.testing.testcases.TC3_getParticularRequest;
import org.testing.testcases.TC4_updateRequest;
import org.testing.testcases.TC5_deleteRequest;
import org.testing.testcases.TC6_getAllEmployess;
import org.testing.testcases.TC7_getParticularEmployee;
import org.testing.testcases.TC8_PostEmployee;
//import org.testing.testcases.TC9_UpdateEmployee;

public class Trigger
{
	public static void main(String[] args) throws IOException 
	{
		TC1_PostRequest tc1 = new TC1_PostRequest();
		tc1.testCase1();
		
		TC2_replaceVarPost tc2 = new TC2_replaceVarPost();
		tc2.testCase2();
		
		TC3_getAllRequest tc3 = new TC3_getAllRequest();
		tc3.testCase3();
	
		TC3_getAllRequestUsingOrgJson tc3_1 = new TC3_getAllRequestUsingOrgJson();
		tc3_1.testCase3_1();
	
		TC3_getParticularRequest tc3_2 = new TC3_getParticularRequest();
		tc3_2.testCase3_2();
		
		TC4_updateRequest tc4 = new TC4_updateRequest();
		tc4.testCase4();
		
		TC5_deleteRequest tc5 = new TC5_deleteRequest();
		tc5.testCase5();
		
		TC6_getAllEmployess tc6 = new TC6_getAllEmployess();
		tc6.testCase6();
		
		TC7_getParticularEmployee tc7 = new TC7_getParticularEmployee();
		tc7.testCase7();
		
		TC8_PostEmployee tc8 = new TC8_PostEmployee();
		tc8.testCase8();
		
		//TC9_UpdateEmployee tc9 = new TC9_UpdateEmployee();
		//tc9.testCase9();
	}

}
