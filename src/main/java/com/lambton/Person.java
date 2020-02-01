package com.lambton;

public class Person
{
    int Salary;
    void setName(String name) {
        if (name == null)
        {
            throw new NullPointerException(("name cannot be NULL"));
        }
        System.out.println("Name:" + name.length());
    }

    //Not allow to set the salary in < 1_000
    public void  setSalary(int salary) throws  SalaryException
    {
        if (salary < 1000)
        {
            throw new SalaryException("Salary < 1000");
        }
        this.Salary= salary;
    }
}
