package com.ing.exchange.plateform;
import org.junit.Before;
import org.junit.Rule;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.text.ParseException;

public class TestprojectApplicationTests {

	@Rule
	public MockitoRule mockitoRule = MockitoJUnit.rule();

	@Before
	public void setup() throws ParseException {
		MockitoAnnotations.initMocks(this);
	}

	public void happypathtest(){

	}


}