package StudentGUI;
public class Student {

    private String name;
    private int marks[];

    
    public Student() {
        this("", new int[3]);
    }
    
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }
    
    public Student(Student student) {
        this.name = student.name;
        this.marks = student.marks;
    }
    
    public void setName(String nm) {
    	name = nm;
    }

    public void setMark(int whichmark, int number){
    	marks[whichmark-1] = number;
    }

    public int getAverage() {
    	int average = 0;
        for (int i = 0; i < marks.length; i++) {
            average = average + marks[i];
        }
        average = average/marks.length;
    	return average;
    }


    public int getMark(int whichmark) {
	return marks[whichmark-1];
    }

    public int getHighscore() {
        int high = marks[0];
        for (int i = 0; i < marks.length; i++) {
            high = Math.max(high, marks[i]);
        }
    	return high;
    }

    public String toString() {
    	String result = "Name: " + name;
        for (int i = 0; i < marks.length; i++) {
            result = result + "\nMark " + (i + 1) + ":\t" + marks[i];
        }
    	result += "\n~~~~~~~~~~~~~~~~~~";
    	result += "\nAverage:\t" + getAverage();
    	return result;
    }

    public String getName() {
    	return name;
    }

    //validate data
    public String validateData() {
    	String message = "";
    	if(name.equals("") || name == null) {
            message = "Student's name cannot be empty or null.";
        }
        for (int i = 0; i < marks.length; i++) {
            if(marks[i]>100 || marks[i]<0) {
                message = message + "\nMark " + (i + 1) + " is out of range.";
            }
        }
        return message;
    }
 }

