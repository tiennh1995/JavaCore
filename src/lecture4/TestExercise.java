package lecture4;

public class TestExercise {
	public static void main(String[] args) {
		TestExercise.getFrequencyWith(2);
	}
	
	 public static void getFrequencyWith(int num) {
	    float[] array = { 1, 2, 3, 4, 1, 4, 6, 9, 3 };
	    float max = TestExercise.getMax(array);
	    
	    for (int i = 0; i < array.length; i++) {
	    	int count = 0;
	    	if(array[i] != max) {
	    		count = 1;
		    	for(int j = i + 1; j < array.length; j++) {
		    		if(array[i] == array[j]) {
		    			array[j] = max;
		    			count++;
		    		}
		    	}
		    	
		    	System.out.println(array[i] + " xuat hien: " + count + " lan");
		    	array[i] = max;		    	
	    	}
	    }
	 }
	 
	 public static float getMax(float[] array) {
		 float max = array[0];
		 for (int i = 1; i < array.length; i++) {
			 if (max < array[i])
				 max = array[i];
		 }
		 return max + 1;
	 }
}
