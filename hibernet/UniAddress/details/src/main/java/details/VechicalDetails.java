package details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VechicalDetails {
	

	@Id
	private long vno;
	private String Vname;
	private String color;
	
	private UserDetails u;
	
	public long getVno() {
		return vno;
	}

	public void setVno(long vno) {
		this.vno = vno;
	}

	public String getVname() {
		return Vname;
	}

	public void setVname(String vname) {
		Vname = vname;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "VechicalDetails [vno=" + vno + ", Vname=" + Vname + ", color=" + color + ", u=" + u + "]";
	}
	


}
