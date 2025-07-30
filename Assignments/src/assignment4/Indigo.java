package assignment4;

	
		public class Indigo implements AirFare {
			
			    private int hours;
			    private double costPerHour;

			    // Default constructor
			    public Indigo() {
			        this.hours = 0;
			        this.costPerHour = 0.0;
			    }
			    // Parameterized constructor
			    public Indigo(int hours, double costPerHour) {
			        this.hours = hours;
			        this.costPerHour = costPerHour;
			    }
			    // Getters
			    public int getHours() {
			        return hours;
			    }
			    public double getCostPerHour() {
			        return costPerHour;
			    }
			    // Setters
			    public void setHours(int hours) {
			        this.hours = hours;
			    }
			    public void setCostPerHour(double costPerHour) {
			        this.costPerHour = costPerHour;
			    }
			    // Implementation of methods
			    @Override
			    public double calculateAmount() {
			        return hours * costPerHour * 8;
			    }
			    @Override
			    public void display() {
			        System.out.printf("%.2f\n", calculateAmount());
			    }
			}