package test.modules.components;

import org.springframework.stereotype.Component;

@Component(value = "testComponent")
public class TestComponent {

	private String test = "123";
	
	public TestComponent() {}

	public String getTest() {
		return test;
	}

	public void setTest(String test) {
		this.test = test;
	};
	
	
	
}
