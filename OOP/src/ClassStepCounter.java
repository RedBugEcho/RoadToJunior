class StepCounter{
    private int steps;
    private int targetSteps;

    StepCounter(int targetSteps){
        this.steps = 0;
        this.targetSteps = targetSteps;
    }

    public void addStep(){
        steps++;
        if (steps == targetSteps) System.out.println("The goal is achieved");
    }

    public void reset(){
        this.steps = 0;
        System.out.println("The metre is reset");
    }

    public void showProgress(){
        System.out.println(steps + " steps passed." + " | How much is left to the goal? " + (targetSteps - steps));
    }
}

public class ClassStepCounter {
    public static void main(String[] args) {
        StepCounter counter1 = new StepCounter(3);

        counter1.addStep();
        counter1.showProgress();
        counter1.addStep();
        counter1.addStep();
        counter1.showProgress();
        counter1.reset();
        counter1.showProgress();
    }
}