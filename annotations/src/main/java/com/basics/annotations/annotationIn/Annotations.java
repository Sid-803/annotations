package com.basics.annotations.annotationIn;

import java.util.ArrayList;
import java.util.List;

/*
 * What is annotations in java?
 * It is the form of meta-data. i.e It behaves like the code about the code.
 * An annotation provides the supporting info about the java program
 * 
 * Basically, annotations are interfaces having parameters/ elements/ attributes/ as method declarations
 * 
 * Annotations can be applied over class, or and methods, fields, parameters, packages etc.
 * 
 * Types of annotations: 1. Empty 2. With elements (non empty) 3. Repeating 4. Predefined (Predefined annotations have their own classifications)
 * 
 */
public class Annotations {
	
	//1. @Override  @Book
	//2.1-Named @Book(name="Core Java", author="RK Sharma") or @SuppressWarning(value="unchecked")
	//2.2-UnNamed @SuppressWarning("unchecked")
	//3. They can be declared multiple times over field, class, method params etc.
	//4. Predefined - These are annotations declared within Java
	
		//4.1- @Deprecated - marked element is deprecated and should not be used.
			//Syntax
			/*
			 * @deprecated  'Note- lowercase d'
			 * explanation why it was derecated
			 * 
			 */
			@Deprecated
			static void duplicatemethod() {}
			
		//4.2- @Override - needs to specify that implement overrides declaration in superclass
			//Syntax
			//@Override
			static void overrideInherited() {}
			
		//4.3- @SuppressWarning - annotation tell compiler to stop specific warnings that it would otherwise generate.
			@SuppressWarnings("deprecation")
			static void deprecatedMethod() {
				//deprecated warning
				duplicatemethod();
			}
			
			@SuppressWarnings("unchecked")
			public void legacyCodeWarning() {
				//legacy code- collection without generics
				List list = new ArrayList(); 
			}
			
			//multiple allowed @SuppressWarnings({"unchecked", "deprecation"})
			
		//4.4- @SafeVarags - ignoring unchecked warnings relating to varargs
			
		//4.5 @FunctionalInterface - java SDK1.8 feature. 
		
		//4.6 @Retention represents the retaining level of annotation such as source, class or runtime
		
		//4.7 @Target - annotation indicates the part of your Java program where the Annotation applies like class, method, field, constructor, parameter etc
			/*type- class, 
			 * field - property or fields, 
			 * constructor - constructor, 
			 * local_variable- local var, 
			 * method - method, 
			 * package, 
			 * parameter, ...
			 */
		
		//4.8 @Documented - will be part of java doc tool
			
		//4.9 @Inherited - we can inherit the annotation type from super class.
		
		//4.10 @Repeatable - It could be repeated at implementation

}
