public class StepTracker{
    int steps;
    int days;
    int activeDays;
    
    public StepTracker(){
        steps = 0;
        days = 0;
        
    }
    
    public stepTracker(int steps){
        this.steps = steps;
    }
    
    
    
    public int addDailySteps(int steps){
        return steps;
        
    }
    
    public int activeDays(){
        if(steps >= 10000){
          return activeDays; 
        }
        
    }
    
    public double averageSteps(){
        return steps/days;
    }
    
    public int addDays(int days){
        return days;
    }
}