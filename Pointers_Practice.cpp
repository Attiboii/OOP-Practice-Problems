#include <iostream>

//Solutions and comments provided by: Addison Arnold
//uncomment code blocks to see the solutions working

//Exercise #1

//Write a program that asks the user to enter integers as inputs to be stored in the 
//variables 'a' and 'b' respectively.There are also two integer pointers named ptrA 
//and ptrB. Assign the values of 'a' and 'b' to ptrA and ptrB respectively, and display them.






//SOLUTION **********
//_____________________________________________________________

int main() {

	//int a, b; //containers for integers a and b
	//int* ptrA;		//2 pointers of the same type needed aka int type
	//int* ptrB;

	//std::cout << "Please Enter Integer Number for a: "; //ask user to input integer for a
	//std::cin >> a;										//allow user to unputer integer
	//std::cout << "Please Enter Integer Number for b: "; //ask user for b integer
	//std::cin >> b;										//get integer b

	//ptrA = &a;	//assign pointer values to the addresses of the integers
	//ptrB = &b;

	//std::cout << *ptrA << std::endl; // print dereferenced pointers ***if they are not dereferenced they will only display the address of the containers***
	//std::cout << *ptrB << std::endl;


	//return 0;

//_____________________________________________________________


//Exercise #2
//
//
//Write a C++ program to find the max of an integral data set.The program will ask the
//user to input the number of data values in the set and each value.The program prints 
//on screen a pointer that points to the max value.
//
//
//
//SOLUTION **********
//_____________________________________________________________


	//array size is dynamic must allocate space in heap or make array size static
	//but because the problem asks for the user to define the size we must consider the array as dynamic

	//int x;
	//int i;
	//int y;
	//int maxval = 0;
	//
	//std::cout << "Please enter the amount of integers you want in your array: ";
	//std::cin >> x;

	////allocate space for the dynamic array:

	//int* array;
	//array = new int[x];

	////for loop to enter data into array

	//for (i = 0; i < x; i++) {
	//	std::cout << "Please enter next value in array: ";
	//	std::cin >> y;
	//	array[i] = y;

	//}

	//for (i = 0; i < x; i++) {
	//	if (array[i] > maxval) {
	//	
	//		maxval = array[i];
	//	}
	//}


	//// you can print maxval directly or you can create a pointer to reference it then dereference it in std::cout
	//std::cout << maxval << std::endl;

	////or

	//int* ptr = &maxval;
	//std::cout << *ptr << std::endl;

	////deallocate space for array

	//delete[] array;

	////Because we had to allocate space in the heap for the array you must also deallocate the space so 
	////no extra space is taken in the heap

	//return 0;


//_____________________________________________________________
//
//
//
//Exercise #3
//
//Take input in variable and display same value by pointer.
//
//
//
//SOLUTION **********
//_____________________________________________________________



	//int x;
	//int* xptr = &x;

	//std::cout << "Please enter a value: ";
	//std::cin >> x;

	//std::cout << "The number you entered is: " << *xptr << std::endl << "the address is : " << xptr;
	//


	//return 0;
}



//_____________________________________________________________


