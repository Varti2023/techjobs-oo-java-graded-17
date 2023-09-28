package org.launchcode.techjobs.oo;

import org.junit.Test;

import javax.swing.plaf.PanelUI;

import static org.junit.Assert.assertNotEquals;
import static org.testng.Assert.*;

public class JobTest {
    //TODO: Create your unit tests here
    @Test
    public void testSettingJobId(){
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals(job1.getId(),job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Job testJob= new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

        assertTrue(testJob instanceof Job);
        assertTrue(testJob.getName().equals("Product tester"));

        assertTrue(testJob.getEmployer() instanceof Employer);
        assertTrue(testJob.getEmployer().getValue().equals("ACME"));

        assertTrue(testJob.getLocation() instanceof Location);
        assertTrue(testJob.getLocation().getValue().equals("Desert"));

        assertTrue(testJob.getPositionType() instanceof PositionType);
        assertTrue(testJob.getPositionType().getValue().equals("Quality control"));

        assertTrue(testJob.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(testJob.getCoreCompetency().getValue().equals("Persistence"));

    }

    @Test
    public void testJobsForEquality(){
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //Job job2 =  job1;
        assertFalse(job1.equals(job2));
    }
 @Test
 //  TEST JOBS FOR START AND END WITH A NEW LINE
    public void testToStringStartsAndEndsWithNewLine (){
        Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String line  = System.lineSeparator();
        System.out.println(line.charAt(0));
        int len = testJob.toString().length()-1;

        assertTrue(testJob.toString().charAt(0) == line.charAt(0));
        assertTrue(testJob.toString().charAt(len) == line.charAt(line.length()-1));
 }

 @Test
 // TEST JOBS FOR LABEL IN JOBS INFORMATION.
    public void testToStringContainsCorrectLabelsAndData(){

         String newLine = System.lineSeparator();
         Job testJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
         String actual = newLine +"ID: "
                        +testJob.getId() +newLine+"Name: "+testJob.getName()+
                        newLine+"Employer: "+testJob.getEmployer()+
                        newLine+"Location: "+testJob.getLocation()+
                        newLine+"Position Type: "+testJob.getPositionType()+
                        newLine+"Core Competency: "+testJob.getCoreCompetency()+
                        newLine;

        assertEquals(actual , testJob.toString());
 }
 @Test
 // TEST JOBS FOR EMPTY FIELDS
    public void testToStringHandlesEmptyField(){

         String newLine = System.lineSeparator();
         String message = "Data not available";
         Job testJob = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));

         String actual = newLine +"ID: "
                 +testJob.getId() +newLine+"Name: "+message+
                 newLine+"Employer: "+testJob.getEmployer()+
                 newLine+"Location: "+testJob.getLocation()+
                 newLine+"Position Type: "+testJob.getPositionType()+
                 newLine+"Core Competency: "+testJob.getCoreCompetency()+
                 newLine;

            assertEquals(actual , testJob.toString());
 }

}
