package triangles;

public class Triangle {
	private float a;
	private float b;
	private float c;
	
	Triangle(float a, float b, float c){
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public void whichTypeTri() {
		
		System.out.println("");
		String triDesc = "Triangle with a=" + a + ", b=" + b + ", and c=" + c + "is a(n):\n";
		System.out.println(triDesc);
		
		if ( pyTheorem(a, b, c) ) {
			System.out.println("Right");
		}
		if (equilatTri(a, b, c)) {
			System.out.println("Equilateral");
		}
		if (scalTri(a, b, c)) {
			System.out.println("Scalene");
		}
		if(isosTri(a, b, c )) {
			System.out.println("Isoseles");
		}
		
		System.out.println("Triangle\n");
	}
	
	public boolean pyTheorem(float a, float b, float c) {
		
		float a2 = a*a;
		float b2 = b*b;
		float c2 = c*c;
		
		if(a2 + b2 == c2) {
			return true;
		}
		else if (a2 + c2 == b2) {
			return true;
		}
		else if (b2 + c2 == a2) {
			return true;
		}
		
		return false;		
		
	}
	
	public boolean equilatTri(float a, float b, float c) {
		
		if(a == b )
			if( a == c)
				if( b == c)
					return true;
		
		return false;
	}
	
	public boolean scalTri(float a, float b, float c) {
		
		if( a != b )
			if( a != c)
				if( b != c)
					return true;
		
		return false;
	}

	
	public boolean isosTri(float a, float b, float c) {
		 
		if( a == b || a == c) {
			if( a != b || a != c) {
				return true;
			} else {
				return false;
			}
		}
		
		return false;
	}
}
