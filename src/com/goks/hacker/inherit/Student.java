/**
 * 
 */
package com.goks.hacker.inherit;

/**
 * @author ramachan
 *
 */
class Student extends Person {
    
    
    private int[] testScores;

    Student(String firstName, String lastName, int identification) {
	super(firstName, lastName, identification);
	// TODO Auto-generated constructor stub
    }
    /*
     * Class Constructor
     * 
     * @param firstName - A string denoting the Person's first name.
     * 
     * @param lastName - A string denoting the Person's last name.
     * 
     * @param id - An integer denoting the Person's ID number.
     * 
     * @param scores - An array of integers denoting the Person's test scores.
     */
    // Write your constructor here
    Student(String firstName, String lastName, int id, int scores[]) {
        super(firstName, lastName, id);
        testScores = scores;
    }

    /*
     * Method Name: calculate
     * 
     * @return A character denoting the grade.
     */
    // Write your method here
    char calculate(){
        int total = 0;
        for(int i=0;i<testScores.length;i++) {
            total = total + testScores[i];
        }
        int avg = total/testScores.length;
        char grade = 'T';
        if(avg >= 90) {
            grade = 'O';
        } else if(avg >= 80) {
            grade = 'E';
        } else if(avg >= 70) {
            grade = 'A';
        } else if(avg >= 55) {
            grade = 'P';
        } else if(avg >= 40) {
            grade = 'D';
        }
        return grade;   
    }
}