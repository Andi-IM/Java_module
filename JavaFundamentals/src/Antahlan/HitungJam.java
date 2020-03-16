class HitungJam{
	public static void main(String[] args){
	int T = 4000;
	int jam, menit, detik;
	
	jam = T / 3600;
	menit = T % 3600 / 60;
	detik = T % 60;
	
	System.out.println(jam);
	System.out.println(menit);
	System.out.println(detik);
	}
}