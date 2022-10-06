package programacionFuncional.Ejercicio2;

enum Tax {
	SUPERREDUCED(4), REDUCED(10), NORMAL(10);

	public int percent;
	
	private Tax(int percent){
		this.percent = percent;
	}
		
	public int getPercent() {
			
		return percent;
		
		}
	}

