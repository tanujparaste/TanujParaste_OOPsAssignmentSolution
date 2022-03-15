package io.github.tanujparaste.deptroutine.main;

import io.github.tanujparaste.deptroutine.model.AdminDepartment;
import io.github.tanujparaste.deptroutine.model.HrDepartment;
import io.github.tanujparaste.deptroutine.model.TechDepartment;

public class Main {

    public static void main(String[] args) {
	// display Admin Department functionalities
	AdminDepartment adminDept = new AdminDepartment();
	System.out.println("Welcome to " + adminDept.departmentName());
	System.out.println(adminDept.getTodaysWork());
	System.out.println(adminDept.getWorkDeadline());
	System.out.println(adminDept.isTodayAHoliday());

	System.out.println();

	// display Hr Department functionalities
	HrDepartment hrDept = new HrDepartment();
	System.out.println("Welcome to " + hrDept.departmentName());
	System.out.println(hrDept.doActivity());
	System.out.println(hrDept.getTodaysWork());
	System.out.println(hrDept.getWorkDeadline());
	System.out.println(hrDept.isTodayAHoliday());

	System.out.println();

	// display Tech Department functionalities
	TechDepartment techDept = new TechDepartment();
	System.out.println("Welcome to " + techDept.departmentName());
	System.out.println(techDept.getTodaysWork());
	System.out.println(techDept.getWorkDeadline());
	System.out.println(techDept.getTechStackInformation());
	System.out.println(techDept.isTodayAHoliday());
    }

}
