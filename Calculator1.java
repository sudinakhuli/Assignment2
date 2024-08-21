class Calculator1 {

    public double add(double... numbers) {
        double sum = 0;
        for (double number : numbers) {
            sum += number;
            
        }
        
        return sum;
    }

    public double multiply(double... numbers) {
        double product = 1;
        for (double number : numbers) {
            product *= number;
        }
        return product;
    }
}


