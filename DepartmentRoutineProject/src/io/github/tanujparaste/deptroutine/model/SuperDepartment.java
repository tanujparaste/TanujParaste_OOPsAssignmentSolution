package io.github.tanujparaste.deptroutine.model;

import io.github.tanujparaste.deptroutine.service.IDepartmentService;

public class SuperDepartment implements IDepartmentService {
    public String departmentName() {
	return "Super Department";
    }

    public String getTodaysWork() {
	return "No work as of now";
    }

    public String getWorkDeadline() {
	return "Nil";
    }

    public String isTodayAHoliday() {
	return "Today is not a holiday";
    }
}
