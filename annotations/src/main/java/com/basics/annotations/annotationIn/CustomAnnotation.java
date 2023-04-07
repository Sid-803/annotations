package com.basics.annotations.annotationIn;


public class CustomAnnotation {
	
	/*
	 * 1. use @interface followed by annotation name
	 * 2. will have @Retention and @Target as meta-annotation
	 * 3. can have only one associated retention policy (source, runtime, class)
	 * 4. can have more than one target
	 * 5. All annotations extend java.lang.annotation.Annotation interface.
	 * 6. Elements/ parameters/ attributes: These are represented by method declaration inside body of annotation type. No implementations needed.
	 * the return type of such methods should be primitive type - String, CLass, enum, An annotation type, or An array of any of the five preceding types. 
	 * NOTE- Annotations cant include extend clause
	 * 
	 */
	
	
	@Book(title="Core Java")
	public class MyBook{
		
	}
	
	@Movie(title="Dharma", genre="Action-Comedy", origin="UK")
	public class MovieInstance{
		
	}
	
	@Comics(title= {"Mogli", "Jungle"}, count =2)
	public void getComicsDetail() {
		
	}
	
	
	
}
