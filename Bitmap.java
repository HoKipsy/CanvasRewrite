class Bitmap{
	int[] colors;

	final int width, height;

	public Bitmap(int width, int height){
		this.width = width;
		this.height = height;
		colors = new int[width * height * 3];
	}


	public int getColor(int x, int y){
		int index = x * 3 + width * y;		

		int red = colors[index + 0];
		int green = colors[index + 1];
		int blue = colors[index + 2];

		return red << 16 | green << 8 | blue;
	}

	public void setColor(int x, int y, int color){ // 0xrrggbb = bb+2^8*gg+2^16*rr
		
		int red = (color & 0xff0000) >> 16;
		int green = (color & 0x00ff00) >> 8;
		int blue = color & 0x0000ff;
		
		setColor(x, y, red, green,  blue);
		
	}

	public void setColor(int x, int y, int red, int green, int  blue){
		int index = x * 3 + width * y;

		colors[index + 0] = red;
		colors[index + 1] = green;
		colors[index + 2] = blue;
		
	}


}
