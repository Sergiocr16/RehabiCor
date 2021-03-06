package com.aditum.rehabicor.service.dto;
import java.time.Instant;
import javax.validation.constraints.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * A DTO for the Session entity.
 */
public class SessionDTO implements Serializable {

    private Long id;

    @NotNull
    private String code;

    @NotNull
    private Instant executionDate;

    private Boolean abscence;

    private Boolean hospitalization;

    private Integer status;

    private Boolean deleted;

    private Boolean currentlyWorking;


    private Long patientId;

    private List<MinorEventsSessionDTO> minorEventsSessions;

    private List<MayorEventsSessionDTO> mayorEventsSessions;

    private List<NonSpecificPainsSessionDTO> nonSpecificPainsSessions;

    private List<DepressiveSymptomsSessionDTO> depressiveSymptomsSessions;

    public Boolean getAbscence() {
        return abscence;
    }

    public Boolean getHospitalization() {
        return hospitalization;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public Boolean getCurrentlyWorking() {
        return currentlyWorking;
    }

    public List<MinorEventsSessionDTO> getMinorEventsSessions() {
        return minorEventsSessions;
    }

    public void setMinorEventsSessions(List<MinorEventsSessionDTO> minorEventsSessions) {
        this.minorEventsSessions = minorEventsSessions;
    }

    public List<MayorEventsSessionDTO> getMayorEventsSessions() {
        return mayorEventsSessions;
    }

    public void setMayorEventsSessions(List<MayorEventsSessionDTO> mayorEventsSessions) {
        this.mayorEventsSessions = mayorEventsSessions;
    }

    public List<NonSpecificPainsSessionDTO> getNonSpecificPainsSessions() {
        return nonSpecificPainsSessions;
    }

    public void setNonSpecificPainsSessions(List<NonSpecificPainsSessionDTO> nonSpecificPainsSessions) {
        this.nonSpecificPainsSessions = nonSpecificPainsSessions;
    }

    public List<DepressiveSymptomsSessionDTO> getDepressiveSymptomsSessions() {
        return depressiveSymptomsSessions;
    }

    public void setDepressiveSymptomsSessions(List<DepressiveSymptomsSessionDTO> depressiveSymptomsSessions) {
        this.depressiveSymptomsSessions = depressiveSymptomsSessions;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Instant getExecutionDate() {
        return executionDate;
    }

    public void setExecutionDate(Instant executionDate) {
        this.executionDate = executionDate;
    }

    public Boolean isAbscence() {
        return abscence;
    }

    public void setAbscence(Boolean abscence) {
        this.abscence = abscence;
    }

    public Boolean isHospitalization() {
        return hospitalization;
    }

    public void setHospitalization(Boolean hospitalization) {
        this.hospitalization = hospitalization;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Boolean isCurrentlyWorking() {
        return currentlyWorking;
    }

    public void setCurrentlyWorking(Boolean currentlyWorking) {
        this.currentlyWorking = currentlyWorking;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        SessionDTO sessionDTO = (SessionDTO) o;
        if (sessionDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), sessionDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "SessionDTO{" +
            "id=" + getId() +
            ", code='" + getCode() + "'" +
            ", executionDate='" + getExecutionDate() + "'" +
            ", abscence='" + isAbscence() + "'" +
            ", hospitalization='" + isHospitalization() + "'" +
            ", status=" + getStatus() +
            ", deleted='" + isDeleted() + "'" +
            ", currentlyWorking='" + isCurrentlyWorking() + "'" +
            ", patient=" + getPatientId() +
            "}";
    }
}
