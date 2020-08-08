package com.lti.codility.lesson1;

import java.util.ArrayList;
import java.util.List;

public class Nailing {
	
	class Plank{
		int start = 0;
		int end = 0;
		public Plank(int start, int end) {
			super();
			this.start = start;
			this.end = end;
		}
		@Override
		public String toString() {
			return "Plank [start=" + start + ", end=" + end + "]";
		}
		
		
	}
	
	
	class Nail{
		int index;
		int position;
		public Nail(int index, int position) {
			super();
			this.index = index;
			this.position = position;
		}
		@Override
		public String toString() {
			return "Nail [index=" + index + ", position=" + position + "]";
		}
		
		
	}	
	
	
	
	public int solution(int[] A, int[] B, int[] C) {
		List<Plank> planks = new ArrayList<>();
		for(int i = 0; i<A.length; i++) {
			planks.add(new Plank(A[i], B[i]));
		}
		System.out.println(planks);
		
		List<Nail> nails = new ArrayList<>();
		for(int i = 0; i<C.length; i++) {
			nails.add(new Nail(i, C[i]));
		}
		System.out.println(nails);
		
		nails.sort((Nail n1, Nail n2) -> Integer.compare(n1.position, n2.position));
		System.out.println(nails);
		
		int index = 0;
		for(Plank plank: planks) {
			
		}
		
		return 0;
	}
	
	public int search(Plank plank, List<Nail> nails) {
		int beg = 0; 
		int end = nails.size() - 1;
		int result = -1;
		
		while(beg <= end) {
			int mid = (beg+end)/2;
			Nail nail = nails.get(mid);
			if(nail.position < plank.start) {
				beg = mid + 1;
			}else if(nail.position > plank.end) {
				end = mid-1;	
			}else {
				end = mid - 1;
				result = mid;
			}
		}
		
		if(result == -1 || nails.get(result).position > plank.end) {
			return result;
		}
		
		Nail nail = nails.get(result);
		int index = nail.index;
		
		while(result< nails.size() && nails.get(result).position <= plank.end) {
			Nail nextNail = nails.get(result);
			index = Math.min(index, nextNail.index);
		}
		return result;
		
	}
	
	public static void main(String[] args) {
		int[] A = new int[] {1,4,5,8};
		int[] B = new int[] {4,5,9,10};
		int[] C = new int[] {4,6,7,10,2};
		
		System.out.println(new Nailing().solution(A, B, C));
	}
}



/*We can also use the older concept for comparing the two arguments for sorting instead of lambda expression
 
  
 * Comparator<Nail> c = new Comparator<Nailing.Nail>() {

			@Override
			public int compare(Nail o1, Nail o2) {
				// TODO Auto-generated method stub
				return 0;
			}};
			
*/

