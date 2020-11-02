class SuitResultBuilder {
	private var suitResult : SuitResult?=null
	
	var suitResultBase = ArrayList<SuitResult>()
	
	fun setSuitResult(suitResult: SuitResult): SuitResultBuilder {
        this.suitResult = suitResult
        return this
    }
	
	fun addSuitResult(suitResultItem: SuitResult): SuitResultBuilder {
        suitResultBase.add(suitResultItem)
        return this
    }
}