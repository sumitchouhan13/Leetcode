class ParkingSystem {
    int[] capacity = new int[3];
    public ParkingSystem(int big, int medium, int small) {
        this.capacity[0] = big;
        this.capacity[1] = medium;
        this.capacity[2] = small;
    }
    
    public boolean addCar(int carType) {
        int totalCapacity = capacity[carType - 1];
        if(totalCapacity > 0){
            capacity[carType - 1]--;
            return true;
        }
        return false;
    }
}

/**
 * Your ParkingSystem object will be instantiated and called as such:
 * ParkingSystem obj = new ParkingSystem(big, medium, small);
 * boolean param_1 = obj.addCar(carType);
 */