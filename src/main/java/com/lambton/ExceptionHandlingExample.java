package com.lambton;

public class ExceptionHandlingExample
{
    public static void main(String[] args) {
        System.out.println("START");
        int d = 10;
        int n = 20;
        int a [] = new int[]{1,2,3};
        Person p = new Person();
        String s = "Hello";
        try
        {
            int fraction = n / d;
            System.out.println("fraction:" + fraction);
            System.out.println("Array value:" + a[2]);
            System.out.println("Length of String:" + s.length());

            p.setName("Thank You");
            p.setSalary(1000);
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error ae: " + e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error aqwe: " + e.toString());
        }
        catch (SalaryException e)
        {
            System.out.println("Error qwer: " + e.getMessage());
        }
        catch (Exception e)
        {
            System.out.println("Error asda: " + e.toString());
        }
        finally
        {
            System.out.println("I am finally block" );
        }

        System.out.println("END");
    }
}
