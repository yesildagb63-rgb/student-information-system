public class AcademicTerm {
    private String id;
    private String code;
    private String name;
    private String academicYear;
    private Semester semester; 
    private String startDate;
    private String endDate;
    private String registrationStart;
    private String registrationEnd;
    private String addDropEnd;
    private boolean isActive;

    
    public AcademicTerm(String id, String code, String name, String academicYear, Semester semester, String startDate, String endDate, String registrationStart, String registrationEnd, String addDropEnd, boolean isActive) {
        this.id = id;
        this.code = code;
        this.name = name;
        this.academicYear = academicYear;
        this.semester = semester;
        this.startDate = startDate;
        this.endDate = endDate;
        this.registrationStart = registrationStart;
        this.registrationEnd = registrationEnd;
        this.addDropEnd = addDropEnd;
        this.isActive = isActive;
    }

   
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getCode() { return code; }
    public void setCode(String code) { this.code = code; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getAcademicYear() { return academicYear; }
    public void setAcademicYear(String academicYear) { this.academicYear = academicYear; }

    public Semester getSemester() { return semester; }
    public void setSemester(Semester semester) { this.semester = semester; }

    public String getStartDate() { return startDate; }
    public void setStartDate(String startDate) { this.startDate = startDate; }

    public String getEndDate() { return endDate; }
    public void setEndDate(String endDate) { this.endDate = endDate; }

    public String getRegistrationStart() { return registrationStart; }
    public void setRegistrationStart(String registrationStart) { this.registrationStart = registrationStart; }

    public String getRegistrationEnd() { return registrationEnd; }
    public void setRegistrationEnd(String registrationEnd) { this.registrationEnd = registrationEnd; }

    public String getAddDropEnd() { return addDropEnd; }
    public void setAddDropEnd(String addDropEnd) { this.addDropEnd = addDropEnd; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    
    @Override
    public String toString() {
        return "AcademicTerm{code='" + code + "', name='" + name + "'}";
    }
}
