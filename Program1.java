public class Program1{public static void main(String[] args) {int a = 2;int b = 5;int c = 20;int count = 0;for (int i = 1; i < c; i += 1) {if (i % a  ==  0) {count ++;}if (i % b  ==  0) {count  += 1;}}System.out.println(count);}}
