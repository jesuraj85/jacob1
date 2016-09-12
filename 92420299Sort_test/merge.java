
public class merge {
	public int[] mergesort(int n, int[] input) {

		int i;
		if(n > 1) {
			int h = n / 2;
			int m = n - h;
			int[] u = new int[h];
			int[] v = new int[m];
	
			for(i = 0; i < h; i++) {
				u[i] = input[i];
			}
			for(i = 0; i < m; i++) {
				v[i] = input[h+i];
			}
			mergesort(h, u);
			mergesort(m, v);
			merge_m(h, m, u, v, input);
		}
		
		return input;
	}
	public void merge_m(int h, int m, int[] u, int[] v, int[] input) {
		int i, j, k;
		i = 0;
		j = 0;
		k = 0;
		while(i < h && j < m) {
			if(u[i] < v[j]) {
				input[k] = u[i];
				i++;
			}
			else {
				input[k] = v[j];
				j++;
			}
			k++;
		}
		if(i == h) {
			while(j < m) {
				input[k] = v[j];
				j++;
				k++;
			}
		}
		else {
			while(i < h) {
				input[k] = u[i];
				i++;
				k++;
			}
		}
	}
}
