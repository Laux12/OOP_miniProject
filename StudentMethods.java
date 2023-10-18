import java.util.ArrayList;

public class StudentMethods extends Students{
	
	ArrayList<String> studentNames = new ArrayList<>();
	ArrayList<String> studentAddress = new ArrayList<>();
	ArrayList<Integer> studentAge = new ArrayList<>();
	ArrayList<Integer> studentId = new ArrayList<>();
	int index,len;
	void addStudent() {
		studentId.add(this.id);
		studentNames.add(this.studentName);
		studentAddress.add(this.address);
		studentAge.add(this.age);
		
	}
	void update(int id, String newName, String newAddress, int newAge) {
		
		index = studentId.indexOf(id);
		studentNames.set(index, newName);
		studentAddress.set(index, newAddress);
		studentAge.set(index, newAge);
		
	}
	void delete(int id) {
		index = studentId.indexOf(id);
		studentId.remove(index);
		studentNames.remove(index);
		studentAddress.remove(index);
		studentAge.remove(index);
	}
	void search(int id) {
		
		index = studentId.indexOf(id);
		if(index < 0) {
			System.out.println("Student ID not Found, Please Try Again");
		}else {
		String format = "";
		System.out.println("============================Result================================");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("ID%-16sName%-16sAddress%-16sAge%-2s\n",format,format,format,format);
		System.out.println("------------------------------------------------------------------");
		System.out.printf("%-18d%-20s%-23s%d\n",studentId.get(index),studentNames.get(index),studentAddress.get(index), studentAge.get(index));
		//System.out.println(studentId.get(index) + "\t" + studentNames.get(index) + "\t"
		//		+ studentAddress.get(index) + "\t" + studentAge.get(index));
		System.out.println("\n\n=========================End of Result============================\n\n");
		}
	}
	void displayAll() {
		len = studentId.size();
		if(len == 0) {
			System.out.println("\nThere are no Students added yet");
		}else {
		String format = "";		
		System.out.println("\n\n==========================Student List============================");
		System.out.println("------------------------------------------------------------------");
		System.out.printf("ID%-16sName%-16sAddress%-16sAge%2s\n",format,format,format,format);
		System.out.println("------------------------------------------------------------------");
							
		for(int i = 0; i < len;i++) {
			System.out.printf("%-18d%-20s%-23s%d\n",studentId.get(i),studentNames.get(i),studentAddress.get(i), studentAge.get(i));
			
			//System.out.println(studentId.get(i) + "\t" + studentNames.get(i) + "\t"
			//		+ studentAddress.get(i) + "\t" + studentAge.get(i));
		
		}
		System.out.println("\n\n========================End of the List===========================");
		
		}
	}
	
	
}
