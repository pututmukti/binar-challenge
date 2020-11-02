class SuitController(private val listener:Suit) {
	
	var suitResultBase = ArrayList<SuitResult>()
	public fun suitProcess(pemain: Pemain,suitResultBases : ArrayList<SuitResult>):SuitController{
		val serach = pemain.pemain1
	    val item = suitResultBases.find { it.nodeBase == serach }
		val hasil : String = ""
		if(pemain.pemain1 == pemain.pemain2){
			listener.result("DRAW!")
		}else if(pemain.pemain2 == item!!.nodeWinner){
			listener.result("Pemain 1 Menang!")
		}else{
			listener.result("Pemain 2 Menang!")
		}
		return this
	}
	
}

