package com.basics.annotations.annotationIn;

/*
 * Here, element qty -1 hence empty annotation @Book is also OK
 * default value is Spring in action for the attribute otherwise explicitly define to ovveride default
 * 
 * EX - @Book(title="Core Java")public class MyBook{....} or @Book public class MyBook{...}
 * 
 */
public @interface Book {
	public String title() default "Spring in Action";

}
