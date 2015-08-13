package test.six;

public class Hamburger {

    private final String patty;

    public Hamburger(String patty){
    	this.patty = patty;
    }

	@Override
	public String toString() {
		return "Hamburger [patty=" + patty + "]";
	}
    
    
   /* public Hamburger(String patty) {
          if("닭고기".equals(patty))
                 this.patty = patty;
          else if("소고기".equals(patty))
                 this.patty = patty;
          else
                 throw new RuntimeException("맞지 않는 패티 재료입니다.");
    }*/

    public String getPatty() {
          return patty;
    }

}
