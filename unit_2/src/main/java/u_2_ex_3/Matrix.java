package u_2_ex_3;

public class Matrix {
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

    public static Matrix sumMatrix(Matrix a, Matrix b) {
        Matrix temp_matrix = new Matrix(a.rows,  a.columns);

        for(int i = 0;i < a.rows;i++) {
            for(int j = 0;j < a.columns;j++)  {
                temp_matrix.setValue(i, j, a.data[i][j] + b.data[i][j]);
            }
        }

        return temp_matrix;
    }

    public static Matrix productMatrix(Matrix a, Matrix b) {
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
