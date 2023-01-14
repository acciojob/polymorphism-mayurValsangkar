package com.driver;

public class Main {
    public static void main(String[] args){
        Product p = new Product();
        int ans1 = p.product(2, 3);
        int ans2 = p.product(2, 3, 4);
        double ans3 = p.product(2.1, 2.9);
    }

   public static class Product{
        public int product(int x, int y){
            int ans = x*y;
            return ans;
        }

        public int product(int x, int y, int z){
            int ans = x*y*z;
            return ans;
        }

        public double product(double x, double y){
            double ans = x*y;
            return ans;
        }
    }



}