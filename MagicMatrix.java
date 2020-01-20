import java.util.Scanner;

class MagicMatrix{

	static int size;

	void inputMatrix(int[][] matrix){
		Scanner scanner=new Scanner(System.in);

		S.o.pln("Enter "+(size*size)+" Elements Of Matrix :");
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				matrix[i][j]=scanner.nextInt();
			}
		}

	}

	void printMatrix(int[][] matrix){
		S.o.pln("Matrix is :");
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){
				S.o.p(matrix[i][j]+"\t");
			}
			S.o.pln();
		}

	}

	boolean isMagicMatrix(int[][] matrix){
		int cost=0,sumR=0,sumC=0,sumDL=0,sumDR=0;

		for(int i=0;i<size;i++)
					cost+=matrix[i][0];

		S.o.pln("Cost Is : "+cost);
		
		for(int i=0;i<size;i++){
			for(int j=0;j<size;j++){

				sumR+=matrix[i][j];
				sumC+=matrix[j][i];

				if(i==j)
					sumDL+=matrix[j][i];
				if(i+j==(size-1))
					sumDR+=matrix[j][i];
			}
			if((sumR!=cost)||(sumC!=cost))
				return false;
			sumR=0;
			sumC=0;
		}
		if((sumDL!=cost)||(sumDR!=cost))
			return false;

		return true;
	}

	public static void main(String[] args) {
		// int[][] matrix=new int[3][3]; 
		// matrix[0][0]=1;matrix[0][1]=2;matrix[0][2]=3;
		// matrix[1][0]=4;matrix[1][1]=5;matrix[1][2]=6;
		// matrix[2][0]=7;matrix[2][1]=8;matrix[2][2]=9;

		Scanner scanner=new Scanner(System.in);
		S.o.pln("Enter The Size Of Square Matrix : ");
		size=scanner.nextInt();

		int[][] matrix=new int[size][size];

		MagicMatrix obj=new MagicMatrix();

		obj.inputMatrix(matrix);
		obj.printMatrix(matrix);

		S.o.pln("Matrix Status Is : "+obj.isMagicMatrix(matrix));
	}
}