package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
    }

    @Test
    public void testConstructorWithAll() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";
        String[] expectedLikes = {"Fun", "Corn", "Fun Corn"};
        boolean alive = true;
        Person parent = new Person("Shirley", 45);
        int expectedHeight = 175;
        int expectedWeight = 145;

        // When
        Person person = new Person(expectedName, expectedAge, expectedLikes, expectedHeight, expectedWeight, alive, parent);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();
        String[] actualLikes = person.getLikes();
        int actualHeight = person.getHeight();
        int actualWeight = person.getWeight();
        boolean actualAlive = person.getAlive();
        Person actualParent = person.getParent();

        Assert.assertEquals(expectedAge, actualAge);
        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedLikes, actualLikes);
        Assert.assertEquals(expectedHeight, actualHeight);
        Assert.assertEquals(expectedWeight, actualWeight);
        Assert.assertEquals(alive, actualAlive);
        Assert.assertEquals(parent, actualParent);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetHeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setHeight(expected);

        // Then
        Integer actual = person.getHeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setWeight(expected);

        // Then
        Integer actual = person.getWeight();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetAlive() {
        // Given
        Person person = new Person();
        boolean expected = true;

        // When
        person.setAlive(expected);

        // Then
        boolean actual = person.getAlive();
        Assert.assertEquals(expected, actual);

        expected = false;
        // When
        person.setAlive(expected);

        // Then
        actual = person.getAlive();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetLikes() {
        // Given
        Person person = new Person();
        String[] expected = {"Sunsets", "Long walks", "Thin mints"};

        // When
        person.setLikes(expected);

        // Then
        String[] actual = person.getLikes();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testSetParent() {
        // Given
        Person person = new Person();
        Person expected = new Person();

        // When
        person.setParent(expected);

        // Then
        Person actual = person.getParent();
        Assert.assertEquals(expected, actual);
    }
}
