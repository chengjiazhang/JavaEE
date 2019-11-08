/*
静态内部类使用
*/

package com.banyuan.test12;

public class MaxMin {

    public static class Result {
        private double max;
        private double min;

        public Result(double max, double min) {
            this.max = max;
            this.min = min;
        }

        public double getMax() {
            return max;
        }

        public double getMin() {
            return min;
        }
    }

    public static Result getResult(double[] array) {
        double max = Double.MIN_VALUE;

        double min = Double.MAX_VALUE;

        for(double i:array){
            if(i>max){
                max=i;
            }
            if(i<min){
                min=i;
            }
        }
        return new Result(max,min);
    }
}

class Test{
    public static void main(String[] args) {
        double[] array=new double[5];

        for(int i=0;i<array.length;i++){
            array[i]=100*Math.random();
        }

        System.out.println("源数组");

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

        System.out.println("最大值："+MaxMin.getResult(array).getMax());
        System.out.println("最小值："+MaxMin.getResult(array).getMin());
    }

}
