package javabasicprogramms;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

public class CompareTwoMaps {

	@Test

	public void compareTwoTables() {

		List<Map<String, String>> actualTable = Arrays.asList(

				ImmutableMap.of("Name", "PriyaJeet", "Age", "32"), 
				ImmutableMap.of("Name", "Ankurush", "Age", "28"));

		List<Map<String, String>> expectedTable = Arrays.asList(

				ImmutableMap.of("Name", "PriyaJeet", "Age", "32"), 
				ImmutableMap.of("Name", "Ankurush", "Age", "28"));

		Assert.assertEquals(actualTable, expectedTable);

	}

}
