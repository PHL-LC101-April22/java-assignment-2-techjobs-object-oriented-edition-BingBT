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
        Job job1 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence");
        Job job2 = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence");
        assertFalse(job1.equals(job2));
    }

    @Test
    public void testToStringStartsAndEndsWithNewLine() {
        Job job = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence");
        assertEquals(job.toString().charAt(0),'\n' );
    }

}
