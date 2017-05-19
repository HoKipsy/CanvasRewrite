class Bitmap{
	byte[] colors;

	final int width, height;

	public Bitmap(int width, int height){
		this.width = width;
		this.height = height;
		colors = new byte[width * height * 3];
	}


	public int getColor(int x, int y){
		int index = x * 3 + width * y;		

		byte red = colors[index + 0];
		byte green = colors[index + 1];
		byte blue = colors[index + 2];

		return red << 16 | green << 8 | blue;
	}

	public void setColor(int x, int y, int color){ // 0xrrggbb = bb+2^8*gg+2^16*rr
		
		byte red   = (byte) ((color & 0xff0000) >> 16);
		byte green = (byte) ((color & 0x00ff00) >> 8);
		byte blue  = (byte) (color & 0x0000ff);
		
		setColor(x, y, red, green,  blue);
		
	}

	public void setColor(int x, int y, byte red, byte green, byte  blue){
		int index = x * 3 + width * y;

		colors[index + 0] = red;
		colors[index + 1] = green;
		colors[index + 2] = blue;
		
	}


}
