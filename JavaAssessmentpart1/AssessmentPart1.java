import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
	
	public class AssessmentPart1 {
		public static void main(String[] args) {
			File fileDir=new File("E:\\");
			if(fileDir.isDirectory()) {
				List listfile =Arrays.asList(fileDir.list());
				System.out.println("list of unsorted files.");
				for(Object A:listfile) {
					System.out.println(A);
				}Collections.sort(listfile);
			
			System.out.println("Retrieving files in assending order");
			for (Object A:listfile) {
				System.out.println(A);
			}
			}
		}
	}


