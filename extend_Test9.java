class Book1{
	String name;
	int page;
	String author;

	Book1(){ }

	Book1(String name, int page, String author){
		this.name=name;
		this.page=page;
		this.author=author;
	}

	public void setName(String name){
		this.name=name;
	}

	public String getName(){
		return name;
	}

	public void setPage(int page){
		this.page=page;
	}

	public int getPage(){
		return page;
	}

	public void setAuthor(String author){
		this.author=author;
	}

	public String getAuthor(){
		return author;
	}

	public String toString(){
		return ("제목 : "+name+", 페이지 수 : "+page+", 저자 : "+author);
	}
}

class magazine extends Book1{
	String release_date;

	magazine(){ }

	magazine(String name, int page, String author, String release_date){
		this.name=name;
		this.page=page;
		this.author=author;
		this.release_date=release_date;
	}

	public void setRelease_date(String release_date){
		this.release_date=release_date;
	}

	public String getRelease_date(){
		return release_date;
	}

	public String toString(){
		return (super.toString()+", 발매일 : "+release_date);
	}
}

public class extend_Test9{
	public static void main(String ar[]){
		Book1 b1=new Book1("a", 200, "a1");
		magazine b2=new magazine("b", 300, "a2", "2018-11-29");
		System.out.println(b1.toString());
		System.out.println(b2.toString());
	}
}