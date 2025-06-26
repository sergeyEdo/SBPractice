package u_2_ex_3;

import java.util.jar.Manifest;

public class ex_3 {
    public static void main(String[] args) {
        Matrix matrix_a = new Matrix(2, 2);
        Matrix matrix_b = new Matrix(2, 2);
        for(int i = 0;i < 2;i++) {
            for(int j = 0;j < 2;j++) {
                matrix_a.setValue(i, j, i+j+1);
                matrix_b.setValue(i, j, i+j+5);
            }
        }
        matrix_a.print();
        matrix_b.print();

        Matrix matrix_c = new Matrix(2, 2);
        matrix_c = Matrix.sum_matrix(matrix_a, matrix_b);
        matrix_c.print();

        Matrix matrix_d = new Matrix(2, 2);
        matrix_d = Matrix.product_matrix(matrix_a, matrix_b);
        matrix_d.print();
    }

    public static class Matrix {
        int rows;
        int columns;
        double[][] data;

        public Matrix(int rows, int columns) {
            this.rows = rows;
            this.columns = columns;
            this.data = new double[rows][columns];
        }

        public void setValue(int i, int j, double value) {
            this.data[i][j] = value;
        }

        public void print() {
            for(double[] line : data) {
                for(double element : line) {
                    System.out.print(element + " ");
                }
                System.out.println();
            }
        }

        public static Matrix sum_matrix(Matrix a, Matrix b) {
            Matrix temp_matrix = new Matrix(a.rows,  a.columns);

            for(int i = 0;i < a.rows;i++) {
                for(int j = 0;j < a.columns;j++)  {
                    temp_matrix.setValue(i, j, a.data[i][j] + b.data[i][j]);
                }
            }

            return temp_matrix;
        }

        public static Matrix product_matrix(Matrix a, Matrix b) {
            Matrix temp_matrix = new Matrix(a.rows, a.columns);

            for (int i = 0; i < a.rows; i++) {
                for (int j = 0; j < b.columns; j++) {
                    double sum = 0;
                    for (int k = 0; k < a.columns; k++) {
                        sum += a.data[i][k] * b.data[k][j];
                    }
                    temp_matrix.setValue(i, j, sum);
                }
            }

            return temp_matrix;
        }
    }
}
