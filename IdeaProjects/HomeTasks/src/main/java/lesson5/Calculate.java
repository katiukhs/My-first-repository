package lesson5;

public class Calculate {
    private double firstVariable, secondVariable;
    private String operation;

    public double getFirstVariable() {
        return firstVariable;
    }

    public double getSecondVariable() {
        return secondVariable;
    }

    public String getOperation() {
        return operation;
    }

    public void setFirstVariable(double firstVariable) {
        this.firstVariable = firstVariable;
    }

    public void setSecondVariable(double secondVariable) {
        this.secondVariable = secondVariable;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
