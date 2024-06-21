class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int unsatisfiedCustomers = 0;
        for(int i = 0; i < minutes; i++){
            unsatisfiedCustomers += customers[i] * grumpy[i];
        }
        int maxUnsatisfiedCustomers = unsatisfiedCustomers;
        for(int i = minutes; i < n; i++){
            unsatisfiedCustomers -= customers[i - minutes] * grumpy[i - minutes];
            unsatisfiedCustomers += customers[i] * grumpy[i];
            maxUnsatisfiedCustomers = Math.max(maxUnsatisfiedCustomers, unsatisfiedCustomers);
        }
        int totalCustomers = maxUnsatisfiedCustomers;
        for(int i = 0; i < n; i++){
            totalCustomers += customers[i] * (1 - grumpy[i]);
        }
        return totalCustomers;
    }
}