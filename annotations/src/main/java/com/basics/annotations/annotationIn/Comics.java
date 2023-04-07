package com.basics.annotations.annotationIn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface Comics {
	public String[] title() default {"Hello","Oiooo"};
	public int count() default 2;

}
