package com.dev.test;

import org.junit.Test;

import com.dev.CodeChallenge;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Unit test for simple App.
 */
public class AppTest
{
	
	@Test
    public void testApp()
    {
        int[] expectedOutput = {3,1,7,4,2,6};
        int[] arrNumbers = {3,4,2,1,6,7};
        
        CodeChallenge code = new CodeChallenge();
        List<Integer> inputList = 
        		Arrays.stream(arrNumbers).boxed().collect(
    					Collectors.toList());
        List<Integer> actualList = code.sortIntegerList(inputList);
        int[] actualOutCome = actualList.stream().mapToInt(i->i).toArray();
        
        assertArrayEquals(expectedOutput, actualOutCome);

    } 
}
