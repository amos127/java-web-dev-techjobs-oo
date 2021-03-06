package org.launchcode.techjobs_oo.Tests;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {

    Job testJobOne;
    Job emptyJob;

    @Before
    public void createJobObject() {
        testJobOne = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        emptyJob = new Job();
    }

    @Test
    public void testSettingJobId() {
        assertNotEquals(testJobOne.getId(), emptyJob.getId());
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
        assertNotEquals(testJobOne.getId(), emptyJob.getId());
    }

    @Test
    public void toStringBeginsAndEndsWithBlankLines() {
        assertTrue(testJobOne.toString().startsWith("\n"));
        assertTrue(testJobOne.toString().endsWith("\n"));
    }

    @Test
    public void toStringHasLabelAndDataForEachField() {
        String testString = "\nID: " + testJobOne.getId()
                + "\nName: " + testJobOne.getName()
                + "\nEmployer: " + testJobOne.getEmployer()
                + "\nLocation: " + testJobOne.getLocation()
                + "\nPosition Type: " + testJobOne.getPositionType()
                + "\nCore Competency: " + testJobOne.getCoreCompetency() + "\n";
        assertEquals(testString, testJobOne.toString());
    }

    @Test
    public void toStringNullValuesReturnNoDataMessage() {
        emptyJob.setName("Librarian");
        String testString = "\nID: " + emptyJob.getId()
                + "\nName: " + emptyJob.getName()
                + "\nEmployer: Data not available"
                + "\nLocation: Data not available"
                + "\nPosition Type: Data not available"
                + "\nCore Competency: Data not available"
                + "\n";
        assertEquals(testString, emptyJob.toString());
    }

    @Test
    public void toStringReturnsErrorMessageIfJobHasNoData() {
        assertEquals("OOPS! This job does not seem to exist.", emptyJob.toString());
    }

}
