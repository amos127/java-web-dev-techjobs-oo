package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class JobTest {

    Job testJobOne;
    Job testJobTwo;

    @Before
    public void createJobObject() {
        testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        testJobTwo = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobId() {
        assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", testJobOne.getName());
        assertTrue(testJobOne.getName() instanceof String);

        assertEquals("ACME", testJobOne.getEmployer().getValue());
        assertTrue(testJobOne.getEmployer() instanceof Employer);

        assertEquals("Desert", testJobOne.getLocation().getValue());
        assertTrue(testJobOne.getLocation() instanceof Location);

        assertEquals("Quality control", testJobOne.getPositionType().getValue());
        assertTrue(testJobOne.getPositionType() instanceof PositionType);

        assertEquals("Persistence", testJobOne.getCoreCompetency().getValue());
        assertTrue(testJobOne.getCoreCompetency() instanceof CoreCompetency);
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(testJobOne.getId() == testJobTwo.getId());
    }

}
