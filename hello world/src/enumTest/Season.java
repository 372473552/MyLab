package enumTest;

public enum Season implements Info {
	SPRING("spring","´ºÅ¯»¨¿ª"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(this.getSeasonDescript());
		}
		
	},
	SUMMER("summer","ÏÄÈÕÑ×Ñ×"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(this.getSeasonDescript());
		}
		
	},
	AUTUMN("autumn","Çï¸ßÆøË¬"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(this.getSeasonDescript());
		}
		
	},
	WINTER("winter","º®¶¬À°ÔÂ"){

		@Override
		public void show() {
			// TODO Auto-generated method stub
			System.out.println(this.getSeasonDescript());
		}
		
	}
	;

	
	
	public String getSeasonName() {
		return seasonName;
	}

	public void setSeasonName(String seasonName) {
		this.seasonName = seasonName;
	}

	public String getSeasonDescript() {
		return seasonDescript;
	}

	public void setSeasonDescript(String seasonDescript) {
		this.seasonDescript = seasonDescript;
	}

	private String seasonName;
	private String seasonDescript;
	
	public String ToString() {
		return "["+seasonName+":"+seasonDescript+"]";
		
	}
	
	private Season(String seasonName, String seasonDescript) {
		this.seasonName = seasonName;
		this.seasonDescript = seasonDescript;
	}
	
}
