public class GradingSystemAdapter implements ManageSystem {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem){
        this.gradingSystem = gradingSystem;
    }

    @Override
    public String integrateSystem() {
        return gradingSystem.recordGrades();
    }
}