package Numbers;

public class MyNumber {
    private int num;

    MyNumber(int num) {
	this.num = num;
    }

    public int getNum() {
	return num;
    }

    public void setNum(int num) {
	this.num = num;
    }

    public boolean isPrime() {
	boolean prime = true;
	for (int i = 2; i < (this.num / 2); i++) {
	    if (this.num % i == 0) {
		prime = false;
		break;
	    }
	}
	return prime;

    }

    public int sumUpToN() {
	int sum = 0;
	for (int i = 0; i <= this.num; i++) {
	    sum += i;
	}
	return sum;
    }

    public int sumDivisorsUpToN() {
	int sum = 0;
	for (int i = 2; i <= this.num / 2; i++) {
	    if (this.num % i == 0) {
		sum += i;
	    }
	}
	return sum;
    }

    public void numberTriangle() {
	for (int i = 1; i <= this.num; i++) {
	    for (int j = 1; j <= i; j++) {
		System.out.printf("%d ", j);
	    }
	    System.out.printf("\n");
	}

    }
}