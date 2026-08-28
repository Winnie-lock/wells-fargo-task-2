package com.wellsfargo.counselor.entity;

import javax.persistence.*;
import java.time.LocalTime;

@Entity
@Table(name = "system_access")
public class SystemAccess {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "system_id")
    private Long systemId;

    @Column(name = "access_start_time")
    private LocalTime accessStartTime;

    @Column(name = "access_end_time")
    private LocalTime accessEndTime;

    @Column(name = "working_days")
    private String workingDays;

    @ManyToOne
    @JoinColumn(name = "advisor_id", nullable = false)
    private Advisor advisor;

    protected SystemAccess() {}

    public SystemAccess(LocalTime accessStartTime, LocalTime accessEndTime, String workingDays, Advisor advisor) {
        this.accessStartTime = accessStartTime;
        this.accessEndTime = accessEndTime;
        this.workingDays = workingDays;
        this.advisor = advisor;
    }

    public Long getSystemId() {
        return systemId;
    }

    public LocalTime getAccessStartTime() {
        return accessStartTime;
    }

    public void setAccessStartTime(LocalTime accessStartTime) {
        this.accessStartTime = accessStartTime;
    }

    public LocalTime getAccessEndTime() {
        return accessEndTime;
    }

    public void setAccessEndTime(LocalTime accessEndTime) {
        this.accessEndTime = accessEndTime;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public Advisor getAdvisor() {
        return advisor;
    }

    public void setAdvisor(Advisor advisor) {
        this.advisor = advisor;
    }
}
