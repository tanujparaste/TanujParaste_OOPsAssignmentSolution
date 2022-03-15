package io.github.tanujparaste.deptroutine.service;

public interface IDepartmentService {
    public String departmentName();

    public String getTodaysWork();

    public String getWorkDeadline();

    public String isTodayAHoliday();
}
