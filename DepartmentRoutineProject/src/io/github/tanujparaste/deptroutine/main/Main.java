package io.github.tanujparaste.deptroutine.main;

import io.github.tanujparaste.deptroutine.model.AdminDepartment;
import io.github.tanujparaste.deptroutine.model.HrDepartment;
import io.github.tanujparaste.deptroutine.model.TechDepartment;

public class Main {

    public static void main(String[] args) {
	// Admin Department
	AdminDepartment adminDept = new AdminDepartment();
	// display all functionalities
	System.out.println("Welcome to " + adminDept.departmentName());
	System.out.println(adminDept.getTodaysWork());
	System.out.println(adminDept.getWorkDeadline());
	// get holiday information with the help of super class
	System.out.println(adminDept.isTodayAHoliday());

	System.out.println();

	// Hr Department
	HrDepartment hrDept = new HrDepartment();
	System.out.println("Welcome to " + hrDept.departmentName());
	System.out.println(hrDept.doActivity());
	System.out.println(hrDept.getTodaysWork());
	System.out.println(hrDept.getWorkDeadline());
	System.out.println(hrDept.isTodayAHoliday());

	System.out.println();

	// Tech Department
	TechDepartment techDept = new TechDepartment();
	System.out.println("Welcome to " + techDept.departmentName());
	System.out.println(techDept.getTodaysWork());
	System.out.println(techDept.getWorkDeadline());
	System.out.println(techDept.getTechStackInformation());
	System.out.println(techDept.isTodayAHoliday());
    }

}
