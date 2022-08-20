package org.launchcode.techjobs.oo.test;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.launchcode.techjobs.oo.*;

import static org.junit.Assert.*;

/**
 * Created by LaunchCode
 */
@RunWith(JUnit4.class)
public class JobTest {

    @Test
    public void testSettingJobId() {
        Job job1 = new Job();
        Job job2 = new Job();
        assertNotEquals( job1.getId(), job2.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        Job job = new Job ("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        String expected = "Product tester";
        String actual = job.getName();
        assertEquals(expected, actual);
        //The instanceof keyword can be used to check the class of an object. The result of the comparison is a boolean
        //objectName instanceof ClassName
        assertTrue( job.getName() instanceof String );

        assertEquals("ACME", job.getEmployer().getValue());
        assertTrue( job.getEmployer().getValue() instanceof String);

        assertEquals("Desert", job.getLocation().getValue());
        assertTrue( job.getLocation().getValue() instanceof String);

        assertEquals( "Quality control", job.getPositionType().getValue());
        assertTrue( job.getPositionType().getValue() instanceof String );

        assertEquals( "Persistence", job.getCoreCompetency().getValue());
        assertTrue( job.getCoreCompetency().getValue() instanceof String );

    }

    @Test
    public void testJobsForEquality() {
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job();
       // assertEquals(job.toString().charAt(0),'\n' );
        assertEquals('\n', job.toString().charAt(0) );
    }

    @Test
    public void testToStringContainsCorrectLabelsAndData() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        //String expected = "\nID: " + job.getId() + "\nName: Product tester" + "\nEmployer: ACME" + "\nLocation: Desert" + "\nPosition Type: Quality control" + "\nCore Competency: persistence";
        String expected = "\nID: "+job.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence";
        String actual = job.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testToStringHandlesEmptyField() {
        Job job = new Job("", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+job.getId() +
                "\nName: Data no available" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence", job.toString());

        Job job2 = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+job2.getId() +
                "\nName: Product tester" +
                "\nEmployer: Data no available" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence", job2.toString());

        Job job3 = new Job("Product tester", new Employer("ACME"), new Location(""), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+job3.getId() +
                "\nName: Product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Data no available" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence", job3.toString());

        Job job4 = new Job("product tester", new Employer("ACME"), new Location("Desert"), new PositionType(""), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+job4.getId() +
                "\nName: product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Data no available" +
                "\nCore Competency: Persistence", job4.toString());

        Job job5 = new Job("product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        assertEquals("\nID: "+job5.getId() +
                "\nName: product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Data no available", job5.toString());

        Job job6 = new Job("product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        assertEquals("\nID: "+job6.getId() +
                "\nName: product tester" +
                "\nEmployer: ACME" +
                "\nLocation: Desert" +
                "\nPosition Type: Quality control" +
                "\nCore Competency: Persistence", job6.toString());


//        Job job7 = new Job();
//        assertEquals("OOPS! This job does not seem to exist.", job7.toString());


    }



}
