package homework;

public class HarrisCalebAssignment8 {

	public static void main(String[] args) {

		// initialize grades arrays
		int[] gradesSection1 = { 40, 55, 70, 58, 82 };
		int[] gradesSection2 = { 91, 76, 68, 89, 94, 84, 71, 65, 88 };

		// calls processGrades method
		System.out.println("Section 1");
		System.out.println("------------------------------------------------------------------");
		processGrades(gradesSection1);
		System.out.println("\nSection 2");
		System.out.println("------------------------------------------------------------------");
		processGrades(gradesSection2);

		// manipulate dog class as described

		// creates an array of 5 dog objects
		Dog[] dogArray = new Dog[5];

		// create 5 dog objects with 5 lines as described
		Dog dog1 = new Dog("Rover", "woof woof");
		Dog dog2 = new Dog("Max", "arf arf arf");
		Dog dog3 = new Dog("Tiny", "yap yap yap");
		Dog dog4 = new Dog("Trooper", "ruff ruff ruff");
		Dog dog5 = new Dog("Magoo", "bow wow bow wow");

		// place dogs into array
		dogArray[0] = dog1;
		dogArray[1] = dog2;
		dogArray[2] = dog3;
		dogArray[3] = dog4;
		dogArray[4] = dog5;

		// make dogs bark
		System.out.println("------------------------------------------------------------------\n");
		makeDogsBark(dogArray);

	} // end main

	// processes grades for needed data
	public static void processGrades(int[] grades) {

		// finds highest grade
		int highestGrade = findHighestGrade(grades);

		// finds average grade
		double averageGrade = computeAverageGrade(grades);

		// initializes letterGrades Array
		char[] letterGrades = new char[grades.length];
		computeLetterGrades(grades, letterGrades, highestGrade);

		// displays the results
		displayDetails(grades, letterGrades, highestGrade, averageGrade);

	} // end processGrades

	// finds the highest grade
	public static int findHighestGrade(int[] grades) {

		// initializes highest grade
		int highestGrade = 0;

		// walks array for highest value
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] > highestGrade) {
				highestGrade = grades[i];
			}
		}

		return highestGrade;

	} // end findHighestGrade

	// computes the letter grades
	public static void computeLetterGrades(int[] grades, char[] letterGrades, int highestGrade) {

		// assigns each grade a letter based on the score
		for (int i = 0; i < grades.length; i++) {
			if (grades[i] >= highestGrade - 10) {
				letterGrades[i] = 'A';
			}

			else if (grades[i] >= highestGrade - 20) {
				letterGrades[i] = 'B';
			}

			else if (grades[i] >= highestGrade - 30) {
				letterGrades[i] = 'C';
			}

			else if (grades[i] >= highestGrade - 40) {
				letterGrades[i] = 'D';
			}

			else {
				letterGrades[i] = 'F';
			}
		}

	} // end computeLetterGrades

	// computes the average of the grades
	public static double computeAverageGrade(int[] grades) {

		// initialize averageGrade
		double averageGrade = 0;

		// gets sum of numbers
		int sum = 0;
		int i = 0;
		while (i < grades.length) {
			sum = (grades[(i)] + sum);
			i++;
		}

		// calculates average
		averageGrade = (sum / (double) grades.length);

		return averageGrade;

	} // end computeAverageGRade

	// displays results for processed data
	public static void displayDetails(int[] grades, char[] letterGrades, int highestGrade, double averageGrade) {
		System.out.println("Student:     Score:     LetterGrade:     ");
		System.out.println("------------------------------------------------------------------");
		// displays results
		for (int i = 0; i < grades.length; i++) {
			System.out.println("# " + (i + 1) + "             " + grades[i] + "               " + letterGrades[i]);
		}
		System.out.println("\nHighest Grade: " + highestGrade);
		System.out.printf("Average Grade: %.2f\n", averageGrade);

	} // end displayDetails

	// makes dogs bark
	public static void makeDogsBark(Dog[] dogArray) {

		for (int i = 0; i < dogArray.length; i++) {
			System.out.println(dogArray[i].getName() + " barks like this: " + dogArray[i].getBark());
		}

	} // end makeDogsBark

} // end HarrisCalebAssignment8

class Dog {

	private String name;

	private String bark;

	public Dog(String name, String bark) {

		this.bark = bark;  
		this.name = name;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBark() {
		return bark;
	}

	public void setBark(String bark) {
		this.bark = bark;
	}

} // Dog
