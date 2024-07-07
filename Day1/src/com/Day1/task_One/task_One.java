package com.Day1.task_One;

public class task_One {

	public static void main(String[] args) {
		
		// Area of parallelogram 
		float base = 43.8990f;
		float height = 96.5895f;
		
		float areaOfParallelogram = base * height;
		double areaOfParallelogram1 = base * height;
		System.out.println("Area of parallelogram : " + areaOfParallelogram);
		System.out.println("Area of parallelogram : " + areaOfParallelogram1);
		
		
		// Area of Circle
		
		float radius = 32.89f;
		
		double circle = Math.PI * radius *radius ;
		float circle1 = 3.14f * radius * radius;
		System.out.println("Area of Circle :" + circle);
		System.out.println("Area of Circle1 :" + circle1);
		
		// Area of Square
		
		float side = 59.678f;
		double square = side *side;
		float square1 = side *side;
		System.out.println("Area of Square :" + square);
		System.out.println("Area of Square :" + square1);
		
		
		// Area of Triangle
		float baseT = 89.863f;
		float heightT = 102.89f;
		float triangle = 0.5f * baseT * heightT;
		double triangle1 = 0.5 * baseT * heightT;
		System.out.println("Area of Triangle :" + triangle);
		System.out.println("Area of Triangle :" + triangle1);
		
		// Area of Cylinder
		float radius_cy = 59.25f;
		float height_cy = 98.568f;
		
		double cylinder = (2 * Math.PI * radius_cy * height_cy) + (2*Math.PI*radius_cy);
		float cylinder1 = (2 * 3.14f * radius_cy * height_cy) + (2 * 3.14f * radius_cy);
		
		System.out.println("Area of Cylinder :" + cylinder);
		System.out.println("Area of Cylinder :" + cylinder1);
		
		//fahrenheit to celsius
		
		float fara = 89.254f;
		double celsius = (fara - 32) * 5/9;
		float celsius1 = (fara - 32) * 5/9;
		System.out.println("fara to celsius :" + celsius);
		System.out.println("fara to celsius :" + celsius1);
		
	}

}
