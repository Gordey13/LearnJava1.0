package task.task11.task1105;

public class Solution {
    private String modelName;
    private int speed;

    public Solution(String modelName, int speed) {
        this.modelName = modelName;
        this.speed = speed;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}