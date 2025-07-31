package junit;

public class Question1 {
	package Junit;

		package com.wipro.task;

		public class DailyTasks {

		    public String doStringConcat(String s1, String s2) {
		        return s1 + s2;
		    }

		    public boolean checkPresence(String str, String subStr) {
		        return str.contains(subStr);
		    }
		}
		package com.wipro.test;

		import static org.junit.Assert.assertEquals;

		import org.junit.Test;

		import com.wipro.task.DailyTasks;

		public class TestStringConcat {

		    @Test
		    public void testDoStringConcat() {
		        DailyTasks dt = new DailyTasks();
		        String result = dt.doStringConcat("Hello", "World");
		        assertEquals("HelloWorld", result);  // JUnit assertion
		    }
		}
}
