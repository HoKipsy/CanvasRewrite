class Car{
	int id;
	private static int carNum = 0;

	public Car(int id){
		carNum+= 1;
		this.id = id;
		System.out.println("constructor");		
	}
	
	public void setId(int newId){
		this.id = newId;
	}
	
	public  int getId() {
		return id;
	}
	public static int getNum() {
		return carNum;
	}
	

    @Override
    public String toString() {
        return id + "";
    }
}
