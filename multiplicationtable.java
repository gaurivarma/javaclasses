package com.firstproject;

public class multiplicationtable  //class created
{
//5*1=5
	//5*10=50
	void print() {
		print(5);
	}
void print(int table,int from,int to)
{
	for (int i = from; i <= to; i++) {
		System.out.printf("%d*%d=%d", table, i, table * i).println();

	}
}

void print(int table) {
	print(table, 1, 10);
}

}