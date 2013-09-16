package com.packpro03;

import com.jayway.android.robotium.solo.By;
import com.jayway.android.robotium.solo.Solo;

import android.test.ActivityInstrumentationTestCase2;

public class ClassTCPro03 extends ActivityInstrumentationTestCase2{

	private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME="com.mapmyfitness.android.activity.Launcher";
	private static Class launcherActivityClass;
	static{
	try{
	launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
	} catch (ClassNotFoundException e){
	throw new RuntimeException(e); } }
	
	public ClassTCPro03() {
		super(launcherActivityClass);
		// TODO Auto-generated constructor stub
	}
	private Solo solo;
	//@Override
	protected void setUp() throws Exception {
	solo = new Solo(getInstrumentation(),getActivity());
	}
	
public void testMMFapk() throws InterruptedException {
		
		/*solo.waitForView(0);
		solo.getCurrentViews();			
        				
        solo.clickOnWebElement(By.xpath(".//*[@id='current_members']/a"));
        solo.waitForView(0);
        //solo.clickOnWebElement(By.
        
        solo.enterTextInWebElement(By.xpath(".//*[@id='username_or_email']"), "TesterVindas");
        solo.enterTextInWebElement(By.xpath(".//*[@id='sign_in_password']"), "mmf123");
        
        solo.clickOnWebElement(By.xpath(".//*[@id='sign-in-button']"));*/
        
        solo.waitForActivity("com.mapmyfitness.android.activity.Dashboard");
        
        solo.clickOnButton("Workouts");
        solo.waitForActivity("com.mapmyfitness.android.activity.Workouts");        
        solo.waitForText("Last week");
        solo.clickOnScreen(200, 120);
        
        solo.waitForActivity("com.mapmyfitness.android.activity.WorkoutDetail");
        
        solo.clickOnScreen(450, 50);
        solo.waitForText("Facebook");
        solo.clickOnText("Facebook");
        solo.waitForDialogToOpen(10000);
        solo.enterText(0,"Facebook - Robotium Test Case 01");
        solo.clickOnButton(1);
        solo.waitForDialogToClose(10000);
        
        solo.waitForActivity("com.mapmyfitness.android.activity.WorkoutDetail");
        solo.waitForActivity("com.mapmyfitness.android.activity.LoginActivity");
           
	}		
	public void tearDown() throws Exception {
	//solo.finishOpenedActivities();
	}
}
