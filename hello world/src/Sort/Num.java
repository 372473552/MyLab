package Sort;

public class Num {


public Num(int n) {
		super();
		this.n = n;
	}

public int getN() {
	return n;
}
public void setN(int n) {
	this.n = n;
}


@Override
public String toString() {
	return  ""+n ;
}


private int n;

}