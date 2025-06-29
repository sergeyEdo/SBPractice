package u_2_ex_3;

public class Ex_3 {
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
        matrix_c = Matrix.sumMatrix(matrix_a, matrix_b);
        matrix_c.print();

        Matrix matrix_d = new Matrix(2, 2);
        matrix_d = Matrix.productMatrix(matrix_a, matrix_b);
        matrix_d.print();
    }
}
