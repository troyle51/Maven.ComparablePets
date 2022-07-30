package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class petTestCompares {
    @Test
    public void testCompare(){
        // given
        Pet pet = new Dog("doggo");
        Pet pet2 = new Dog("doggo");

        //when
        Assert.assertEquals(0, pet.compare(pet, pet2));
    }
    @Test
    public void testCompareTo(){
        // given
        Pet pet = new Dog("doggo");
        Pet pet2 = new Dog("doggo");

        //when
        Assert.assertEquals(0, pet.compareTo(pet2));
    }
}
