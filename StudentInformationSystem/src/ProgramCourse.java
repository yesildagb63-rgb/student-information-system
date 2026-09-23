public class ProgramCourse {
    private String id;
    private String programId;       
    private String courseId;        
    private int semesterOrder;
    private CourseType courseType;  
    private boolean isActive;

    
    public ProgramCourse(String id, String programId, String courseId, int semesterOrder, CourseType courseType, boolean isActive) {
        this.id = id;
        this.programId = programId;
        this.courseId = courseId;
        this.semesterOrder = semesterOrder;
        this.courseType = courseType;
        this.isActive = isActive;
    }

    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getProgramId() { return programId; }
    public void setProgramId(String programId) { this.programId = programId; }

    public String getCourseId() { return courseId; }
    public void setCourseId(String courseId) { this.courseId = courseId; }

    public int getSemesterOrder() { return semesterOrder; }
    public void setSemesterOrder(int semesterOrder) { this.semesterOrder = semesterOrder; }

    public CourseType getCourseType() { return courseType; }
    public void setCourseType(CourseType courseType) { this.courseType = courseType; }

    public boolean isActive() { return isActive; }
    public void setActive(boolean active) { isActive = active; }

    
    @Override
    public String toString() {
        return "ProgramCourse{programId='" + programId + "', courseId='" + courseId + "', semesterOrder=" + semesterOrder + "}";
    }
}