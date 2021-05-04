#include <iostream>

using std::string;

class Absraction {
	// pure virtual function
	virtual void promotion() = 0;

};


class Employee:Absraction { //classes are private by defualt
private:
	//if these variables are under protected you can access these variables directly in child class
	string Name; //does not represent data but represents a blueprint
	string Company;
	int Age; //since attributes are now private you must setter and getter functions

public:

	//class methods

	void setName(string name) { //setter function
	
		Name = name;
	}

	string getName() {	//getter function
		return Name;
	}

	void intro() {
	
		std::cout << "Name - " << Name << std::endl;
		std::cout << "Company - " << Company << std::endl;
		std::cout << "Age - " << Age << std::endl;
	}
	Employee(string name, string company, int age) {
	
		Name = name;
		Company = company;
		Age = age;

	}

	void promotion() {
		if (Age > 30)
			std::cout << Name << "Promotion" << std::endl;
		else
			std::cout << Name << "No Promotion" << std::endl;
	}


};

//developer is child class and employee is parent/super class
class Developer:public Employee {
public:
	string FavProg;
	Developer(string name, string company, int age, string lang)
		:Employee(name,company,age)
	{
		FavProg = lang;
	
	}

	void FixBug() {
	
		std::cout << getName() << " fixed bug using " << FavProg << std::endl;
	
	}


};



int main() {

	/*Employee employee1 = Employee("Addison", "Tocix Players", 45);
	employee1.intro();

	Employee employee2 = Employee("john", "Tesla", 32);
	employee2.intro();*/

	Developer d = Developer("Addison","Toxic Players", 23,"C++");
	d.FixBug();

	return 0;
}