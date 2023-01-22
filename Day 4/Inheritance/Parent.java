package com.finserv.java.inheritance;

public class Parent {
int p=10;
int pid;
public Parent()
{
	System.out.println("From Non Parametrized Parent constructor");
}
public Parent(int pid)
{
	this.pid = pid;
}
public void display()
{
	System.out.println("From Parent Display");
}
}
