package lsp;

public class Square implements Shape {

	private int side;
	
	public Square() {
		// TODO Auto-generated constructor stub
	}
	public Square(int side) {
		super();
		this.side = side;
	}

	

	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	@Override
	public int getArea() {
		// TODO Auto-generated method stub
		return this.side*this.side;
	}

}
