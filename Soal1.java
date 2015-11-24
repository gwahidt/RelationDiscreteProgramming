import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Soal1{
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int size = Integer.parseInt(in.readLine());
		
		boolean[][] matrix = new boolean[size][size];
		
		for(int i = 0; i < size; i++){
			String line = in.readLine();
			for(int j = 0 ; j < size; j++){
				if(line.charAt(j * 2) == '1'){
					matrix[i][j] = true; 
				}
			}
		}
		
		RelationMatrix relationMatrix = new RelationMatrix(matrix);
		
		boolean isReflective = relationMatrix.isReflective();
		boolean isIrreflecsive = relationMatrix.isIrreflective();
		boolean isSymmetrical = relationMatrix.isSymmetrical();
		boolean isAntisymmetrical = relationMatrix.isAntisymmetrical();
		boolean isTransitive = relationMatrix.isTransitive();
		
		if(isReflective){
			out.write("refleksif");
		}
		
		if(isIrreflecsive){
			out.write("irrefleksif");
		}
		
		if(isSymmetrical){
			out.write("simetris");
		}
		
		if(isAntisymmetrical){
			out.write("antisimetri");
			
			if(isIrreflecsive){
				out.write("asimetri");
			}
		}
		
		if(isTransitive){
			out.write("transitif");
		}
		
		if(!isReflective && !isIrreflecsive && !isSymmetrical && !isAntisymmetrical && !isTransitive){
			out.write("tidak ada");
		}
		
		in.close();
		out.close();
	}
}
