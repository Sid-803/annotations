package com.basics.annotations.annotationIn;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * Here, we have meta annoation Retention (Annotation executes by JVM) and Target(means its class level annotation)
 * Here, we have three attributes to custom annotation
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface Movie {
	public String title() default "Sholay";

	public String genre() default "Drama";

	public String origin() default "India";

}
