package Sort;

public class Num {
/**
 *  适合int或double类型
 */

private int n;




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
	return ""+n;
}

}
