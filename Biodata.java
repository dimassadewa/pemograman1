import java.math.*;

class Biodata{ 
	String Nama;
	String Alamat;
	BigInteger Npm;
	Integer Umur;
	
	public String getNama(){ 
		return Nama; 
	}
	public String getAlamat(){ 
		return Alamat;	
	}
	public BigInteger getNpm(){ 
		return Npm;	
	}
	public Integer getUmur(){
		return Umur; 
	}
	
	public void setNama(String a){ 
		this.Nama=a;	
	}
	public void setAlamat(String b){  
		this.Alamat=b;	
	}
	public void setNpm(BigInteger x){ 
		this.Npm=x;	
	}
	public void setUmur(Integer y){ 
		this.Umur=y;	
	}
	
	
	public static void main(String[] args){
	Biodata biodatasaya= new Biodata();
	biodatasaya.setNama("dimas sadewa");
	System.out.print("Nama Anda Adalah :"); 
	System.out.println(biodatasaya.getNama()); 
	
	biodatasaya.setUmur(19); 
	System.out.print("Umur Anda Adalah :"); 
	System.out.println(biodatasaya.getUmur()); 
	
	biodatasaya.setAlamat("cibinong");
	System.out.print("Alamat Anda Adalah :");
	System.out.println(biodatasaya.getAlamat()); 
	
	biodatasaya.setNpm(new BigInteger("4513210016")); 
	System.out.print("Npm Anda yaitu :");
	System.out.print(biodatasaya.getNpm());	
	}
}