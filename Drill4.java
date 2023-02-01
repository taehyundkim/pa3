class Drill4 {
    String phaseOfWater(int temp) {
        if(temp >= 100) {
            return "vapor"; 
        }
        else if(temp > 0) {
            return "liquid";
        }
        else {
            return "solid";
        }
    }

    int maxDifference(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        return max - min;
    }

    double ringArea(double inner, double outer) {
        return Math.PI * outer * outer - Math.PI * inner * inner;
    }
}
